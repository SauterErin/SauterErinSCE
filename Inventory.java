package choice;

public class Inventory {

	boolean redkey;
	boolean pinkkey;
	boolean ironkey;
	
	public Inventory()
	{
		redkey = false;
		pinkkey = false;
		ironkey = false;
	}
	
	public boolean checkRedKey()
	{
		return redkey;
	}
	
	public boolean checkPinkKey()
	{
		return pinkkey;
	}
	
	public boolean checkIronKey()
	{
		return ironkey;
	}
	
	public void findRedKey()
	{
		redkey = true;	
	}
	
	public void findPinkKey()
	{
		pinkkey = true;
	}
	
	public void findIronKey()
	{
		ironkey = true;
	}
}
