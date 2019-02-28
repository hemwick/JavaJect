package day06_2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestName1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Name n1 = new Name("f1", "l1");
		Name n2 = new Name("f2", "l2");

		HashSet<Name> set = new HashSet<Name>();
		set.add(n1);
		set.add(n2);

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Name name = (Name) iterator.next();
			System.out.println(name.getFirstName());
		}*/
		Collection c=new HashSet();
		c.add(new Name("fff1","lll1"));
		c.add(new Name("f2","l2"));
		c.add(new Name("fff3","lll3"));
		for(Iterator i =c.iterator();i.hasNext();) {
			Name name=(Name)i.next();
			if (name.getFirstName().length()<3) {
				i.remove();
				//如果换成c.remove(name);会产生例外
			}
		}System.out.println(c);
	}
}
