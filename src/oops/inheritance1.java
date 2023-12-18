package oops;
class father
{
	String fname="virasen";
}
class daughter extends father
{
	String dname="sonam";
	
	void display()
	{
		System.out.println("Father Name is : "+fname);
		System.out.println("Father Name is : "+dname);

	}
	
}
public class inheritance1 {
	public static void main(String[] args) {
daughter d=new daughter();
d.display();
}
}