public class Archer extends Entity
{

	Archer()
	{
		this.name = "Archer";
		this.lifePoints = 1000;
		this.damage = 300;
		this.ability = "Invisibility";
	}
	
	@Override
	void attack()
	{
		System.out.println("Archer inflicts 300 damage");
	}

	@Override
	void defend()
	{
		System.out.println("Archer lost 200 life points");
	}

	@Override
	void special()
	{
		System.out.println("Archer use Invisibility");
	}
	
}