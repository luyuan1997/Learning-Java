package chapter12.chapter12_2;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class ImageViewer {
	final int PREVIEW_SIZE = 100;
	JFrame jf = new JFrame("¼òµ¥Í¼Æ¬²é¿´Æ÷");
	JMenuBar menuBar = new JMenuBar();
	JLabel label = new JLabel();
	JFileChooser chooser = new JFileChooser(".");
	JLabel accessory = new JLabel();
}
