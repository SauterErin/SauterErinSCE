package choice;
import java.awt.*;
public class PurpleDoor extends GameObject{
	
	public PurpleDoor (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		boolean wait = true;

		if(list.checkPurpleKey() == true)
		{	
			// If in Detention Room
			if (gameinfo.getRoom() == 2 && wait == true)
			{	
				gameinfo.changeRoom(0);
				sprite.setGameSprite (9, 3, 'W');
				wait = false;
			}
			
			// If in North Hall
			if (gameinfo.getRoom() == 0 && wait == true)
			{	
				// Facing East
				if(sprite.checkDirection() == 'E' && wait == true)
				{
					gameinfo.changeRoom(2);
					sprite.setGameSprite(4,5,'N');
					wait = false;
				}
				
				// Facing North 
				if(sprite.checkDirection() == 'N' && wait == true)
				{
					gameinfo.changeRoom(19);
					sprite.setGameSprite(3,13,'N');
					wait = false;
				}
			}
			
			// If in Exit Hall
			if (gameinfo.getRoom() == 19 && wait == true)
			{
				// If facing North exit
				if(sprite.checkDirection() == 'N' && wait == true)
				{
					log.readDialogue(131);
				}
				
				// If using southern door
				if(sprite.checkDirection() == 'S' && wait == true)
				{
					gameinfo.changeRoom(0);
					sprite.setGameSprite(8,1,'S');
					wait = false;
				}
			}
			
			// If outside in Front Yard
			if (gameinfo.getRoom() == 20 && wait == true)
			{
				log.readDialogue(132);
			}
			
			// If in Key Slot Room 
			if (gameinfo.getRoom() == 21 && list.checkKeySlot() == false && wait == true)
			{
				gameinfo.changeRoom(12);
				wait = false;
				sprite.setGameSprite(4,5,'N');
			}
			
			// If in East Hall 
			if (gameinfo.getRoom() == 12 && wait == true)
			{
				wait = false;
				gameinfo.changeRoom(21);
				sprite.setGameSprite(1,1,'S');
			}	
		}
		// If does not have purple key 
		if(list.checkPurpleKey() == false)
		{
			log.readDialogue(12);
		}
		
		// Exiting key slot room after activating key slot
		if (gameinfo.getRoom() == 21 && list.checkKeySlot() == true && wait == true )
		{
			log.readDialogue(134);
		}
	}
	
	public void paintComponent(Graphics g)
	{		
		super.paintComponent(g);
			
		g.setColor(Color.gray);	
		
		g.fillRect(RelativeX, RelativeY, 10,50 );
		g.fillRect(RelativeX+40, RelativeY, 10,50 );
		
		g.setColor(new Color(51, 5, 66));
		g.fillRect(RelativeX+10, RelativeY, 30,50);
		
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
		g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
		
		g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		
		// If Jackson is holding door
		if(list.checkDoorHold2() == true)
		{
			g.setColor(Color.white);
			g.fillRect(RelativeX+10,RelativeY+30,30,10);
			g.drawLine(RelativeX+15, RelativeY+24, RelativeX+27, RelativeY+14);

			g.setColor(Color.red);
			g.fillRect(RelativeX+10, RelativeY+10, 30, 20);
			g.drawLine(RelativeX+15, RelativeY+30, RelativeX+15, RelativeY+38);
		}
	}
}