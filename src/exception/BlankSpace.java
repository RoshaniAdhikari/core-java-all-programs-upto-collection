package exception;

import java.util.Scanner;

/* class definitions:
class MyException: Define exception
class Source:
method definitions:
checkName(String firstName,String lastName)throw a user defined
exception if firstName and lastName is blank else return name
return type: String
visibility: public

* checkName(String firstName,String lastName): throw a user defined exception if
firstName and lastName is blank else return name*/

//Custom exception class

class MyException extends Exception {
 MyException(String message) {
     super(message);
 }
}
public class BlankSpace {
  String checkName(String firstName, String lastName) throws MyException {
     if (firstName.isBlank() ) {
         throw new MyException("First name ");
     }
     else if ( lastName.isEmpty()) {
         throw new MyException(" last name cannot be blank");
     }
     else {
         return firstName + " " + lastName;
     }
 }
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 BlankSpace bs = new BlankSpace();
	 System.out.println("Enter first name");
	 String firstName=sc.nextLine();
	 System.out.println("Enter last name");
	 String lastName=sc.nextLine();
	 try {
		System.out.println(bs.checkName(firstName, lastName));
	} catch (MyException e) {
		e.getMessage();
	}   
 }
}	