package iterativestatement;

public class palindrom {
public static void main(String[] args) {
	String str="abytba";
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
}
