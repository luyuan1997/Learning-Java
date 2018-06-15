package chapter8.chapter8_9;

import java.util.Hashtable;
import java.util.Vector;

public class Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("Math");
		v.add("English");
		Hashtable scores = new Hashtable();
		scores.put("Chinese", 90);
		scores.put("history", 85);
		java.util.Enumeration em = v.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		java.util.Enumeration keyEm = scores.keys();
		while(keyEm.hasMoreElements()) {
			Object key = keyEm.nextElement();
			System.out.println(key+"--->"+scores.get(key));
		}
	}

}
