package day04;

   

public class TestHelloWorld {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		hello.userName = "方正";
		System.out.println(hello.userName);
		hello.sayHello();
		
		System.out.println(hello.toString());
		
		hello.setSecret("wawawa");
		System.out.println(hello.getSecret());
		
		hello.setPasswd(123456);
		System.out.println(hello.getPasswd());
	}
}
