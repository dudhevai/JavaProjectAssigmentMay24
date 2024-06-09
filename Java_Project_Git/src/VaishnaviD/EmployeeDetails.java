package VaishnaviD;

class EmployeeDetails{
	String firstName;
	String lastname;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName="Vaish";
		lastname="Dudhe";
		empId=181818;
		managerId=121212;
	}
	
	void updateSecondaryInfo(){
		address="Mumbai";
		phoneNumber="+91-9168014213";	
	}
	
	void displayPrimaryInfo(){
		System.out.println("firstName is : "+ firstName);
		System.out.println("lastname is : "+ lastname);
		System.out.println("empId is : "+ empId);
		System.out.println("managerId is : "+ managerId);
	}
	
	void displayOtherInfo(){
		System.out.println("adress is : "+ address);
		System.out.println("phoneNumber is : "+ phoneNumber);	
	}
	
	void displayAllInfo(){
		System.out.println("firstName is : "+ firstName);
		System.out.println("lastname is : "+ lastname);
		System.out.println("empId is : "+ empId);
		System.out.println("managerId is : "+ managerId);
		System.out.println("adress is : "+ address);
		System.out.println("phoneNumber is : "+ phoneNumber);
	}
	
	public static void main(String[] args){
		EmployeeDetails employeedetails = new EmployeeDetails();
		employeedetails.displayPrimaryInfo();
		employeedetails.updatePrimaryInfo();
		employeedetails.updateSecondaryInfo();
		employeedetails.displayPrimaryInfo();
		employeedetails.displayOtherInfo();
		employeedetails.displayAllInfo();
	}	
}