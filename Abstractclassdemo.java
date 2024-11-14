package Oops;
 abstract class Employee
{
	 abstract void show();
	void show(int n)
	{
		System.out.println("hello world");
	}
}
class Role extends Employee
{
	void show()
	{
		System.out.println("i am showing an roles");
	}
}
class Joining extends Employee
{
	void show()
	{
		System.out.println("Joined successfully");
//		super.show(1);
	}
}
public class Abstractclassdemo {
public static void main(String[] args) {
//	Employee e=new Employee(1);
	Role r=new Role();
	Joining r1=new Joining();
	r.show();
	r1.show();
	r.show(1);
}
}
