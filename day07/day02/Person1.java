package day07.day02;

public class Person1 {
	private String name;
	private int age;
	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
}
