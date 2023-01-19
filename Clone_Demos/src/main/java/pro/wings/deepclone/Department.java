package pro.wings.deepclone;

public class Department implements Cloneable {

	//private static Object Employee;
	String dpName;
	int pin;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String dpName, int pin) {
		super();
		this.dpName = dpName;
		this.pin = pin;
	}
	public String getDpName() {
		return dpName;
	}
	public void setDpName(String dpName) {
		this.dpName = dpName;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Department [dpName=" + dpName + ", pin=" + pin + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	Department dp=new Department("IT",12048);
	Employee e=new Employee(11,"ram",dp);
	//Employee e2=null;
	Employee e2=(Employee)e.clone();
	 
	 System.out.println("before change"+e);
	 System.out.println("before change"+e2);
	 
	 e.getDp().setDpName("HR");
	 
	 System.out.println("after change"+e);
	 System.out.println("after change"+e2);
	
	}
}
