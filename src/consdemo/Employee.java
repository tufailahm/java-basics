package consdemo;

/*
 * By default , java does provide default constructor
 * But if you create parameterized cons , 
 * default constructor would not be available.
 */
public class Employee {

	private String employeeName;
	
	
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Employee(String employeeName) {
		this.employeeName = employeeName;
	}

	public Employee() {
		employeeName="Ahmed";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("Daniel");
		
		
		System.out.println(e1.employeeName);
		System.out.println(e2.employeeName);

	}

}
