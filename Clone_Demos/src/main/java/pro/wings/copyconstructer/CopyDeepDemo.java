package pro.wings.copyconstructer;//deep cloning

public class CopyDeepDemo {
public static void main(String[] args) {
	Address a=new Address(1234,"pune");
	Employee e=new Employee(112,"ram",a);
	
	Employee e2=new Employee(e);
//	Employee e3=new Employee(e);
//	Employee e4=new Employee(e);
	System.out.println("e\t" +e);
	System.out.println("e2\t" +e2);
	
	System.out.println("////////////////////////////////////////////////////////////////");
	e2.add.city="mumbai";
//	e3.add.pin=2222;
	
	System.out.println("e\t" +e);
	System.out.println("e2\t" +e2);
//	System.out.println("e3\t" +e3);
	
}
}
