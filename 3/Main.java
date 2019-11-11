public class Main
{	
	public static void main(String[] args)
	{	
		System.out.print("Enter the row of first matrix : ");
		int row1 = Methods.getRowColomn();	
		System.out.print("Enter the colomn of first matrix : ");
		int colomn1 = Methods.getRowColomn();
		
		System.out.print("Enter the row of second matrix : ");
		int row2 = Methods.getRowColomn();	
		System.out.print("Enter the colomn of second matrix : ");
		int colomn2 = Methods.getRowColomn();
		
        if (colomn1 != row2)
        {
        	System.out.println("\nMultiplication incorrect because of first matrix's row is not equal to second matrix's colomn ! ");
            System.exit(0);
        }
        
		int[][] first = new int[row1][colomn1];
		System.out.println("First Matrix :");
		first = Methods.getMatrix(first, row1, colomn1);
		
		int[][] second = new int[row2][colomn2];
		System.out.println("Second Matrix :");
		second = Methods.getMatrix(second, row2, colomn2);	
		
		int[][] result = new int[row1][colomn2];
		result = Methods.matrixMultiplication(first, second);
		
		System.out.print("Result Matrix :");
		Methods.printMatrix(result, row1, colomn2);
	}
}