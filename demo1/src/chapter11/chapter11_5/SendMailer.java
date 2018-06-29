package chapter11.chapter11_5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class SendMailer {
	
	private Frame f = new Frame("≤‚ ‘");
	private TextField tf = new TextField(40);
	private Button send = new Button("∑¢ÀÕ");
	public void init() {
		send.addActionListener(new MailerListener(tf));
		f.add(tf);
		f.add(send, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SendMailer().init();
	}

}
