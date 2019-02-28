package day07.day02;


import java.util.*;

public class testPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Jack", 24);
		Person p2 = new Person("Rose", 21);
		List<Person> list = new ArrayList<Person>();
		//List list = new ArrayList();
		list.add(p1);
		list.add(p2);
		
		Iterator<Person> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		Collections.sort(list);
		System.out.println(list);
	}

}
