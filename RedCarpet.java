package choice;
import java.awt.*;
public class RedCarpet extends GameObject{
	
	public RedCarpet (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
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
		g.setColor(new Color(84, 0, 31));	
		
		if (gameinfo.getYear() == gameinfo.getPresent())
		{	
			g.setColor(new Color(255, 128, 174));
		}
		
		g.fillRect(RelativeX, RelativeY, 50,50);
	}
}