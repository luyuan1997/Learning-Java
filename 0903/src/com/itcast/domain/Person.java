package com.itcast.domain;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Person {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Person() {
		System.out.println("无参构造器 ");
	}
	public Person(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void eat() {
		System.out.println("会吃");
	}
	private void sleep() {
		System.out.println("在睡觉");
	}
	
	private void sleep(String name) {
		System.out.println(name+"在睡觉");
	}
}
