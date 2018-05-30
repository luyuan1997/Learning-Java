package overrideEqualsRight;
class Person{
	private String name;
	private String idStr;
	public Person() {};
	public Person(String name, String idStr) {
		this.name = name;
		this.idStr = idStr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
	public String getName() {
		return name;
	}
	public String getIdStr() {
		return idStr;
	}
	public boolean equals(Object obj) {
		//如果两个对象为同一个对象
		if(this == obj) {
			return true;
		}
		//只有当obj时Person对象
		if(obj != null && obj.getClass() == Person.class) {
			Person personObj =(Person)obj;
			//并且当前对象的idStr与obj对象的idStr相等时才可判断两个对象相等
			if(this.getIdStr().equals(personObj.getIdStr())) {
				return true;
			}
		}
		return false;
	}
}
public class OverrideEqualsRight {
	public static void main(String[] args) {
		Person p1 = new Person("孙悟空","12345645218");
		Person p2=new Person("孙行者","12345645218");
		Person p3 = new Person("孙悟饭","1221341");
		//p1和p2的idStr相等，所以输出true
		System.out.println("p1和p2是否相等？"+p1.equals(p2));
		//p2和p3的idStr不相等，所以输出false
		System.out.println("p3和p2是否相等？"+p3.equals(p2));
	}
}
