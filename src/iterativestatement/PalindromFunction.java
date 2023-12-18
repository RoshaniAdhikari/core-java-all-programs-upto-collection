package iterativestatement;

public class PalindromFunction {
void pal()
{
	String str="ababa";
	StringBuffer sb=new StringBuffer(str);
	System.out.println("reverce String: "+sb.reverse());
	String str1=sb.toString();
	if(str.equals(str1))
	{
		System.out.println("String is palindrom");
		
	}
	else
	{
		System.out.println("String is not palindrom");
	}
}
public static void main(String[] args) {
	PalindromFunction pf= new PalindromFunction();
	pf.pal();
}
}

