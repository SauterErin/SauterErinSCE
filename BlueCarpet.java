package choice;
import java.awt.*;
public class BlueCarpet extends GameObject{
	
	public BlueCarpet (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
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
		
		// Past Color 
		g.setColor(new Color(0,23,107));	
		
		// Present Color
		if (gameinfo.getYear() == gameinfo.getPresent())
		{	
			g.setColor(new Color(128, 155, 255));
		}
		
		g.fillRect(RelativeX, RelativeY, 50,50);
	}
}