
public abstract class Personaggio implements Pers_Master
{
	private int ID;
	private String tipo;
	private int energia;
	private int startPos;
	private int gamePos;
	private int angolo;
	
	static int count = 0;
	
	Personaggio(String tipo, int energia, int startPos)
	{
		this.ID = count;
		this.tipo = tipo;
		this.energia = energia;
		this.startPos = startPos;
		this.gamePos = startPos;
		this.angolo = 0;
		
		count++;
	}
	
	public abstract void colpisci(Personaggio pers);
	
	@Override
	public String toString()
	{
		return "Tipo: " + tipo + " | Energia: " + energia + " | Posizione iniziale: " + startPos + 
				" | Posizione attuale: " + gamePos + " | Rotazione: " + angolo;
	}
	
	public void ruota(int g) 
	{
		if(g > 0)
		{
			this.setAngolo((this.getAngolo() + g) % 360);
		}
	}
	
	@Override
	public void avanti(int s) throws CampoGiocoException
	{	
		if(this.getGamePos() == 100)
		{
			throw new CampoGiocoException("Limite campo di gioco raggiunto.");
		}
		else
		{
			this.setGamePos(this.getGamePos() + s);
			System.out.println("Movimento in avanti effettuato");
		}
	}

	@Override
	public void indietro(int s) throws CampoGiocoException
	{
		if(this.getGamePos() == 0)
		{
			throw new CampoGiocoException("Limite campo di gioco raggiunto.");
		}
		else
		{
			this.setGamePos(this.getGamePos() - s);
			System.out.println("Movimento indietro effettuato");
		}
	}
	
	public int getID() 
	{
		return ID;
	}

	public void setID(int iD) 
	{
		ID = iD;
	}

	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}

	public int getEnergia() 
	{
		return energia;
	}

	public void setEnergia(int energia) 
	{
		this.energia = energia;
	}

	public int getStartPos() 
	{
		return startPos;
	}

	public void setStartPos(int startPos) 
	{
		this.startPos = startPos;
	}

	public int getGamePos() 
	{
		return gamePos;
	}

	public void setGamePos(int gamePos) 
	{
		this.gamePos = gamePos;
	}

	public int getAngolo() 
	{
		return angolo;
	}

	public void setAngolo(int angolo) 
	{
		this.angolo = angolo;
	}

}