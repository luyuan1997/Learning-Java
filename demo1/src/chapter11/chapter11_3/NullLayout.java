package chapter11.chapter11_3;

import java.awt.Button;
import java.awt.Frame;

public class NullLayout {

	Frame f = new Frame("²âÊÔ´°¿Ú");
	Button b1 = new Button("button1");
	Button b2 = new Button("button2");
	public void init() {
		f.setLayout(null);
		b1.setBounds(20, 30, 90, 28);
		f.add(b1);
		b2.setBounds(50, 45, 120, 35);
		f.add(b2);
		f.setBounds(50, 50, 200, 100);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullLayout().init();
	}

}
