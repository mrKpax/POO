
public class Orco extends Personaggio
{
	private static int countOrco = 0;
	private int idClass;

	Orco(String tipo, int energia, int startPos) {
		super(tipo, energia, startPos);
		this.setIdClass(countOrco++);
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