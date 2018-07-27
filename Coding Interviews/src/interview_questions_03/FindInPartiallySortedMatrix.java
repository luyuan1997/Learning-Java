package interview_questions_03;

public class FindInPartiallySortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(isIn(arr,7));
	}

	private static boolean isIn(int[][] a, int num) {
		// TODO Auto-generated method stub
		if(a!=null) {
			int m = a.length;
			int n = a[0].length;
			int i=0;
			while(i<m && n>0) {
				if(a[i][n-1] == num) {
					return true;
				}else if(a[i][n-1] > num) {
					n--;
				}else {
					i++;
				}
			}
		}
		return false;
	}

}
