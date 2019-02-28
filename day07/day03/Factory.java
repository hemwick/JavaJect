package day07.day03;

public class Factory {
	public static Object getI(String className) {
	/*if(name.equals("螺丝钉")) {
		C1 c1 = new C1();
		return c1;
	}else {
		C2 c2 = new C2();
		return c2;
	}*/
	Object o =null;
	try {	
	Class c =Class.forName(className);
	o = c.newInstance();
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return o;
}
}
