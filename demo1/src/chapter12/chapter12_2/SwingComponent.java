package chapter12.chapter12_2;

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
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
	JPopupMenu pop = new JPopupMenu();
}
