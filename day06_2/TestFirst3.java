package day06_2;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class TestFirst3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstLevelTitle f1 = new FirstLevelTitle(1, "汽车", "管理员", new Date());
		FirstLevelTitle f2 = new FirstLevelTitle(2, "高考", "管理员", new Date());
		FirstLevelTitle f3 =new FirstLevelTitle(3,"爆炸","管理员",new Date());
		LinkedList<FirstLevelTitle> list = new LinkedList<FirstLevelTitle>();
		list.addFirst(f1);
		list.add(f3);
		list.addLast(f2);
		
		//FirstLevelTitle g1 =list.getFirst();
		//System.out.println(g1.getTitleName());
		
		//FirstLevelTitle g2 =list.getLast();
		//System.out.println(g2.getTitleName());
		
		//list.removeFirst();
		//list.removeLast();
		print(list);
		Iterator i=list.iterator();
		while(i.hasNext()) {
			FirstLevelTitle f11 =(FirstLevelTitle)i.next();
			System.out.println(f11.getTitleName());
		}
	}
	public static void print(List<FirstLevelTitle> list) {
		for (int i = 0; i < list.size(); i++) {
			FirstLevelTitle f=list.get(i);
			System.out.println(i+""+f.getTitleName());
			
		}
}
}