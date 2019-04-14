package choice;
import java.awt.*;
public class TrapDoor extends GameObject{
	
	public TrapDoor (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
	}
	
	public void interactObject()
	{
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			// If door is opened
			if (list.checkTrapDoor() == false)
			{
				move = false;
				list.actTrapDoor();
				log.readDialogue(2);
			}
			
			// If door is closed
			else
			{
				// If Note 1 hasn't been read
				if (list.checkNote1() == false)
				{
					log.shortcutSelect(2);
				}
				// If Note 1 has been read
				else	
				{
					log.readDialogue(3);
				}
			}
		}
		
		else
		{
			
		}
		

	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// Color Instructions - Past 
		g.setColor(new Color(96,45, 6));	
		
		// Color instructions - Past 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(new Color(220, 166, 132));
		}
		
		// If in past or closed 
		if(list.checkTrapDoor() == false || gameinfo.getYear() == gameinfo.getPast())
		{
			g.fillRect(RelativeX, RelativeY, 50, 50);
			g.setColor(Color.black);
			g.drawLine(RelativeX+17, RelativeY, RelativeX+17, RelativeY+50);
			g.drawLine(RelativeX+33, RelativeY, RelativeX+33, RelativeY+50);
			move = true;
		}
		
		else // Present & Open 
		{
			move = false;
			g.fillRect(RelativeX, RelativeY, 50, 10);
			g.setColor(Color.black);
			g.drawLine(RelativeX+17, RelativeY, RelativeX+17, RelativeY+10);
			g.drawLine(RelativeX+33, RelativeY, RelativeX+33, RelativeY+10);
			
			// Colors
			if(gameinfo.getYear() == gameinfo.getPast())
			{
				g.setColor(new Color(39, 29, 22));
			}
			else 
			{
				g.setColor(new Color(50, 31, 16));
			}
			g.fillRect(RelativeX, RelativeY+11, 50, 40);
			
			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY+17, RelativeX+50, RelativeY+17);
			g.drawLine(RelativeX, RelativeY+33, RelativeX+50, RelativeY+33);
			
			// If note has not been picked up
			if(list.checkNote1() == false)
			{
				g.setColor(Color.yellow);
				g.fillRect(RelativeX+5, RelativeY+16, 10,10);
			}
		}
		g.drawLine(RelativeX, RelativeY, RelativeX, RelativeY+49);
		g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);		
	}
}