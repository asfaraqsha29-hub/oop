abstract class Shape{
	abstract void area();
	void display(){
		System.out.println("This is a Shape");
	}
}
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	void area(){
		double result=3.14159*radius*radius;
		System.out.println("Area of the circle is :"+result);
	}
}
class Rectangle extends Shape{
	double length;
	double width;
	
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	void area(){
		double result=length*width;
		System.out.println("Area of Rectangle is :"+result);
	}
}
public class Abstract{
	public static void main(String args[]){
		Circle c=new Circle(7.0);
		c.display();
		c.area();
		
		Rectangle r=new Rectangle(4.0,5.0);
		r.display();
		r.area();
	}
	
}