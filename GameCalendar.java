package choice;
import javax.swing.*;
import java.awt.*;

public class GameCalendar extends JPanel {
	
	int gameday;
	int gameyearpast;
	int gameyearpresent;
	int room;
	int menucursor;
	int inventorycursor;
	int inventorytotal;
	boolean dialogue;
	boolean tutorial;
	boolean menu;
	boolean inventorymenu;
	boolean red;
	boolean blue;
	int currentyear;
	
	public GameCalendar () 
	{
		gameday = 0;
		gameyearpast = 2042;
		gameyearpresent = 2052;
		room = 0;
		menucursor = 0;
		inventorycursor = 0;
		inventorytotal = 0;
		dialogue = false;
		menu = false;
		inventorymenu = false;
		tutorial = true;
		red = false;
		blue = false;
		currentyear = gameyearpast;
	}
	
	public void completeDay()
	{
		gameday +=1;
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
	
	public boolean checkMenu()
	{
		return menu;
	}
	
	public void startMenu()
	{
		menu = true;
	}
	
	public void endMenu()
	{
		menu = false;
	}
	
	public int getMenuCursor()
	{
		return menucursor;
	}
	
	public void setMenuCursor(int newposition)
	{
		menucursor = newposition;
	}
	
	public boolean checkInventoryMenu()
	{
		return inventorymenu;
	}
	
	public void startInventoryMenu()
	{
		System.out.println("Inven - start");
		inventorymenu = true;
	}
	
	public void endInventoryMenu()
	{
		inventorymenu = false;
	}
	
	public int getInventoryTotal()
	{
		return inventorytotal;
	}
	
	public void increaseInventoryTotal()
	{
		inventorytotal = inventorytotal +1;
	}
	
	public int getInventoryCursor()
	{
		return inventorycursor;
	}
	
	public void resetInventoryCursor()
	{
		inventorycursor = 0;
	}
	
	public void changeInventoryCursor( int change)
	{
		inventorycursor = inventorycursor + change;
	}
	
	
	public boolean checkTutorial()
	{
		return tutorial;
	}
	
	public void endTutorial()
	{
		tutorial = false;
	}
	
	public void ModeRed()
	{
		red = true;
		blue = false;
	}
	
	public boolean getRed()
	{
		return red;
	}
	
	public void ModeBlue()
	{
		blue = true;
		red = false;
	}
	
	public void DefaultMode()
	{
		blue = false;
		red = false;
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
			calendar.drawString("Day: " + (gameday+1), 140, 320);
			
			if (gameday == 0)
			{
			calendar.drawString("Year: " + gameyearpast, 140, 350);
			}
			
			if (gameday == 1)
			{
				calendar.drawString("Year: " +gameyearpresent, 140, 350);
			}
			
			if (gameday == 357)
			{
				calendar.drawString("Year: 2053", 140, 350);
			}
		}
	}
}