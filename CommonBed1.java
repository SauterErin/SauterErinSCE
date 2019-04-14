package choice;
import java.awt.*;
public class CommonBed1 extends GameObject
{	
	public CommonBed1 (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		// If in past 
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			
			if(list.checkNightofHorrors() == false)
			{
			}
			
			// If Jackson and Alva are trying to escape 
			else
			{
				log.readDialogue(56);
			}
		}
		
		// If in present 
		else
		{
			log.readDialogue(50);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		// If in present 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			move = false;
			g.setColor(Color.white);
			g.fillRect(RelativeX, RelativeY, 50, 50);
		}
		
		// If in past
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			g.setColor(Color.green);
			g.fillRect(RelativeX, RelativeY, 50, 50);
			
			// If before Jackson and Alva try to escape
			if(list.checkNightofHorrors() == false)
			{				
				g.setColor(Color.yellow);
				g.fillRect(RelativeX+12,RelativeY+31,26,8);
				g.setColor(Color.magenta);
				g.fillRect(RelativeX+12, RelativeY+15, 26, 18);
			}
		}
	}
}	