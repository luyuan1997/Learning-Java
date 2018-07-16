package com.imooc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	public Map<String, Student> students;
	
	public MapTest() {
		this.students = new HashMap<String, Student>();
	}
	
	public void testPut() {
		Scanner console = new Scanner(System.in);
		int i =0;
		while (i<3) {
			System.out.println("请输入送学生的ID");
			String ID = console.next();
		//判断ID是否被占用，如果没有则添加
			Student st = students.get(ID);
			if(st == null) {
				System.out.println("请输入学生姓名");
				String name = console.next();
				Student newStudent = new Student(ID,name);
				students.put(ID, newStudent);
				System.out.println("成功添加学生："+students.get(ID).name);
				i++;
			}else {
				System.out.println("该学号已经被占用");
				continue;
			}
		}
	}
	
	public void testKeySet() {
		//返回MAP中所有键的Set集合,进行遍历
		Set<String> keySet = students.keySet();
		System.out.println("总共有："+students.size()+"个学生!");
		for(String stuID:keySet) {
			Student st = students.get(stuID);
			if(st != null) {
				System.out.println("学生:"+st.name);
			}
		}
	}
	
	//删除Map中的数据
	public void testRemove() {
		Scanner console = new Scanner(System.in);
		while(true) {
			System.out.println("请输入要删除学生的ID");
			String ID = console.next();
			Student st = students.get(ID);
			if(st == null) {
				System.out.println("该ID不存在");
				continue;
			}
			students.remove(ID);
			System.out.println("成功删除学生:"+st.name);
			break;
		}
	}
	
	//遍历所有键值对
	public void testEntrySet() {
		Set<Entry<String, Student>> entrySet = students.entrySet();
		for(Entry<String, Student> entry:entrySet) {
			System.out.println("取得键:"+entry.getKey());
			System.out.println("对应的值为："+entry.getValue().name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
		mt.testRemove();
		mt.testEntrySet();
		
	}

}
