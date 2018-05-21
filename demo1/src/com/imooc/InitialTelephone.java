package com.imooc;

public class InitialTelephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//通过无参数的构造方法可以创建对象
		Telephone phone = new Telephone();
		//通过有参数的构造方法创建对象,并给对象中的实例变量赋初值
		Telephone phone2 = new Telephone(1.5f, 1.4f, 2.0f);
		//phone2.cpu=6.0f此时已经不能再起作用，因为类已经封装
		phone2.setScreen(6.0f);//设置封装属性值
		System.out.println("screen:"+phone2.getScreen());
	}

}
//构造方法注意点：
//1）当没有制定构造方法时，系统会自动添加无参的构造方法；
//2）当有制定构造方法，无论是有参、无参的构造方法，都不会自动添加无参的构造方法；
//3）构造方法的重载：方法名相同，但是参数不同的读哟个方法，调用时会自动根据不同的参数选择相应的方法
//4）构造方法不但可以给对象的属性赋值，还可以保证给对象的属性赋一个合理的值；