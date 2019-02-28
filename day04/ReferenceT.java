package day04;

public class ReferenceT {

	
	public static void main(String[] args) {
		ReferenceT tt = new ReferenceT();//1实例化类本身
		StringBuffer sb=new StringBuffer("abc");//2实例化一个StringBuffer类型的字符串abc
		System.out.println(sb.toString());
		tt.modify(sb);//3调用modify方法
		System.out.println(sb.toString());//7
	}
	
	public void modify(StringBuffer sb) { //4定义一个stringbuffer类型的sb2
		sb.append("efg");//5拼接sb2
		System.out.println(sb.toString());//6
		//引用传递
	}
}
