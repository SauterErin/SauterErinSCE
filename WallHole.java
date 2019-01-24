package choice;
import java.awt.*;
public class WallHole extends GameObject{

	List list;
	
	public WallHole (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, InteractionPanel inter, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, inter, sprite);
		move = true;
		this.list = list;
	}
	
	public void interacteObject()
	{
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.lightGray);
		g.fillRect(RelativeX, RelativeY, 50, 50);
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}