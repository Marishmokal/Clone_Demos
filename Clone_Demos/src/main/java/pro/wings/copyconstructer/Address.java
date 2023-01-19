package pro.wings.copyconstructer;//deep cloning

public class Address {
int pin;
String city;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int pin, String city) {
	super();
	this.pin = pin;
	this.city = city;
}

public Address(Address a)
{
	this.pin=a.pin;
	this.city=a.city;
}
@Override
public String toString() {
	return "Address [pin=" + pin + ", city=" + city + "]";
}

}
