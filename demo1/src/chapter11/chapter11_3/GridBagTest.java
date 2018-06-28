package chapter11.chapter11_3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GridBagTest {

	private Frame f = new Frame("²âÊÔ´°¿Ú");
	private GridBagLayout gb = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();
	private Button[] bs = new Button[10];
	
	public void init() {
		f.setLayout(gb);
		for(int i = 0; i < bs.length; i++) {
			bs[i] = new Button("°´Å¥"+i);
		}
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx =1;
		addButton(bs[0]);
		addButton(bs[1]);
		addButton(bs[2]);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		addButton(bs[3]);
		gbc.weightx = 0;
		addButton(bs[4]);
		gbc.gridwidth = 2;
		addButton(bs[5]);
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		addButton(bs[6]);
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.weighty = 1;
		addButton(bs[7]);
		gbc.weighty = 0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		addButton(bs[8]);
		addButton(bs[9]);
		f.pack();
		f.setVisible(true);
	}
	
	public void addButton(Button button) {
		gb.setConstraints(button, gbc);
		f.add(button);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridBagTest().init();
	}

}
