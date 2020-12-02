package shapes;

public class Circle extends Shape{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void computeArea(double radius)
	{
		super.computeArea();
		area=(22/7)*(radius*radius);
		area = Math.round(area * 100.0) / 100.0;
		System.out.println("Area of circle: "+area);
		
	}
}
