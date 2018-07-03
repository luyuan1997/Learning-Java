//package chapter12.chapter12_2;
//
//import java.awt.Component;
//import java.awt.GridLayout;
//import java.util.Date;
//
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EtchedBorder;
//import javax.swing.border.TitledBorder;
//
//public class JOptionPaneTest {
//
//	JFrame jf = new JFrame("测试JOptionPane");
//	private ButtonPanel messagePanel;
//	private ButtonPanel messageTypePanel;
//	private ButtonPanel msgPanel;
//	private ButtonPanel confirmPanel;
//	private ButtonPanel optionsPanel;
//	private ButtonPanel inputPanel;
//	private String messageString = "消息区内容";
//	private Icon messageIcon = new ImageIcon("ico/heart.png");
//	private Object messageObject = new Date();
//	private Component messageComponent = new JButton("组件消息");
//	private JButton msgBn = new JButton("消息对话框");
//	private JButton confirmBn = new JButton("确认对话框");
//	private JButton inputBn = new JButton("输入对话框");
//	private JButton optionBn = new JButton("选项对话框");
//	
//	public void init() {
//		JPanel top = new JPanel();
//		top.setBorder(new TitledBorder(new EtchedBorder(), "对话框的通用选项", TitledBorder.CENTER, TitledBorder.TOP));
//		top.setLayout(new GridLayout(1,2));
//		messageTypePanel = new ButtonPanel("选择消息的类型", new String[] {"ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"});
//		messagePanel = new ButtonPanel("选择消息内容的类型", new String[] {"字符串信息", "图标信息", "组件消息", "普通对象消息", "Object[]消息"});
//		top.add(messageTypePanel);
//		top.add(messagePanel);
//		JPanel bottom = new JPanel();
//		bottom.setBorder(new TitledBorder(new EtchedBorder(),"弹出不同的对话框", TitledBorder.CENTER, TitledBorder.TOP));
//		bottom.setLayout(new GridLayout(1,4));
//		msgPanel = new ButtonPanel("消息对话框", null);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	
//	class ButtonPanel extends JPanel{
//		
//	}
//
//}
