package chapter11.chapter11_3;

import java.awt.Button;
import java.awt.Frame;

public class BoxLayout {

	private Frame f = new Frame("≤‚ ‘");
	public void init() {
//		f.setLayout(new BoxLayout(f, BoxLayout.Y_AXIS));
		f.add(new Button("button1"));
		f.add(new Button("button2"));
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoxLayout().init();
	}

}
