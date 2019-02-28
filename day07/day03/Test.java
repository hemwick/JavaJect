package day07.day03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//螺丝钉 c1.f()
		//螺丝帽 c2.f()
		try {
			String className = "day07.day03.C1";
			I i =(I) Factory.getI(className);
			i.f();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
