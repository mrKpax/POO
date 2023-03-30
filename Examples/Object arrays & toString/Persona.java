
public class Persona
{
	String nome;
	String cognome;
	int anni;
	String lavoro;
	static int n;
	
	Persona(String nome, String cognome, int anni, String lavoro)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.anni = anni;
		this.lavoro = lavoro;
		n++;
	}
	
	public String toString()
	{
		String risultato = nome + "\n" + cognome + "\n" + anni + "\n" + lavoro;
		return risultato;
	}
	
	static void numPersone()
	{
		System.out.println("Numero di persone create: " + n);
	}
}
