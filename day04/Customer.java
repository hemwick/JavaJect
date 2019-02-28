package day04;

public class Customer {
	private String name;
	private boolean sex;
	private String weight;
	private String height;
	
	
	public Customer() {
		super();
	}
	
	public Customer(String name, boolean sex, String weight, String height) {
		super();
		this.name = name;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", sex=" + sex + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
}
