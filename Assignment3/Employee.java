package Assignment3;

public class Employee {
/*6. Write a Java program to create a class called "Employee" with a name, job title, and salary
 attributes, and methods to calculate and update salary*/
	String name;
	String job_title;
	int salary;
	
	
	 
	void update_salary(String job_title,String name) {
		if(job_title== "Analyst") {
			salary=50000;
			System.out.println(name+" updated salary "+salary);
			
		}
		else if(job_title== "java developer") {
			salary=60000;
			System.out.println(name+" updated salary "+salary);
			
		}
		else if(job_title== "tester") {
			salary=40000;
			System.out.println(name+" updated salary "+salary);
		}
		calculate_salary();
		
	}
	void calculate_salary() {
		
	int totalperanum= salary*12;
	
	System.out.println("calculated salary per annum is "+totalperanum);
	
		
	}
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.update_salary("Analyst","suresh");
		
		
	}
}
