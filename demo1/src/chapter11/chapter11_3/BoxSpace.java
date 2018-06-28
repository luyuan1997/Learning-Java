package chapter11.chapter11_3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

import javax.swing.Box;

public class BoxSpace {

	private Frame f = new Frame();
	private Box horizontal = Box.createHorizontalBox();
	private Box vertical = Box.createVerticalBox();
	public void init() {
		horizontal.add(new Button("button1"));
		horizontal.add(Box.createHorizontalGlue());
		horizontal.add(new Button("button2"));
		horizontal.add(Box.createHorizontalStrut(10));
		horizontal.add(new Button("button3"));
		vertical.add(new Button("button4"));
		vertical.add(Box.createVerticalGlue());
		vertical.add(new Button("button5"));
		vertical.add(Box.createVerticalStrut(10));
		vertical.add(new Button("button6"));
		f.add(horizontal, BorderLayout.NORTH);
		f.add(vertical);
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoxSpace().init();
	}

}
