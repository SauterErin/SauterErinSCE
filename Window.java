package choice;
import java.awt.*;
public class Window extends GameObject{

	List list;
	
	public Window (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, InteractionPanel inter, GameSprite sprite)
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

		


		g.setColor(Color.BLUE);	
		
		g.fillRect(RelativeX, RelativeY, 14, 25 );
		g.fillRect(RelativeX+16, RelativeY, 24, 25 );		
		g.fillRect(RelativeX+36, RelativeY, 14, 25 );

		g.fillRect(RelativeX, RelativeY+26, 14, 24 );
		g.fillRect(RelativeX+16, RelativeY+26, 24, 24 );		
		g.fillRect(RelativeX+36, RelativeY+26, 14, 24 );
		

		g.setColor(Color.white);
		g.drawLine(RelativeX+15, RelativeY, RelativeX+15, RelativeY+49);
		g.drawLine(RelativeX+35, RelativeY, RelativeX+35, RelativeY+49);
		g.drawLine(RelativeX, RelativeY+25, RelativeX+49, RelativeY+25);
		
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
		g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX, RelativeY, RelativeX, RelativeY+49);
		

	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}