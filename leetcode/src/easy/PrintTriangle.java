package easy;

public class PrintTriangle {

	public static void main(String[] args) {
		
		PrintTriangle a = new PrintTriangle();
		int lastNum;
		
		lastNum = a.printRightTriangle(5);
		System.out.println("最后一个值为"+lastNum);

	}
	
	public int printRightTriangle(int n) {
		int last=0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				last++;
				System.out.printf("%02d  ", last);
			}
			System.out.println();
		}
		return last;
	}

}
