package easy;

public class StringBufferAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operator(a,b);
		System.out.println(a+","+b);
	}
	
	public static void operator(StringBuffer x, StringBuffer y) {
		x.append(y);
		y=x;
		
	}

}
