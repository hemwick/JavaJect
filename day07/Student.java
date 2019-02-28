package day07;

public class Student {
	private String name;
	private String className;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String className) {
		super();
		this.name = name;
		this.className = className;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", className=" + className + "]";
	}
	
}
