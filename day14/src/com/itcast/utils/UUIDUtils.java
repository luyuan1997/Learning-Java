package com.itcast.utils;

import java.util.UUID;

/**
 * 根据系统和硬件生成含有"-"的32为的字符串id
 * @author lu
 *
 */
public class UUIDUtils {
	public static String getId() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}
	
	public static String getCode() {
		return getId();
	}
}
