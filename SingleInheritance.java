package Oops;
class Animal
{
	void beh()
	{
		System.out.println("I am  parent");
	}
}
//class Dog extends Animal
//{
//	void bark()
//	{
//		System.out.println("I am son");
//	}
//}
public class SingleInheritance extends Animal {
	void bark()
	{
		System.out.println("I am son");
	}
public static void main(String[] args) {
	SingleInheritance d=new SingleInheritance();
	d.beh();
	d.bark();
}
}
