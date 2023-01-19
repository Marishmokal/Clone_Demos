package pro.wings.copyconstructer;//shallow cloning

public class CopyConstructerDemo {
public static void main(String[] args) {
	Person p=new Person(10,"ram");
	
	Person p2=new Person(p);
	System.out.println(p);
	System.out.println(p2);
	
	System.out.println("/////////////////////////////////////////////////////////////");
	
	p.name="sham";
	System.out.println(p);
	System.out.println(p2);
	
	System.out.println(p==p2);
	
	
}
}
