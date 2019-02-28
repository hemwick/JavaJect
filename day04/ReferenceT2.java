package day04;

public class ReferenceT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceT2 t2 = new ReferenceT2();
		int a = 1;
		t2.modify(a);
		System.out.println(a);
	}

	public void modify(int a) {
		a = a + 1;
		System.out.println(a);//值传递

	}
}
