
public abstract class Entity
{
	String name;
	int life;
	int damage;
	String ability;
	int special;
	
	public void attack(Entity enemy)
	{
		enemy.life = enemy.life - this.damage;
	}
	
	public void specialAttack(Entity enemy)
	{
		enemy.life = enemy.life - (this.damage + this.special);
	}
	
}
