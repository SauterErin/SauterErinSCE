package choice;
import java.awt.*;


public class Desk extends GameObject {

	List list;
	GameSprite sprite;
	
	public Desk(int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interacteObject()
	{		
		if(list.checkYellowKey() == false)
		{	
			log.readDialogue(6);
			list.switchYellowKey();
			calen.increaseInventoryTotal();
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
				
		g.setColor(Color.magenta);
		g.fillRect(RelativeX, RelativeY, 50,50);
		
		g.setColor(Color.yellow);	
		
		if(list.checkYellowKey() == false)
			g.fillRect(RelativeX+15, RelativeY, 10,10 );
		
	}
}