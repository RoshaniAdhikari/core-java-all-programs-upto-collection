package iterativestatement;
class StaticMethod
{
	static int div(int a,int b)
	{
		return a/b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
}
public class FunctionDemo {
	int a=12,b=32;
	void add()
	{
		System.out.println("Addition is : "+(a+b));
	}
	void addition(int n1,int n2)
	{
		System.out.println("Addition is : "+(n1+n2));
	}
	int mul(int a,int b)
	{
		return a*b;
	}
	static String display()
	{
		return "Hello";
	}
public static void main(String[] args) {
	FunctionDemo fd=new FunctionDemo();
	fd.add();
	fd.addition(3, 20);
	System.out.println("Multiplication is : " +fd.mul(2,4));
	System.out.println("String is : "+fd.display());
	System.out.println("Static method of different class"+StaticMethod.div(10, 20));
	StaticMethod sm=new StaticMethod();
	System.out.println("non static method of another class"+sm.sub(9, 10));
}
}
