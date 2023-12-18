package Decision_making;
import java.util.*;
public class Switch {
public static void main(String[] args) {
	int op;
	int num1,num2,num3,result;
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose an operator: +,-,*,/");
	String ch=sc.next()charAt();
	System.out.println("Operator"+op);
	
	System.out.println("Enter first number");
	num1=sc.nextInt();
	System.out.println("Enter second number");
	num2=sc.nextInt();
	switch(op)
	{
	case 1:
		 result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;
	}
}

private static void charAt() {
	// TODO Auto-generated method stub
	
}
}
