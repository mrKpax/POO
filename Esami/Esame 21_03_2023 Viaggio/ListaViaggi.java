
public abstract class ListaViaggi implements Lista
{
	private int codice;
	private String nome;
	private int validita;
	
	private static int count = 0;
	
	ListaViaggi(String nome, int validita)
	{
		count++;
		this.codice = count;
		this.nome = nome;
		this.validita = validita;
	}
	
	abstract public void modifica(Object val);
	
	@Override
	public String toString()
	{
		return "Codice lista: " + codice + " | Nome lista: " + nome + " | Periodo di validità in giorni: " + validita;
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
	public int getValidita() 
	{
		return validita;
	}
	public void setValidita(int validita) 
	{
		this.validita = validita;
	}
	public static int getCount() 
	{
		return count;
	}
	public static void setCount(int count) 
	{
		ListaViaggi.count = count;
	}
}
