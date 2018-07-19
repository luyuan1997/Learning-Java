package com.imooc.ioc;

public class User {
	public void add() {
		System.out.println("add..........");
	}
	
	public static void main(String[] args) {
		//原始做法
		User user = new User();
		user.add();
	}
}
