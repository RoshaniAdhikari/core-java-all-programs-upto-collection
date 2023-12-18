package oops;
interface Abc
{
	public void printAbc();
	 
}
interface Xyz
{
	 void printXyz();
	 
}
interface Pqr extends Abc,Xyz
{
	public void printPqr();
	
}
class child implements Pqr
{

	@Override
	public void printAbc() {
		// TODO Auto-generated method stub
		System.out.println("Roshani");
	}

	@Override
	public void printXyz() {
		// TODO Auto-generated method stub
		System.out.println("Sonam");

	}

	@Override
	public void printPqr() {
		// TODO Auto-generated method stub
		System.out.println("Arti");

	}	
}
public class InterfaceEx {
public static void main(String[] args) {
	child c=new child();
	c.printAbc();
	c.printPqr();
	c.printXyz();
}

}