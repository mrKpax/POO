
public class Cavaliere extends Personaggio
{
	private static int countCav = 0;
	private int idClass;

	Cavaliere(String tipo, int energia, int startPos) {
		super(tipo, energia, startPos);
		this.setIdClass(countCav++);
	}

	@Override
	public void colpisci(Personaggio pers)
	{
		pers.setEnergia(pers.getEnergia()-1);
	}

	public int getIdClass() 
	{
		return idClass;
	}

	public void setIdClass(int idClass) 
	{
		this.idClass = idClass;
	}
	
}
