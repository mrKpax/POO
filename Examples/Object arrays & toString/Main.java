import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		System.out.println("Quante persone vuoi inserire?");
		n = scanner.nextInt();
		scanner.nextLine();
		
		Persona[] persone = new Persona[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Inserisci nome n." + i);
			String nome = scanner.nextLine();
			
			System.out.println("Inserisci cognome n." + i);
			String cognome = scanner.nextLine();
			
			System.out.println("Inserisci anni n." + i);
			int anni = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Inserisci lavoro n." + i);
			String lavoro = scanner.nextLine();
			
			persone[i] = new Persona(nome, cognome, anni, lavoro);
		}
		
		System.out.println("\nVisualizzazione database persone:\n");
		
		for(int i=0; i<n; i++)
		{
			System.out.println(persone[i].toString());
			System.out.println("\n");
		}
		
		Persona.numPersone();
		
		scanner.close();
	}

}
