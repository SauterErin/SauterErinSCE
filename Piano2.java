package choice;
import java.awt.*;


public class Piano2 extends GameObject {

	public Piano2(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
			
	public void interactObject()
	{	
		// If in present 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			// Will at Piano - Red key get
			if(list.checkRetrieveRedKey() == false)
			{
				list.actRetrieveRedKey();
				log.readDialogue(9);
			}
			
			// Will has red key	
			else
			{
				log.readDialogue(11);
			}
		}
		
		// If in Past
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			// If Alva is holding door
			if(list.checkDoorHold1() == true)
			{
				// If red key hasn't been hidden
				if(list.checkHideRedKey() == false)
				{
					log.readDialogue(25);
				}
				
				// If red key has been hidden
				else
				{
					log.readDialogue(26);
				}
			}
			
			// If Alva isn't holding door
			else
			{
				log.readDialogue(27);
			}
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	
		// If in Present
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			// If Will has opened Piano 
			if(list.checkRetrieveRedKey() == true)
			{
				g.setColor(Color.black);
				g.fillRect(RelativeX, RelativeY+25, 50, 25);
				g.setColor(Color.white);
				g.fillRect(RelativeX, RelativeY, 50,25);
				g.setColor(Color.yellow);
				g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
			}
			
			// If Will hasn't opened the piano 
			else
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX, RelativeY, 50,50);
			}
		}
		
		// If in Past
		else
		{
			g.setColor(Color.black);
			g.fillRect(RelativeX, RelativeY+25, 50, 25);
			g.setColor(Color.white);
			g.fillRect(RelativeX, RelativeY, 50,25);
			g.setColor(Color.yellow);
			g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		}
	}
}