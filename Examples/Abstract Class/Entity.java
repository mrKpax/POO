
public abstract class Entity
{
	String name;
	int lifePoints;
	int damage;
	String ability;
	
	abstract void attack();
	abstract void defend();
	abstract void special();
	
	public String toString()
	{
		String result = name + " has " + lifePoints + " life points, inflicts " + damage + " damage and has " + ability + " ability.";
		return result;
	}
	
}
