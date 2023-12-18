package oops;

import java.util.Scanner;

class EmployeeEx
{
	String name;
	int salary;
	String role;
	public EmployeeEx(String name, int salary, String role) {
		super();
		this.name = name;
		this.salary = salary;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void display()
	{
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee Role : "+role);
	}
}
public class EncapsulationEx {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter name");
	String name=sc.nextLine();
	System.out.println("Enter role");
	String role=sc.nextLine();
	System.out.println("Enter salary");
	int salary=sc.nextInt();
	EmployeeEx em=new EmployeeEx(name, salary, role);
	System.out.println(em.getName());
	System.out.println(em.getRole());
	System.out.println(em.getSalary());
	System.out.println("Update information");
	em.setName(sc.nextLine());
	em.setRole(sc.nextLine());
	System.out.println("Updated information");
	System.out.println(em.getName());
	System.out.println(em.getRole());
	System.out.println(em.getSalary());
//	EmployeeEx em=new EmployeeEx("Roshani", 30000, "Java Developer");
//	System.out.println("Name: "+em.getName());
//	System.out.println("Salary : "+em.getSalary());
//	System.out.println("Role : "+em.getRole());
//	em.setName("Preetha");
//	em.setSalary(40000);
//	em.setRole("Java backend Developer");
//	em.display();
}
}
