package choice;

import java.awt.Color;
import java.awt.Graphics;

public class GameMode {

	private boolean monsterMode;
	
	private int currentyear;
	private int ending;
	private int gameyearpast;
	private int gameyearpresent;
	private int room;

	public GameMode () 
	{
		ending = 0;
		gameyearpast = 2042;
		gameyearpresent = 2052;
		monsterMode = false;
		room = 2;
		
		currentyear = gameyearpresent;
	}
	
	// Change ending number 
	public void changeEnding(int newEnding)
	{
		ending = newEnding;
	}
	
	// Change current Room
	public void changeRoom(int newRoom)
	{
		room = newRoom;
	}
	
	// Check if playing as monster 
	public boolean checkMonsterMode() 
	{
		return monsterMode;
	}
	
	// Stop playing as Monster
	public void endMonsterMode() 
	{
		monsterMode = false;
	}
	
	// Get current ending of game - 0 is normal play, -1 is lead up to Ending Title
	public int getEnding()
	{
		return ending;
	}
	
	// Get Current Room
	public int getRoom()
	{
		return room;
	}
	
	// Return time value of past 
	public int getPast() 
	{
		return gameyearpast;
	}
	
	// Return time value of present
	public int getPresent() 
	{
		return gameyearpresent;
	}
	
	// Return time frame of game 
	public int getYear()
	{
		return currentyear;
	}
	
	// Start playing as Monster
	public void startMonsterMode() 
	{
		monsterMode = true;
	}	
	
	// Change game time period to past
	public void startPast()
	{
		currentyear = gameyearpast;
	}
	
	// Change game time period to present
	public void startPresent()
	{
		currentyear = gameyearpresent;
	}
}