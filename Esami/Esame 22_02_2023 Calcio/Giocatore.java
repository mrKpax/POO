
public class Giocatore
{
	private int codice;
	private String nome;
	private int anni;
	private double stipendio;
	
	private static int count = 0;
	
	Giocatore(String nome, int anni, double stipendio)
	{
		this.codice = count;
		this.nome = nome;
		this.anni = anni;
		this.stipendio = stipendio;
		
		count++;
	}
	
	@Override
	public String toString()
	{
		return nome + " | " + anni + " | Stipendio: " + stipendio;
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
	public int getAnni()
	{
		return anni;
	}
	public void setAnni(int anni)
	{
		this.anni = anni;
	}
	public double getStipendio() 
	{
		return stipendio;
	}
	public void setStipendio(double stipendio)
	{
		this.stipendio = stipendio;
	}
}
