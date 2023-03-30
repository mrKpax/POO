import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Creazione di una persona:");
		
		System.out.println("Inserisci il nome: ");
		String nome = scanner.nextLine();
			
		System.out.println("Inserisci il cognome: ");
		String cognome = scanner.nextLine();
			
		System.out.println("Inserisci gli anni: ");
		int anni = scanner.nextInt();
		scanner.nextLine();
			
		System.out.println("Inserisci il lavoro: ");
		String lavoro = scanner.nextLine();
			
		Persona p = new Persona(nome, cognome, anni, lavoro);
		
		System.out.println("La persona si chiama " + p.nome + " " + p.cognome + ", ha " + p.anni + " e fa il " + p.lavoro);
	
		scanner.close();
	}
	
}
