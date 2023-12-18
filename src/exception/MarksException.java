package exception;

class ExceptionMark extends Exception{
	public ExceptionMark(String mark) {
    super(mark)	;
}
}

public class MarksException {
String totalMark(int mark) throws ExceptionMark{
if(mark>0 && mark<=100)
{
throw new ExceptionMark("Invalid Marks");
}
else
{
return "Valid Marks";
	}
}

public static void main(String[] args) {
MarksException me=new MarksException();
{
	try{
	System.out.println(me.totalMark(222));	
	}
	catch (ExceptionMark e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	}
}
}
