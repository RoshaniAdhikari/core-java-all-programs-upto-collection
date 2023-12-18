package Sorting;
public class Sort1 {
public static void main(String[] args) {
	int a[]={2,5,2,5,657,12,35,7,875,3};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}	
	System.out.println("Sorted Array is : "+a[i]);
}
}
}
