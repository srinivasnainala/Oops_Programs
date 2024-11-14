package Oops;

abstract class cal
{
	abstract int add();
	int add(int a,int b)
	{
		return a+b;
	}
}
class sample extends cal
{
	public int add()
	{
		return 10+30;
	}
	public int sub()
	{
		return 10-7;
	}
}
 class sample1 extends sample
{
	public int add()
	{
		return 0;
	}
}
public class AbstractClassCalculator1 {
public static void main(String[] args) {
	sample1 c=new sample1();
	System.out.println(c.add());
	System.out.println(c.add(10,61));
	System.out.println(c.sub());
}
}
