package choice;
import java.awt.*;
public class JacksonBed1 extends GameObject{

	List list;
	
	public JacksonBed1 (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
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
		}

		
		
		if(gameinfo.currentyear == 2042)

		{
			g.setColor(Color.red);
			g.fillRect(RelativeX, RelativeY, 50, 50);
		}
	}
}
	