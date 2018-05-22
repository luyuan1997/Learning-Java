package yangHuiTriangle;

public class YangHuiTriangle {
	public static void main(String[] args) {
		int max = 5;
		for (int i=1; i <=5; i++) {
			for (int j=1; j<= max -i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
