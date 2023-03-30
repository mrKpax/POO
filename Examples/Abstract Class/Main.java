
public class Main
{
	public static void main(String[] arg)
	{
		Barbarian barbaro = new Barbarian();
		Archer arciere = new Archer();
		
		System.out.println(barbaro.toString());
		System.out.println(arciere.toString());
		
		System.out.println("\nPiccola lotta:\n");
		barbaro.special();
		barbaro.attack();
		arciere.defend();
		arciere.special();
		arciere.attack();
		barbaro.defend();
		
	}
}
