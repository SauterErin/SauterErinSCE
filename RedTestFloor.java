package choice;
import java.awt.*;

public class RedTestFloor extends GameObject {
	List list;
	public RedTestFloor ( int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo ,log, list, sprite);
		move = true;
		this.list = list;
	}

	public void interactObject() 
	{
	}	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillRect(RelativeX, RelativeY, 50, 50);
	}
}
