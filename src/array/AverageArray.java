package array;
import java.util.*;
public class AverageArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of subjects");
	int numsub=sc.nextInt();
	
	int [] mrks=new  int [numsub];
	
	for(int i=0 ;i<numsub;i++)
	{
		System.out.println("Enter marks for subject : "+(i+1));
		mrks [i]=sc.nextInt();
	}
	int total=0;
	for(int mark=0;mark< mrks.length;mark++)
	{
		total+=mark;
	}
	double percentage=(double) total/(numsub*100)*100;
	System.out.println("Total marks : "+total);
	System.out.println("Total percentage : "+percentage+"%");	
}
}
