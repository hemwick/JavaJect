package day05;

public class JudgeAll {
	public void judge(Human human) {
		human.sayHello();
	}
	
	public static void main(String[] args) {
		Women women=new Women();
		//women.setName("ZS");
		
		Man man = new Man();
		man.setName("LS");
		JudgeAll j2=new JudgeAll();
	j2.judge(women);
	j2.judge(man);
		//多态：不同的对象调用同一个方法实现不同的操作
	}
}
