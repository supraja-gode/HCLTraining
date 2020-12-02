package shapes;

public class Triangle extends Shape{
	private double base;
	private double height;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public void computeArea(double base,double height)
	{
		super.computeArea();
		area=(1/2) * (base * height);
		area = Math.round(area * 100.0) / 100.0;
		System.out.println("Area of triangle: "+area);
		
	}
}
