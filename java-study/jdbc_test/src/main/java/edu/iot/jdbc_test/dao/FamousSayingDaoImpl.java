package edu.iot.jdbc_test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.iot.jdbc_test.Database;
import edu.iot.jdbc_test.model.FamousSaying;

public class FamousSayingDaoImpl implements FamousSayingDao {
	private Connection conn = Database.getConnection();

	@Override
	public int count() throws Exception {
		String sql = "select count(*) from famous_saying";
		try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
			rs.next();
			return rs.getInt(1);
		}
	}

	@Override
	public int insert(FamousSaying fs) throws Exception {
		String sql = "insert into famous_saying(id, statement, who) " + "values(famous_saying_seq.nextval ,?,?)";

		// PreparedStatement 준비
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			// ? -> 매개변수설정
			pstmt.setString(1, fs.getStatement());
			pstmt.setString(2, fs.getWho());

			// insert퀴리실행및 결과리턴
			return pstmt.executeUpdate();
		}
	}

	@Override
	public List<FamousSaying> getList() throws Exception {
		String sql = "select * from famous_saying";
		List<FamousSaying> list = new ArrayList<>();

		try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				FamousSaying fs = map(rs);
				list.add(fs);
			}
		}
		return list;
	}

	@Override
	public int update(FamousSaying fs) throws Exception {
		String sql = "update famous_saying set " + "	statement =?, " + "	who =? , " + "	update_date=sysdate "
				+ "	where id =?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, fs.getStatement());
			pstmt.setString(2, fs.getWho());
			pstmt.setLong(3, fs.getId());

			return pstmt.executeUpdate();
		}
	}

	@Override
	public int delete(Long id) throws Exception {
		String sql = "delete from famous_saying where id =" + id;
		try (Statement stmt = conn.createStatement()) {
			return stmt.executeUpdate(sql);
		}
	}

	@Override
	public FamousSaying findById(Long id) throws Exception {
		String sql = "select * from famous_saying where id = " + id;
		FamousSaying fs = null;
		try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
			if (rs.next()) {
				fs = map(rs);
			}
		}
		return fs;
	}

	@Override
	public List<FamousSaying> getPage(int start, int end) throws Exception {
		String sql = "select * from fs_pagination_view " + "where seq between ? and ? ";

		List<FamousSaying> list = new ArrayList<>();
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					FamousSaying fs = map(rs);
					list.add(fs);
				}
			}
		}
		return list;
	}

	private FamousSaying map(ResultSet rs) throws Exception {
		return FamousSaying.builder().id(rs.getLong("id")).statement(rs.getString("statement")).who(rs.getString("who"))
				.regDate(rs.getDate("reg_date")).updateDate(rs.getDate("update_date")).build();

	}

	@Override
	public List<FamousSaying> random(int num) throws Exception {
		String sql = "select * from random_fs_view " + "where rownum <= " + num;
		List<FamousSaying> list = new ArrayList<>();

		try (Statement stmt = conn.createStatement(); 
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				FamousSaying fs = map(rs);
				list.add(fs);
			}
		}
		return list;
	}

}
