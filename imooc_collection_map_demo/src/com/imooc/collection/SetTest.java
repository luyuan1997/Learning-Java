package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	
	public List<Course> coursesToSelect;
	
	public SetTest() {
		coursesToSelect = new ArrayList<Course>();
	}
	public void testAdd() {
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
//		System.out.println("添加了课程:"+temp.id+":"+temp.name);
		
		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
//		System.out.println("添加了课程:"+temp2.id+":"+temp2.name);
		
		Course[] course = {new Course("3","离散数学"), new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
//		System.out.println("添加了两门课程:"+temp3.id+":"+temp3.name+";"
//		+temp4.id+":"+temp4.name);
		
		Course[] course2 = {new Course("5","高等数学"), new Course("6","JAVA语言")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course)coursesToSelect.get(2);
		Course temp6 = (Course)coursesToSelect.get(3);
//		System.out.println("添加了两门课程:"+temp5.id+":"+temp5.name+";"
//				+temp6.id+":"+temp6.name);	
	}
	
	public void testForEach() {
		for(Object obj : coursesToSelect) {
			Course cr = (Course)obj;
			System.out.println("课程："+cr.id+":"+cr.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEach();
		Student student = new Student("1", "小明");
		System.out.println("欢迎学生："+student.name+"选课！");
		//创建一个Scanner对象。用来接收从键盘输入的课程
		Scanner console = new Scanner(System.in);
	}

}
