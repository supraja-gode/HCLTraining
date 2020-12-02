package shapes;

public class Shape {
	protected double area;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	protected Shape(double area) {
		super();
		this.area = area;
	}
	protected double getArea() {
		return area;
	}
	protected void setArea(double area) {
		this.area = area;
	}
	public void computeArea()
	{
	
		area=0;
	}
}
