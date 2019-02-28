package day06_1;

public class Teacher implements Introduceable {

	private Printer p = new Printer();

	@Override
	public String detail() {
		// TODO Auto-generated method stub
		return "I am teacher";
	}

	public void print(Introduceable intro) {
		p.print(intro.detail());
	}
	public Printer getP() {
		return p;
	}

	public void setP(Printer p) {
		this.p = p;
	}

	
}
