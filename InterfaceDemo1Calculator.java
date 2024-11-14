package Oops;

interface calc
{
	int add();
	int sub();
	int mul();
	int div();
}
class Calculator1 implements calc
{
	public int add()
	{
		return 10+10;
	}
	public int sub()
	{
		return 12-2;
	}
	public int mul()
	{
		return 5*3;
	}
	public int div()
	{
		return 10/2;
	}
}
public class InterfaceDemo1Calculator {
public static void main(String[] args) {
	calc c1=new calc() {

		public int add()
		{
			return 10+20;
		}
		public int sub()
		{
			return 12-2;
		}
		public int mul()
		{
			return 5*3;
		}
		public int div()
		{
			return 10/2;
		}
	};
	calc c=new Calculator1();
	System.out.println(c.add());
	System.out.println(c1.add());
//	System.out.println(c.sub());
//	System.out.println(c.mul());
//	System.out.println(c.div());
}
}
