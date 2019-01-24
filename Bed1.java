package choice;
import java.awt.*;
public class Bed1 extends GameObject{

	List list;
	
	public Bed1 (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, InteractionPanel inter, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, inter, sprite);
		move = false;
		this.list = list;
	}
	
	public void interacteObject()
	{
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.green);
		g.fillRect(RelativeX, RelativeY, 50, 50);

		g.setColor(Color.white);
		g.fillRect(RelativeX, RelativeY, 10, 10);
		g.fillRect(RelativeX+40, RelativeY, 10, 10);

	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}