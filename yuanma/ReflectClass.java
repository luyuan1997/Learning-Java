package yuanma;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectClass {
	private final static String TAG = "ReflectClass";
	
	//创建对象
	public static void reflcetNewInstance() throws Exception {
		try {
			Class<?> classBook = Class.forName("yuanma.Book");
			Object objectBook = classBook.newInstance();
			Book book = (Book) objectBook;
			book.setName("Android进阶之光");
			book.setAuthor("刘望舒");
			System.out.println("reflectNewInstance book = " + book.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//反射私有构造方法
	public static void reflectPrivateConstructor() throws Exception {
		try {
			Class<?> classBook = Class.forName("yuanma.Book");
			Constructor<?> declaredConstructorBook = classBook.getDeclaredConstructor(String.class, String.class);
			declaredConstructorBook.setAccessible(true);
			Object objectBook = declaredConstructorBook.newInstance("Android开发艺术探索","任玉刚");
			Book book = (Book) objectBook;
			System.out.println("reflectPrivateConstructor book = " + book.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//反射私有属性
	public static void reflectPrivateField() throws Exception {
		try {
			Class<?> classBook = Class.forName("yuanma.Book");
			Object objectBook = classBook.newInstance();
			Field fieldTag = classBook.getDeclaredField("TAG");
			fieldTag.setAccessible(true);
			String tag = (String) fieldTag.get(objectBook);
			System.out.println("reflectPrivateField tag = " + tag);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//反射私有方法
	public static void reflectPrivateMethod() throws Exception {
		try {
			Class<?> classBook = Class.forName("yuanma.Book");
			Method methodBook = classBook.getDeclaredMethod("declaredMethod", int.class);
			methodBook.setAccessible(true);
			Object objectBook = classBook.newInstance();
			String string = (String) methodBook.invoke(objectBook, 0);
			System.out.println("reflectPrivateMethod string = " + string);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//获得系统Zenmode值
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		ReflectClass rc = new ReflectClass();
//		rc.reflcetNewInstance();
//		rc.reflectPrivateConstructor();
//		rc.reflectPrivateField();
		rc.reflectPrivateMethod();
	}
}
