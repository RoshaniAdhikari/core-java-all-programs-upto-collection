package exception;

class ExceptionMovie extends Exception{
	public ExceptionMovie(String msg) {
    super(msg)	;
}
}

public class MyExceptionn {
String invalidAge(int age) throws ExceptionMovie{
if(age<18)
{
throw new ExceptionMovie("Age is smaller than 18");
}
else
{
return "Valid";
	}
}
public static void main(String[] args) {
MyExceptionn me=new MyExceptionn();
{
	try{
	System.out.println(me.invalidAge(22));	
	}
	catch (ExceptionMovie e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	}
}
}


