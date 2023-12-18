package collectionex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class IteratorInterface {
public static void main(String[] args) {
	LinkedList<Integer> al=new LinkedList<Integer>();
    al.addFirst(10);
    al.add(40);
    al.add(70);
    al.addLast(20);
    al.add(40);
    al.offerLast(90);
    al.offerFirst(89);
    System.out.println("Elements in Linkedlist are : " +al);
	System.out.println("Element in Linked List using Iterator :");
//	Iterator<Integer> iter = al.iterator();
	Iterator<Integer> iter = al.descendingIterator();
    while (iter.hasNext()) {
      int i = iter.next();
       System.out.println(i);
       
    }
}
}
