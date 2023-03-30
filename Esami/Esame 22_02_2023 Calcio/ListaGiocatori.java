import java.util.ArrayList;

public abstract class ListaGiocatori implements SquadraDiCalcio
{
	private int codice;
	private String nome;
	private String campionato;
	private int anno;
	private int maxGiocatori;
	private ArrayList<Giocatore> lista;
	
	private static int count = 0;

	ListaGiocatori(int codice, String nome, String campionato, int anno)
	{
		this.codice = codice;
		this.nome = nome;
		this.campionato = campionato;
		this.anno = anno;
		this.maxGiocatori = 25;
		this.lista = new ArrayList<Giocatore>();
	}
	
	@Override
	public String toString()
	{
		return nome + " [" + codice + "] | " + campionato + " (" + anno + ") | Giocatori in rosa: " + count;
	}
	
	void modifica(int n)
	{
		this.setMaxGiocatori(n);
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

	public String getCampionato()
	{
		return campionato;
	}

	public void setCampionato(String campionato) 
	{
		this.campionato = campionato;
	}

	public int getAnno() 
	{
		return anno;
	}

	public void setAnno(int anno)
	{
		this.anno = anno;
	}

	public int getMaxGiocatori() 
	{
		return maxGiocatori;
	}

	public void setMaxGiocatori(int maxGiocatori) 
	{
		this.maxGiocatori = maxGiocatori;
	}

	public ArrayList<Giocatore> getLista() 
	{
		return lista;
	}

	public void setLista(ArrayList<Giocatore> lista) 
	{
		this.lista = lista;
	}
	
	public static int getCount() 
	{
		return count;
	}

	public static void setCount(int count) 
	{
		ListaGiocatori.count = count;
	}
}
