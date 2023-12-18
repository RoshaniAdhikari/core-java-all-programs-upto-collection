package iterativestatement;

public class palindromm {
public static void main(String[] args) {
	int n=1214;
	int temp=n;
	int rev=0;
	while(n!=0)
	{
		int d=n%10;
		rev=rev*10+d;
		n=n/10;
	}
	System.out.println(temp);
	System.out.println("rev"+rev);
	if(temp==rev)
	{
		System.out.println("Palindrom Number");
		
	}
	else
	{
		System.out.println("Not palindrom number");
	}
}}

