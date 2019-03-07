package choice;

public class List {
	
	boolean Note1;
	boolean wall2;
	boolean floor1;
	boolean floor2;
	boolean redkey;
	boolean yellowkey;
	boolean greenkey;
	boolean powerswitch;
	boolean doorhold1;
	boolean doorhold2;
	boolean escape;
	boolean meetAlva;
	
	public List ()
	
	{
		Note1 = false;
		wall2 = false;
		floor1 = false;
		floor2 = false;
		redkey = false;
		greenkey = false;
		yellowkey = false;
		powerswitch = true;
		doorhold1 = false;
		doorhold2 = false;
		escape = false;
		meetAlva = false;
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
	
	public boolean checkRedKey()
	{
		return redkey;
	}
	
	public boolean checkGreenKey()
	{
		return greenkey;
	}
	
	public boolean checkYellowKey()
	{
		return yellowkey;
	}
	
	public boolean checkDoorHold1()
	{
		return doorhold1;
	}	public boolean checkDoorHold2()
	{
		return doorhold2;
		
	}
	
	public boolean checkPowerSwitch()
	{
		return powerswitch;
	}
	
	public boolean checkEscape()
	{
		return escape;
	}
	
	public void Escape()
	{
		escape = true;
	}
	
	public void switchRedKey()
	{
		if(redkey == false)
			redkey = true;
		else
			redkey = false;
	}
	
	public void switchGreenKey()
	{
		if(greenkey == false)
			greenkey = true;
		else
			greenkey = false;
	}
	
	public void switchYellowKey()
	{
		if(yellowkey == false)
			yellowkey = true;
		else
			yellowkey = false;
	}
	
	public void switchDoorHold1()
	{
		if(doorhold1 == false)
			doorhold1 = true;
		else
			doorhold1 = false;
	}
	
	public void switchDoorHold2()
	{
		if(doorhold2 == false)
			doorhold2 = true;
		else
			doorhold2 = false;
	}
	
	public void switchPowerSwitch()
	{
		if(powerswitch == false)
			powerswitch = true;
		else
			powerswitch = false;
	}
	
	public void meetAlva()
	{
		meetAlva = true;
	}
	
	public boolean checkMeetAlva()
	{
		return meetAlva;
	}
	
	
}
	
