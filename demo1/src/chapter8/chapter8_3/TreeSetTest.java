package chapter8.chapter8_3;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet nums = new TreeSet();
		//向TreeSet添加四个Integer对象
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		//输出集合元素，看到集合已经处于排序状态
		System.out.println(nums);
		//输出第一个元素,最后一个元素,小于4的元素，大于等于5的元素，大于等于-3小于4的子集
		System.out.println(nums.first());
		System.out.println(nums.last());
		System.out.println(nums.headSet(4));
		System.out.println(nums.tailSet(5));
		System.out.println(nums.subSet(-3, 4));
	}

}
