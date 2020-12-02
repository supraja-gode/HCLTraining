package interface2;

public class Rectangle implements Polygon {
	double length;
	double breadth;
	@Override
	public double calPeri() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public void calPeri(double length,double breadth)
	{
		double perimeter=2*(length+breadth);
		System.out.println("perimeter of Rectangle is: "+perimeter);
		
	}
	public void calArea(double length,double breadth)
	{
		double area=length*breadth;
		System.out.println("Area of Rectangle: "+area);
	}
}
