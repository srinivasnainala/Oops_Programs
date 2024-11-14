package Oops;

class Name
{
	void show()
	{
		System.out.println("What is your name");
	}
}
class Vasu extends Name
{
	void show()
	{
		System.out.println("My name is vasu");
	}
}
class Sai extends Name
{
	void show()
	{
		System.out.println("My name is Sai");
	}
}
public class Overriding {
public static void main(String[] args) {
	Name v=new Name();
	Vasu v1=new Vasu();
	Sai v2=new Sai();
	v.show();
	v1.show();
	v2.show();
}
}
