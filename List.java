package choice;

public class List {
	
	boolean wall1;
	boolean wall2;
	boolean floor1;
	boolean floor2;
	
	public List ()
	
	{
		wall1 = false;
		wall2 = false;
		floor1 = false;
		floor2 = false;
	}
	
	public void actWall1()
	{
		wall1 = true;
	}
	
	public void actWall2()
	{
		wall2 = true;
	}
	
	public void actFloor1()
	{
		floor1 = true;
	}
	
	public void actFloor2()
	{
		floor2 = true;
	}
	
	public boolean checkWall1()
	{
		return wall1;
	}
	
	public boolean checkWall2()
	{
		return wall2;
	}
	
	public boolean checkFloor1()
	{
		return floor1;
	}
	
	public boolean checkFloor2()
	{
		return floor2;
	}
}
	
