package day04;

public class Student {
	private String name;
	private String no;
	private String className;
	private int score;
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", className=" + className + ", score=" + score + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(String name, String no, String className, int score) {
		super();
		this.name = name;
		this.no = no;
		this.className = className;
		this.score = score;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
