
public class Leone extends EssereVivente implements Terrestre, Carnivoro
{
	Leone()
	{
		this.famiglia = "felini";
		this.colore = "giallo";
	}
	
	@Override
	void respira()
	{
		System.out.println("Il leone usa le narici");
	}
	
	@Override
	public void mangiaCarne()
	{
		System.out.println("Il leone mangia carne");
	}

	@Override
	public void cammina()
	{
		System.out.println("Il leone cammina");
	}

	public String toString()
	{
		String result = "Il leone appartiene ai " + famiglia + " ed è " + colore;
		return result;
	}
}
