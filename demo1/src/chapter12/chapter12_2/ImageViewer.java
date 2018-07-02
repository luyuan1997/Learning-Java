package chapter12.chapter12_2;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;

public class ImageViewer {
	final int PREVIEW_SIZE = 100;
	JFrame jf = new JFrame("简单图片查看器");
	JMenuBar menuBar = new JMenuBar();
	JLabel label = new JLabel();
	JFileChooser chooser = new JFileChooser(".");
	JLabel accessory = new JLabel();
	ExtensionFileFilter filter = new ExtensionFileFilter();
	public void init() {
		filter.addExtension("jpg");
		filter.addExtension("jpeg");
		filter.addExtension("gif");
		filter.addExtension("png");
		filter.setDescription("图片文件(*.jpg, *.jpeg, *.gif, *.png)");
		chooser.addChoosableFileFilter(filter);
		//禁止“文件类型”下拉列表中显示“所有文件”选项
		chooser.setAcceptAllFileFilterUsed(false);
		//为文件选择器制定自定义的fileView对象
		chooser.setFileView(new FileIconView(filter));
		//为文件选择器指定一个预览图片的附件
		chooser.setAccessory(accessory);
		accessory.setPreferredSize(new Dimension(PREVIEW_SIZE, PREVIEW_SIZE));
		accessory.setBorder(BorderFactory.createEtchedBorder());
		chooser.addPropertyChangeListener(event -> {
			if(event.getPropertyName() == JFileChooser.SELECTED_FILE_CHANGED_PROPERTY) {
				File f = (File) event.getNewValue();
				if(f == null) {
					accessory.setIcon(null);
					return;
				}
				//将所选文件读入ImageIcon对象中
				ImageIcon icon = new ImageIcon(f.getPath());
				if(icon.getIconWidth() > PREVIEW_SIZE) {
					icon = new ImageIcon(icon.getImage().getScaledInstance(PREVIEW_SIZE, -1, Image.SCALE_DEFAULT));
				}
				accessory.setIcon(icon);
			}
		});
		JMenu menu = new JMenu("文件");
		menuBar.add(menu);
		JMenuItem openItem = new JMenuItem("打开");
		menu.add(openItem);
		openItem.addActionListener(event -> {
			
		});
	}
}

class ExtensionFileFilter extends FileFilter{
	private String description;
	private ArrayList<String> extensions = new ArrayList<>();
	public void addExtension(String extension) {
		if(!extension.startsWith(".")) {
			extension = "."+extension;
			extensions.add(extension.toLowerCase());
		}
	}
	public void setDescription(String aDescription) {
		description = aDescription;
	}
	public String getDescription() {
		return description;
	}
}

class FileIconView extends FileView{
	private FileFilter filter;
	public FileIconView(FileFilter filter) {
		this.filter = filter;
	}
}