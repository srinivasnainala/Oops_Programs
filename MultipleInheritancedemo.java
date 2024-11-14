package Oops;

interface WildAnimal
{
	void hunt();
}
interface DomesticAnimal
{
	void bark();
}
class Animl implements WildAnimal,DomesticAnimal
{
	public void hunt()
	{
		System.out.println("Hunting..");
	}
	public void bark()
	{
		System.out.println("Barking..");
	}
}

public class MultipleInheritancedemo {
public static void main(String[] args) {
	WildAnimal a=new Animl();
	DomesticAnimal d=new Animl();
	d.bark();
	a.hunt();

}
}
