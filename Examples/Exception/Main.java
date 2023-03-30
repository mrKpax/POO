import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci l'anno corrente");
		
		try
		{
			int anno = scanner.nextInt();
			checkYear(anno);
		}
		catch(Exception e)
		{
			System.out.println("Errore bro\n" + e);
		}
	}
	
	static void checkYear(int anno) throws YearException
	{
		if(anno > 2023)
			throw new YearException("Impossibile bro, non puoi venire dal futuro");
		else
			System.out.println("Ciao umano del " + anno);
	}
	

}
