package Assignment3;

public class Circle {
/* 4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and
 modify this attribute. Calculate the area and circumference of the circle*/
	double radius=10;
	
	
	double area(double radius,double Pi) {
		double areaOfCircle=Pi*Math.pow(radius, 2);
		return areaOfCircle;
	}
	
	double circumference(double radius,double Pi) {
		double circumOfCircle=2*Pi*radius;
		return circumOfCircle;
	}
	
	public static void main(String[] args) {
		double radius=20;
		final double Pi = 3.14;
		Circle obj=new Circle();
		System.out.println(obj.area(radius,Pi));
		System.out.println(obj.circumference(radius,Pi));
		
	}
			
	
}
