package choice;
import java.awt.*;
public class BlueCarpet extends GameObject{

	List list;
	
	public BlueCarpet (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
		this.list = list;
	}
	
	public void interactObject()
	{
	}
	
	public void paintComponent(Graphics g)
	{		
		super.paintComponent(g);
		g.setColor(Color.getHSBColor(196, 79, 68));	
		
		if (gameinfo.returnYear() == gameinfo.gameyearpresent)
		{	
			g.setColor(Color.getHSBColor(18, 20, 8));
		}
		
		g.fillRect(RelativeX, RelativeY, 50,50);
	}

}
