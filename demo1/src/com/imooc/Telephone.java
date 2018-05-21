package com.imooc;

public class Telephone {
//	float screen;
//	float cpu;
//	float mem;
//为了防止在使用过程中，用户对数据的更改，因此需要对数据的进行封装；
	private float screen;
	private float cpu;
	private float mem;
	
	public float getScreen() {//得到封装类中的screen的值
		return screen;
	}
	
	public void setScreen(float newScreen) {//设置封装后的类的screen值，其中，newScreen为参数；
		screen = newScreen;
	}
	
	public Telephone() {
		System.out.println("无参数的构造方法执行了");
	}
	public Telephone(float newScreen, float newCpu, float newMem) {
		if(newScreen < 3.5f) {
			System.out.println("您输入的屏幕尺寸太小，自动赋值为3.5f");
			newScreen = 3.5f;
		}else {
			screen = newScreen;
		}
		
		cpu = newCpu;
		mem = newMem;
		System.out.println("有参数的构造方法执行了");
	}
}
