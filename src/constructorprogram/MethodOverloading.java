package constructorprogram;
public class MethodOverloading {
	static void  rec(int a,int b)
	{
		System.out.println("Rectactangle"+(a*b));
		//return a*b;
		
	}
	static float rec(int a,float b)
	{
		return a*b;

	}
	static int rec(int a,int b,int c)
	{
		return a+b+c;
	
}
//public class MethodOverloading {
public static void main(String[] args) {
	MethodOverloading mv=new MethodOverloading();
	mv.rec(2, 10);
	System.out.println(mv.rec(11, 11,5));
}
}

