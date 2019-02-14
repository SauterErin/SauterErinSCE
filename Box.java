package choice;
import java.awt.*;


public class Box extends GameObject {

	Inventory items;
	GameSprite sprite;
	Countdown clock;
	
	public Box(int AbsoluteX, int AbsoluteY, GameCalendar calen, Dialogue log, GameSprite sprite, Inventory items, Countdown clock)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.items = items;
		this.sprite = sprite;
		this.clock = clock;
	}
			
	public void interacteObject()
	{
		
			if (items.checkRedKey() == false && super.counterday1 < 9)
			{
				log.readDialogue(4);
			}
						
			if (items.checkRedKey() == true)
			{	
				//Enter door position
			}
		
		
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		
		g.setColor(Color.gray);	
		
		g.fillRect(RelativeX+15, RelativeY, 10,50 );
		
		g.setColor(Color.magenta);
		g.fillRect(RelativeX, RelativeY, 50,50);
		
		g.setColor(Color.gray);	
		
		g.fillRect(RelativeX+15, RelativeY, 10,50 );
		
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
		g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
		
		g.drawLine(RelativeX+15, RelativeY, RelativeX+15, RelativeY+49);
		g.drawLine(RelativeX+26, RelativeY, RelativeX+26, RelativeY+49);
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}