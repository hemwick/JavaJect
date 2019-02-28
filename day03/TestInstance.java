package day03;

public class TestInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str ="abc";
		String str2=new String("aaa");
		if (str2 instanceof String) {
			System.out.println("是字符串类型");
		}
		
		Integer i=0;//Integer int对应的包装类型
		if (i instanceof Integer) {
			System.out.println("是Integer类型");
		}
		System.out.println(5>>>1);
	}

}
