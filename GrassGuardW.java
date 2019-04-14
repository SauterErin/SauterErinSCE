package choice;
import java.awt.*;


public class GrassGuardW extends GameObject {
	
	public GrassGuardW(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
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
		
		// Present paint instructions 
		if(gameinfo.getYear() == gameinfo.getPresent())
			g.setColor(new Color(12, 104, 40));
		
		// Past paint instructions
		else
		{
			g.setColor(new Color(87, 106, 54));
		}
		g.fillRect(RelativeX, RelativeY, 50,50 );
		
		if(list.checkRetrieveGreenKey() == true && list.checkNightMonster() == false)
		{
			g.setColor(Color.white);
			g.fillRect(RelativeX+8, RelativeY+8, 24, 34);
			g.setColor(Color.blue);
			g.fillRect(RelativeX+32, RelativeY+8, 10,34);
		}
	}
}