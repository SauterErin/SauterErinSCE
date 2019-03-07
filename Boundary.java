package choice;
import java.awt.*;
public class Boundary extends GameObject{

	List list;
	
	public Boundary (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
	}
	
	public void interacteObject()
	{
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.getHSBColor(235, 99, 23));
		
		if(calen.getRed() == true)
			g.setColor(Color.getHSBColor(100,92,145));
			
		
		g.fillRect(RelativeX, RelativeY, 50, 50);
	}
}
