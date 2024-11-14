package Oops;

class Company
{
	void show()
	{
		System.out.println("My name is company");
	}
}
class Miracle1 extends Company
{
	void show()
	{
		System.out.println("My name is miracle software systems");
	}
}
class Technical1 extends Miracle1
{
	void show()
	{
		System.out.println("i am from tech");
	}
}
public class MEthodOverridingdsajdkhfjklsdh {
public static void main(String[] args) {
	Company c=new Company();

//    Miracle1 c1=new Miracle1();
	c .show();
	c=new Miracle1();
	c.show();
	c=new Technical1();
	c.show();
	
	
	
}
}
