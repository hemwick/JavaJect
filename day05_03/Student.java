package day05_03;

public class Student extends Person {
	//private String name;
	private String major;
	

	public Student() {
		super();
	}
	public Student (String name) {
		super(name);
	}
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
///////////////////////////////////////
	public String getDescription() {
		return "你学的专业" + major;
	}
///////////////////////////////////////	
}
