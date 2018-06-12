package chapter8.chapter8_3;

import java.util.TreeSet;

class RZ implements Comparable{
	int count;
	public RZ(int count) {
		this.count = count;
	}
	public String toString() {
		return "R[count:"+count+"]";
	}
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj != null && obj.getClass() == RZ.class) {
			RZ r = (RZ)obj;
			return r.count == this.count;
		}
		return false;
	}
	public int compareTo(Object obj) {
		RZ r = (RZ)obj;
		return count > r.count ? 1 : count<r.count ? -1 : 0;
	}
}
public class TreeSetTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(new RZ(5));
		ts.add(new RZ(-3));
		ts.add(new RZ(9));
		ts.add(new RZ(-2));
		System.out.println(ts);
		RZ first = (RZ)ts.first();
		first.count = 20;
		RZ last = (RZ)ts.last();
		last.count = -2;
		System.out.println(ts);
		System.out.println(ts.remove(new RZ(-2)));
		System.out.println(ts);
		System.out.println(ts.remove(new RZ(5)));
		System.out.println(ts);
	}

}
