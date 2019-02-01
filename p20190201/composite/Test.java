package p20190201.composite;

public class Test {
	private static void printDep(Department department) {
		System.out.println("部门名称" + department.getName());
		System.out.println("部称人数" + department.getNumberOfPeople());
		System.out.println("部长名称" + department.getNameOfMinister());
		System.out.println("部称级别" + department.getLevel());
		System.out.println("----------------------------------");
		if(!department.getSubDepartments().isEmpty()) {
			for(Department department1 : department.getSubDepartments()) {
				printDep(department1);
			}
		}
	}
	public static void main(String[] args) {
		Department department_level = new Department("消费者BG", 1000, "Winston", 1);
		department_level.add(new Department("产品线", 300, "Lu", 2));
		department_level.add(new Department("产品线2", 500, "Lu2", 3));
		department_level.add(new Department("产品线3", 800, "Lu3", 4));
		printDep(department_level);
	}

}
