package Task;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Task2 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(111);
		ts.add(121);
		ts.add(11);
		ts.add(34);
		ts.add(112);
		System.out.println(ts);
		  System.out.println("TreeSet elements (Sorted)...");
	      Iterator<Integer> i = ts.iterator();
	      while(i.hasNext()) {
	         System.out.println(i.next());
	      }
		
	}

}
