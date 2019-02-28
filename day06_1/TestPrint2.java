package day06_1;

public class TestPrint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackPrint bp = new BlackPrint();
		ColorPrint cp = new ColorPrint();
		Teacher1 t1 = new Teacher1();
		Student s = new Student();
		t1.setP(bp);
		t1.print(s);
		t1.setP(cp);
		t1.print(t1);

	}

}
