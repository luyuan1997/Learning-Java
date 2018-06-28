package chapter11.chapter11_3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;

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
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
