package section5_4;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		//由于age和name属性都是private属性，因此必须使用方法获得
		p.setAge(27);
		p.setName("Winston");
		System.out.println("欢迎您："+p.getName()+"到今年您的年龄为："+p.getAge()+"距离您三十岁的时间还有"+(30-p.getAge())+"年");
	}
}
