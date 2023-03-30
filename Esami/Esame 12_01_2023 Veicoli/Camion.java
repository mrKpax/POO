
public class Camion extends Macchina
{
	private double lunRimorchio;
	private double pesoCarico;
	private int limiteVel;
	
	Camion(int ruote, int cilindrata, String colore, String targa, int marce)
	{
		super(cilindrata, colore, targa, marce);
		this.setTipo("Camion");
		this.setStato(false);
		this.setRuote(ruote);
		this.lunRimorchio = 0;
		this.pesoCarico = 0;
		this.limiteVel = 0;
	}
	
	public void caricaRimorchio(double carico)
	{
		this.setPesoCarico(this.getPesoCarico() + carico);
	}
	
	public void scaricaRimorchio()
	{
		this.setPesoCarico(0);
	}
	
	@Override
	public String toString()
	{
		return "Tipo: " + this.getTipo() + " | Matricola: " + this.getMatricola() + " | Targa: " + this.getTarga() + " | Cilindrata: " + this.getCilindrata() 
		+ " | Colore: " + this.getColore() + " | Ruote: " + this.getRuote() + " | Marce: " + this.getMarce() + " | Lunghezza rimorchio: " + lunRimorchio + 
		" | Peso rimorchio: " + pesoCarico + " | Limite velocità: " + limiteVel;
	}
	
	public double getLunRimorchio() 
	{
		return lunRimorchio;
	}

	public void setLunRimorchio(double lunRimorchio) 
	{
		this.lunRimorchio = lunRimorchio;
	}

	public double getPesoCarico() 
	{
		return pesoCarico;
	}

	public void setPesoCarico(double pesoCarico)
	{
		this.pesoCarico = pesoCarico;
	}

	public int getLimiteVel() 
	{
		return limiteVel;
	}

	public void setLimiteVel(int limiteVel) 
	{
		this.limiteVel = limiteVel;
	}
	
}
