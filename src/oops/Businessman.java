package oops;
class Dhirubhai
{
	String company="Reliance";
	public void thinkingStyle()
	{
		System.out.println("This is Dhirubhai's thinking style");
	}
}
class Mukesh extends Dhirubhai
{
	String mcompany="jio";
	public void businessStratagy()
	{
		System.out.println("This is business stratagy of Mukesh Ambani");
	}
}
class Akash extends Mukesh
{
	int income=1000000000;
	String sidebusiness="MI_IPL";
}
public class Businessman {
public static void main(String[] args) {
	Dhirubhai d=new Dhirubhai();
	System.out.println("Dhirubhai Ambani property");
	System.out.println("Own Company: "+d.company);
	d.thinkingStyle();
	System.out.println("**************************");
	System.out.println("Mukesh Ambani's property");
	Mukesh m=new Mukesh();
	System.out.println("Parent Company: "+m.company);
	m.thinkingStyle();
	System.out.println("Own Company: "+m.mcompany);
	m.businessStratagy();
	System.out.println("**************************");

	System.out.println("Akash Ambani's property");
	Akash a=new Akash();
	System.out.println("Grand Parent Company: "+a.company);
	System.out.println("Parent Company: "+a.mcompany);
	a.thinkingStyle();
	a.businessStratagy();
	System.out.println("Own Income: "+a.income);
	System.out.println("Akash Ambani side business: "+a.sidebusiness);
}
}
