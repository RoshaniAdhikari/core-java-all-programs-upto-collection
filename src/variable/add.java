package variable;

import java.util.Scanner;

public class add {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2, sum;
		System.out.println("Enter Frist No :");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second No:");
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		System.out.println("Sum of these No :"+sum);
		
		int mul = num1*num2;
		System.out.println("Multiplication of these No :"+mul);
		
		int div = num1 / num2;
		System.out.println("Division of these No :"+div);
		
		int sub = num1 - num2;
		System.out.println("Subtraction of these No :"+sub);



	}

}

