package Oops;

class Calc
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
}
class AdvCalc extends Calc
{
	int mul(int a,int b)
	{
		return a*b;
	}
	int div(int a,int b)
	{
		return a/b;
	}
}
public class SingleInheritanceCalculator {
public static void main(String[] args) {
	AdvCalc a=new AdvCalc();
	System.out.println("Adding two numbers : "+a.add(10, 30));
	System.out.println("Substracting two numbers : "+a.sub(12,2));
	System.out.println("Multiplicating two numbers : "+a.mul(3, 6));
	System.out.println("Dividing two numbers : "+a.div(10, 5));
}
}
