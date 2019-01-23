package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayCopyOf {

	public static void main(String[] args) {
		int[] arr = {3, 7, 2, 1, 9,3,45,7,8,8,3,2,65,34,5};
		int[] arr1 = new int[6];
		int[] arr2 = Arrays.copyOf(arr, 1);
		String[] arr3 = {"黄渤","张艺兴","孙红雷","小猪","牙哥","黄磊"};
		List<String> list = Arrays.asList(arr3);
		Set<String> set = new HashSet<String>(Arrays.asList(arr3));
		System.out.println(set);
//		Arrays.sort(arr, 2, 12);
//		System.arraycopy(arr, 0, arr1, 1, 3);
//		for(int str : arr) {
//			System.out.println(str + " ");
//		}
	}

}
