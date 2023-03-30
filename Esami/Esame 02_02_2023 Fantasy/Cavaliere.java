
public class Cavaliere extends Personaggio
{

	Cavaliere(int energia)
	{
		super(energia);
		this.setTipo("Cavaliere");
	}

	@Override
	public void ruota(int g) 
	{
		this.setRotation((this.getRotation() + g) % 360);
	}

	@Override
	public void avanti(int s) throws PositionException 
	{
		if((this.getGamePos() + s) <= 100)
		{
			this.setGamePos(this.getGamePos() + s);
		}
		else
		{
			throw new PositionException("Impossibile superare i limiti del campo di gioco.");
		}
	}

	@Override
	public void indietro(int s) throws PositionException 
	{
		if((this.getGamePos() - s) >= 0)
		{
			this.setGamePos(this.getGamePos() - s);
		}
		else
		{
			throw new PositionException("Impossibile superare i limiti del campo di gioco.");
		}
	}

	@Override
	void colpisci(Personaggio pers) 
	{
		pers.setEnergia(pers.getEnergia() - 1);
	}

}
