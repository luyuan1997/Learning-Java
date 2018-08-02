package easy;

public class GetIndex {

	public static int getIndex(int array[], int value) {
		int max = array.length-1;
		int min=0;
		int mid=(max+min)/2;
		while(array[mid] != value) {
			if(array[mid] > value) {
				max = mid-1;
			}else if(array[mid] < value) {
				min = mid+1;
			}
			if(min > max) {
				return -1;
			}
			mid=(max+min)/2;
		}
		return mid;
		
	}
	
	public static void main(String[] args) {
		int [] array= {1,5,6,5,7,1,9,6,8};
		
		System.out.println(GetIndex.getIndex(array, 7));
	}
}
