package day06_2;


import java.util.*;

public class TestFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstLevelTitle f1 =new FirstLevelTitle(1,"汽车","管理员",new Date());
		FirstLevelTitle f2 =new FirstLevelTitle(2,"高考","管理员",new Date());
		FirstLevelTitle f3 =new FirstLevelTitle(3,"爆炸","管理员",new Date());
		
		List<FirstLevelTitle> list = new ArrayList<FirstLevelTitle>();
		list.add(f1);
		list.add(f2);
		
		list.add(2, f3);
		if(list.contains(f2)) {
			System.out.println("有高考的新闻");
		}else {
			System.out.println("没有高考的新闻");
		}
		list.remove(1);
		print(list);
		//list.add(f3);
		
		//print(list);
	}

	public static void print(List<FirstLevelTitle> list) {
		for (int i = 0; i < list.size(); i++) {
			FirstLevelTitle firstLevelTitle=list.get(i);
			System.out.println(i+""+firstLevelTitle.getTitleName()+firstLevelTitle.getId());
			
		}
	}
}
