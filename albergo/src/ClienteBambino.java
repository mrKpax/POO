
public class ClienteBambino extends Cliente
{
	int anni;
	String madre;
	String padre;
	
	ClienteBambino(String nome, String cognome, String tipo, int stanza, int anni, String madre, String padre)
	{
		super(nome, cognome, tipo, stanza);
		this.anni = anni;
		this.madre = madre;
		this.padre = padre;
	}
	
	@Override
	void informazioni()
	{
		System.out.println("Il cliente si chiama " + nome + " " + cognome + " ed è un " + tipo + ".");
		System.out.println("Genitori : " + madre + ", " + padre + ".");
		System.out.println("Soggiorna nella stanza " + stanza + ".");
	}
}
