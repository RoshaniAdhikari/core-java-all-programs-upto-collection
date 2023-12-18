package collectionex;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx {
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
    System.out.println("Size Of My linked "+al.size());
    
    System.out.println("Get Frist : "+al.getFirst());
    System.out.println("Peek Method : "+al.peekFirst());//retrive the first elemeny
    System.out.println(al);
    System.out.println("Poll Method : "+al.pollFirst());//retrive first element and delete also
    System.out.println(al);
}
}
