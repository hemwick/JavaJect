package day05_03;

public class Employee extends Person {
	public String name;
	private double salary;
	//@Override
	//public String toString() {
	//	return "Employee [name=" + name + ", salary=" + salary + "]";
	//}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override///////////////////////
	public String getDescription() {
		// TODO Auto-generated method stub
		return "员工的工资是："+salary;
	}
///////////////////////////////////////
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
