package day04;

public class Man {
	private String name;
	private int age;
	public Man() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Man(String name, int age) {
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
		return "Man [name=" + name + ", age=" + age + "]";
	}
	public static void eat() {
		System.out.println("----");
	}
}
