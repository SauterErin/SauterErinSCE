package choice;
import java.awt.*;
public class CommonBed2 extends GameObject{
	
	public CommonBed2 (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		// If in past 
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			// If while Jackson and Alva are heading to bed/recover screwdriver
			if(list.checkNightofHorrors() == false)
			{
			}
			
			// If while Jackson and Alva are trying to escape
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
		
		// If in Past
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			g.setColor(Color.green);
			g.fillRect(RelativeX, RelativeY, 50, 50);

			g.setColor(Color.white);
			g.fillRect(RelativeX+15, RelativeY+30, 20, 15);
			
			g.fillRect(RelativeX, RelativeY+40, 10, 10);
			g.fillRect(RelativeX+40, RelativeY+40, 10, 10);
		}
	}
}