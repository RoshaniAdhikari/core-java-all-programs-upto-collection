package collectionex;

import java.util.TreeSet;

public class TreeSetEx {
public static void main(String[] args) {
	TreeSet<String> t=new TreeSet<String>();
	t.add("roshani");
	t.add("preetha");
	t.add("Rajlakshmi");
	t.add("Rutumbara");
	t.add("Rajlakshmi");
	//t.add(10);hetorogenious not allow
	//t.add(null);
	System.out.println("treeset Hashcode Elements: "+t.hashCode());//print any integer value based on elements
	System.out.println("treeset Elements: "+t);	
}
}
