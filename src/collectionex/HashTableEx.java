package collectionex;

import java.util.Hashtable;

public class HashTableEx {
public static void main(String[] args) {
	Hashtable<Integer, String> h=new Hashtable<Integer, String>();
	h.put(1, "Java");
	h.put(2, "HTML");
	h.put(3, "css");
	h.put(3, "c#");//it will take latest value if key is duplicate
	h.put(4, "c#");//It is Synchronized
//	h.put(null, "c++");// not allowed null key and null value
//	h.put(5, null);
//	h.put(6, null);
	h.putIfAbsent(0, ".net");
	System.out.println("HashTable Elements: "+h);
}
}
