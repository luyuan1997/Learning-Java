package chapter11.chapter11_2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextField;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("²âÊÔ´°¿Ú");
//		Panel p = new Panel();
		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		sp.add(new TextField(20));
		sp.add(new Button("µ¥»÷"));
		f.add(sp);
		f.setBounds(30,30,250,200);
		f.setVisible(true);
	}

}
