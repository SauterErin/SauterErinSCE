package choice;
import java.awt.*;
public class JacksonBed2 extends GameObject{

	List list;
	
	public JacksonBed2 (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
	}
	
	public void interactObject()
	{
		if(gameinfo.returnYear() == gameinfo.gameyearpast)
		{
			if(list.checkNightofHorrors() == false)
			{
				log.readDialogue(51);
			}
			
			else
			{
				log.readDialogue(52);
			}
		}
		
		else
		{
			log.readDialogue(50);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		if(gameinfo.currentyear == 2052)
		{
			move = false;
			g.setColor(Color.white);
			g.fillRect(RelativeX, RelativeY, 50, 50);
	
			g.setColor(Color.white);
			g.fillRect(RelativeX+15, RelativeY+30, 20, 15);
			
			g.fillRect(RelativeX, RelativeY+40, 10, 10);
			g.fillRect(RelativeX+40, RelativeY+40, 10, 10);
			
			g.setColor(Color.black);
			g.fillRect(RelativeX, RelativeY+40, 10, 10);
			g.fillRect(RelativeX+40, RelativeY+40, 10, 10);
		}

		
		
		if(gameinfo.currentyear == 2042)

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