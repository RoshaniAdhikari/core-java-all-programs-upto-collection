package Decision_making;

import java.util.Scanner;

public class StudResult {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int math=sc.nextInt();
		System.out.println("Enter secont number");
		int science=sc.nextInt();
		System.out.println("Enter third number");
		int english=sc.nextInt();
		
		float avg=(math+science+english)/3;
		
		System.out.println("Total percentage : "+avg);
		//int avg=-76;
		if(avg>=90 && avg<=100)
		{
			System.out.println("Grade is A+");
		}
		else if(avg>=80 && avg<=89)
		{
			System.out.println("Grade is A");
		}
		else if(avg>=70 && avg<=79)
		{
			System.out.println("Grade is B+");
		}
		else if(avg>=50 && avg<=69)
		{
			System.out.println("Grade is B");
		}
		else if(avg>=0 && avg<50) {
			System.out.println("You are fail");
		}
		else
		{
			System.out.println("Invalid input");
		}
	}

}
