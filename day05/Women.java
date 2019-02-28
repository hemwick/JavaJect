package day05;

public class Women extends Human {
	
	public static void main(String[] args) {
		Women wm = new Women();
		wm.canEat();
		System.out.println(wm);
		System.out.println(wm.toString());
	}
	public void isMather() {
		System.out.println("women---isMather");
	}
	public void sayHello() {
		System.out.println("women--sayHello");
	}
}
