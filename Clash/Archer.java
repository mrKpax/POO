
public class Archer extends Entity
{
	Archer()
	{
		this.name = "Arciere";
		this.life = 1000;
		this.damage = 350;
		this.ability = "Mega bowl";
		this.special =250;
	}
	
	@Override
	public void specialAttack(Entity enemy)
	{
		System.out.println(this.ability + " activated");
		enemy.life = enemy.life - (this.damage + this.special);
	}
}
