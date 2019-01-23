package desc;

public class AddAll {
	public static class Test{
		int a;
		int b;
		public void f() {
			a = 0;
			b = 0;
			int[] c = {0};
			g(b,c);
			System.out.println(a + " " + b + " "+c[0]);
		}
		public void g(int b, int[] c) {
			a = 1;
			b = 1;
			c[0] = 1;
		}
		public static void main(String[] args) {
			Test t = new Test();
			t.f();
		}
	}
	
}
