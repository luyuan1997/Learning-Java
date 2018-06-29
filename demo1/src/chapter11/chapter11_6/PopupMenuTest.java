package chapter11.chapter11_6;

import java.awt.BorderLayout;
import java.awt.CheckboxMenuItem;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.sun.glass.events.KeyEvent;

import javafx.scene.input.MouseEvent;

public class PopupMenuTest {
	private TextArea ta = new TextArea(4,30);
	private Frame f = new Frame("测试");
	PopupMenu pop = new PopupMenu();
	CheckboxMenuItem autoWrap = new CheckboxMenuItem("自动换行");
	MenuItem copyItem = new MenuItem("复制");
	MenuItem pasteItem = new MenuItem("粘贴");
	Menu format = new Menu("格式");
	MenuItem commentItem = new MenuItem("注释", new MenuShortcut(KeyEvent.VK_SLASH, true));
	MenuItem cancelItem = new MenuItem("取消注释");
	public void init() {
		ActionListener menuListener = e ->{
			String cmd = e.getActionCommand();
			ta.append("单击‘"+cmd+"’菜单"+"\n");
			if(cmd.equals("退出")) {
				System.exit(0);
			}
		};
		commentItem.addActionListener(menuListener);
		pop.add(autoWrap);
		pop.addSeparator();
		pop.add(copyItem);
		pop.add(pasteItem);
		format.add(commentItem);
		format.add(cancelItem);
		pop.add(new MenuItem("-"));
		pop.add(format);
		final Panel p = new Panel();
		p.setPreferredSize(new Dimension(300, 160));
		p.add(pop);
		p.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				if(e.isPopupTrigger()) {
//					pop.show(p, e.getX(), e.getY());
				}
			}
		});
		f.add(p);
		f.add(ta, BorderLayout.NORTH);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.pack();
		f.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PopupMenuTest().init();
	}

}
