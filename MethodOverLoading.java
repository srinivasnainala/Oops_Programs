package Oops;

class Addition
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a-b;
	}
}

public class MethodOverLoading {
public static void main(String[] args) {
	Addition a=new Addition();
	System.out.println("Adding two numbers : "+a.add(212,8));
	System.out.println("Adding three numbers : "+a.add(21,6,3));
}
}
