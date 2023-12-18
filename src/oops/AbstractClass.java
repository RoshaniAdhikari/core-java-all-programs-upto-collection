package oops;
abstract class Fruit
{
	
	abstract void display();
	void type()
	{
		System.out.println("Fruit Type");
	}
	static void SeasonFruit()
	{
		System.out.println("Cold");
	}
}
class apple extends Fruit
{

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Apple");
	}
	
}
class Graps extends Fruit
{

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Graps");
	}
	
}
public class AbstractClass {
public static void main(String[] args) {
	Fruit a=new apple();//Upcasting
	a.display();
	Fruit.SeasonFruit();
	Fruit g=new Graps();
	g.display();
}
}
