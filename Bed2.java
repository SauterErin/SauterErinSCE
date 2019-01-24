package choice;
import java.awt.*;
public class Bed2 extends GameObject{

	List list;
	
	public Bed2 (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, InteractionPanel inter, GameSprite sprite)
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
		g.fillRect(RelativeX+15, RelativeY+30, 20, 15);
		
		g.fillRect(RelativeX, RelativeY+40, 10, 10);
		g.fillRect(RelativeX+40, RelativeY+40, 10, 10);

	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}