package variable;

public class Stringmethods {
	public static void main(String[] args) {
		String s="hello";
		String ss=" ";
		String sss="       hii       ";
		String s1= new String("everyone");
		
		System.out.println("Length : "+s1.length());
		System.out.println("Upercase : "+s1.toUpperCase());
		System.out.println("Lower : "+s1.toLowerCase());
		System.out.println("Ignorecase : "+s.equalsIgnoreCase(s1));
		System.out.println("Concat : "+s.concat(s));
		System.out.println("Equal : "+s.equals(s1));
		System.out.println("Length : "+s1.length());
		System.out.println("CharAt : "+s.charAt(2));
		System.out.println("Length : "+s1.length());
		System.out.println("ConpareTo : "+s.compareToIgnoreCase(ss));
		System.out.println("Index Of : "+s.indexOf('l'));
		System.out.println("Last Index OF : "+s.lastIndexOf('l'));
		System.out.println("Replace : "+s.replace('e','l'));
		System.out.println("Length : "+s1.length());
		System.out.println("String : "+s);
		System.out.println("Length : "+s1.length());
		System.out.println("Contains : "+s.contains(ss));
		System.out.println("Ends With : "+s.endsWith("123"));
		System.out.println("substring : "+s.substring(2,5));
		System.out.println("Trim : "+sss.trim().length());
        System.out.println("IS Empty: "+ss.isEmpty());
        System.out.println("IS Empty: "+ss.isBlank());
        System.out.println("To char array: "+s.toCharArray());
	}
}
