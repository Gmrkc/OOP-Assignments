// Furkan Gümrükçü 171805057

public class BMItest
{
	public static void main(String[] args)
	{
		BMI object1 = new BMI();
		BMI object2 = new BMI("Sarah King", 215, 70);
		BMI object3 = new BMI("Kim Young", 18, 145, 70);
		
		System.out.println("The BMI for " + object1.getName() + " is " + object1.getBMI() + " " + object1.getStatus());
		System.out.println("The BMI for " + object2.getName() + " is " + object2.getBMI() + " " + object2.getStatus());
		System.out.println("The BMI for " + object3.getName() + " is " + object3.getBMI() + " " + object3.getStatus());
	}
}
