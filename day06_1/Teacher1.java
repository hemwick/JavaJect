package day06_1;

public class Teacher1 implements Introduceable {

	private PrintFace p;

	@Override
	public String detail() {
		// TODO Auto-generated method stub
		return "i am teacher";
	}

	public void print(Introduceable intro) {
		p.print(intro.detail());
	}

	public PrintFace getP() {
		return p;
	}

	public void setP(PrintFace p) {
		this.p = p;
	}

}
