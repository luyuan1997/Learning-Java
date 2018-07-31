package easytest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer x =new StringBuffer("A");
		StringBuffer y = new StringBuffer("B");
		swap(x, y);
		System.out.println(x+","+y);
	}
	
	public static void swap(StringBuffer x, StringBuffer y) {
		x.append(y);
		y=x;
		
	}

}
