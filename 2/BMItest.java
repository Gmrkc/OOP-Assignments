// Furkan Gumrukcu 171805057
// Menu hali github'da var

import java.util.Scanner;

public class BMItest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double weight;
		double height;
		double bmi;
		
		while(true)
		{
			try
			{
				System.out.print("\nWeight (pounds) : ");
				weight = input.nextDouble();
				break;
			}
			catch(Exception e)
			{
				System.out.println("Please enter a valid number !");
				input.next();
			}
		}
		
		while(true)
		{
			try
			{
				System.out.print("\nHeight (inches) : ");
				height = input.nextDouble();
				break;
			}
			catch(Exception e)
			{
				System.out.println("Please enter a valid number !");
				input.next();
			}
		}
		bmi = BMI.calculateBMI(weight, height);
		System.out.println("\nBMI : "+ bmi);
		System.out.println(BMI.interpretBMI(bmi));
		input.close();
	}
}
