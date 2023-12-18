package accessspecifier;
class PrivateDemo
{
	private int a1=20;
	String name="roshani";
	void displayA()
	{
		System.out.println("A "+a1 );
	}
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
}
public class PrivateEx1 {
	
public static void main(String[] args) {
	PrivateDemo demo=new PrivateDemo()
;
	System.out.println(demo.name);
	demo.displayA();
	demo.setA1(10);
	System.out.println(demo.getA1());
	
}
}

