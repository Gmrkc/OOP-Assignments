public class Square extends GeometricObject implements Colorable
{
	protected double side;
	
	public Square(double side)
	{
		this.side = side;
		this.color = "White";
		this.filled = false;
		System.out.println(this.toString());
		this.howToColor();
	}
	public double getSide()
	{
		return side;
	}
	public void setSide(double side)
	{
		this.side = side;
	}
	public void howToColor()
	{
		System.out.println("Color all four sides.");
	}
	public double getPerimeter()
	{
		return 4 * side;
	}
	public double getArea()
	{
		return side * side;
	}
	public String toString()
	{
		return  "[Square] " + date.toString() + "\nColor = " + super.getColor() + "\nFilled = " + super.isFilled() + "\nSide = "
				+ getSide() + "\nArea = " + getArea();
	}
}