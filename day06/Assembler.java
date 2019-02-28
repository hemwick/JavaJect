package day06;

public class Assembler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoundCard sc=new SoundCard();
		PCI nc=new NetworkCard();
		
		sc.start();
		nc.start();
		System.out.println();
		sc.stop();
		nc.stop();
		sc.sleep();
		
	}

}
