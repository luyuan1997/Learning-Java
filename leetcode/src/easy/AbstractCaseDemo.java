package easy;

abstract class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void say() {
		System.out.println(this.getContent());
	}
	public abstract String getContent();
	
}

class Student extends Person{
	public Student(String name, int age,float score) {
		super(name, age);
		this.score = score;
		// TODO Auto-generated constructor stub
	}
	
	public String getContent() {
		return "工人信息 -->姓名："+super.getName()+";年龄:"+super.getAge()+";成绩:"+this.score;
	}

	private float score;
}

class Worker extends Person{

	private float salary;

	public Worker(String name, int age,float salary) {
		super(name, age);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "工人信息 -->姓名："+super.getName()+";年龄:"+super.getAge()+";成绩:"+this.salary;
	}
	
}

public class AbstractCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per1 = new Student("张三",20,99.0f);
		Person per2 = new Worker("李四",30,300.0f);
		per1.say();
		per2.say();
	}

}
