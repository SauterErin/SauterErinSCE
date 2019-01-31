package choice;

public class List {
	
	boolean Note1;
	boolean wall2;
	boolean floor1;
	boolean floor2;
	
	public List ()
	
	{
		Note1 = false;
		wall2 = false;
		floor1 = false;
		floor2 = false;
	}
	
	public void actNote1()
	{
		Note1 = true;

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
	
	public boolean checkNote1()
	{
		return Note1;
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
	
