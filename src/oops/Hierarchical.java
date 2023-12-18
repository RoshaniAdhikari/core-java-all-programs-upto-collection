package oops;
import java.util.*;
import java.util.Scanner;

class Employee
{
	void CName()
	{
		System.out.println("Capgeminie");
	}
}
class Permanant extends Employee
{
	int hra=3255,da=622,ta=1000,sal;
public Permanant(int s)
{
	sal=this.sal+da+hra+ta;
}
}
class Temporary extends Employee
{
int sal=0;
public Temporary(int fsal)
{
	 sal=fsal;
	//System.out.println("Temporary Salary is : "+sal);
}

}
class Hourly extends Employee
{
	int sal=0,fsal=500;
	public Hourly(int hr)
	{
		sal=this.fsal*hr;
	}
	}
class Contract extends Employee
{
	int days=0,sal=5000;
	public Contract(int days)
	{
		sal=this.sal*days;
	}
	}
public class Hierarchical {
public static void main(String[] args) {
	Permanant p=new Permanant(3000);
	System.out.println("Permanant Salary is : "+p.sal);
	p.CName();
	Temporary t=new Temporary(3500);
	System.out.println("Temporary Salary is : "+t.sal);
	Hourly h=new Hourly(3);
	System.out.println("Hourly Salary is : "+h.sal);
	Contract c=new Contract(4);
	System.out.println("Contract Salary is : "+c.sal);
}
}
