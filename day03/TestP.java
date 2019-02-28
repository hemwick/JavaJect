package day03;

import javax.xml.parsers.DocumentBuilder;

public class TestP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//包装类 
		//int double
		//Integer Double
		double dd=5.89;
		Double d=new Double(dd);
		System.out.println(d);
		
		//String转Double
		String dd2="5.89";
		Double d2=new Double(dd2);
		System.out.println(d2);
		
		//Double-->double
		double d3=d.doubleValue();
		System.out.println(d3);
		
		int d4=d.intValue();
		System.out.println(d4);
		
		int d5=(int)d3;
		
		int i=0;
		Integer ii=new Integer(i);
		System.out.println(ii);
		
		//String-->Integer
		Integer ii2= new Integer("1234");
		System.out.println(ii2);
		
		String str=String.valueOf(ii2);
		System.out.println(str);
		
		
		
		
		
		
		
		
		}
	

}
