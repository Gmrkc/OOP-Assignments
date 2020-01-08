import java.util.Date;

public abstract class GeometricObject
{
	Date date = new Date();
	
	protected String color;
	protected boolean filled;
	
	abstract double getPerimeter();
	abstract double getArea();
	
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
}