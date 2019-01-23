package bubblesort;

public class BubbleSort2 {
	
	public static int[] bubbleSort(int[] arr) {
		if(arr.length == 0) {
			return arr;
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j + 1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};
		int[] b = bubbleSort(arr);
		for(int i : b) {
			System.out.print(i + " ");
		}
	}

}
