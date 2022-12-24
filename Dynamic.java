import java.util.*;

abstract class Shape{
	double length,breadth;
 	abstract void compute_area();
	

void input(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Number");
	length=sc.nextDouble();
	System.out.println("Enter Second Number");
	breadth=sc.nextDouble();
}

}
class Triangle extends Shape{
	public void compute_area(){
	double area;
	area=0.5*length*breadth;
	System.out.println("Area of Triangle is :"+area);
}
}
class Rectangle extends Shape{
	public void compute_area(){
	double area;
	area=length*breadth;
	System.out.println("Area of Rectangle is :"+area);
}
}
	


	
public class Dynamic{
	public static void main(String[]args){
	Triangle t= new Triangle();
	Rectangle r=new Rectangle();
	t.input();
	t.compute_area();
	r.input();
	r.compute_area();
	}	
}
