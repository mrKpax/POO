
public class Squalo extends EssereVivente implements Acquatico, Carnivoro
{
	Squalo()
	{
		this.famiglia = "pesci";
		this.colore = "grigio";
	}
	
	@Override
	void respira()
	{
		System.out.println("Lo squalo usa le branchie");
	}

	@Override
	public void mangiaCarne()
	{
		System.out.println("Lo squalo mangia carne");
	}

	@Override
	public void nuota()
	{
		System.out.println("Lo squalo nuota");
	}

	public String toString()
	{
		String result = "Lo suqualo appartiene ai " + famiglia + " ed è " + colore;
		return result;
	}
}
