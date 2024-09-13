package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class HashSet_Demo {
	
	public static void main(String[] args) throws Exception {

		Set<Object> s = new HashSet<Object>();
		s.add(100);
		s.add("Hussain");
		s.add("c");

		System.out.println(s);

//		Iterator<Object> itr= s.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr .next());
//		}

		for (Object object : s) {
			System.out.println(object);
		}

	}

}
