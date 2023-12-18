package accessspecifier;

public class vehicle {
protected int speed;
protected vehicle(int s)
{
	speed=s;
}
protected void display()
{
	System.out.println("vehicle class : "+speed);
}
}
