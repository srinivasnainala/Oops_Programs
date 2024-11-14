package Oops;

class Miracle
{
	void employment()
	{
		System.out.println("WE ARE HIRING");
	}
}
class Technical extends Miracle
{
	void tech()
	{
		System.out.println("I AM AN TECHNICAL");
	}
}
class Sales extends Miracle
{
	void sale()
	{
		System.out.println("I AM AN SALE");
	}
}
public class HieraricalInheritance {
public static void main(String[] args) {
//	Miracle m=new Miracle();
	Technical t=new Technical();
	Sales s=new Sales();
	t.employment();
	t.tech();
	s.sale();
}
}
