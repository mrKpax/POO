
public class Barbarian extends Entity
{
	Barbarian()
	{
		this.name = "Barbaro";
		this.life = 1500;
		this.damage = 250;
		this.ability = "Ultra strenght";
		this.special = 150;
	}
	
	@Override
	public void specialAttack(Entity enemy)
	{
		System.out.println(this.ability + " activated");
		enemy.life = enemy.life - (this.damage + this.special);
	}
}
