package choice;
import java.awt.*;
public class TrapDoor extends GameObject{

	List list;
	boolean positionopen;
	
	public TrapDoor (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = true;
		this.list = list;
		positionopen = false;
	}
	
	public void interacteObject()
	{

		if (positionopen == false)
		{
			positionopen = true;
			move = false;
			log.readDialogue(2);
		}
		
		else
		{
			if (list.checkNote1() == false)
				log.shortcutSelect(2);
			else	
				log.readDialogue(3);
		}
		

	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if(calen.returnYear() == calen.gameyearpast)
				g.setColor(new Color(121,94, 32));
		else
			g.setColor(new Color(96, 45, 6));
		if(positionopen == false)
		{
			g.fillRect(RelativeX, RelativeY, 50, 50);
			g.setColor(Color.black);
			g.drawLine(RelativeX+17, RelativeY, RelativeX+17, RelativeY+50);
			g.drawLine(RelativeX+33, RelativeY, RelativeX+33, RelativeY+50);

		}
		
		else 
		{
			g.fillRect(RelativeX, RelativeY, 50, 10);
			g.setColor(Color.black);
			g.drawLine(RelativeX+17, RelativeY, RelativeX+17, RelativeY+10);
			g.drawLine(RelativeX+33, RelativeY, RelativeX+33, RelativeY+10);
			if(calen.returnYear() == calen.gameyearpast)
				g.setColor(new Color(39, 29, 22));
			else 
				g.setColor(new Color(50, 31, 16));
			g.fillRect(RelativeX, RelativeY+11, 50, 40);
			
			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY+17, RelativeX+50, RelativeY+17);
			g.drawLine(RelativeX, RelativeY+33, RelativeX+50, RelativeY+33);
			if(list.checkNote1() == false)
			{
				g.setColor(Color.yellow);
				g.fillRect(RelativeX+5, RelativeY+16, 10,10);
			}
		
		}
		

		g.drawLine(RelativeX, RelativeY, RelativeX, RelativeY+49);
		g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);		
	}

}