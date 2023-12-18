package oops;
abstract class ElectronicDevice
{
	private String cname;
	private String colour;
	private int price;
	public ElectronicDevice(String name, String colour, int price) {
		this.cname = name;
		this.colour = colour;
		this.price = price;
	}
	public abstract void powerOn();
	public abstract void powerOff();
	public void displayFeatures()
	{
		System.out.println("Name : "+cname);
		System.out.println("Name : "+colour);
		System.out.println("Name : "+price);
	}
}
class Fan extends ElectronicDevice
{
	public Fan(String cname, String colour, int price) {
		super(cname, colour, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void powerOn() {
System.out.println("fan is Started");		
	}
	@Override
	public void powerOff() {
System.out.println("Fan Is Off");		
	}	
}
class Freez extends ElectronicDevice {

	public Freez(String cname, String colour, int price) {
		super(cname, colour, price);
	}
	@Override
	public void powerOn() {
		System.out.println("Fan Is ON");
	}
	@Override
	public void powerOff() {
		System.out.println("Fan Is Off");
	}
}
public class AbstractionEx {
public static void main(String[] args) {
	Fan f=new Fan("USHA", "Black", 10000);
	Freez fr=new Freez("godrej", "Red", 20000);
	System.out.println("Freez Information");
	f.displayFeatures();
	f.powerOn();
	f.powerOff();
	System.out.println("Fan Information");
	fr.displayFeatures();
	fr.powerOn();
	fr.powerOff();
}
}
