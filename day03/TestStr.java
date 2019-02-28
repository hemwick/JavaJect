package day03;

public class TestStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hello";
		a="world";
		
		
		String p="humburger";
		String p1=new String("efg");
		String p2=new String("abc");
		
		int sum=p1.compareTo(p2);//比较ascii码的值
		System.out.println(sum);
		System.out.println("a".concat("b"));//拼接
		System.out.println("abc".endsWith("bc"));//测试此字符串是否以指定后缀结束
		System.out.println(p1.equals(p2));//比较具体数值 与object类下equals不同。
		
		String str1="fly";
		String str2="wait";
		String str3="flyweight";
		String str4=str1+str2;
		String str5="fly"+"weight";//编译过程变成flyweight 无需在内存开辟新空间
		System.out.println(str3==str4);
		System.out.println(str3==str5);
		System.out.println(str4==str5);
		
		System.out.println("abcdefg".indexOf("ef"));
		System.out.println("abcdefg".length());
		
		String str6="a,b,c,d";
		String[] aaa=str6.split(",");
		for(int i=0;i<aaa.length;i++) {
			System.out.println(aaa[i]+"--------");
		}
		System.out.println();
		
		for (String m:aaa) {
			System.out.println(m);
		}
		
		System.out.println();
		
		//p="humburger";
		System.out.println(p.substring(4,9));
		//节选字符串
		System.out.println(p.toUpperCase().toLowerCase());
		//大小写转换
		System.out.println("         dsjkda         ".trim());
		//消除空格
		System.out.println();
		
		
		String str10="this is a test of java";
		//(1)统计字符串s出现的次数
		int count=0;
		for (int i = 0; i < str10.length(); i++) {
			String a1=str10.substring(i, i+1);
			if (a1.equals("s")) {
				count++;
			}
		}
		System.out.println(count);
		//取出字符串test
		System.out.println(str10.substring(10, 14));
		//将每个词首字母大写
		
		String[] a2=str10.split(" ");
		for (int i = 0; i < a2.length; i++) {
			a2[i]=a2[i].substring(0, 1).toUpperCase()+a2[i].substring(1);
			System.out.print(a2[i]+" ");
		}
		System.out.println();
		//用两种方法实现字符串的倒叙输出（String Buffer 和for）
		for (int i = 0; i < str10.length(); i++) {
		//	System.out.print(str10.substring(str10.length()-1-i,str10.length()-i));
		
		StringBuffer sb = new StringBuffer(str10);
		System.out.println(sb.reverse());
		}
		System.out.println();
		//算出字符串中字母 数字 和空格各有多少
		//Character.isDefined(args)
		//输出yyyy-MM-dd 判断是今年的第几天
		//将十进制转换为二进制
		
		
		
		StringBuffer sfer=new StringBuffer("abc");
		sfer.append("efg");
		System.out.println(sfer);
		
		System.out.println(sfer.reverse());//倒序输出
		
		
	
		
		
		
	}

}
