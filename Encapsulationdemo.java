package Oops;
class Demo4
{
	String name;
	long phonenumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
}
	public class Encapsulationdemo {
	int age;

//	public int Age(int a)
//	{
//		age=a;
//		return age;
//	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

public static void main(String[] args) {
	Encapsulationdemo e=new Encapsulationdemo();
	e.setAge(21);
	Demo4 d=new Demo4();
	d.setName("vasu naidu");
	d.setPhonenumber(814209334);
	System.out.println("His age is :          "+e.getAge());
//	System.out.println("His age is :          "+e.Age(21));
	System.out.println("His name is :         "+d.getName());
    System.out.println("His mobilenumber is : "+ d.getPhonenumber());
}
}
