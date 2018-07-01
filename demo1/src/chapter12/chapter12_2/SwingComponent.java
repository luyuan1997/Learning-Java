package chapter12.chapter12_2;

import java.awt.BorderLayout;
import java.awt.event.InputEvent;

import javax.swing.Box;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class SwingComponent {
	JFrame f = new JFrame("测试");
	Icon okIcon = new ImageIcon("ico/ok.png");
	JButton ok = new JButton("确认", okIcon);
	JRadioButton female = new JRadioButton("女", false);
	JRadioButton male = new JRadioButton("男", true);
	ButtonGroup bg = new ButtonGroup();
	JCheckBox married = new JCheckBox("是否已婚？", false);
	String[] colors = new String[] {"红色", "绿色", "蓝色"};
	JComboBox<String> colorChooser = new JComboBox<>(colors);
	JList<String> colorList = new JList<>(colors);
	//定义一个8行、20列的多行文本域
	JTextArea ta = new JTextArea(8,20);
	//定义一个40列的单行文本域
	JTextField name = new JTextField(40);
	JMenuBar mb = new JMenuBar();
	JMenu file = new JMenu("文件");
	JMenu edit = new JMenu("编辑");
	//创建“新建”菜单项，为之制定图标
	Icon newIcon = new ImageIcon("icon/new.png");
	JMenuItem newItem = new JMenuItem("新建", newIcon);
	Icon saveIcon = new ImageIcon("icon/save.png");
	JMenuItem saveItem = new JMenuItem("保存", saveIcon);
	Icon exitIcon = new ImageIcon("icon/exit.png");
	JMenuItem exitItem = new JMenuItem("退出", exitIcon);
	JCheckBoxMenuItem autoWrap = new JCheckBoxMenuItem("自动换行");
	JMenuItem copyItem = new JMenuItem("粘贴", new ImageIcon("ico/copy.png"));
	JMenuItem pasteItem = new JMenuItem("粘贴", new ImageIcon("ico/paste.png"));
	JMenu format = new JMenu("格式");
	JMenuItem commentItem = new JMenuItem("注释");
	JMenuItem cancelItem = new JMenuItem("取消注释");
	//定义一个右键菜单用于设置程序风格
	JPopupMenu pop = new JPopupMenu();
	ButtonGroup flavorGroup = new ButtonGroup();
	JRadioButtonMenuItem metalItem = new JRadioButtonMenuItem("Metal风格", true);
	JRadioButtonMenuItem nimbusItem = new JRadioButtonMenuItem("Nimbus风格");
	JRadioButtonMenuItem windowsItem = new JRadioButtonMenuItem("Windows风格");
	JRadioButtonMenuItem classicItem = new JRadioButtonMenuItem("Windows经典风格");
	JRadioButtonMenuItem motifItem = new JRadioButtonMenuItem("Motif风格");
	public void init() {
		//创建装载了文本框和按钮的JPanel
		JPanel bottom = new JPanel();
		bottom.add(name);
		bottom.add(ok);
		f.add(bottom, BorderLayout.SOUTH);
		//创建装载了下拉选择框和三个JCheckBox的JPanel
		JPanel checkPanel = new JPanel();
		checkPanel.add(colorChooser);
		bg.add(male);
		bg.add(female);
		checkPanel.add(male);
		checkPanel.add(female);
		checkPanel.add(married);
		//创建一个垂直排列组件的Box，盛装多行文本域JPanel
		Box topLeft = Box.createVerticalBox();
		JScrollPane taJsp = new JScrollPane(ta);
		topLeft.add(taJsp);
		topLeft.add(checkPanel);
		Box top = Box.createHorizontalBox();
		top.add(topLeft);
		top.add(colorList);
		f.add(top);
		newItem.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK));
		newItem.addActionListener(e -> ta.append("用户单击了“新建”菜单\n"));
		file.add(newItem);
		file.add(saveItem);
		file.add(exitItem);
		edit.add(autoWrap);
		edit.addSeparator();
		edit.add(copyItem);
		edit.add(pasteItem);
		
	}
}
