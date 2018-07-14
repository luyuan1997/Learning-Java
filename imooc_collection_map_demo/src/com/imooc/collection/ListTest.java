package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public List coursesToSelect;
	public ListTest() {
		this.coursesToSelect = new ArrayList();
	}
	
	public void testAdd() {
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println("添加了课程:"+temp.id+":"+temp.name);
		
		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println("添加了课程:"+temp2.id+":"+temp2.name);
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.testAdd();
	}
}
