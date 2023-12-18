package patternprograms;

public class typecast {
public static void main(String[] args) {
	byte b=10;
	Short s=100;
	int i=b;
	int ii=s;
	int j=200;
	long l=j;
	//smaller-->bigger---->Implicit(done automatically)-->Widening
	System.out.println(i);
	//bigger-->smaller-->Explicit( U have to do--->Narrowing
	int ii1=30;
	byte b1=(byte) ii1;
	short ss=(short) ii1;
	byte bb1=(byte) l;
	float f=ii;
}
}
