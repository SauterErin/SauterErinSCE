package choice;

import java.awt.Color;
import java.awt.Graphics;

public class GameMode {
	
	int gameday;
	int gameyearpast;
	int gameyearpresent;
	int room;
	boolean red;
	boolean monsterMode;
	int currentyear;


	public GameMode () 
	{
		gameday = 0;
		gameyearpast = 2042;
		gameyearpresent = 2052;
		room = 2;
		red = false;
		currentyear = gameyearpresent;
	}
	
	
	
	
	public void completeDay()
	{
		if (currentyear == 2052)
			currentyear = 2042;
		else 
			currentyear = 2052;
	}
	
	public void completeGame()
	{
		gameday = 357;
	}
	
	public int returnYear()
	{
		return currentyear;
	}
	
	public int getGameDay()
	{
		return gameday;
	}
	
	public void zeroDay()
	{
		gameday = -1;
	}
	
	public int getRoom()
	{
		return room;
	}
	
	public void changeRoom(int newRoom)
	{
		room = newRoom;
	}
	
	
	
	public void ModeRed()
	{
		red = true;
	}
	
	public boolean getRed()
	{
		return red;
	}
	
	public void startBadEnd1()
	{
	
		gameday = -2;
	}
	
	public void finishBadEnd1()
	{
		gameday = -3;
	}
	
	public void DefaultMode()
	{
		monsterMode = false;
		red = false;
	}

	public void MonsterMode() 
	{
		monsterMode = true;
		red = true;
	}


	public boolean checkMonsterMode() {
		return monsterMode;
	}


	
	
}
