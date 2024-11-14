package Oops;

interface Drawing
{
	 void draw();
//	public static int draw(int n)
//	{
//		return n;
//	}
}
interface writing
{
	void write();
}
class Pen implements Drawing,writing
{
	public void draw()
	{
		System.out.println("Drawing an flowchart");
	}
	public void write () 
	{
	System.out.println("i am writing a notes");
	}
}
class Pencil extends Pen
{
	public void draw()
	{
		System.out.println("Drawing an diagram");
	}
}
public class InterfaceDemo {
public static void main(String[] args) {
//	Drawing d=new Pen();
	Drawing d1=new Pencil();
	d1.draw();

//	d1.draw();
//	Drawing d2=new Marker();
//	d2.draw();
	Pen p=new Pen();
	p.draw();
	p.write();
}
}
