package variable;

public class StringBufferEx {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("hello");
	System.out.println("Append Method: "+sb.append("roshani") );
   
	StringBuilder sbb=new StringBuilder("hello");
    System.out.println("Append       : "+sbb.append("all"));
    System.out.println("reverce      : "+sb.reverse());
    System.out.println("Insert       : "+sb.insert(6, "dear"));
    StringBuffer sbb1=new StringBuffer("RA");//default capacity is 16
    System.out.println("Capacity     : "+sbb1.capacity());
}
}