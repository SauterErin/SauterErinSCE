package choice;
import java.awt.*;

public class FancyDoor extends GameObject {
	
	public FancyDoor(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
			
	public void interactObject()
	{
		// IF player hasn't placed purple key in key slot (Room 21)
		if(list.checkKeySlot() == false)
		{
			log.readDialogue(12);
		}
		
		// If player has placed purple key in key slot of room 21
		else
		{
			// If in East Hall
			if(gameinfo.getRoom() == 12)
			{
				gameinfo.changeRoom(22);
				sprite.setGameSprite(4,1,'S');
			}
			
			// If in Final Switch Room
			else
			{
				gameinfo.changeRoom(12);
				sprite.setGameSprite(9,5,'N');
			}
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.gray);	
		
		g.fillRect(RelativeX, RelativeY, 10,50 );
		g.fillRect(RelativeX+40, RelativeY, 10,50 );
		
		g.setColor(Color.pink);
		g.fillRect(RelativeX+10, RelativeY, 30,50);
		
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
		g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
		
		g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		
		// Open door - crack of black for visiual emphasis 
		if(list.checkKeySlot() == true)
		{
			g.fillRect(RelativeX+35, RelativeY, 5, 50);
		}
	}
}