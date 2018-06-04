package chapter6_7;
interface Product{
	public double getPrice();
	public String getName();
}
public class AnnonymousTest {
	public void test(Product p) {
		System.out.println("购买了一个"+p.getName()+",花掉了"+p.getPrice());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnonymousTest ta = new AnnonymousTest();
		//调用test()方法时，需要传入一个Product参数
		//此处传入其匿名实现类的实例
		//下面的代码等价于如下的代码
//		class AnnonymousProduct implements Product{
//			public double getPrice() {
//				return 567.8;
//			}
//			public String getName() {
//				return "AGP显卡";
//			}
//		}
		ta.test(new Product() {
			public double getPrice() {
				return 527.8;
			}
			public String getName() {
				return "AGP显卡";
			}
		});
	}

}
