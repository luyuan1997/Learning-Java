package chapter12.chapter12_2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class BindKeyTest {

	JFrame jf = new JFrame("≤‚ ‘º¸≈Ã∞Û∂®");
	JTextArea jta = new JTextArea(5,30);
	JButton jb = new JButton("∑¢ÀÕ");
	JTextField jtf = new JTextField(15);
	public void init() {
		jf.add(jta);
		JPanel jp = new JPanel();
		jp.add(jtf);
		jp.add(jb);
		jf.add(jp, BorderLayout.SOUTH);
		Action sendMsg = new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				jta.append(jtf.getText() + "\n");
				jtf.setText("");
			}
		};
		jb.addActionListener(sendMsg);
		jtf.getInputMap().put(KeyStroke.getKeyStroke('\n', java.awt.event.InputEvent.CTRL_MASK), "send");
		jtf.getActionMap().put("send", sendMsg);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BindKeyTest().init();
	}

}
