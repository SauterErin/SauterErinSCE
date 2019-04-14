package choice;
import java.awt.*;

public class SimpleDoor extends GameObject {

	public SimpleDoor(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
			
	public void interactObject()
	{
		// If in Past 
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			// If neither Wire Box or Simple Door are broken
			if(list.checkBrokenSimpleDoor() == false && list.checkBrokenWireBox() == false)
			{
				log.readDialogue(32);
			}
			
			// If one of either Wire Box or Simple Door are broken
			if(list.checkBrokenSimpleDoor() == true || list.checkBrokenWireBox() == true)
			{
				// If in East Wing
				if(gameinfo.getRoom() == 12)
				{
					gameinfo.changeRoom(13);
					sprite.setGameSprite(1,2,'N');
				}
				
				// If in Spare Room
				else
				{
					gameinfo.changeRoom(12);
					sprite.setGameSprite(9,1,'S');	
				}
			}
		}
		
		// In present 
		else
		{
			// If Door is reinforced and Wire box isn't broken or Wire box is welded and door is not broken
			if((list.checkReinforcedSimpleDoor() == true && list.checkBrokenWireBox() == false) || (list.checkWeldWireBox() == true && list.checkBrokenSimpleDoor() == false))
			{
				// If Door is reinforced 
				if(list.checkReinforcedSimpleDoor() == true)
				{
					log.readDialogue(34);
				}
				
				// If door is not reinforced 
				else
				{	
					log.readDialogue(38);
				}
			}
			
			// If Door is compromised in some way 
			else
			{
				// If in East Hall 
				if(gameinfo.getRoom() == 12)
				{
					gameinfo.changeRoom(13);
					sprite.setGameSprite(1,2,'N');
					sprite.endPresentMonster();
				}
				
				else
				{
					// If After Will is captured or Before Will Meets Alva 
					if(list.checkRun() == false || (list.checkRun() == true && list.checkNightofHorrors() == true))
					{
						gameinfo.changeRoom(12);
						sprite.setGameSprite(9,1,'S');
					}
					
					// If while Will is running away - before capture
					else
						log.readDialogue(85);
				}
			}
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// If Door is not broken
		if(list.checkBrokenSimpleDoor() == false)
		{
			g.setColor(Color.gray);	
			
			g.fillRect(RelativeX, RelativeY, 10,50 );
			g.fillRect(RelativeX+40, RelativeY, 10,50 );
			
			g.setColor(new Color(44,92,51));
			g.fillRect(RelativeX+10, RelativeY, 30,50);
			
			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
			g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
			
			g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		}
		
		// If Door is broken - and not reinforced
		if(list.checkBrokenSimpleDoor() == true && list.checkReinforcedSimpleDoor() == false)
		{
			g.setColor(Color.gray);	
			
			g.fillRect(RelativeX, RelativeY, 10,50 );
			g.fillRect(RelativeX+40, RelativeY, 10,50 );
			
			g.setColor(new Color(44,92,51));
			g.fillRect(RelativeX+10, RelativeY, 30,50);
			
			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
			g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
			
			g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			
			g.fillRect(RelativeX+35, RelativeY, 5, 50);
		}
		
		// If door is broken and then reinforced
		if(list.checkBrokenSimpleDoor() == true && list.checkReinforcedSimpleDoor() == true)
		{
			g.setColor(Color.gray);	
			
			g.fillRect(RelativeX, RelativeY, 10,50 );
			g.fillRect(RelativeX+40, RelativeY, 10,50 );
			
			g.setColor(Color.darkGray);
			g.fillRect(RelativeX+10, RelativeY, 30,50);
			
			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
			g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
			
			g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		}
	}
}