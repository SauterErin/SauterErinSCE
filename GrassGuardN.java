package choice;
import java.awt.*;

public class GrassGuardN extends GameObject {
	
	public GrassGuardN(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
	}
			
	public void interactObject()
	{	
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// Paint Present Instructions
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(new Color(12, 104, 40));
		}
		
		// Paint Past Instructions 
		else
		{
			g.setColor(new Color(87, 106, 54));
		}
		
		g.fillRect(RelativeX, RelativeY, 50,50 );
		
		// Jackson Capture Flag
		if(list.checkRetrieveGreenKey() == true && list.checkNightMonster() == false)
		{
			g.setColor(Color.blue);
			g.fillRect(RelativeX+8, RelativeY+8, 34, 10);
			g.setColor(Color.white);
			g.fillRect(RelativeX+8, RelativeY+18, 34,24);
		}
	}
}