package chapter10.chapter10_4;

public class AuctionTest {

	private double initPrice = 30.0;
	//因为方法中显示抛出了AuctionException异常
	//所以此处需要声明抛出AuctionException异常
	public void bid(String bidPrice) throws Auction{
		double d = 0.0;
		try {
			d = Double.parseDouble(bidPrice);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new Auction("竞拍价格必须是数值，"+"不能包含其他字符");
		}
		if(initPrice > d) {
			throw new Auction("竞拍价格比起拍价低，禁止竞拍");
		}
		initPrice = d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuctionTest at = new AuctionTest();
		try {
			at.bid("df");
		}
		catch(Auction ae) {
			System.err.println(ae.getMessage());
		}
	}

}
