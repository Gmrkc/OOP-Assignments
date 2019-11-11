// Furkan Gumrukcu 171805057

public class BMI
{
	public static double calculateBMI(double weight, double height)
	{
		weight *= 0.45359237;
		height *= 0.0254;
		double bmi = weight / (height * height);
		return bmi;
	}
	public static String interpretBMI(double bmi)
	{
		if (bmi <= 18.5)
		{
			return "Underweight";
		}
		else if (bmi <= 25)
		{
			return "Normal";
		}
		else if (bmi <= 30)
		{
			return "Overweight";
		}
		else
		{
			return "Obese";
		}
	}
}
