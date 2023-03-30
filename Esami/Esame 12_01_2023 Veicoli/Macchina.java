
public class Macchina extends Autovettura
{
	private int matricola;
	private String targa;
	private int marce;
	
	Macchina(int cilindrata, String colore, String targa, int marce)
	{
		super(cilindrata, colore);
		this.setRuote(4);
		this.setTipo("Macchina");
		this.setStato(false);
		this.matricola = count;
		this.targa = targa;
		this.marce = marce;
	}

	@Override
	public void accendi(Auto a) throws MotoreException
	{
		if(this.getStato())
			throw new MotoreException("Errore! Motore già acceso");
		else
		{
			this.setStato(true);
			System.out.println("Motore acceso.");
		}	
	}

	@Override
	public void spegni(Auto a) throws MotoreException
	{
		if(!this.getStato())
			throw new MotoreException("Errore! Motore già spento");
		else
		{
			this.setStato(false);
			System.out.println("Motore spento.");
		}	
	}
	
	public void avanti()
	{
		if (this.getStato())
			System.out.println("Il veicolo si muove in avanti.");
		else
			System.out.println("Impossibile muovere il veicolo: veicolo spento.");
	}
	
	public void indietro()
	{
		if (this.getStato())
			System.out.println("Il veicolo si muove in retromarcia.");
		else
			System.out.println("Impossibile muovere il veicolo: veicolo spento.");
	}

	@Override
	public String toString()
	{
		return "Tipo: " + this.getTipo() + " | Matricola: " + matricola + " | Targa: " + targa + " | Cilindrata: " + this.getCilindrata() 
		+ " | Colore: " + this.getColore() + " | Ruote: " + this.getRuote() + " | Marce: " + marce;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) 
	{
		this.matricola = matricola;
	}

	public String getTarga() 
	{
		return targa;
	}

	public void setTarga(String targa) 
	{
		this.targa = targa;
	}

	public int getMarce() 
	{
		return marce;
	}

	public void setMarce(int marce) 
	{
		this.marce = marce;
	}
}
