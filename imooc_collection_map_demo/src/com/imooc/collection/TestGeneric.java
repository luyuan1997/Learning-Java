package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	
	public List<Course> courses;
	
	public TestGeneric() {
		this.courses = new ArrayList<Course>();
	}
	
	public void testAdd() {
		Course cr1 = new Course("1","大学语文");
		courses.add(cr1);
		Course cr2 = new Course("2","JAVA基础");
		courses.add(cr2);
	}
	
	public void testForEach() {
		for(Course cr:courses) {
			System.out.println(cr.id+":"+cr.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForEach();
	}

}
