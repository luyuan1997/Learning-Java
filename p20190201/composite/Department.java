package p20190201.composite;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private int numberOfPeople;
	private String nameOfMinister;
	private int level;
	private List<Department> subDepartments;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	public String getNameOfMinister() {
		return nameOfMinister;
	}
	public void setNameOfMinister(String nameOfMinister) {
		this.nameOfMinister = nameOfMinister;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public List<Department> getSubDepartments() {
		return subDepartments;
	}
	public void setSubDepartments(List<Department> subDepartments) {
		this.subDepartments = subDepartments;
	}
	public Department(String name, int numberOfPeople, String nameOfMinister, int level) {
		super();
		this.name = name;
		this.numberOfPeople = numberOfPeople;
		this.nameOfMinister = nameOfMinister;
		this.level = level;
		this.subDepartments = new ArrayList<>();
	}
	
	public void add(Department department) {
		this.subDepartments.add(department);
	}
	
	public void remove(Department department) {
		this.subDepartments.remove(department);
	}
}
