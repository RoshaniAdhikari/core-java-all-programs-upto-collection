package oops;
import java.util.*;

class Country
{
	String c="India";
}

class State extends Country
{
	String s="Maharashtra";
}
class City extends State
{
	String cc="Thane";
	void Display()
	{
	System.out.println("My Country is : "+c);
	System.out.println("My State is : "+s);
	System.out.println("My City is : "+cc);

	}
	
}
public class Multilevelinhe {
public static void main(String[] args) {
	
	City city=new City();
	city.Display();
	
}
}
