package day06_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("请输入S1的总学时");
			int totalTime = in.nextInt();
			System.out.println("请输入S1的课程数目");
			int totalCourse = in.nextInt();
			System.out.println("S1个课程的平均学时为:" + totalTime / totalCourse);
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("输入不为数字");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("课程数目不能为0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("发生错误" + e.getMessage());
		}
	}

}
