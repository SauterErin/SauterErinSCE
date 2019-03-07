package choice;
import java.awt.*;

public class GraveStone extends GameObject{
	
	List list;

	public GraveStone (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
	}

	public void interacteObject()
	{
	
	}
		
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		move = false;
		g.setColor(Color.DARK_GRAY);
		
		g.fillRect(RelativeX, RelativeY, 50, 50);
		
		if(list.checkEscape() == true && list.checkMeetAlva() == false)
			{g.setColor(Color.CYAN);
			g.fillRect(RelativeX+25, RelativeY+25, 5, 5);}
		if(calen.currentyear == 2042){
			move = true;
			g.setColor(new Color(87, 106, 54));
		
			g.fillRect(RelativeX, RelativeY, 50,50 );}
	}
}