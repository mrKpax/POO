
public class Persona
{
	String nome;
	String cognome;
	int anni;
	
	Persona(String nome, String cognome, int anni)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.anni = anni;
	}
	
	public String toString()
	{
		String risultato = nome + "\n" + cognome + "\n" + anni + "\n";
		return risultato;
	}
	
}
