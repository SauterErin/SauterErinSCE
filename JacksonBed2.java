package choice;
import java.awt.*;
public class JacksonBed2 extends GameObject{
	
	public JacksonBed2 (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		// In Past
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			// - Going to Bed - transition to Night2 
			if(list.checkNightofHorrors() == false)
			{
				log.readDialogue(51);
			}
			
			// - Jackson and Alva Escape 
			else
			{
				log.readDialogue(52);
			}
		}
		
		// In Present 
		else
		{
			log.readDialogue(50);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		// Present paint instructions 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			move = false;
			g.setColor(Color.white);
			g.fillRect(RelativeX, RelativeY, 50, 50);
	
			g.setColor(Color.white);
			g.fillRect(RelativeX+15, RelativeY+30, 20, 15);
			
			g.fillRect(RelativeX, RelativeY+40, 10, 10);
			g.fillRect(RelativeX+40, RelativeY+40, 10, 10);
		}

		// Past paint instructions 
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			g.setColor(Color.red);
			g.fillRect(RelativeX, RelativeY, 50, 50);
	
			g.setColor(Color.white);
			g.fillRect(RelativeX+15, RelativeY+30, 20, 15);
			
			g.fillRect(RelativeX, RelativeY+40, 10, 10);
			g.fillRect(RelativeX+40, RelativeY+40, 10, 10);
		}
	}
}