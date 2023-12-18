package accessspecifier1;


import accessspecifier.PublicClass;
class PublicSubClass extends PublicClass{
	String deg;
	public PublicSubClass(String nm,String deg) {
		super(nm);
		this.deg=deg;
	}
	void display() {
		System.out.println("Name: "+printName());
		System.out.println("My Degree : "+this.deg);
	}
	
}
public class PublicEx {

	public static void main(String[] args) {
		PublicClass p=new PublicClass("Pooja");
		System.out.println("My name : "+p.printName());
		System.out.println("***********Public usage in sub class***********");
		PublicSubClass ps=new PublicSubClass("Pretha", "BTECH");
		ps.display();
		

	}

}