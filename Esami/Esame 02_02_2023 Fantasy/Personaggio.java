
public abstract class Personaggio implements PersMaster
{
	private int id;
	private String tipo;
	private int energia;
	private int startPos;
	private int gamePos;
	private int rotation;

	private static int count = 0;
	
	Personaggio(int energia)
	{
		this.id = count;
		this.tipo = "";
		this.energia = energia;
		this.startPos = 1;
		this.gamePos = startPos;
		this.rotation = 0;
		
		count++;
	}
	
	abstract void colpisci(Personaggio pers);
	
	@Override
	public String toString()
	{
		return "ID: " + this.id + " | " +  this.tipo + " | Energia: " + this.energia + " | Posizione attuale: " + this.gamePos;
	}
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
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
	

	public int getRotation() 
	{
		return rotation;
	}

	public void setRotation(int rotation) 
	{
		this.rotation = rotation;
	}
}
