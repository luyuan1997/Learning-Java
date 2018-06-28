package chapter11.chapter11_3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class BorderLayoutTest {


	private static Object SOUTH;
	private static Object NORTH;
	private static Object EAST;
	private static Object WEST;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("²âÊÔ´°¿Ú");
		f.setLayout(new BorderLayout(30,5));
		f.add(new Button("South"), SOUTH);
		f.add(new Button("North"), NORTH);
		Panel p = new Panel();
		p.add(new TextField(20));
		p.add(new Button("µ¥»÷"));
		f.add(p);
		f.add(new Button("east"), EAST);
		f.add(new Button("west"), WEST);
		f.pack();
		f.setVisible(true);
	}

}
