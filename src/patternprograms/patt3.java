package patternprograms;

public class patt3 {
public static void main(String[] args) {
	for(int i=97;i<=100;i++) {//row
		for(int j=97;j<=i;j++) {//col
			char k=(char)j;
			System.out.print(k+" ");
		}
		System.out.println();
		
	}}
}
