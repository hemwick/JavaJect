package day05_03;

public class TestPerson {
	public static void main(String[] args) {
		Person[] p=new Person[2];
		p[0]= new Employee("zs",50000);
		
		p[1]=new Student("ls","math");
		
		for(int i = 0 ; i<p.length;i++) {
			Person pr=p[i];
			System.out.println(pr.getName()+"---"+pr.getDescription());
			
		}
		
	}
}
