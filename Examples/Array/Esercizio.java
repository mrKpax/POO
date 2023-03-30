import java.util.Scanner;

public class Esercizio
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int[][] mat = new int[3][3];
		
		for(int i=0; i<mat.length; i++)
		{
			System.out.println("Per la riga " +i + ":");
			
			for(int j=0; j<mat[i].length; j++)
			{
				System.out.println("Inserisci elemento [" + i + "," + j + "]");
				mat[i][j] = scanner.nextInt();
				scanner.nextLine();
			}
		}
		
		for(int i=0; i<mat.length; i++)
		{
			
			for(int j=0; j<mat[i].length; j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}

}
