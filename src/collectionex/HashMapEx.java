package collectionex;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx {
public static void main(String[] args) {
	HashMap<Integer, String> h=new HashMap<Integer, String>();
	h.put(1, "Java");
	h.put(2, "HTML");
	h.put(3, "css");
	h.put(3, "c#");//it will take latest value if key is duplicate
	h.put(4, "c#");//Not Synchronized
	h.put(null, "c++");//only one null key
	h.put(5, null);
	h.put(6, null);
	h.putIfAbsent(7, ".net");
//	for(int i:h)
//	{
//		System.out.println(i);
//	}
	System.out.println("HashMap Elements: "+h);
	System.out.println("EntrySet: "+h.entrySet());
//	System.out.println("Default : "+h.getOrDefault(3));
	System.out.println(h.containsKey(8));
//	Iterator<String> i = hs.iterator();
//    while(i.hasNext()) 
//        System.out.println(i.next());
	Iterator<Entry<Integer, String> > new_Iterator= h.entrySet().iterator();
// Iterating every set of entry in the HashMap
while (new_Iterator.hasNext()) {
    Map.Entry<Integer, String> new_Map
        = (Map.Entry<Integer, String>)
              new_Iterator.next();
    // Displaying HashMap
    System.out.println(new_Map.getKey() + " = "+ new_Map.getValue());	
    System.out.println("*****************");
    h.forEach(
            (key, value)
                -> System.out.println(key + " = " + value));
}
}
}