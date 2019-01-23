package bubblesort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};
		int[] b1 = bubbleSort1(arr);
		int[] b2 = bubbleSort2(arr);
		
		//for循环遍历
		for(int i = 0; i < b1.length; i++) {
			System.out.print(b1[i] + " ");
		}
		System.out.println();
		//增强for循环遍历
		for(int i : b1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : b2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	//原始方法
	private static int[] bubbleSort1(int[] a) {
		System.out.println("bubbleSort1的排序结果为：");
		int n = a.length;
		for(int i = 0; i < n; i++) {
			for(int j =1; j < n - i; j++) {
				if(a[j - 1] > a[j]) {
					int temp;
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	//优化方法1
	/**
	 * 设置标识，如果交换为true，否则为false
	 * @param arr
	 * @return
	 */
	private static int[] bubbleSort2(int[] arr) {
		System.out.println("bubbleSort2的排序结果为：");
		boolean flag = true;
		int n = arr.length;
		while(flag) {
			flag = false;
			for(int j = 1; j < n; j++) {
				if(arr[j - 1] >arr[j]) {
					int temp;
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					//标识交换过数据
					flag = true;
				}
			}
			n--;
		}
		return arr;
	}
}
