package choice;
import javax.swing.*;
import java.awt.*;

public class GameCalendar extends JPanel {
	
	int gameday;
	int gameyearpast;
	int gameyearpresent;
	int room;
	boolean dialogue;
	boolean tutorial;
	
	public GameCalendar () 
	{
		gameday = 0;
		gameyearpast = 2042;
		gameyearpresent = 2052;
		room = 0;
		dialogue = false;
		tutorial = true;
	}
	
	public void completeDay()
	{
		gameday +=1;
	}
	
	public void completeGame()
	{
		gameday = 357;
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
	
	public boolean checkDialogue()
	{
		return dialogue;
	}
	
	public void startDialogue()
	{
		dialogue = true;
	}
	
	public void endDialgoue()
	{
		dialogue = false;
	}
	
	public boolean checkTutorial()
	{
		return tutorial;
	}
	
	public void endTutorial()
	{
		tutorial = false;
	}
	
	public void paintComponent(Graphics calendar)
	{	
		calendar.setColor(Color.white);
		
		super.paintComponent(calendar);
		if (gameday == -1)
		{
			calendar.setColor(Color.red);
			calendar.drawString("Day: xxxxx", 100, 20);
			calendar.drawString("Year: xxxxx", 100, 40);
		}
		
		else
		{
			calendar.drawString("Day: " + (gameday+1), 100, 20);
			
			if (gameday == 0)
			{
			calendar.drawString("Year: " + gameyearpast, 100, 40);
			}
			
			if (gameday == 1)
			{
				calendar.drawString("Year: " +gameyearpresent, 100, 40);
			}
			
			if (gameday == 357)
			{
				calendar.drawString("Year: 2053", 100, 40);
			}
		}
	}
}