package choice;
import java.awt.*;

public class Piano extends GameObject {
	
	public Piano(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
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
		// Paint instructions - Present 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(Color.white);
			g.fillRect(RelativeX, RelativeY, 50,50);
		}
		
		//Paint instructions Past
		else
		{
			g.setColor(Color.black);
			g.fillRect(RelativeX, RelativeY, 50,50);
		}
	}
}