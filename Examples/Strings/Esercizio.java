import java.util.Scanner;

public class Esercizio
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Cognome:");
		String cognome = scanner.nextLine();
		
		System.out.println("Il tuo nome in maiuscolo: " + nome.toUpperCase());
		System.out.println("Il tuo cognome in minuscolo: " + cognome.toLowerCase());
		System.out.println("Lunghezza del tuo nome: " + nome.length());
		System.out.println("Lunghezza del tuo cognome: " + cognome.length());
		
		int tot = nome.length() + cognome.length();
		System.out.println("Lunghezza di nome e cognome sommate: " + tot);
		
		System.out.println("Il tuo nome è Francesco? " + nome.equals("Francesco"));
		
	}

}
