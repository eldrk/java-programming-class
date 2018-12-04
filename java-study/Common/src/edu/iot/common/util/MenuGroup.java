package edu.iot.common.util;

import java.util.ArrayList;

import edu.iot.common.command.Prompt;

public class MenuGroup extends Menu {
	
	public MenuGroup() {
		this(null);//다른생성자를 부르겠다
	}

	public MenuGroup(String title) {
		super(title);
		menuList = new ArrayList<Menu>();
	}
	
	@Override
	public void execute() throws Exception {
		if(title != null) {
			System.out.printf("[%s]", title);
		}
		for(int i=0; i<menuList.size(); i++) {
			Menu menu = menuList.get(i);
			if(menu.getMenuList() != null) {
				System.out.printf("[%d) %s] ", i,menu.getTitle()); 
			}else {
				System.out.printf(" %d) %s " , i,menu.getTitle()); 
			}
		}
		System.out.println();
		Prompt prompt = new Prompt();
		int select = prompt.getInt("선택");
		if(select >= 0 && select<menuList.size()) {
			menuList.get(select).execute();
		}
	}

}
