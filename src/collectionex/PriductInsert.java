package collectionex;

import java.util.ArrayList;
import java.util.Iterator;

public class PriductInsert {
public static void main(String[] args) {
	ArrayList<Product>al=new ArrayList<>();
	Product p=new Product(1, "Mobile", 20000);
	al.add(p);
	al.add(new Product(2, "Chair", 500));
	al.add(new Product(3, "Table", 500));
	al.add(new Product(4, "Laptop", 500));
	al.add(new Product(5, "NoteBook", 500));
	System.out.println("Elements in arraylist : "+al);
	al.remove(2);
	Product p2=new Product(3, "iphone", 100000);
	al.set(2, p2);
	System.out.println("***********************");
	System.out.println("Using enhance for loop");
	for(Product p1:al)
	{
		System.out.println("id : "+p1.getId());
		System.out.println("id : "+p1.getName());
		System.out.println("id : "+p1.getPrice());
	}
	System.out.println("***********************");
	System.out.println("Using Iterable");
	Iterator<Product>itr=al.iterator();
	while(itr.hasNext())
	{
		Product p1=itr.next();
		System.out.println(p1);
		}
}
}
	