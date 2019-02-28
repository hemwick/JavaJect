package day05_03;
//抽象类不能实例化
//抽象类必须被继承
public abstract class Person {
	private String name;//定义名字
	
	public Person() {
		super();
	}//定义无参的构造方法
	public Person(String name) {
		super();
		this.name = name;
	}//定义有参名字的构造方法
	public abstract String getDescription();//定义一个抽象方法 不包含方法体
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
