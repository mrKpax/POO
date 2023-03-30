import java.util.Scanner;

public class Battaglia
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		Entity barb = new Barbarian();
		Entity arc = new Archer();
		
		int op;
		
		while(barb.life > 0 && arc.life > 0)
		{
			if(barb.life > 0)
			{
				System.out.println("\nIl barbaro (" + barb.life + " life) attacca...");
				System.out.println("1.Attacco base (250)\n2.Attacco special(400)");
				op = scanner.nextInt(); scanner.nextLine();
				if(op == 1)
				{
					barb.attack(arc);
				}
				if(op == 2)
				{
					barb.specialAttack(arc);
				}
			}
			else if(barb.life <= 0)
			{
				System.out.println("L'arciere ha vinto!");
			}
			
			if(arc.life > 0)
			{	
				System.out.println("\nL'arciere (" + arc.life + " life) attacca...");
				System.out.println("1.Attacco base (350)\n2.Attacco special(600)");
				op = scanner.nextInt(); scanner.nextLine();
				if(op == 1)
				{
					arc.attack(barb);
				}
				if(op == 2)
				{
					arc.specialAttack(barb);
				}
			}
			else if(arc.life <= 0)
			{
				System.out.println("Il barbaro ha vinto!");
			}
		}
		scanner.close();
	}

}
