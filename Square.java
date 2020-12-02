package interface2;

public class Square implements Polygon{
	double side;

	public Square() {
		// TODO Auto-generated constructor stub
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

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
	public void calPeri(double side)
	{
		double perimeter=4*side;
		System.out.println("perimeter of Square: "+perimeter);
	
	}
	public void calArea(double side)
	{
		double area=side*side;
		System.out.println("Area of Square: "+area);
}
}