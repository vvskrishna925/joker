package milestone2;

import java.util.*;

public class DemoArray {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		// insert 
		al.add(12);
		al.add(13);
		al.add(24);
		al.add(12);
		// index = 0 to length - 1;
		// when object object is added then index will be created 
//		System.out.println(al.remove(0));
//		System.out.println(al.size());
//		 iteration 
		/* Iteration
		 * 1.Iterator
		 * 2.ListIterator
		 * 3.For Loop
		 * 4.For each
		 * 
		 */
		// using for loop
//		for (int i = 0;i <= al.size();i++) {
//			System.out.println(al.get(i));
//		}
		// using for each loop
//		for (int i:al) {
//			System.out.println(i);
//		}
		// collection supports boxing 
//		Iterator<Integer> i = al.iterator();
//		String Str = "";
//		while (i.hasNext())// checks if i as address or not
//			{ 
//				 Str += i.next() + " ";
//			// gets the value from that particular address and moves to the next location 
//		}
//		System.out.println(Str);
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			}
		// System.out.println();
//		while(li.hasPrevious()) {
//			System.out.print(li.previous() + " ");
//		}
	}
}
