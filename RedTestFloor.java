package choice;
import java.awt.*;

public class RedTestFloor extends GameObject {
	List list;
	public RedTestFloor ( int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen ,log, sprite);
		move = true;
		this.list = list;
	}

	public void interacteObject() 
	{
	}	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillRect(RelativeX, RelativeY, 50, 50);
	}
}
