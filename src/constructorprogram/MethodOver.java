package constructorprogram;

class MOverloadingg
{
	static  void rec(int a,int b)
	{
		System.out.println("Rectactangle"+ (a*b));
		
	}
	static float rec(int a,float b)
	{
		return a*b;

	}
	static double rec(int a,double b,int c)
	{
		return a+b;
	
}
public class MethodOver {
public static void main(String[] args) {
	MOverloadingg mv=new MOverloadingg();
	mv.rec(2, 10);
	mv.rec(11, 1.1,5);
}
}
}