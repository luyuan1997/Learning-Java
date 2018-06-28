//package chapter11.chapter11_3;
//
//import java.awt.BorderLayout;
//import java.awt.Frame;
//
//public class Box {
//
//	private Frame f = new Frame();
//	private Box horizontal = Box.createHorizontalBox();
//	private Box vertical = Box.createVerticalBox();
//	public void init() {
//		horizontal.add(new Button("button1"));
//		horizontal.add(new Button("button2"));
//		vertical.add(new Button("button3"));
//		vertical.add(new Button("button4"));
//		f.add(horizontal, BorderLayout.NORTH);
//		f.add(vertical);
//		f.pack();
//		f.setVisible(true);
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new Box().init();
//	}
//
//}
