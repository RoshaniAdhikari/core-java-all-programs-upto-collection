package array;

public class DeepCloning {
public static void main(String[] args) {
	int intArray[][]= {{1,2},{3,4}};
	//deep copy applied for multi dimentional-> Store in same memory adress

	int cloneArray[][]=intArray.clone();
	System.out.println(intArray[1][0]==cloneArray[1][0]);
	for(int i=0;i<cloneArray.length;i++)
	{
		for(int j=0;j<cloneArray.length;j++)
		{
			System.out.print(cloneArray[i][j]+" ");
		}
		System.out.println();
	}
}
}
