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
			System.out.println("E' un Avenger? (Y/N)");
			String op = scanner.nextLine();
			
			if(op.equals("Y"))
			{
				System.out.println("Inserisci nome Avenger");
				String nome = scanner.nextLine();
				
				System.out.println("Inserisci cognome Avenger");
				String cognome = scanner.nextLine();
				
				System.out.println("Inserisci anni Avenger");
				int anni = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Inserisci superpotere Avenger");
				String potere = scanner.nextLine();
				
				System.out.println("Inserisci alleati Avenger");
				int alleati = scanner.nextInt();
				scanner.nextLine();
				
				persone[i] = new Avenger(nome, cognome, anni, potere, alleati);
				
				continue;
			}
			
			System.out.println("Inserisci nome civile");
			String nome = scanner.nextLine();
			
			System.out.println("Inserisci cognome civile");
			String cognome = scanner.nextLine();
			
			System.out.println("Inserisci anni civile");
			int anni = scanner.nextInt();
			scanner.nextLine();
			
			persone[i] = new Persona(nome, cognome, anni);
		}
		
		System.out.println("\nVisualizzazione database persone:\n");
		
		for(int i=0; i<n; i++)
		{
			System.out.println(persone[i].toString());
			System.out.println("\n");
		}
		
		scanner.close();
	}

}