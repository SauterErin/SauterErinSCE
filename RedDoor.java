package choice;
import java.awt.*;

public class RedDoor extends GameObject {

	public RedDoor(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
			
	public void interactObject()
	{
		boolean wait = true;
			
		// If in present 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			// If player has red key 
			if(list.checkRedKey() == true)
			{
				// If in Music Room 
				if (gameinfo.getRoom() == 4 && wait == true)
				{	
					gameinfo.changeRoom(0);
					sprite.setGameSprite (13, 6, 'S');
					wait = false;
					
					// If haven't entered North Hallway before
					if(list.checkEnterNorthHallway() == false)
					{
						log.readDialogue(21);
					}
				}
				
				// If in Power room 
				if (gameinfo.getRoom() == 1 && wait == true)
				{	
					gameinfo.changeRoom(0);
					sprite.setGameSprite (3, 6, 'S');
					wait = false;
				}
				
				// If in North Hall
				if (gameinfo.getRoom() == 0 && wait == true)
				{	
					// If entering music room & Will has gifted his card.
					if(sprite.checkDirection() == 'N' && sprite.getX() == 13 && list.checkGiftCard() == true && wait == true)
					{
						gameinfo.changeRoom(4);
						sprite.setGameSprite(5,7,'N');
						wait = false;
					}
					
					// If entering music room & Will hasn't gifted his card
					if(sprite.checkDirection() == 'N' && sprite.getX() == 13 && list.checkGiftCard() == false && wait == true)
					{
						log.readDialogue(150);
						sprite.changeDirection('S');
						wait = false;
					}
					
					// If Entering Power room 
					if(sprite.checkDirection() == 'N' && sprite.getX() == 3 && wait == true)
					{
						gameinfo.changeRoom(1);
						sprite.setGameSprite(2,2,'N');
						wait = false;
					}
				}
			}
			
			else
			{
				log.readDialogue(12);
			}
		}
			
		// If in past
		else
		{
			// If in music room 
			if(gameinfo.getRoom() == 4)
			{
				// If Alva is following and haven't hidden key - Alva holds door
				if(sprite.checkAlvaFollow() == true && list.checkHideRedKey() == false)
				{
					log.readDialogue(24);
				}
					
				// - Alva holding door and haven't hidden key
				if(sprite.checkAlvaFollow() == false && list.checkHideRedKey() == false)
				{
					log.readDialogue(64);
				}	
				
				// - Hidden key
				if(list.checkHideRedKey() == true)
				{
					gameinfo.changeRoom(0);
					sprite.setGameSprite (13, 6, 'S');
					list.endDoorHold1();
					sprite.startAlvaFollow();	
				}
			}
				
			else
			{
				log.readDialogue(12);
			}
		}
	}
		


	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.gray);	
		
		g.fillRect(RelativeX, RelativeY, 10,50 );
		g.fillRect(RelativeX+40, RelativeY, 10,50 );
		
		g.setColor(Color.red);
		g.fillRect(RelativeX+10, RelativeY, 30,50);
		
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
		g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
		
		g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		
		// If Alva is holding Door 
		if(list.checkDoorHold1() == true)
		{
			g.setColor(Color.green);
			g.fillRect(RelativeX+12,RelativeY+12,26,8);
			g.setColor(Color.white);
			g.fillRect(RelativeX+12, RelativeY+17, 26, 18);
		}
	}
}