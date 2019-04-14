package choice;
import java.awt.*;

public class YellowDoor extends GameObject {
	
	public YellowDoor(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}

	public void interactObject()
	{
		boolean wait = true;

		// If player has yellow key
		if(list.checkYellowKey() == true)
		{
			
			// If in Office Room
			if (gameinfo.getRoom() == 6 && wait == true)
			{	
				gameinfo.changeRoom(0);
				sprite.setGameSprite (7, 3, 'E');
				wait = false;
			}
			
			// If in North Hall 
			if (gameinfo.getRoom() == 0 && wait == true)
			{	
				gameinfo.changeRoom(6);
				sprite.setGameSprite (2, 2, 'W');
				wait = false;
			}	
			
			// If in East Wing
			if(gameinfo.getRoom() == 12 && wait == true)
			{
				// If Will is exploring and hasn't seen Alva
				if(list.checkNight2() == true && list.checkRun() == false)
				{
					log.readDialogue(80);
				}
				
				//  If in East Wing and has already seen Alva
				else
				{
					// After Will has been captured
					if ((list.checkRun() == true && list.checkNightofHorrors() == true))
					{
						gameinfo.changeRoom(14);	
						sprite.setGameSprite (1, 2, 'N');
						wait = false;
					}
					
					// Will is running away 
					else
						log.readDialogue(85);
				}

			}
			
			// If in South Hall
			if(gameinfo.getRoom() == 8 && wait == true)
			{
				gameinfo.changeRoom(15);	
				sprite.setGameSprite (4, 1, 'S');
				wait = false;
			}
			
			// If in Dorm 
			if(gameinfo.getRoom() == 15 && wait == true)
			{
				gameinfo.changeRoom(8);	
				sprite.setGameSprite (4, 3, 'N');
				wait = false;
			}
			
			// If in Wreck Room for first time
			if(gameinfo.getRoom() == 14 && list.checkRetrieveFatherID() == false && wait == true)
			{
				log.readDialogue(81);
			}
			
			// If in Wreck room and post Will being captured
			if(gameinfo.getRoom() == 14 && list.checkRetrieveFatherID() == true && list.checkRun() == true && wait == true)
			{
				gameinfo.changeRoom(12);	
				sprite.setGameSprite (4, 1, 'S');
				wait = false;
			}
			
			// Exiting Wreck Room for first time
			if(gameinfo.getRoom() == 14 && list.checkRetrieveFatherID() == true && list.checkRun() == false && wait == true )
			{
				log.readDialogue(82);
				wait = false;
			}	
		}
		
		//If do not have yellow key - general
		if(list.checkYellowKey() == false && gameinfo.getRoom() != 12 && gameinfo.getRoom() != 14 && wait == true)
		{
			log.readDialogue(12);
		}
		
		// If in East Wing - do not need yellow key
		if(gameinfo.getRoom() == 12 && gameinfo.getYear() == gameinfo.getPresent() &&  list.checkYellowKey() == false && gameinfo.checkMonsterMode() == true && wait == true)
		{
			gameinfo.changeRoom(14);	
			sprite.setGameSprite (1, 2, 'N');
			wait = false;
		}
		
		// If in Wreck room - don't need Yellow key
		if(gameinfo.getRoom() == 14 && gameinfo.getYear() == gameinfo.getPresent() && list.checkYellowKey() == false && gameinfo.checkMonsterMode() == true && wait == true)
		{
			gameinfo.changeRoom(12);	
			sprite.setGameSprite (4, 1, 'S');
			wait = false;
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
				
		g.setColor(Color.gray);	
		
		g.fillRect(RelativeX, RelativeY, 10,50 );
		g.fillRect(RelativeX+40, RelativeY, 10,50 );
		
		g.setColor(Color.yellow);
		g.fillRect(RelativeX+10, RelativeY, 30,50);
		
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
		g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
		
		g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);

		// Present - Wreck Room or East Wing
		if((gameinfo.getYear() == gameinfo.getPresent() && gameinfo.getRoom() == 12) || (gameinfo.getYear() == gameinfo.getPresent() && gameinfo.getRoom() == 14))
		{
			g.setColor(Color.gray);	
			
			g.fillRect(RelativeX, RelativeY, 10,50 );
			g.fillRect(RelativeX+40, RelativeY, 10,50 );
			
			g.setColor(Color.yellow);
			g.fillRect(RelativeX+10, RelativeY, 20,20);
			
			g.fillRect(RelativeX+10, RelativeY+30, 20,15);
			
			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
			g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
			
			g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			
			g.setColor(Color.black);
			g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
			g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
			g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
		}
	}
}