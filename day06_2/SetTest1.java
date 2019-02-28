package day06_2;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet();
		s.add("hello");
		s.add("world");
		s.add(new Name("f1","f2"));
		s.add(new Integer(100));
		s.add(new Name("f1","f2"));
		s.add("hello");
		System.out.println(s);
		
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		s1.add("a");s1.add("b");s1.add("c");
		s2.add("d");s2.add("a");s2.add("b");
		Set sn = new HashSet(s1);
		sn.retainAll(s2);
		Set su = new HashSet(s1);
		su.addAll(s2);
		System.out.println(sn);
		System.out.println(su);
		}

}
