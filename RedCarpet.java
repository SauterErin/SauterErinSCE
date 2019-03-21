package choice;
import java.awt.*;
public class RedCarpet extends GameObject{

	List list;
	
	public RedCarpet (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
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
		g.setColor(Color.getHSBColor(340, 96, 89));	
		
		if (gameinfo.returnYear() == gameinfo.gameyearpresent)
		{	
			g.setColor(Color.getHSBColor(0, 89, 78));
		}
		
		g.fillRect(RelativeX, RelativeY, 50,50);
	}

}
