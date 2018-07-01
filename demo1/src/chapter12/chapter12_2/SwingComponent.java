package chapter12.chapter12_2;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingComponent {
	JFrame f = new JFrame("����");
	Icon okIcon = new ImageIcon("ico/ok.png");
	JButton ok = new JButton("ȷ��", okIcon);
	JRadioButton female = new JRadioButton("Ů", false);
	JRadioButton male = new JRadioButton("��", true);
	ButtonGroup bg = new ButtonGroup();
	JCheckBox married = new JCheckBox("�Ƿ��ѻ飿", false);
	String[] colors = new String[] {"��ɫ", "��ɫ", "��ɫ"};
	JComboBox<String> colorChooser = new JComboBox<>(colors);
	JList<String> colorList = new JList<>(colors);
	//����һ��8�С�20�еĶ����ı���
	JTextArea ta = new JTextArea(8,20);
	//����һ��40�еĵ����ı���
	JTextField name = new JTextField(40);
	JMenuBar mb = new JMenuBar();
	JMenu file = new JMenu("�ļ�");
	JMenu edit = new JMenu("�༭");
	//�������½����˵��Ϊ֮�ƶ�ͼ��
	Icon newIcon = new ImageIcon("icon/new.png");
	JMenuItem newItem = new JMenuItem("�½�", newIcon);
	Icon saveIcon = new ImageIcon("icon/save.png");
	JMenuItem saveItem = new JMenuItem("����", saveIcon);
	Icon exitIcon = new ImageIcon("icon/exit.png");
	JMenuItem exitItem = new JMenuItem("�˳�", exitIcon);
	JCheckBoxMenuItem autoWrap = new JCheckBoxMenuItem("�Զ�����");
	JMenuItem copyItem = new JMenuItem("ճ��", new ImageIcon("ico/copy.png"));
	JMenuItem pasteItem = new JMenuItem("ճ��", new ImageIcon("ico/paste.png"));
	JMenu format = new JMenu("��ʽ");
	JMenuItem commentItem = new JMenuItem("ע��");
	JMenuItem cancelItem = new JMenuItem("ȡ��ע��");
	//����һ���Ҽ��˵��������ó�����
	JPopupMenu pop = new JPopupMenu();
	ButtonGroup flavorGroup = new ButtonGroup();
	JRadioButtonMenuItem metalItem = new JRadioButtonMenuItem("Metal���", true);
	JRadioButtonMenuItem nimbusItem = new JRadioButtonMenuItem("Nimbus���");
	JRadioButtonMenuItem windowsItem = new JRadioButtonMenuItem("Windows���");
	JRadioButtonMenuItem classicItem = new JRadioButtonMenuItem("Windows������");
	JRadioButtonMenuItem motifItem = new JRadioButtonMenuItem("Motif���");
	public void init() {
		//����װ�����ı���Ͱ�ť��JPanel
		JPanel bottom = new JPanel();
		bottom.add(name);
		bottom.add(ok);
		f.add(bottom, BorderLayout.SOUTH);
		//����װ��������ѡ��������JCheckBox��JPanel
		JPanel checkPanel = new JPanel();
		checkPanel.add(colorChooser);
		bg.add(male);
		bg.add(female);
		checkPanel.add(male);
		checkPanel.add(female);
		
	}
}