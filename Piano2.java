package choice;
import java.awt.*;


public class Piano2 extends GameObject {

	List list;
	GameSprite sprite;
	
	public Piano2(int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
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
			calen.increaseInventoryTotal();
			log.readDialogue(9);
			}
		else
			log.readDialogue(11);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
				
		if(list.checkRedKey() == true)
		{
			g.setColor(Color.black);
			g.fillRect(RelativeX, RelativeY+25, 50, 25);
			g.setColor(Color.white);
			g.fillRect(RelativeX, RelativeY, 50,25);
			g.setColor(Color.yellow);
			g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		}
		else
		{
			g.setColor(Color.white);
			g.fillRect(RelativeX, RelativeY, 50,50);
		}

		
	}

}