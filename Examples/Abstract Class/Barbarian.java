
public class Barbarian extends Entity
{

	Barbarian()
	{
		this.name = "Barbarian";
		this.lifePoints = 2000;
		this.damage = 250;
		this.ability = "Ultra strenght";
	}
	
	@Override
	void attack()
	{
		System.out.println("Barbarian inflicts 250 damage");
	}

	@Override
	void defend()
	{
		System.out.println("Barbarian lost 100 life points");
	}

	@Override
	void special()
	{
		System.out.println("Barbarian use Ultra Strenght");
	}
	
}
