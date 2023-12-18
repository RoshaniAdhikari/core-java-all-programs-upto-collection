package iterativestatement;

public class FunctionReverceString {
	void rev(int n)
	{
	int rev=0;	
	while(n!=0)
	{
		int d=n%10;
		rev=rev*10+d;
		n=n/10;
	}
	System.out.println(rev);
}
public static void main(String[] args) {
	FunctionReverceString fr=new FunctionReverceString();
	fr.rev(8375687);
}
}
