import java.util.Scanner;

public class Esercizio
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci valore:");
		Integer a = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Inserisci valore:");
		Integer b = scanner.nextInt();
		scanner.nextLine();
		
		int sum = 10 + 19;
		
		System.out.println("Somma di " + a + " + " + b + " = " + sum);
		
		scanner.close();
	}

}
