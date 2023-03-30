
public class Balena extends EssereVivente implements Acquatico, Erbivoro
{
	Balena()
	{
		this.famiglia = "cetacei";
		this.colore = "nero";
	}
	
	@Override
	void respira()
	{
		System.out.println("La balena usa le branchie");
	}
	
	@Override
	public void mangiaPiante()
	{
		System.out.println("La balena mangia alghe");
	}

	@Override
	public void nuota()
	{	
		System.out.println("La balena nuota");
	}

	public String toString()
	{
		String result = "La balena appartiene ai " + famiglia + " ed è " + colore;
		return result;
	}
}
