package chapter8.chapter8_6;

import java.util.TreeMap;

class R implements Comparable{
	int count;
	public R(int count) {
		this.count = count;
	}
	public String toString(){
		return "R[count:"+count+"]";
	}
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj != null && obj.getClass() == R.class) {
			R r = (R)obj;
			return r.count == this.count;
		}
		return false;
	}
	public int compareTo(Object obj) {
		R r = (R)obj;
		return count > r.count ? 1 : count < r.count ? -1 :0;
	}
	
}

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm = new TreeMap();
		tm.put(new R(3), "轻量级JAVA EE企业应用实战");
		tm.put(new R(-5), "疯狂java讲义");
		tm.put(new R(9), "疯狂AJAX讲义");
		System.out.println(tm);
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastKey());
		System.out.println(tm.higherKey(new R(2)));
		System.out.println(tm.lowerEntry(new R(2)));
		System.out.println(tm.subMap(new R(-1), new R(4)));
	}

}
