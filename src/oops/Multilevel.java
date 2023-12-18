package oops;
interface A
{
	void msg();
	static void display()
	{
		System.out.println("This is class A");

	}
	default void msgName()
	{
		System.out.println("Default method of class A");
	}
}
interface B
{
	void msg();
}
class C implements A,B
{

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("This is class C");
	}	
}

public class Multilevel {
public static void main(String[] args) {
	C cc=new C();
	cc.msg();
	A.display();
	cc.msgName();
}
}
