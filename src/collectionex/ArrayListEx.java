package collectionex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrayListEx {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
    al.add(10);
    al.add(40);
    al.add(70);
    al.add(20);
    al.add(40);
    System.out.println("Elements in Arraylist are : " +al);
    System.out.println("Size Of My Array "+al.size());
    System.out.println("My Sorted Arraylist");
    Collections.sort(al);
    for(int i:al)
    {
    	System.out.println(i);
    }
    ArrayList<String> al1=new ArrayList<String>();
    al1.add("roshani");
    al1.add("nikita");
    al1.add("Preetha");
    al1.add("Saundarya");
    al1.add("Narmadha");
    System.out.println("My FriendList is : "+al1);
    al1.remove(3);
    System.out.println("My FriendList is : "+al1);
    System.out.println("First position : "+al1.get(1));
    al1.set(2, "Rajlakshmi");
    System.out.println("Es Empty"+al1.isEmpty());
    System.out.println("Contains : "+al1.contains("nikita"));
    System.out.println("Index Of : "+al.indexOf(40));
    System.out.println("Last index of : "+al1.lastIndexOf(40));
}
}
