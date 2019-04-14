package choice;
import java.awt.*;

public class GraveStone extends GameObject{
	
	public GraveStone (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
	}

	public void interactObject()
	{
		// If in present 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			// If Alva
			if(gameinfo.checkMonsterMode() == true)
			{
				log.readDialogue(105);
			}
			
			// If Will
			else
			{
				log.readDialogue(72);
			}
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		move = false;
		g.setColor(Color.DARK_GRAY);
		
		g.fillRect(RelativeX, RelativeY, 50, 50);
		
		// If in Past 
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			move = true;
			g.setColor(new Color(87, 106, 54));
		}
		
		g.fillRect(RelativeX, RelativeY, 50,50 );
		
		// If Night 2 
		// Ordered so as to prevent Cyan gravestone
		if(list.checkNight2() == true && gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(Color.CYAN);
			g.fillRect(RelativeX+25, RelativeY+25, 5, 5);
		}
	}	
}