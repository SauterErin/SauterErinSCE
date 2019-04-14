package choice;
import java.awt.*;
public class AlvaBed2 extends GameObject{
	
	public AlvaBed2 (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		// If in past 
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			// If before Alva and Jackson try to escape
			if(list.checkNightofHorrors() == false)
			{
				log.readDialogue(53);
			}
			
			// During Escape attempt
			else
			{
				log.readDialogue(54);
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
			g.setColor(Color.pink);
			g.fillRect(RelativeX, RelativeY, 50, 50);

			g.setColor(Color.white);
			g.fillRect(RelativeX+15, RelativeY+30, 20, 15);
			
			g.fillRect(RelativeX, RelativeY+40, 10, 10);
			g.fillRect(RelativeX+40, RelativeY+40, 10, 10);
		}
	}
}