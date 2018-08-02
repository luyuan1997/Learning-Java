package easy;

public class SelectSort {

	public static void main(String[] args) {
		int [] arr = {1,6,0,-1,-9,1000,-1000,98,-652};
		SelectSort select = new SelectSort();
		select.sort(arr);
	}
	
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int j=0; j<arr.length-1; j++) {
			int min=arr[j];
			int minIndex = j;
			
			for(int k=j+1;k<arr.length;k++) {
				if(min > arr[k]) {
					min=arr[k];
					minIndex = k;
				}
			}
			temp = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;
		}
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
