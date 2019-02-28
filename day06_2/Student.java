package day06_2;

public class Student {
	private String stuNO;
	private String stuName;
	private String stuAddress;
	
	public Student(String stuNO, String stuName, String stuAddress) {
		super();
		this.stuNO = stuNO;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStuNO() {
		return stuNO;
	}
	public void setStuNO(String stuNO) {
		this.stuNO = stuNO;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	@Override
	public String toString() {
		return "Student [stuNO=" + stuNO + ", stuName=" + stuName + ", stuAddress=" + stuAddress + "]";
	}
	@Override
	/*public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((stuNO == null) ? 0 : stuNO.hashCode());
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		
		if (stuNO == null) {
			if (other.stuNO != null)
				return false;
		} else if (!stuNO.equals(other.stuNO))
			return false;
		
		return true;
	}*/
	public boolean equals(Object obj) {
		Student other = (Student)obj;
		if ((this.stuNO).equals(other.stuNO)) {
			return true;
		}
		return false;
		
	}
	public int hashCode() {
		return this.stuNO.hashCode();
	}
}
