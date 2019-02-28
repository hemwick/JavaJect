package day04;

public class JavaTeacher {
	private String name;
	private int age;

	public JavaTeacher() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	public JavaTeacher(String name, int age) {
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
		if (age < 22) {
			System.out.println("error,age<22");
			this.age = 22;
		} else {
			this.age = age;
		}
	}

	@Override
	public String toString() {
		return "JavaTeacher [name=" + name + ", age=" + age + "]";
	}
}
