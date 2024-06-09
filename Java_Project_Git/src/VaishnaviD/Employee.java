package VaishnaviD;

class Employee{
	String empName ="Vaish";
	int empId = 1817777;
	
	void display(){
		System.out.println(empName);
		System.out.println(empId);
	}
	
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.display();
	}	
}