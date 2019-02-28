package day05_2;

public class TestPr {

	public void Printer(Printer p) {
		p.print("HelloWorld");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackPrinter bp=new BlackPrinter();
		ColorPrinter cp=new ColorPrinter();
		
		TestPr tp=new TestPr();
		tp.Printer(bp);
		System.out.println();
		tp.Printer(cp);
	}

}
