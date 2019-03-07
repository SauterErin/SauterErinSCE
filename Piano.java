package choice;
import java.awt.*;


public class Piano extends GameObject {

	List list;
	GameSprite sprite;
	
	public Piano(int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interacteObject()
	{		
		if(list.checkRedKey() == false)
			{list.switchRedKey();
			log.readDialogue(9);
			}
		else
			log.readDialogue(11);
	}

	public void paintComponent(Graphics g)
	{
		if(calen.currentyear == 2052)
		{
			
				g.setColor(Color.white);
				g.fillRect(RelativeX, RelativeY, 50,50);
		}
		
		else{
			g.setColor(Color.black);
			g.fillRect(RelativeX, RelativeY, 50,50);
		}
		
	}
}