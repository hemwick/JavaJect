package day05;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Judge {

	
	public void judge(Women women) {
		women.sayHello();
		women.isMather();
	}
	public void judge(Man man) {
		man.sayHello();
		man.isFather();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Women women=new Women();
		women.setName("ZS");
		
		Man man = new Man();
		man.setName("LS");
		Judge j=new Judge();
		j.judge(man);
	}
}
