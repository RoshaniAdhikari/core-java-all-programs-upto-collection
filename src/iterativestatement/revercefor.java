package iterativestatement;

public class revercefor {
	public static void main(String[] args) {
		String n="Roshani";
		String rev="";
		for(int i=n.length()-1;i>=0;i--)
		{
		rev=rev+n.charAt(i)	;
		System.out.println(rev);
		}
		System.out.println(rev);
	}
}
