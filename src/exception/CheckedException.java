package exception;

public class CheckedException {

	public static void main(String[] args) {
	
			try {
				Class.forName("basic.Demo");
				//File f=new File("demo123.txt");
				System.out.println("Class found");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Class  not found"+e);
			}
}}