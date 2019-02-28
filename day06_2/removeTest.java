package day06_2;


import java.util.*;

public class removeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("3");
		list.add("3");
		list.add("7");
		
		Iterator<String> i=list.iterator();
		while(i.hasNext()) {
			String s1 = i.next();
			if ("3".equals(s1)) {
				i.remove();
			}
		}
		
		Iterator<String> i1= list.iterator();
		while(i1.hasNext()) {
			String s1 = i1.next();
			System.out.println(s1);
		}
	}

}
