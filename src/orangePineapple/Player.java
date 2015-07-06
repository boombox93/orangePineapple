package orangePineapple;

public class Player 
{
	private int _health;
	private int _armor;
	public int _damage;
	private String _name;
	
	public void setHealth(int health)
	{
		_health = health;
	}
	
	public int getHealth()
	{
		return _health;
	}
	
	public void setArmor(int armor)
	{
		_armor = armor;
	}
	
	public int getArmor()
	{
		return _armor;
	}
	
	public void setDamage(int damage)
	{
		_damage = damage;
	}
	
	public int getDamage()
	{
		return _damage;
	}
	
	public void setName(String name)
	{
		_name = name;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public void takeDamage(int damage)
	{
		//Logic is: if armor is greater than damage, subtract that amount of damage from health
		//else if there's less health than the amount of damage, subtract the remainder of armor - damage from health
		//Confirmed working properly
		//test
		if(_armor > damage)
		{
			_armor = _armor - damage;
		}
		else if(_armor < damage)
		{
			int remainder = damage - _armor;
			_armor = 0;
			_health = _health - remainder;
		}
	
	}
	
	
	
}
