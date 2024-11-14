package Oops;

class Anime 
{
//	void dis()
//	{
//		System.out.println("hello world123");
//	}
	class Do 
	{
		void dis()
		{
			System.out.println("hello world");
		}
	}
}

public class classWithinTheClassObjectCreation {
public static void main(String[] args) {
	Anime a=new Anime();
    Anime.Do d= a.new Do();
    d.dis();
}
}
