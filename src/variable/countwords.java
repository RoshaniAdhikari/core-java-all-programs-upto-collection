package variable;

public class countwords {
public static void main(String[] args) {
	String str = "    Hello Everyone I am fine    ";
	str = str.trim();
//  String[] words = str.split("\\s+");
	String[] words = str.split(" ");
	for(int i=0;i<words.length;i++)
	{
		System.out.println(i+1 +"  "+words[i]);
	}
	int wordCount = words.length;
	System.out.println(str+" : " + wordCount);
}
}