package choice;
import java.awt.*;
public class BrickWall extends GameObject{

	List list;
	
	public BrickWall (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, InteractionPanel inter, GameSprite sprite)
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
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+50, RelativeY);
		g.drawLine(RelativeX, RelativeY+50, RelativeX+50, RelativeY+50);
		g.drawLine(RelativeX+50, RelativeY, RelativeX+50, RelativeY+50);
		g.drawLine(RelativeX, RelativeY, RelativeX, RelativeY+50);
		
		g.drawLine(RelativeX, RelativeY+10, RelativeX+50, RelativeY+10);
		g.drawLine(RelativeX, RelativeY+20, RelativeX+50, RelativeY+20);
		g.drawLine(RelativeX, RelativeY+30, RelativeX+50, RelativeY+30);
		g.drawLine(RelativeX, RelativeY+40, RelativeX+50, RelativeY+40);
		
		g.drawLine(RelativeX+15, RelativeY, RelativeX+15, RelativeY+10);
		g.drawLine(RelativeX+30, RelativeY, RelativeX+30, RelativeY+10);
		g.drawLine(RelativeX+20, RelativeY+10, RelativeX+20, RelativeY+20);
		g.drawLine(RelativeX+40, RelativeY+10, RelativeX+40, RelativeY+20);
		g.drawLine(RelativeX+15, RelativeY+20, RelativeX+15, RelativeY+30);
		g.drawLine(RelativeX+30, RelativeY+20, RelativeX+30, RelativeY+30);
		g.drawLine(RelativeX+20, RelativeY+30, RelativeX+20, RelativeY+40);
		g.drawLine(RelativeX+40, RelativeY+30, RelativeX+40, RelativeY+40);
		g.drawLine(RelativeX+15, RelativeY+40, RelativeX+15, RelativeY+50);
		g.drawLine(RelativeX+30, RelativeY+40, RelativeX+30, RelativeY+50);

		g.setColor(Color.getHSBColor(87,89,70));	
		if(calen.getRed() == true)
			g.setColor(Color.getHSBColor(87, 89, 70));
			
		
		g.fillRect(RelativeX+1, RelativeY+1, 14,9 );
		g.fillRect(RelativeX+1, RelativeY+21, 14,9 );
		g.fillRect(RelativeX+1, RelativeY+41, 14,8 );
		
		g.fillRect(RelativeX+16, RelativeY+1, 14,9);
		g.fillRect(RelativeX+16, RelativeY+21, 14,9);
		g.fillRect(RelativeX+16, RelativeY+41, 14,8);
		
		g.fillRect(RelativeX+31, RelativeY+1, 18, 9 );
		g.fillRect(RelativeX+31, RelativeY+21, 18,9 );
		g.fillRect(RelativeX+31, RelativeY+41, 18,8 );

		g.fillRect(RelativeX+1, RelativeY+11, 19,9);
		g.fillRect(RelativeX+1, RelativeY+31, 19,9);

		g.fillRect(RelativeX+21, RelativeY+11, 19,9);
		g.fillRect(RelativeX+21, RelativeY+31, 19,9);

		g.fillRect(RelativeX+41, RelativeY+11, 8,9);
		g.fillRect(RelativeX+41, RelativeY+31, 8,9);		

	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
