package day06_2;

import java.util.*;


public class setTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashSet<String> set=new HashSet<String>();
		set.add("1");
		set.add("3");
		set.add("3");
		set.add("7");
		
		Iterator<String> i=set.iterator();
		while (i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}*/
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("3");
		list.add("3");
		list.add("7");
		
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < list.size(); i++) {
			String s1 = list.get(i);
			set.add(s1);
		}
	}

}
