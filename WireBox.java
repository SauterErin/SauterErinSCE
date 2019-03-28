package choice;
import java.awt.*;
public class WireBox extends GameObject{

	List list;
	
	public WireBox (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
	}
	
	public void interactObject()
	{
		if(gameinfo.returnYear() == gameinfo.gameyearpast)
		{
			if(list.checkBrokenWireBox() == false && list.checkBrokenSimpleDoor() == false)
			{
				log.readDialogue(31);
			}
			
			if(list.checkBrokenWireBox() == true)
			{
				log.readDialogue(33);
			}
			
			if(list.checkBrokenSimpleDoor() == true)
			{
				log.readDialogue(35);
			}
		}
		
		else
		{
			if(list.checkSearWireBox() == true)
			{
				log.readDialogue(36);
			}
			
			else
			{	
				log.readDialogue(37);
			}
		}
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
		if(gameinfo.getRed() == true)
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
		
		if(list.checkBrokenWireBox() == false)
		{
			g.setColor(Color.gray);
			g.fillRect(RelativeX+5, RelativeY+2, 40, 46);
		}
		
		if(list.checkBrokenWireBox() == true && list.checkSearWireBox() == false)
		{
			g.setColor(Color.gray);
			g.fillRect(RelativeX+5, RelativeY+2, 40, 46);
			g.setColor(Color.red);
			g.drawLine(RelativeX+5, RelativeY+10, RelativeX+9, RelativeY+15);
			g.drawLine(RelativeX+5, RelativeY+15, RelativeX+11, RelativeY+23);
			g.drawLine(RelativeX+5, RelativeY+18, RelativeX+15, RelativeY+35);

			

		}

		
		if(list.checkSearWireBox() == true)
		{	
			g.setColor(Color.gray);
			g.fillRect(RelativeX+5, RelativeY+2, 40, 46);
			
			g.setColor(Color.darkGray);
			g.drawRect(RelativeX+5, RelativeY+2,40,46);
			g.drawRect(RelativeX+6, RelativeY+3,39,45);
			g.drawRect(RelativeX+7, RelativeY+4,38,44);
			g.drawRect(RelativeX+8, RelativeY+5,37,43);

		}

	}
}
