
public class Viaggio 
{
	private int codice;
	private String nome;
	private String descrizione;
	private int durata;
	private double costo;
	
	private static int count = 0;
	
	Viaggio(String nome, String descrizione, int durata, double costo)
	{
		count++;
		this.codice = count;
		this.nome = nome;
		this.descrizione = descrizione;
		this.durata = durata;
		this.costo = costo;
	}
	
	@Override
	public String toString()
	{
		return "Codice viaggio: " + codice + " | Nome viaggio: " + nome + " | Descrizione itinerario: " + descrizione + 
				" | Durata in giorni: " + durata + " | Costo: " + costo;
	}
	
	public int getCodice() 
	{
		return codice;
	}
	public void setCodice(int codice) 
	{
		this.codice = codice;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getDescrizione() 
	{
		return descrizione;
	}
	public void setDescrizione(String descrizione) 
	{
		this.descrizione = descrizione;
	}
	public int getDurata() 
	{
		return durata;
	}
	public void setDurata(int durata) 
	{
		this.durata = durata;
	}
	public double getCosto() 
	{
		return costo;
	}
	public void setCosto(double costo) 
	{
		this.costo = costo;
	}
}
