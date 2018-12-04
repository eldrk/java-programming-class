package edu.iot.capricorn.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

public class Util {
	public static int getInt(String str, int defValue) {
		
		int value = defValue;
		try {
			if(str != null) {
				value = Integer.parseInt(str);
				
			}
			
		}catch(Exception e){}
			
		return value;
			
	}
	
	public static String getToday() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}
	
	public static void toScope(HttpServletRequest request, Map<String, Object> map){
		Set<String> keyset = map.keySet();
		for(String key: keyset) {
			Object value = map.get(key);
			
			request.setAttribute(key, value);
		}
	}
}
