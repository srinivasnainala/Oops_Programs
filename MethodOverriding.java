package Oops;
class Demo
{
    int add(int a,int b)
	{
	    return a+b;	
	}
}
class Demo1 extends Demo
{
    int add(int a,int b)
	{
    return a+b-a;	
	}
}
public class MethodOverriding {
public static void main(String[] args) {
//	Demo d1=new Demo();
//    System.out.println(d1.add(5,9));
	Demo d=new Demo1();
//	System.out.println( d.add(10,5));
    System.out.println(d.add(10, 23));
    
}
}
