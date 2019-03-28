package choice;
import java.awt.*;
public class AlvaBed2 extends GameObject{

	List list;
	
	public AlvaBed2 (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
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
				log.readDialogue(53);
			}
			
			else
			{
				log.readDialogue(54);
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
		}

		
		
		if(gameinfo.currentyear == 2042)

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
	