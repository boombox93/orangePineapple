package orangePineapple.Creatures;

public class Rat 
{

	private int _health;
	private int _damage;
	private boolean _isDead = false;
	
	public void setHealth(int health)
	{
		_health = health;
	}
	
	public int getHealth()
	{
		return _health;
	}
	
	public void setDamage(int damage)
	{
		_damage = damage;
	}
	
	public int getDamage()
	{
		return _damage;
	}
	
	public boolean isDead()
	{
		if(_isDead = true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void takeDamage(int damage)
	{
		
		if(_health > damage)
		{
			_health = _health - damage;
			_isDead = false;
		}
		else if(_health < damage)
		{
			_health = 0;
			_isDead = true;
		}
		
		
	}
	
}
