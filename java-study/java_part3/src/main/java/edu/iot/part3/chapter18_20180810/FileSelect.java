package edu.iot.part3.chapter18_20180810;



import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import edu.iot.part3.chapter15_20180807.Prompt;

public class FileSelect {
	
	private String []filters;
	private File dir;
	
	
	public FileSelect(String dir) {
		filters = null;
		this.dir = new File(dir);
	}
	

	public FileSelect(String dir, String filters) {
		filters = filters.toLowerCase();
		this.filters = filters.split(",");
		this.dir = new File(dir);
	}
	
	private File[] getFileList() {
		
		if(filters == null) {
			return dir.listFiles();
		}else {
			return dir.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					name = name.toLowerCase();
					for(String filter : filters) {
						if(name.endsWith(filter)) {
							return true;
						}
					}
					return false;
				}});
		
		}
	}

	public File select() {
		
		File []files = getFileList();
		
		for(int i=0; i<files.length; i++) {
			System.out.println(i+ "] " + files[i].getName());
		}
		
		Prompt prompt = new Prompt();
		int ix = prompt.getInt("선택");
		
		return files[ix];
	
	}
	

	
	public static void main(String[] args) {
		FileSelect fs = new FileSelect("c:/temp", ".mp3,.jpg,.txt");
		File file = fs.select();
		
		//파일 로드
		List<Saying> list = new ArrayList<>();
		List<String> lines = FileUtil.readLines(file);
		for(String line : lines) {
			String[] temp = line.split("#");
			list.add(new Saying(temp[0],temp[1]));
		}
		//데이터 확인
		for(Saying saying : list) {
			System.out.println(saying);
		}



	}
}

