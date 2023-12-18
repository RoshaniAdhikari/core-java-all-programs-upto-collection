package patternprograms;

import java.util.Scanner;

public class patt5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rowa number");
		int rows=sc.nextInt();	
	int rowCount = 1;
	for (int i = rows; i > 0; i--) {
		for (int j = 1; j < i; j++) {
			System.out.print(" ");//space
		}
		for (int j = 1; j <= rowCount; j++) {
			System.out.print(rowCount + " ");
		}
		System.out.println();
		rowCount++;
	}
}
}


//n=3
//i=3;i>0;i--
//step1:
//i=3
//j=1;j<3;j++
//j=1,2--->2 space
//j=1;J<=1;j++
//rowcount=1
//output:_ _ 1
//
//step:
//rowcount=2
//i=2
//j=1--->1 space
//j=1;j<=2-->2  2
//output: _ 2 2
//
//step3:
//rowcount=3
//i=1
//j=--->no space
//j=1;j<=3
// 3  3 3
//