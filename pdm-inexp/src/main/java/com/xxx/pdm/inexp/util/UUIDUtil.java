package com.xxx.pdm.inexp.util;

import java.util.UUID;

public class UUIDUtil {

	public static String genUUID() {
		return UUID.randomUUID().toString().toLowerCase().replaceAll("-", "");
	}
	
	public static void main(String[] args) {
		
		System.out.println(UUIDUtil.genUUID());
	}
}
