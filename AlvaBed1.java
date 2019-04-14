package choice;
import java.awt.*;
public class AlvaBed1 extends GameObject{
	
	public AlvaBed1 (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		//If in game past
		if(gameinfo.getYear() == gameinfo.getPast())
		{	
			//If in Act 2 - Jackson/Alva heading to bed
			if(list.checkNightofHorrors() == false)
			{
				log.readDialogue(53);
			}
			
			//If in Act 4 - Jackson/Alva trying to escape
			else
			{
				log.readDialogue(54);
			}
		}
		
		//If in game present
		else
		{
			log.readDialogue(50);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		//If in game present
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(Color.white);
			g.fillRect(RelativeX, RelativeY, 50, 50);
		}
		
		//If past
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			g.setColor(Color.pink);
			g.fillRect(RelativeX, RelativeY, 50, 50);
			
			//If before Jackson and Alva try to escape - IE Alva sleeping
			if(list.checkNightofHorrors() == false)
			{			
				g.setColor(Color.green);
				g.fillRect(RelativeX+12,RelativeY+31,26,8);
				g.setColor(Color.white);
				g.fillRect(RelativeX+12, RelativeY+15, 26, 18);
			}
		}
	}
}