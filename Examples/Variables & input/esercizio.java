
import java.util.Scanner;

public class esercizio
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ciao, come ti chiami?");
		String nome = scanner.nextLine();
		
		System.out.println("Ciao " + nome + ", inserisci il tuo cognome:");
		String cognome = scanner.nextLine();
		
		System.out.println("Quanti anni hai?");
		int anni = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Ciao " + nome.toUpperCase() + " " + cognome.toUpperCase());
		int annoNascita = 2023 - anni;
		System.out.println("Secondo i nostri studi sei dell'anno " + annoNascita);
		System.out.println("E' corretto? (Y = 1, N = 0)");
		int check = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Okay possiamo salutarci, ciao!");
	}

}
