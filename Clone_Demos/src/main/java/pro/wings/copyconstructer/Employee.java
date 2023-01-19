package pro.wings.copyconstructer;//deep cloning

public class Employee {
int id;
String name;
Address add;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, Address add) {
	super();
	this.id = id;
	this.name = name;
	this.add = add;
}

public Employee(Employee e)
{
	this.id=e.id;
	this.name=e.name;
	Address add=new Address(e.add);
	this.add=add;
	
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
}

}
