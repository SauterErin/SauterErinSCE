package choice;
import java.awt.*;
public class Bed2 extends GameObject{

	List list;
	
	public Bed2 (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
	}
	
	public void interacteObject()
	{
		if(list.checkYellowKey() == true && list.checkEscape() == false)
			log.readDialogue(14);
		else
			log.readDialogue(0);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		if(calen.currentyear == 2052)
		{
			move = false;
			g.setColor(Color.green);
			g.fillRect(RelativeX, RelativeY, 50, 50);
	
			g.setColor(Color.white);
			g.fillRect(RelativeX+15, RelativeY+30, 20, 15);
			
			g.fillRect(RelativeX, RelativeY+40, 10, 10);
			g.fillRect(RelativeX+40, RelativeY+40, 10, 10);
		}
		
		if(calen.currentyear == 2042)

		{
			move = true;
			g.setColor(new Color(121,94, 32));
				
			
			
			g.fillRect(RelativeX, RelativeY+1, 50,16 );
			g.fillRect(RelativeX, RelativeY+18, 50,16 );
			g.fillRect(RelativeX, RelativeY+34, 50,16 );
			

			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY, RelativeX+50, RelativeY);
			g.drawLine(RelativeX, RelativeY+50, RelativeX+50, RelativeY+50);
			
			g.drawLine(RelativeX, RelativeY+17, RelativeX+50, RelativeY+17);
			g.drawLine(RelativeX, RelativeY+33, RelativeX+50, RelativeY+33);
			
		}
	}
}