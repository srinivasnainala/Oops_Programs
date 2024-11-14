package Oops;

class AdvCalc1 extends AdvCalc
{
	int pow(int a,int b)
	{
		return (int)Math.pow(a, b);
	}
}
public class MultilevelInheritanceCalculator {
public static void main(String[] args) {
	AdvCalc1 a1=new AdvCalc1();
	System.out.println("Adding two numbers : "+a1.add(121, 2));
	System.out.println("Subtracting two numbers : "+a1.sub(7,2));
	System.out.println("Multiplicating two numbers : "+a1.mul(2,30));
	System.out.println("Dividing two numbers : "+a1.div(10, 5));
	System.out.println("Square of given number is : "+a1.pow(3,3));
}
}
