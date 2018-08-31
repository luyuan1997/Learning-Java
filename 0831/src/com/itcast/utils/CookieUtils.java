package com.itcast.utils;

import javax.servlet.http.Cookie;

public class CookieUtils {
	public static Cookie getCookieByName(String name, Cookie[] cookies) {
		if(cookies!=null) {
			for(Cookie c:cookies) {
				//通过名字获取
				if(name.equals(c.getName())) {
					//返回
					return c;
				}
			}
		} 
		return null; 
	}
}
