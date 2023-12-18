package oops;
class ec1
{
	private int rollno;
	private String s;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public void add(int a,int b)
	{
		System.out.println("Addition is : "+ (a+b));
	}
	
}
public class encapsulation {
public static void main(String[] args) {
	ec1 ec=new ec1();
	ec.setRollno(1);
	ec.setS("roshani");
	System.out.println("Roll no : "+ec.getRollno()+"  name : "+ec.getS());
    ec.setS("ankita");
	System.out.println("Roll no : "+ec.getRollno()+"  name : "+ec.getS());
    ec1 ecc=new ec1();
    ecc.add(3, 40);
}

}
