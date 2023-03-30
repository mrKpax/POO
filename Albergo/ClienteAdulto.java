
public class ClienteAdulto extends Cliente
{
	String idCard;

	ClienteAdulto(String nome, String cognome, String tipo, int stanza, String idCard)
	{
		super(nome, cognome, tipo, stanza);
		this.idCard = idCard;
	}
	
	@Override
	void informazioni()
	{
		System.out.println("Il cliente si chiama " + nome + " " + cognome + " ed è un " + tipo + ".");
		System.out.println("Carta d'identità: " + idCard);
		System.out.println("Soggiorna nella stanza " + stanza + ".");
	}

}
