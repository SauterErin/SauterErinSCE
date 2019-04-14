package choice;
import java.awt.*;
public class WireBox extends GameObject{
	
	public WireBox (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		// If Past
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			// If both Wire Box and Door aren't broken
			if(list.checkBrokenSimpleDoor() == false && list.checkBrokenWireBox() == false)
			{
				log.readDialogue(31);
			}
			
			// If Wire box is broken 
			if(list.checkBrokenWireBox() == true)
			{
				log.readDialogue(33);
			}
			
			// If door is broken
			if(list.checkBrokenSimpleDoor() == true)
			{
				log.readDialogue(35);
			}
		}
		
		// Present 
		else
		{
			// Welded wire box
			if(list.checkWeldWireBox() == true)
			{
				log.readDialogue(36);
			}
			
			// Break Wire Box
			if(list.checkBrokenWireBox() == false)
			{	
				log.readDialogue(37);
			}
			
			// If wire box is broken but not welded
			if(list.checkBrokenWireBox() == true && list.checkWeldWireBox() == false)
			{
				log.readDialogue(120);
			}
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
		
		// If wire box is not broken
		if(list.checkBrokenWireBox() == false)
		{
			g.setColor(Color.gray);
			g.fillRect(RelativeX+5, RelativeY+2, 40, 46);
		}
		
		// If Wire box has been broken
		if(list.checkBrokenWireBox() == true && list.checkWeldWireBox() == false)
		{
			g.setColor(Color.gray);
			g.fillRect(RelativeX+5, RelativeY+2, 40, 46);
			g.setColor(Color.red);
			g.drawLine(RelativeX+5, RelativeY+10, RelativeX+9, RelativeY+15);
			g.drawLine(RelativeX+5, RelativeY+15, RelativeX+11, RelativeY+23);
			g.drawLine(RelativeX+5, RelativeY+18, RelativeX+15, RelativeY+35);
		}

		// If Wire Box has been welded
		if(list.checkWeldWireBox() == true)
		{	
			g.setColor(Color.gray);
			g.fillRect(RelativeX+5, RelativeY+2, 40, 46);
			
			g.setColor(Color.darkGray);
			g.drawRect(RelativeX+5, RelativeY+2,40,46);
			g.drawRect(RelativeX+6, RelativeY+3,39,45);
			g.drawRect(RelativeX+7, RelativeY+4,38,44);
			g.drawRect(RelativeX+8, RelativeY+5,37,43);
		}
	}
}