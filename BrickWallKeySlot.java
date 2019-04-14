package choice;
import java.awt.*;
public class BrickWallKeySlot extends GameObject{
	
	public BrickWallKeySlot (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		// If rescuing Alva and haven't placed purple key in slot
		if(list.checkNightofFireRescue() == true && list.checkKeySlot() == false)
		{
			log.readDialogue(140);
		}
		
		// If not rescuing Alva
		if(list.checkNightofFireRescue() == false)
		{
			log.readDialogue(141);
		}
		
		// If already placed key in slot 
		if(list.checkKeySlot() == true)
		{
			log.readDialogue(142);
		}
	}
	
	public void paintComponent(Graphics g)
	{		
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		
		g.drawLine(RelativeX, RelativeY+10, RelativeX+49, RelativeY+10);
		g.drawLine(RelativeX, RelativeY+20, RelativeX+49, RelativeY+20);
		g.drawLine(RelativeX, RelativeY+30, RelativeX+49, RelativeY+30);
		g.drawLine(RelativeX, RelativeY+40, RelativeX+49, RelativeY+40);
		
		g.drawLine(RelativeX+15, RelativeY, RelativeX+15, RelativeY+10);
		g.drawLine(RelativeX+30, RelativeY, RelativeX+30, RelativeY+10);
		g.drawLine(RelativeX+20, RelativeY+10, RelativeX+20, RelativeY+20);
		g.drawLine(RelativeX+40, RelativeY+10, RelativeX+40, RelativeY+20);
		g.drawLine(RelativeX+15, RelativeY+20, RelativeX+15, RelativeY+30);
		g.drawLine(RelativeX+30, RelativeY+20, RelativeX+30, RelativeY+30);
		g.drawLine(RelativeX+20, RelativeY+30, RelativeX+20, RelativeY+40);
		g.drawLine(RelativeX+40, RelativeY+30, RelativeX+40, RelativeY+40);
		g.drawLine(RelativeX+15, RelativeY+40, RelativeX+15, RelativeY+49);
		g.drawLine(RelativeX+30, RelativeY+40, RelativeX+30, RelativeY+49);

		// Paint instructions past
		g.setColor(new Color(250, 44, 0));
		
		// Paint instructions present
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(new Color(250, 156, 155));
		}
		
		// Paint instructions for building on fire
		if(list.checkNightofFire() == true)
		{
			g.setColor(new Color(247, 87, 85));
		}
		
		// Paint instructions for building on fire continuing 
		if(list.checkNightofFireRescue() == true)
		{	
			g.setColor(new Color(244, 51, 27));
		}		
		
		g.fillRect(RelativeX+1, RelativeY+1, 14,9 );
		g.fillRect(RelativeX+1, RelativeY+21, 14,9 );
		g.fillRect(RelativeX+1, RelativeY+41, 14,9 );
		
		g.fillRect(RelativeX+16, RelativeY+1, 14,9);
		g.fillRect(RelativeX+16, RelativeY+21, 14,9);
		g.fillRect(RelativeX+16, RelativeY+41, 14,9);
		
		g.fillRect(RelativeX+31, RelativeY+1, 19, 9 );
		g.fillRect(RelativeX+31, RelativeY+21, 19,9 );
		g.fillRect(RelativeX+31, RelativeY+41, 19,9 );

		g.fillRect(RelativeX+1, RelativeY+11, 19,9);
		g.fillRect(RelativeX+1, RelativeY+31, 19,9);

		g.fillRect(RelativeX+21, RelativeY+11, 19,9);
		g.fillRect(RelativeX+21, RelativeY+31, 19,9);

		g.fillRect(RelativeX+41, RelativeY+11, 9,9);
		g.fillRect(RelativeX+41, RelativeY+31, 9,9);	
		
		g.setColor(Color.black);
		g.drawLine(RelativeX+20, RelativeY+20, RelativeX+25, RelativeY+20);
		g.drawLine(RelativeX+20, RelativeY+25, RelativeX+25, RelativeY+25);
		g.drawLine(RelativeX+20, RelativeY+20, RelativeX+20, RelativeY+25);
		g.drawLine(RelativeX+25, RelativeY+20, RelativeX+25, RelativeY+25);
		
		// If Purple key has not been inserted
		if (list.checkKeySlot() == false)
		{
			g.setColor(Color.black);
		}
		
		// If purple key has been inserted
		else
		{
			g.setColor(Color.green);
		}
		
		g.fillRect(RelativeX+21,RelativeY+21, 4,4);
	}
}