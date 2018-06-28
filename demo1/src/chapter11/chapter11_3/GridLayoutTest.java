package chapter11.chapter11_3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class GridLayoutTest {

	private static Object NORTH;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("¼ÆËã»ú");
		Panel p1 = new Panel();
		p1.add(new TextField(30));
		f.add(p1, NORTH);
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3,5,4,4));
		String[] name = {"0","1","2","3","4","5","6","7","8","9","+","-","*","/","."};
		for(int i = 0; i < name.length; i++) {
			p2.add(new Button(name[i]));
		}
		f.add(p2);
		f.pack();
		f.setVisible(true);
	}

}
