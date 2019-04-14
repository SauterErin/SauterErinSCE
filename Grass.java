package choice;
import java.awt.*;

public class Grass extends GameObject {
	
	public Grass(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
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
		
		// Present Colors
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(new Color(12, 104, 40));
		}
		
		// Past Colors
		else
		{
			g.setColor(new Color(87, 106, 54));
		}
		
		g.fillRect(RelativeX, RelativeY, 50,50 );
	}
}