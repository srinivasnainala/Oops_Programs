package Oops;
 class Domestic
 {
	 void stage()
	 {
		 System.out.println("I am parent of dog");
	 }
 }
 class ZermanSheperd extends Domestic
 {
	 void stage1()
	 {
		 System.out.println("I am the child of an animal and parent of baby dog");
	 }
 }
 class BabyDog extends ZermanSheperd
 {
	 void stage2()
	 {
		 System.out.println("I am a child of Dog");
	 }
 }
public class MultilevelInheritance {
public static void main(String[] args) {
//	Dog d=new Dog();
	BabyDog b=new BabyDog();
	b.stage();
	b.stage1();
	b.stage2();
}
}
