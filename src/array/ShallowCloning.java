package array;

public class ShallowCloning {
public static void main(String[] args) {
	int [] intArray= {2,4,6,7,8};
	int [] cloneArray=intArray.clone();
	//Shallow copy applied for one dimentional-> Store in different memory adress
	System.out.println(intArray==cloneArray);
	System.out.println("My clone Array is : ");
	for(int i=0;i<cloneArray.length;i++)
	{
		System.out.print(cloneArray[i]+" ");
	}
}
}
