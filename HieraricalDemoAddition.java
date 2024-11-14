package Oops;
class Addition1
{
	int add(int a,int b)
	{
	return a+b-a;	
	}
}
class Substraction extends Addition1
{
	int sub(int a,int b)
	{
		return a-b;
	}
}
class Multiplication extends Addition1
{
	int mul(int a,int b)
	{
		return a*b*a;
	}
}
public class HieraricalDemoAddition {
public static void main(String[] args) {
	Multiplication m=new Multiplication();
	Substraction s=new Substraction();
	System.out.println("Adding two numbers : " +s.add(8,2));
	System.out.println("Substracting two numbers : "+s.sub(9,2));
	System.out.println("Multiplicating two numbers :"+m.mul(2,3));
}
}
