package day06_2;

import java.util.InputMismatchException;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("plz input 1~3");
		Scanner in = new Scanner(System.in);
		int courseCode = 0;
		
		try {
			courseCode=in.nextInt();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println(1);
			e.printStackTrace();
			System.out.println(2);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(3);
			e.printStackTrace();
			System.out.println(4);
		}
		
		switch (courseCode) {
		case 1:
			System.out.println("C");
			break;
		case 2:
			System.out.println("JAVA");
			break;
		}
	
	}

}
