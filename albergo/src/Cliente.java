
public abstract class Cliente
{
	String nome;
	String cognome;
	String tipo;
	int stanza;
	
	Cliente(String nome, String cognome, String tipo, int stanza)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.tipo = tipo;
		this.stanza = stanza;
	}
	
	void informazioni()
	{
		System.out.println("Il cliente si chiama " + nome + " " + cognome + " ed è un " + tipo + ".");
		System.out.println("Soggiorna nella stanza " + stanza + ".");
	}
}
