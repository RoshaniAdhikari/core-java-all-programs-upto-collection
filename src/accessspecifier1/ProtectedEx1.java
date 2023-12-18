package accessspecifier1;

import accessspecifier.vehicle;

class Bike extends vehicle
{
	String nm;
	protected Bike(int s,String name) {
		super(s);
		nm=name;
		// TODO Auto-generated constructor stub
	}
	void displayBike()
	{
		display();
		System.out.println("name: "+nm);
	}
}
public class ProtectedEx1 {
public static void main(String[] args) {
	Bike b=new Bike(1000," Pulsor");
	b.displayBike();
	//vehicle v=new vehicle();//we can not access protected constructor in another package non subclass
}
}
