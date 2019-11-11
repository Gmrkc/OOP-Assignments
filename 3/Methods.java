import java.util.Scanner;

public class Methods
{	
	public static int getRowColomn()
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		while(true)
		{
			try
			{
				number = input.nextInt();
				break;
			}
			
			catch(Exception e)
			{
				System.out.print("Please enter a valid number ! ");
				input.next();
			}
		}
		return number;
	}
	
	public static int[][] getMatrix(int[][] matrix, int row, int colomn)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < colomn; j++)
			{
				while(true)
				{
					try
					{
						System.out.print("[" + i + "]" + "[" + j + "] : ");
						matrix[i][j] = input.nextInt();
						break;
					}
					
					catch(Exception e)
					{
						System.out.println("Please enter a valid number !");
						input.next();
					}
				}	
			}
		}
		return matrix;
	}
	
	public static int[][] matrixMultiplication(int[][] first, int[][] second)
	{
        int[][] result = new int[first.length][second[0].length];

        for (int i = 0; i < first.length; i++)
        {
            for (int j = 0; j < second[0].length; j++)
            { 
                for (int k = 0; k < first[0].length; k++)
                { 
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        return result;
    }
	
	public static void printMatrix(int[][] matrix, int row, int colomn)
	{
		for(int i = 0; i < row; i++)
		{
			System.out.print("\n");
			for(int j = 0; j < colomn; j++)
			{
				System.out.print(matrix[i][j]);
				System.out.print("  ");
			}
		}
	}
}