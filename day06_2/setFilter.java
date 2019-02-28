package day06_2;

import java.util.HashSet;
import java.util.Iterator;

public class setFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> set=new HashSet<Student>();
		Student stu1= new Student("001","张三","中华门");
		Student stu2= new Student("002","李四","中华门");
		Student stu3= new Student("002","王五","鼓楼");
		Student stu4= new Student("001","刘六","雨花台");
		Student stu5= new Student("003","赵七","定淮门");
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
		
		Iterator<Student> it=set.iterator();
		System.out.println("Set的长度"+set.size());
		while (it.hasNext()) {
			System.out.println((Student) it.next());
			
		}
	}

}
