package easy;

public class Bubble {

	public static void main(String[] args) {
		int [] arr = {1,6,0,-1,-9};
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j]=temp;				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
