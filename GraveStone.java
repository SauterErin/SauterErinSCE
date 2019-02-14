package choice;
import java.awt.*;

public class GraveStone extends GameObject{
	
	List list;

	public GraveStone (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
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
		
		g.setColor(Color.DARK_GRAY);
		
		g.fillRect(RelativeX, RelativeY, 50, 50);
		
		g.setColor(Color.CYAN);
		if(list.checkEscape() == true)
			g.fillRect(RelativeX+25, RelativeY+25, 5, 5);
		
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}