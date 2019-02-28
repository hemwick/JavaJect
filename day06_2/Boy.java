package day06_2;

public class Boy extends Person {
	public void eat() throws Exception {
		System.out.println("eat");
		throw new Exception();
	}
	
}
