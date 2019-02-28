package day07.day02;


import java.util.Comparator;
public class PersonComparator implements Comparator<Person1> {

	@Override
	public int compare(Person1 arg0, Person1 arg1) {
		
		return arg0.getAge()-arg1.getAge();
	}

}
