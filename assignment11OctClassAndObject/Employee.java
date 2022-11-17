package com.mayur.assignment11OctClassAndObject;

public class Employee {

	int empno;
	String empname;
	float basic_salary;


	public Employee(int empno, String empname, float basic_salary) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.basic_salary = basic_salary;
	}

	public void calculate() {
		double DA = 52.00*basic_salary;
		
		double GS = basic_salary+DA;
		double IT = (30/100)*GS;
		double Net_Salary = GS-IT;
		
		  //System.out.println("Employee Details : ");
		 
		  System.out.println("Basic = "+basic_salary+"\nDA = "+DA+"\nNet Salary = "+Net_Salary);
		
	}

	public void display() {

		System.out.println("Employee Details : \nEmployee name : " + empname + "\nEmployee Number : " + empno);
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", basic_salary=" + basic_salary + "]";
	}

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(12, "Mrunal", 18000);
		e1.display();
		e1.calculate();
		
	}

}
