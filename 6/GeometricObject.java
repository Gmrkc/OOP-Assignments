import java.util.Date;

public class GeometricObject
{
	protected String color;
	protected boolean filled;
	private Date dateCreated;
	
	public GeometricObject()
	{
		color = "white";
		this.dateCreated = new Date();
	}
	public GeometricObject(String color, boolean filled)
	{
		this.dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public boolean getFilled()
	{
		return filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	public String getDateCreated()
	{
		return dateCreated.toString();
	}
	
	public String toString()
	{
		return "Geometric Object Class: " + getDateCreated() + " Filled = " + getFilled() + " Color = " + getColor();
	}
}
