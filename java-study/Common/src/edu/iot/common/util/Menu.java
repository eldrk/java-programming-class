package edu.iot.common.util;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Menu {

	String title;
	List<Menu> menuList;
	
	public Menu(String title) {
		this.title = title;
	}
	
	public void add(Menu menu) {
		menuList.add(menu);
	}
	
	public abstract void execute() throws Exception;
}
