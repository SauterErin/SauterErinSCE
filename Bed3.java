package choice;
import java.awt.*;
public class Bed3 extends GameObject{

	List list;
	
	public Bed3 (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, InteractionPanel inter, GameSprite sprite)
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
		g.fillRect(RelativeX+15, RelativeY+30, 30, 20);

	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}