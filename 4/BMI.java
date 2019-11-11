// Furkan Gümrükçü 171805057

public class BMI
{
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public static final double KILOGRAMS_PER_POUND = 0.45359237;	
	public static final double METERS_PER_INCH = 0.0254;
	
	BMI()
	{
		name = "John Black";
		age = 25;
		weight = 100;
		height = 50;
	}
	
	BMI(String a, double c, double d)
	{
		age = 20;
		name = a;
		weight = c;
		height = d;
	}
	
	BMI(String a, int b, double c, double d)
	{
		name = a;
		age = b;
		weight = c;
		height = d;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String a)
	{
		name = a;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setWeight(double a)
	{
		weight = a;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double a)
	{
		height = a;
	}
	
	public double getBMI()
	{
		double bmi =  (weight * KILOGRAMS_PER_POUND) / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));	
		return Math.round(bmi * 100d) / 100d;
	}
	
	public String getStatus()
	{
		if (getBMI() <= 18.5)
		{
			return "Underweight";
		}
		else if (getBMI() <= 25)
		{
			return "Normal";
		}
		else if (getBMI() <= 30)
		{
			return "Overweight";
		}
		else
		{
			return "Obese";
		}
	}
}