package oops;
class vehicle
{
	int speed=100;
	void display()
	{
		System.out.println("Parent Class");
		System.out.println("Speed of Vehicle : "+speed);
	}
	void type()
	{
		System.out.println("Three Wheeler");
	}
}
class Autorikshaw extends vehicle
{
	int speed=110;
	void display()
	{
		type();		
			super.display();
			System.out.println("Speed of vehicle : "+super.speed);
			System.out.println("Speed of Autorikshaw: "+speed);
		}
	}
public class SuperAsVariable {
public static void main(String[] args) {
	Autorikshaw ar=new Autorikshaw();
	ar.display();
}
}
