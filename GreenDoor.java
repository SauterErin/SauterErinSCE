package choice;
import java.awt.*;

public class GreenDoor extends GameObject {
	
	public GreenDoor(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
			
	public void interactObject()
	{	
		// If you have Green Key 
		if(list.checkGreenKey() == true)
		{
			boolean wait = true;
			
			// If in South Hall
			if (gameinfo.getRoom() == 8 && wait == true)
			{	
				gameinfo.changeRoom(7);
				sprite.setGameSprite (2, 10, 'N');
				wait = false;
			}
			
			// If in East Hall
			if (gameinfo.getRoom() == 7 && wait == true)
			{	
				// If looking to West Door 
				if(sprite.checkDirection() == 'W' && sprite.getY() == 7 && wait == true)
				{
					gameinfo.changeRoom(9);
					sprite.setGameSprite(15,12,'W');
					wait = false;
				}
				
				// If looking to South Door 
				if(sprite.checkDirection() == 'S' && sprite.getX() == 2 && wait == true )
				{
					gameinfo.changeRoom(8);
					sprite.setGameSprite(6,1,'S');
					wait = false;
				}
			}
			
			// If in Central Yard
			if (gameinfo.getRoom() == 9 && wait == true)
			{	
				// If facing North Door
				if(sprite.checkDirection() == 'N' && sprite.getY() == 1 && wait == true)
				{
					gameinfo.changeRoom(0);
					sprite.setGameSprite(8,8,'N');
					wait = false;
				}
				
				// If facing Eastern Door
				if(sprite.checkDirection() == 'E' && sprite.getY() == 12 && wait == true)
				{
					gameinfo.changeRoom(7);
					sprite.setGameSprite(1,7,'E');
					wait = false;
				}
			}
			
			// If in North Hall
			if (gameinfo.getRoom() == 0 && wait == true)
			{	
				// Normal usage 
				if(sprite.checkDirection() == 'S' && sprite.getY() == 8 && wait == true)
				{
					gameinfo.changeRoom(9);
					sprite.setGameSprite(8,1,'S');
					wait = false;
				}
				
				// If triggered Jackson captured flag - picking up green key 
				if(list.checkRetrieveGreenKey() == true && gameinfo.getYear() == gameinfo.getPast())
				{
					log.readDialogue(91);
				}
			}
			
		}
		
		// If do not have Green Key 
		else
		{
			log.readDialogue(12);
		}

	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		
		g.setColor(Color.gray);	
		
		g.fillRect(RelativeX, RelativeY, 10,50 );
		g.fillRect(RelativeX+40, RelativeY, 10,50 );
		
		g.setColor(Color.green);
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