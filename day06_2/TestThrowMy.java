package day06_2;

public class TestThrowMy {
	public static void main(String[] args)  {
		int score=150;
		try {
			if (score>100||score<0) {
				throw new MyException("你输入的数字超出范围");
			}else {
				System.out.println("input right");
			}
		} catch (MyException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
