package Assignment3;

public class Dog {
	/*2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two
instances of the "Dog" class, set their attributes using the constructor and modify the attributes using
the setter methods and print the updated values.
*/
	private String name;
	private String breed;
	
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
		
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	
	public static void main(String[] args) {
		Dog obj1=new Dog("Mickey","pomerian");
		Dog obj2=new Dog("Rocky","husky");
		System.out.println(obj1.getName()+" is a "+obj1.getBreed());
		System.out.println(obj2.getName()+" is a "+obj2.getBreed());
	}
	
}
