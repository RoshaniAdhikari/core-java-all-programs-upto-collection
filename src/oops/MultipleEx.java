package oops;
class Animal
{
	String name;
	int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void canEat() 
	{
		System.out.println(name+"  can Eat food");
	}
	public void canRun() 
	{
		System.out.println(name+" can Run");
	}
}
class Aquatic extends Animal
{
	public Aquatic(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void canSwim()
	{
		System.out.println(name+"  can Swim");
	}
}
class Bird extends Animal
{

	public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void canFly()
	{
		System.out.println(name+" can Fly");
	}
}
public class MultipleEx {
public static void main(String[] args) {
	Aquatic a=new Aquatic("Frog", 1);
	Bird b=new Bird("Parrot", 3);
	a.canEat();
	a.canRun();
	a.canSwim();
	System.out.println();
	b.canEat();
	b.canFly();
	b.canRun();
}
}
