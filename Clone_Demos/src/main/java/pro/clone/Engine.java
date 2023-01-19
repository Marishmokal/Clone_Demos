package pro.clone;

public class Engine implements Cloneable {
String name;
int num;
public Engine() {
	super();
	// TODO Auto-generated constructor stub
}
public Engine(String name, int num) {
	super();
	this.name = name;
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
@Override
public String toString() {
	return "Engine [name=" + name + ", num=" + num + "]";
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

}
