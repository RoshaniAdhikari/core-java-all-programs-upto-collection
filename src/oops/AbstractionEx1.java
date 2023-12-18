package oops;
abstract class Mobile
{
	private String name;
	private int price;
	Mobile(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	abstract public void powerON();
	abstract public void powerOff();
	public void display()
	{
		System.out.println("Name is : "+name);
		System.out.println("price is : "+price);
	}
}
class Tv extends Mobile
{
	Tv(String name,int price)
	{
	super(name,price);
	}
	@Override
	public void powerON()
	{
		System.out.println("Tv power on");
	}
	@Override
	public void powerOff()
	{
		System.out.println("tv power off");
	}
}
class TubeLight extends Mobile
{
	TubeLight(String name,int price)
	{
		super(name,price);
	}
	@Override
	public void powerON()
	{
		System.out.println("Tubelight on");
	}
	@Override
	public void powerOff()
	{
		System.out.println("tubelight off");
	}
}
public class AbstractionEx1 {
	public static void main(String[] args) {
	Tv t=new Tv("1+", 30000);
	t.display();
	t.powerON();
	t.powerOff();
	TubeLight tl=new TubeLight("Philips", 1000);
	tl.display();
	tl.powerON();
	tl.powerOff();
	}
}
