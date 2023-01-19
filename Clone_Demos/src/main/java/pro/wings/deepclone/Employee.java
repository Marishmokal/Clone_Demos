package pro.wings.deepclone;//deep cloning

public class Employee implements Cloneable {
private static final Department Department = null;
int id;
String name;
Department dp;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, Department dp) {
	super();
	this.id = id;
	this.name = name;
	this.dp = dp;
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
public Department getDp() {
	return dp;
}
public void setDp(Department dp) {
	this.dp = dp;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dp=" + dp + "]";
}
@Override
protected Object clone() throws CloneNotSupportedException {
	Employee dummy=(Employee)super.clone();
	dummy.setDp((Department)dummy.getDp().clone());
	return dummy;
}


}
