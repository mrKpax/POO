import java.util.ArrayList;

public abstract class Camera 
{
	float prezzo;
	String stato;
	String tipo;
	int idCamera;
	int posti;
	ArrayList<Cliente> clienti = new ArrayList<Cliente>();
	
	Camera(int idCamera)
	{
		this.idCamera = idCamera;
		
	}
	
	void informazioni()
	{
		System.out.println("La stanza è una " + tipo + " da " + posti + " posti, costa " + prezzo + "€ a notte ed à attualmente " + stato + ".");
	}
	
	void pulisci()
	{
		System.out.println("Servizio di pulizia incluso.");
	}
	
	void optional()
	{
		pulisci();
	}
	
	void insertAdulto(String nome, String cognome, String tipo, int stanza, String idCard)
	{
		ClienteAdulto nuovo = new ClienteAdulto(nome, cognome, tipo, stanza, idCard);
		
		clienti.add(nuovo);
	}
	
	void insertRagazzo(String nome, String cognome, String tipo, int stanza, String idCard)
	{
		ClienteRagazzo nuovo = new ClienteRagazzo(nome, cognome, tipo, stanza, idCard);
		
		clienti.add(nuovo);
	}
	
	void insertBambino(String nome, String cognome, String tipo, int stanza, int anni, String madre, String padre)
	{
		ClienteBambino nuovo = new ClienteBambino(nome, cognome, tipo, stanza, anni, madre, padre);
		
		clienti.add(nuovo);
	}
	
	void checkout()
	{
		for(int i=posti; i == 0; i--)
		{
			clienti.remove(i);
		}
	}
}
