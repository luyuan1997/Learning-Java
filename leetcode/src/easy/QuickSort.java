package easy;

public class QuickSort {

	/**
	 * 依次快速排序
	 * @param array 数组
	 * @param lo 数组的前下标
	 * @param hi数组的后下标
	 * @param key的下标index，也就是分片的间隔点
	 */
	public static int Sort(int [] a, int beg, int end) {
		int key=a[end];
		while(beg < end) {
			while(beg<end && a[beg] <= key) {
				beg++;
			}
			if(beg<end) {
				int temp=a[beg];
				a[beg] = a[end];
				a[end] = temp;
				end--;
			}
			while(beg<end && a[end]>=key) {
				end--;
			}
			if(beg<end) {
				int temp=a[beg];
				a[beg] = a[end];
				a[end] = temp;
				beg++;
			}
		}
		return end;
	}
	
	public static void FastSort(int [] a, int beg, int end) {
		if(beg>end) {
			return;
		}else {
			int partition = Sort(a,beg,end);
			FastSort(a,beg,partition-1);
			FastSort(a,partition+1,end);
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{2,7,4,5,10,1,9,3,8,6};
		int[] b = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] c = new int[]{10,9,8,7,6,5,4,3,2,1};
		int[] d = new int[]{1,10,2,9,3,2,4,7,5,6};
		
		FastSort(a,0,a.length-1);
		System.out.println("排序后的结果:");
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
}
