package day05;

public class Human {
	private String name;
	private String sex;
	private String age;
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Human(String name, String sex, String age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	public void canEat() {
		System.out.println("can eat");
	}
	public void breath( ){
		System.out.println("breath");
	}
	public void sayHello(String str) {
		System.out.println("Human---sayHello");
	}
	public void sayHello() {
		System.out.println("Human---sayHello");
	}
}
