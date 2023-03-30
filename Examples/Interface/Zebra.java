
public class Zebra extends EssereVivente implements Terrestre, Erbivoro
{
	Zebra()
	{
		this.famiglia = "equini";
		this.colore = "bianco e nero";
	}

	@Override
	void respira()
	{
		System.out.println("La zebra usa le narici");
	}

	@Override
	public void mangiaPiante()
	{
		System.out.println("La zebra mangia l'erba");
	}

	@Override
	public void cammina()
	{
		System.out.println("La zebra cammina");
	}

	public String toString()
	{
		String result = "La zebra appartiene ai " + famiglia + " ed è " + colore;
		return result;
	}
}
