package day06;

public class SoundCard implements PCI {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("DUDUDU");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("sound stop");
	}
	
	public void sleep() {
		System.out.println("sound sleep");
	}
}
