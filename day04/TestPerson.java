package day04;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Jack = new Person("Jack","男",null);
		Person Helen = new Person("Helen","女",null);
		Person Tom = new Person("Tom","男",null);
		Person Jerry = new Person("Jerry","男",null);
		//Jack.marry(Rose);
		//Tom.marry(Jack);
		//Rose.marry(Jerry);
		Helen.marry(Jack);
	}

}
