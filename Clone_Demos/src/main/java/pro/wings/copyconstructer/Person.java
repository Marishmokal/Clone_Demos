package pro.wings.copyconstructer;//shallow cloning

public class Person {
int id;
String name;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Person(Person p)
{
	this.id=p.id;
	this.name=p.name;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + "]";
}

}
