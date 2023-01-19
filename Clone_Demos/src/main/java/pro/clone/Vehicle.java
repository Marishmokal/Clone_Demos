package pro.clone;//Deep cloning

public class Vehicle implements Cloneable{
String vName;
int price;
Engine e;
public Vehicle() {
	super();
	// TODO Auto-generated constructor stub
}
public Vehicle(String vName, int price,Engine e) {
	super();
	this.vName = vName;
	this.price = price;
	this.e=e;
	
}
public String getvName() {
	return vName;
}
public void setvName(String vName) {
	this.vName = vName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Vehicle [vName=" + vName + ", price=" + price + ", e=" + e + "]";
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
   Engine edummy=new Engine(e.name,e.num);
   Vehicle vdummy=new Vehicle(vName,price,edummy);
//	Vehicle dummy=(Vehicle) super.clone();
//	dummy.setE((Engine) dummy.getE().clone());
	
return vdummy;
}
public Engine getE() {
	return e;
}
public void setE(Engine e) {
	this.e = e;
}


}
