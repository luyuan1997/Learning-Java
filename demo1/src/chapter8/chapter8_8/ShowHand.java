package chapter8.chapter8_8;

import java.util.List;
import java.util.LinkedList;

public class ShowHand{
	//定义游戏最多支持多少玩家
	private final int PLAY_NUM = 5;
	//定义扑克牌的所有花色和数值
	private String[] types = {"方块","草花","红心","黑桃"};
	private String[] values = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	//cards是一局游戏中剩下的扑克牌
	private List<String> cards = new LinkedList<String>();
	//定义所有的玩家
	private String[] players = new String[PLAY_NUM];
	//所有玩家手上的扑克牌
	private List<String>[] playersCards = new List[PLAY_NUM];
	/**
	 * 初始化扑克牌，放入52长扑克牌
	 * 并且使用shuffle方法将他们安随机顺序排列
	 */
	public void initCards() {
		for(int i=0; i<types.length; i++) {
			for
		}
	}
}

public class ShowHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
