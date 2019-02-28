package day07;

import java.util.*;

public class mapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("李明","Java3");
		Student s2=new Student("刘丽","Java4");
		
		Map<String, Student> map = new HashMap<String,Student>();
		map.put("Jack", s1);
		map.put("Rose", s2);
		
		System.out.println("key值输出---"+map.keySet());
		System.out.println("value值输出---"+map.values());
		System.out.println(map);
		
		Set<String> set=map.keySet();
		Iterator i=set.iterator();
		while(i.hasNext()) {
				String kk =(String) i.next();
			Student st = map.get(kk);
			System.out.println(st.getName()+"---"+st.getClassName());
		}
		
		
	/*	String key = "Jack";
		if(map.containsKey(key)) {
			System.out.println(map.get(key));
		}
		
		map.remove(key);
		System.out.println(map);
	}*/

}}
