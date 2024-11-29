package Assignment3;
import java.util.*;
public class Rectangle {


public void Area(int length,int width) {
	int area=length*width;
	System.out.println("the area of the rectangle is "+area);
}

public void Perimeter(int length,int width) {
	int perimeter=2*(length+width);
	System.out.println("the perimeter of the rectangle is "+perimeter);
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int length=sc.nextInt();
	int width=sc.nextInt();
	Rectangle obj=new Rectangle();
	obj.Area(length, width);
	obj.Perimeter(length,width);
	

	}
}
