package Assignment3;

public class Person {
/*1. Write a Java program to create a class called "Person" with a name and age attribute. Create two
instances of the "Person" class, set their attributes using the constructor, and print their name and
age.*/
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age= age;
	}
	void display() {
		System.out.println("the name is " + name+" and the person age is "+age);
		
	}
	public static void main(String[] args) {
		Person obj1= new Person("Nobita",10);
		obj1.display();
		Person obj2= new Person("Alia",35);
		obj2.display();
	}
}
