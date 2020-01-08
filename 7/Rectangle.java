public class Rectangle extends GeometricObject
{
	protected double width;
	protected double height;
	
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
		this.color = "White";
		this.filled = false;
		System.out.println(this.toString());
	}
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getPerimeter()
	{
		return 2 * (this.height + this.width);
	}
	public double getArea()
	{
		return this.height * this.width;
	}
	public String toString()
	{
		return  "[Rectangle] " + date.toString() + "\nColor = " + super.getColor() + "\nFilled = " + super.isFilled() + "\nWidth = "
				+ getWidth() + "\nHeight = " + getHeight() + "\nArea = " + getArea();
	}
}
