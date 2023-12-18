package accessspecifier;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class UserInputBuffered {
	//IOEXception-->checked-->compile time exception
		public static void main(String[] args) throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your name:");
			String name=br.readLine();
			System.out.println("My Name is : "+name);
			System.out.println("Enter your Rollno :");
			int rno=Integer.parseInt(br.readLine());
			System.out.println("My Rollno is : "+rno);
			
//			File f = new File("f:/filepooja11.txt");
//			if(!f.exists()){
//			throw new Exception("File doesnot exist "+f.toString());
//			}
//			else {
//			System.out.println("Welcome, we got into file "+f.toString());
//			}
			
			try {
			//int sum=rno/0;
				int a[]= {1,2,3};
			System.out.println("Array " +a[5]);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

	}
