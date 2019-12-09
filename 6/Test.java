import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three sides = ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.print("Enter the color = ");
		String color = input.next();
		
		System.out.print("Enter a boolean value for filled = ");
		boolean filled = input.nextBoolean();
		
		Triangle triangleObject1 = new Triangle(side1, side2, side3);
		triangleObject1.setFilled(filled);
		triangleObject1.setColor(color);
		
		System.out.print(triangleObject1.toString());
		
		System.out.println("\n----------OUTPUT OF POLIMORPHISM EXAMPLE--------------");
		
		GeometricObject triangleObject2 = new Triangle(side1, side2, side3);
		triangleObject2.setFilled(filled);
		triangleObject2.setColor(color);
		System.out.print(triangleObject2.toString());
		// Triangle Class invoked toString method. JVM searchs toString method Triangle-->GeometricObjects-->Object so it finds in first Triangle
	}
}
