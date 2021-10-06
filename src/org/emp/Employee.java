package org.emp;

public class Employee {
	
	private void empid() {
	
		System.out.println("employee id is 1234");

	}
	private void empName() {
		System.out.println("employee name is mugesh");

	}
	private void empdob() {
		System.out.println("employee dob is 22/06/1997");

	}
private void empphone() {
	System.out.println("employee phone no is 123456789");

}
private void empEmail() {
	System.out.println("empoyeeEmail id is mugeshprasath7871@gmail.com");

}
private void empAddress() {
	System.out.println("employee Adress is palavanthangal");

}
public static void main(String[] args) {
	
	Employee employeedetails=new Employee();
	employeedetails.empid();
	employeedetails.empName();
	employeedetails.empdob();
	employeedetails.empAddress();
	employeedetails.empEmail();
	employeedetails.empphone();
	
	
}
}
