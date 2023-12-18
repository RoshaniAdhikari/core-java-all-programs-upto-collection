package variable;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
Scanner sc=new Scanner(System.in);

System.out.println("Enter your full name: ");
String name=sc.nextLine();
System.out.println("My name is: "+name);

System.out.println("Enter the number");
a=sc.nextInt();
System.out.println("Value of a: "+a);

System.out.println("Enter percentage");
float percentage=sc.nextFloat();
System.out.println("Percentage : "+percentage);

System.out.println("Enter your name");
char ch=sc.next().charAt(3);
System.out.println("My name : " +ch);

	}

}
