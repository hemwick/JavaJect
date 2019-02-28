package day03;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//产生【0，999】之间的随机整数[a,b]
		//(int)(Math.random()*(b-a+1))+a;
		int number=(int)(Math.random()*1000);
		for (int i = 0; i < 1000; i++) {
			number=(int)(Math.random()*1000);
			System.out.println(number+"      ");
		}
		//System.out.println(Math.random());
		
		
	}

}
