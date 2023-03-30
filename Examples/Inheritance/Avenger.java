
public class Avenger extends Persona
{
	String potere;
	int alleati;
	
	Avenger(String nome, String cognome, int anni, String potere, int alleati)
	{
		super(nome, cognome, anni);
		this.potere = potere;
		this.alleati = alleati;
	}
	
	@Override
	public String toString()
	{
		String risultato = "Avenger:\n" + nome + "\n" + cognome + "\n" + anni + "\n" + potere + "\n" + "Alleati: " + alleati;
		return risultato;
	}
	
}
