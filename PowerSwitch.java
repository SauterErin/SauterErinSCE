package choice;
import java.awt.*;
public class PowerSwitch extends GameObject{

	List list;
	
	public PowerSwitch (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
	}
	
	public void interacteObject()
	{
		log.readDialogue(8);
	}
	
	public void paintComponent(Graphics g)
	{		
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		
		g.drawLine(RelativeX, RelativeY+10, RelativeX+49, RelativeY+10);
		g.drawLine(RelativeX, RelativeY+20, RelativeX+49, RelativeY+20);
		g.drawLine(RelativeX, RelativeY+30, RelativeX+49, RelativeY+30);
		g.drawLine(RelativeX, RelativeY+40, RelativeX+49, RelativeY+40);
		
		g.drawLine(RelativeX+15, RelativeY, RelativeX+15, RelativeY+10);
		g.drawLine(RelativeX+30, RelativeY, RelativeX+30, RelativeY+10);
		g.drawLine(RelativeX+20, RelativeY+10, RelativeX+20, RelativeY+20);
		g.drawLine(RelativeX+40, RelativeY+10, RelativeX+40, RelativeY+20);
		g.drawLine(RelativeX+15, RelativeY+20, RelativeX+15, RelativeY+30);
		g.drawLine(RelativeX+30, RelativeY+20, RelativeX+30, RelativeY+30);
		g.drawLine(RelativeX+20, RelativeY+30, RelativeX+20, RelativeY+40);
		g.drawLine(RelativeX+40, RelativeY+30, RelativeX+40, RelativeY+40);
		g.drawLine(RelativeX+15, RelativeY+40, RelativeX+15, RelativeY+49);
		g.drawLine(RelativeX+30, RelativeY+40, RelativeX+30, RelativeY+49);

		g.setColor(Color.getHSBColor(245, 140, 133));	
		if(calen.getRed() == true)
			g.setColor(Color.getHSBColor(87, 89, 70));
			
		
		g.fillRect(RelativeX+1, RelativeY+1, 14,9 );
		g.fillRect(RelativeX+1, RelativeY+21, 14,9 );
		g.fillRect(RelativeX+1, RelativeY+41, 14,9 );
		
		g.fillRect(RelativeX+16, RelativeY+1, 14,9);
		g.fillRect(RelativeX+16, RelativeY+21, 14,9);
		g.fillRect(RelativeX+16, RelativeY+41, 14,9);
		
		g.fillRect(RelativeX+31, RelativeY+1, 19, 9 );
		g.fillRect(RelativeX+31, RelativeY+21, 19,9 );
		g.fillRect(RelativeX+31, RelativeY+41, 19,9 );

		g.fillRect(RelativeX+1, RelativeY+11, 19,9);
		g.fillRect(RelativeX+1, RelativeY+31, 19,9);

		g.fillRect(RelativeX+21, RelativeY+11, 19,9);
		g.fillRect(RelativeX+21, RelativeY+31, 19,9);

		g.fillRect(RelativeX+41, RelativeY+11, 9,9);
		g.fillRect(RelativeX+41, RelativeY+31, 9,9);	
		
		g.setColor(Color.black);
		g.drawLine(RelativeX+20, RelativeY+20, RelativeX+25, RelativeY+20);
		g.drawLine(RelativeX+20, RelativeY+25, RelativeX+25, RelativeY+25);
		g.drawLine(RelativeX+20, RelativeY+20, RelativeX+20, RelativeY+25);
		g.drawLine(RelativeX+25, RelativeY+20, RelativeX+25, RelativeY+25);
		
		if (list.checkPowerSwitch() == true)
			g.setColor(Color.blue);
		else
			g.setColor(Color.red);
		g.fillRect(RelativeX+21,RelativeY+21, 4,4);


	}
}
