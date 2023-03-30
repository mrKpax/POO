import java.util.Scanner;
import java.util.ArrayList;

public class esercizio
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		System.out.println("Come ti chiami?");
		String nome = scanner.nextLine();
		
		System.out.println("Ciao " + nome + ", quanti valori vuoi inserire?");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for (int i=0; i<n; i++)
		{
			System.out.println("Inserisci valore n." + i + ": ");
			lista.add(scanner.nextInt());
		}
		
		scanner.nextLine();
		System.out.println("Inserimento terminato, vuoi visualizzare la lista? (Y/N)");
		String op = scanner.nextLine();
		
		if (op.equals("Y"))
		{
			for (int i=0; i<n; i++)
			{
				System.out.println(lista.get(i) + " ");
			}
		}
		else
		{
			System.out.println("Au revoir");
		}
		
		scanner.close();
		
	}

}
