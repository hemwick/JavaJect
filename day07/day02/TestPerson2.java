package day07.day02;

import java.util.*;

public class TestPerson2 {
	public static void main(String[] args) {
	Person1 p1 = new Person1("Jack", 25);
	Person1 p2 = new Person1("Rose", 22);
	List<Person1> list = new ArrayList<Person1>();
	//List list = new ArrayList();
	list.add(p1);
	list.add(p2);
	
	Iterator<Person1> i = list.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
		
	}
	Collections.sort(list, new PersonComparator());
	System.out.println(list);
}

}
