package Oops;


abstract class Hello
{
	abstract void dis();
	void dis(int n)
	{
		System.out.println("hello world..!");
	}
}
class World extends Hello
{
	public void dis()
	{
		System.out.println("I am world");
	}
	public void dis(int n)
	{
		System.out.println("my name is world");
	}
}

public class abstractiondemo {
public static void main(String[] args) {
	Hello h=new World();
	h.dis();
	h.dis(1);
}
}
