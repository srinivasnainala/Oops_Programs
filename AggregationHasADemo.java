package Oops;

class Address
{
	String village;
	String mandal;
    String district;
    String state;
	public Address(String village, String mandal, String district, String state) {
		super();
		this.village = village;
		this.mandal = mandal;
		this.district = district;
		this.state = state;
	}
}

public class AggregationHasADemo {
	int id;
	int age;
	String name;
	long mobilenumber;
	Address address;
	
	
public AggregationHasADemo(int id, int age, String name, long mobilenumber, Address address) 
    {
		this.id = id;
		this.age = age;
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.address = address;
	}
   void show()
   {
	   System.out.println("Id            : " +id);
       System.out.println("Name          : " +name);
       System.out.println("Age           : "+age);
       System.out.println( "Mobile Number : "+mobilenumber);
       System.out.println( "Address       : "+address.village +","+address.mandal+","+address.district+","+address.state);
   }

public static void main(String[] args) {
Address a=new Address("Mamidikuduru","Mamidikuduru Mandal","Konaseema","Andhra Pradesh");
AggregationHasADemo ae=new AggregationHasADemo(1,21,"vasu",814209334,a);
ae.show();
}
}
