package accessspecifier;
class Apple
{
protected int price=100;
protected Apple(int price) {
	this.price=price;
}
protected void display()
{
	System.out.println("Apple class : "+this.price);
}
}
class Orange extends Apple{

	protected Orange(int price) {
		super(price);//we can access protected in nsuperclass
		// TODO Auto-generated constructor stub
	}
	void displayOrange()
	{
		display();
		System.out.println("Orange class : ");
	}
	
}
public class ProtectedEx {

public static void main(String[] args) {
	Apple px=new Apple(200);//we can access protected in nonsubclass
	px.display();
	Orange og=new Orange(50);
	og.displayOrange();
}
}
