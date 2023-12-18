package accessspecifier;

class Fruit
{
	int price;
	Fruit(int price)
	{
		this.price=price;
	}
	void display()
	{
		System.out.println("price of fruit: "+price);
	}
}
class Mango extends Fruit
{
	String nm;
	Mango(int price ,String nm)
	{
		super(price);
		this.nm=nm;
	}
		void mDisplay()
		{
			display();
			System.out.println("Name of Fruit : "+this.nm);
	}
}
public class DefaultAcc {
public static void main(String[] args) {
	Fruit f=new Fruit(70);
	f.display();
	System.out.println("****Sub Class****");
	Mango m=new Mango(80, "mango");
	m.mDisplay();
}
}
