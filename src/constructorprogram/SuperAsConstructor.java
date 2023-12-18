package constructorprogram;

class Furniture{
	String type;
	public Furniture() {
		System.out.println("Parent Default constructor");
	}
	public Furniture(String type) {
		this.type=type;
		System.out.println(this.type);
	}
}
class Sofaset extends Furniture {
	String color;
	public Sofaset() {
		super();//super call parent class default constructor
		System.out.println("Child Default constructor");
	}
	public Sofaset(String type,String color) {
		super(type);
		this.color=color;
		System.out.println(this.color);
		
	}
}
public class SuperAsConstructor {
	public static void main(String[] args) {
		//Sofaset t=new Sofaset();
		Sofaset t1=new Sofaset("four Seater","Radish");
	}

}
