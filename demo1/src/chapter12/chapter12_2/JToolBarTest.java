package chapter12.chapter12_2;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class JToolBarTest {
	JFrame jf = new JFrame("测试工具条");
	JTextArea jta = new JTextArea(6,35);
	JToolBar jtb = new JToolBar();
	JMenuBar jmb = new JMenuBar();
	JMenu edit = new JMenu("编辑");
	//获取系统剪贴板
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	//创建“粘贴”Action,用于创建菜单项、工具按钮和普通按钮
	Action pasteAction = new AbstractAction("粘贴", new ImageIcon("ico/paste.png")) {
		public void actionPerformed(ActionEvent e) {
			//如果剪贴板包含stringFlavor内容
			if(clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor)) {
				try {
					//取出其中内容
					String content = (String)clipboard.getData(DataFlavor.stringFlavor);
					jta.replaceRange(content, jta.getSelectionStart(), jta.getSelectionEnd());
				}
				catch(Exception ee) {
					ee.printStackTrace();
				}
			}
		}
	};
	//创建赋值Action
	Action copyAction = new AbstractAction("复制", new ImageIcon("ico/copy.png")) {
		public void actionPerformed(ActionEvent e) {
			StringSelection contents = new StringSelection(jta.getSelectedText());
			clipboard.setContents(contents, null);
			if(clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor)) {
				pasteAction.setEnabled(true);
			}
		}
	};
	public void init() {
		pasteAction.setEnabled(false);
		jf.add(new JScrollPane(jta));
	}
	
}
