package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2018-09-12 09:59:30
		//2018/09/12 09:59:30
		Date d=new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(d);
		System.out.println(time);
	}

}
