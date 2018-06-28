//package chapter11.chapter11_3;
//
//import java.awt.BorderLayout;
//import java.awt.Button;
//import java.awt.Frame;
//import java.awt.Panel;
//import java.awt.event.ActionListener;
//
//public class CardLayout {
//
//	Frame f = new Frame("测试窗口");
//	String[] names = {"第一章","第二章","第三章","第四章","第五章"};
//	Panel p1 = new Panel();
//	public void init() {
//		final CardLayout c = new CardLayout();
//		p1.setLayout(c);
//		for(int i = 0; i < names.length; i++) {
//			p1.add(names[i], new Button(names[i]));
//		}
//		Panel p = new Panel();
//		ActionListener Listener = e -> {
//			switch(e.getActionCommand()) {
//			case "上一张":
//				c.previous(p1);
//				break;
//			case "下一张":
//				c.next(p1);
//				break;
//			case "第一章":
//				c.first(p1);
//				break;
//			case "最后一张":
//				c.last(p1);
//				break;
//			case "第三章":
//				c.show(p1, "第三章");
//				break;
//			}
//		};
//		Button previous = new Button("上一张");
//		previous.addActionListener(Listener);
//		Button next = new Button("下一张");
//		next.addActionListener(Listener);
//		Button first = new Button("第一章");
//		first.addActionListener(Listener);
//		Button last = new Button("最后一张");
//		last.addActionListener(Listener);
//		Button third = new Button("第三章");
//		third.addActionListener(Listener);
//		p.add(previous);
//		p.add(next);
//		p.add(first);
//		p.add(last);
//		p.add(third);
//		f.add(p1);
//		f.add(p, BorderLayout.SOUTH);
//		f.pack();
//		f.setVisible(true);
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new CardLayout().init();
//	}
//
//}
