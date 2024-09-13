package collection;

import java.util.Stack;

public class Stack_Demo {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push(100);
		s.push("Hussain");
		s.add(200);
		
		System.out.println(s);
		
		s.pop();//Removes topmost element
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
	}
}
