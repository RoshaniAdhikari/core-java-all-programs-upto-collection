package exception;

public class ArrayIndexException {
	public static void main(String[] args) {
		try {
			int a[] = { 2, 3, 4, 5 };
			System.out.println("Array Element: " + a[2]);
//			int c = 30 / 0;
//			System.out.println("Element C : " + c);
			String s = "123";
			int ss = Integer.parseInt(s);
			System.out.println("value of ss : " + ss);
//			String s1 = "abc";
//			int sss = Integer.parseInt(s1);
//			System.out.println("value of sss : " + sss);
	 
		int b[]=null;
		System.out.println("Length of array is : "+b.length);
	}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e1) {
			// TODO: handle exception
			System.out.println(e1);}
			catch (NumberFormatException e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
		catch (NullPointerException e3) {
			// TODO: handle exception
			System.out.println(e3);
		}
		 finally {
			System.out.println("Finally Block");
		}
	}
}


