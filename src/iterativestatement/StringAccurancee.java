package iterativestatement;

import java.util.Scanner;

public class StringAccurancee {
	public int countAm(String s)
	{
	String str=s.toLowerCase();
	int count=0;
	String a[]=str.split(" ");
	for(int i=0;i<a.length;i++)
	{
		if(a[i].equals("am"))
		{
			count=count+1;
			
		}
	}
	return count;
	}
	class OccuranceAm
	{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			StringAccurance sa=new StringAccurance();
			int count=sa.countAm("I am Amsterdam Am");
			System.out.println(count);
		}
	}
}
