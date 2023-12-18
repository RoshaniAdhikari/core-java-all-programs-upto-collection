package variable;
import java.util.*;

public class bitwises {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=10;
	int b=20;
	int c=15;
	System.out.println("Bitwise AND: "+(a&b));
	System.out.println("Bitwise OR: "+(a|b));
	System.out.println("Bitwise NOT: "+(~b));
	
	if(a>b && a>c)
	{
		System.out.println("a is greater");
	}


}
}
