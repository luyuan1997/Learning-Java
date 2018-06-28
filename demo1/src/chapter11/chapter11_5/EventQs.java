package chapter11.chapter11_5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventQs {

	private Frame f = new Frame();
	private Button ok = new Button("确认");
	private TextField tf = new TextField(30);
	public void init() {
		//注册监听器
		ok.addActionListener(new OkListener());
		f.add(tf);
		f.add(ok, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	
	//定义事件监听器类
	class OkListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("用户单击了ok按钮");
			tf.setText("HELLO WORLD");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventQs().init();
	}

}
