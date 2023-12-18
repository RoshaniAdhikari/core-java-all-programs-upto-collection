package variable;

public class internMethod {
public static void main(String[] args) {
	String st1=new String("hi");
	String st2=new String("hi");
	System.out.println("String : "+(st1==st2));
	st1=st1.intern();
	st2=st2.intern();
	System.out.println("String Intern: "+(st1==st2));
		}
}

