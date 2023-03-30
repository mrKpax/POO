
public abstract class Autovettura implements Auto
{
	private String tipo;
	private int ruote;
	private int cilindrata;
	private String colore;
	private boolean stato;
	
	static int count = 0;
	
	Autovettura(int cilindrata, String colore)
	{
		this.tipo = "Autovettura";
		this.ruote = 0;
		this.cilindrata = cilindrata;
		this.colore = colore;
		this.stato = false;
		count++;
	}
	
	public abstract void accendi(Auto a) throws MotoreException;
	public abstract void spegni(Auto a) throws MotoreException;
	
	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}

	public int getRuote() 
	{
		return ruote;
	}

	public void setRuote(int ruote) 
	{
		this.ruote = ruote;
	}

	public int getCilindrata() 
	{
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) 
	{
		this.cilindrata = cilindrata;
	}

	public String getColore() 
	{
		return colore;
	}

	public void setColore(String colore) 
	{
		this.colore = colore;
	}

	public boolean getStato() 
	{
		return stato;
	}

	public void setStato(boolean stato) 
	{
		this.stato = stato;
	}
}
