package Assignment3;

public class TrafficLight {
/* 8. Write a Java program to create class called "TrafficLight" with attributes for color and duration,
 and methods to change the color and check for red or green.*/
	String color;
	int duration;
	
	void setcolour(String color) {
		this.color=color;
		boolean a=green();
		boolean b= red();
		if (a==false) {
			System.out.println("its a red signal please stop");
		}
		else  {
			System.out.println("its a green signal please go");
		}
	}
	boolean green() {
		return (this.color).equals("Green");
	}
	boolean red() {
		return (this.color).equals("red");
	}
	

	

	public static void main(String[] args) {
		TrafficLight obj=new TrafficLight();
		obj.setcolour("red");
	}
}
