public class Test
{
	public static void main(String[] args)
	{
		GeometricObject objectArray[] = new GeometricObject[5];
		
		objectArray[0] = new Square(2.0);
		objectArray[1] = new Circle(5.0);
		objectArray[2] = new Square(5.0);
		objectArray[3] = new Rectangle(3.0, 4.0);
		objectArray[4] = new Square(4.5);
	}
}
