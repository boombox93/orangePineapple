package orangePineapple;

public class Player 
{
	private int _health;
	private int _armor;
	public int _damage;
	public int _xPos = 0;
	public int _yPos = 0;
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
	
	public void setX(int xPos)
	{
		_xPos = xPos;
	}
	public int getX()
	{
		return _xPos;
	}
	
	public void setY(int yPos)
	{
		_yPos = yPos;
	}
	public int getY()
	{
		return _yPos;
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
	
	public void move(String direction)
	{
		if(direction.equals("Up"))
		{
			_yPos = _yPos + 1;
			if(_yPos == 10 )
			{
				System.out.println("No room in this direction.");
				_yPos = 9;
			}
			
		}
		else if(direction.equals("Down"))
		{
			_yPos = _yPos - 1;
			if(_yPos == -1 )
			{
				System.out.println("No room in this direction.");
				_yPos = 0;
			}
			
		}
		else if(direction.equals("Left"))
		{
			_xPos = _xPos - 1;
			if(_xPos == -1 )
			{
				System.out.println("No room in this direction.");
				_xPos = 0;
			}
		}
		else if(direction.equals("Right"))
		{
			_xPos = _xPos + 1;
			if(_xPos == 10 )
			{
				System.out.println("No room in this direction.");
				_xPos = 9;
			}
		}
	}
	
	
	
}
