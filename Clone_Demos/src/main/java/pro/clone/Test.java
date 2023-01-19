package pro.clone;

public class Test {
public static void main(String[] args) {
  Engine e=new Engine("Fourstroke",123);
 Vehicle v=new Vehicle("BMW",1250,e);
 Vehicle v2=null;
 try {
	 v2=(Vehicle)v.clone();
} catch (CloneNotSupportedException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
 
	System.out.println(v);
	System.out.println(v2);
	
	System.out.println("////////////////////////////////////////////////////////////////////////////////////");
	
	v2.e.setNum(258);
	System.out.println(v);
	System.out.println(v2);
}
}
