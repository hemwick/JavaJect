package day04;
/**
 * 
 * @author Administrator
 *1.属性：姓名 性别 对象 name sex 对象
 *2.同性不能结婚
 *3.结过婚的不能结婚
 *4.两人都是单身 可以结婚
 */
public class Person {
	private String name;
	private String sex;
	private Person partener;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String sex, Person partener) {
		super();
		this.name = name;
		this.sex = sex;
		this.partener = partener;
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
	public Person getPartener() {
		return partener;
	}
	public void setPartener(Person partener) {
		this.partener = partener;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", partener=" + partener + "]";
	}
	
	
	public void marry(Person that ) {
		System.out.println(this.sex+"---"+that.sex);
		if ((this.sex).equals(that.sex)) {
			System.out.println("同性不能结婚");
		}else {
			if (this.partener!=null || that.partener!=null) {
				System.out.println("结过婚不能结婚");
			}else {
				System.out.println("你俩可以结婚");
				this.partener = that;
				that.partener = this;
			}
		}
	}
	
	
	
}
