package choice;
import java.awt.*;
public class WoodFloorAlva extends GameObject{

	List list;
	
	public WoodFloorAlva (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = true;
		this.list = list;
	}
	
	public void interacteObject()
	{
	}
	
	public boolean checkMove()
	{
		if(calen.currentyear == 2042 && list.checkMeetAlva() == false)
		{
			log.readDialogue(16);
		}
		
		return move;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.setColor(new Color(96,45, 6));	
		if(calen.returnYear() == calen.gameyearpast)
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