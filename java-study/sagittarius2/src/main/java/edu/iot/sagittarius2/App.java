package edu.iot.sagittarius2;

import org.apache.ibatis.session.SqlSession;

import edu.iot.common.database.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SqlSession session = Session.getSession();
        System.out.println("MyBatis 준비완료");
        session.close();
    }
}
