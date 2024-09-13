package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Cursors_Demo {

	public static void main(String[] args) {

		// Iterator Demo

		List arraylist = new ArrayList();

		arraylist.add(100);
		arraylist.add("Hussian");
		arraylist.add("c");

//		Iterator itr = arraylist.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		// List Iterator demo

		ListIterator listitr = arraylist.listIterator();

		while (listitr.hasNext()) {
			System.out.println(listitr.next());
		}

		// We cannot directly use following way as the cursor by default points at the
		// begining of the Iterator
		while (listitr.hasPrevious()) { //Backward direction iteration
			System.out.println(listitr.previous());
		}

		//We can also move the cursor by using .next() method 
		//Here there are three objects in the list hence we have use listitr.next() three times.
		
	}

}
