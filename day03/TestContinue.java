package day03;

public class TestContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break跳出离自己最近的循环
		for (int j = 0; j < 2; j++) {
			
		
		for (int i = 0; i < 5; i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
	}
		for (int k = 0; k <5; k++) {
			if (k==3) {
				continue;
			}
			System.out.println(k);
			
		}
	}
}
