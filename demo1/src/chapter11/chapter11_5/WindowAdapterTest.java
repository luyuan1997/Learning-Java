package chapter11.chapter11_5;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterTest {

	private Frame f = new Frame("测试");
	private TextArea ta = new TextArea(6,40);
	public void init() {
		f.addWindowListener(new MyListener());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	class MyListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.out.println("用户关闭窗口！\n");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowAdapterTest().init();
	}
}
