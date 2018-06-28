package chapter11.chapter11_4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.Box;

public class CommonComponent {

	Frame f = new Frame();
	Button ok = new Button("确认");
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox male = new Checkbox("男", cbg, true);
	Checkbox female = new Checkbox("女", cbg, false);
	Checkbox married = new Checkbox("是否已婚?", false);
	Choice colorChooser = new Choice();
	List colorList = new List(6, true);
	TextArea ta = new TextArea(5, 20);
	TextField name = new TextField(50);
	public void init() {
		colorChooser.add("红色");
		colorChooser.add("绿色");
		colorChooser.add("蓝色");
		colorList.add("红色");
		colorList.add("绿色");
		colorList.add("蓝色");
		Panel bottom = new Panel();
		bottom.add(name);
		bottom.add(ok);
		f.add(bottom, BorderLayout.SOUTH);
		Panel checkPanel = new Panel();
		checkPanel.add(colorChooser);
		checkPanel.add(male);
		checkPanel.add(female);
		checkPanel.add(married);
		Box topLeft = Box.createVerticalBox();
		topLeft.add(ta);
		topLeft.add(checkPanel);
		Box top = Box.createHorizontalBox();
		top.add(topLeft);
		top.add(colorList);
		f.add(top);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CommonComponent().init();
	}

}
