package constructorprogram;
class Typesconstructor
{
	private Object rollno1;
	private Object sss;
	Typesconstructor()
	{
		int roll=1;
		String s="roshani";
		System.out.println(s + " "+roll);
	}
	Typesconstructor(int rollno,String ss)
	{
		rollno=rollno;
		ss=ss;
		System.out.println(ss+" "+rollno);
		
	}
	Typesconstructor(Typesconstructor tc1)
	{
		rollno1=rollno1;
		sss=sss;
		System.out.println(rollno1+" "+sss);
	}
}
public class TypeConstructor {
public static void main(String[] args) {
	Typesconstructor tc=new  Typesconstructor();
	System.out.println("***************************");
	Typesconstructor tc1=new  Typesconstructor(2,"Ankita");
	Typesconstructor tc2=new Typesconstructor(tc1);
	

	
	
}
}
