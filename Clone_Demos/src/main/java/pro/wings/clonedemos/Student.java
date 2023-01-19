package pro.wings.clonedemos;//shallow cloning

public class Student implements Cloneable {
int id;
String name;
Address add;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, Address add) {
	super();
	this.id = id;
	this.name = name;
	this.add = add;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
}
public static void main(String[] args) throws CloneNotSupportedException {
	Address address=new Address(1234,"pune");
	Student s1=new Student(101,"ram",address);
	Student s2=null;
	
		 s2=(Student) s1.clone();
	
	System.out.println("before city change"+s1);
	System.out.println("before city change"+s2);
	
	s1.getAdd().setCity("mumbai");
	System.out.println("after city change"+s1);
	System.out.println("after city change"+s2);
}


}

