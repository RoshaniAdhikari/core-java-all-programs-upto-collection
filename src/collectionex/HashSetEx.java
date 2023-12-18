package collectionex;

import java.util.HashSet;

public class HashSetEx {
public static void main(String[] args) {
	HashSet<Integer> h=new HashSet<Integer>();
	h.add(10);
	h.add(20);
	h.add(10);//if duplicate it will take only latest value
	h.add(null);
	h.add(null);//only  take one null value
	h.add(5);
	
	System.out.println("Elements in hashset : "+h);
	HashSet<Integer> h1=new HashSet<Integer>();
	h1.add(6);
	h1.add(30);
	h1.add(10);
	System.out.println("Elements in hashsett : "+h1);
	//Union of two set
//	h1.addAll(h);//add all but not duplicate values
//	System.out.println("Union Operation: "+h1);
//	//Intersection of two set
//	h1.retainAll(h);
//	System.out.println("Intersection operation : "+h1);
	//Differance Method
	h1.removeAll(h);
	System.out.println("Differance operation : "+h1);
}
}
