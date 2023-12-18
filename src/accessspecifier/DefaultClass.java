package accessspecifier;

class DefaultCl
{
int a;
public DefaultCl(int a) {
	// TODO Auto-generated constructor stub
	this.a=a;
}
void display()
{
	System.out.println("Value of a : "+a);
}
}
class DefaultSub extends DefaultCl
{
	int b;
	 DefaultSub(int a,int b) {
		 super(a);
		this.b=b;
	 }
	void subDisplay()
	{
		display();
		System.out.println("Value of b : "+this.b);
	}
}
public class DefaultClass {
public static void main(String[] args) {
	DefaultCl dc=new DefaultCl(10);
	dc.display();
	System.out.println("*****Sub Class*****");
	DefaultSub ds=new DefaultSub(10, 20);
	ds.subDisplay();
}
}
