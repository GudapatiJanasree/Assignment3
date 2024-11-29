package Assignment3;

import java.time.LocalDate;

public class Employee_6 {
/* Write a Java program to create a class called "Employee" with a name, salary, and hire date
 attributes, and a method to calculate years of service*/
	
	String name;
	int salary;
	int hiredate;
	
	Employee_6(String name,int salary,int hiredate){
		this.name=name;
		this.salary=salary;
		this.hiredate=hiredate;
		
	}
	
	int calculate_years_of_service() {
		int current_year= LocalDate.now().getYear();
		return current_year-hiredate;
	
	}
	
	public static void main(String[] args){
		Employee_6 obj=new Employee_6("nobita",50000,2022);
		System.out.print(obj.name+" "+obj.salary+" "+" years of experience is "+obj.calculate_years_of_service());
	}
	

}
