public class Circle extends GeometricObject
{
	protected double radius;
	
	public Circle(double radius)
	{
		this.color = "White";
		this.filled = false;
		this.radius = radius;
		System.out.println(this.toString());
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getPerimeter()
	{
		return 2 * Math.PI * this.radius;
	}
	public double getArea()
	{
		return Math.PI * this.radius * this.radius;
	}
	public String toString()
	{
		return  "[Circle] " + date.toString() + "\nColor = " + super.getColor() + "\nFilled = " + super.isFilled() + "\nRadius = "
				+ getRadius() + "\nArea = " + getArea();
	}
}
