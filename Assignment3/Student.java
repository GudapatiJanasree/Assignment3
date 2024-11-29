package Assignment3;

import java.util.*;

public class Student {
	/*
	 * 10. Write a Java program to create a class called "Student" with a name,
	 * grade, and courses attributes, and methods to add and remove courses.
	 */
	String name;
	String[] Courses=new String[3];;
	String grade;
	Scanner sc = new Scanner(System.in);

	void addCourse() {
		
		
		System.out.println("enter any three courses to add");
		for (int i = 0; i <= Courses.length - 1; i++) {
			Courses[i] = sc.nextLine();
		}
		System.out.println("courses added are");
		for (int j = 0; j <= Courses.length - 1; j++) {
			System.out.println(Courses[j]);
			
		}
	}

	void removeCourse() {
	    System.out.println("Enter the name of the course you want to remove:");
	    String toRemove = sc.nextLine();

	    boolean courseFound = false;
	    for (int i = 0; i < Courses.length; i++) {
	        if (courseFound) {
	            Courses[i - 1] = Courses[i];
	        } else if (Courses[i] != null && Courses[i].equals(toRemove)) {
	            courseFound = true;
	        }
	    }

	    if (courseFound) {
	        Courses[Courses.length - 1] = null;
	        System.out.println("Course removed successfully.");
	    } else {
	        System.out.println("Course not found.");
	    }
	}

			
		
		

	
	
	public static void main(String[] args) {
		Student obj=new Student();
		obj.addCourse();
		obj.removeCourse();
	}

}
