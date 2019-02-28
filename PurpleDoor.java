package choice;
import java.awt.*;
public class PurpleDoor extends GameObject{

	List list;
	
	public PurpleDoor (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
	}
	
	public void interacteObject()
	{/*
		boolean onechoice = true;
		if (calen.getRoom() == 2 && onechoice == true)
		{	
			calen.changeRoom(0);
			sprite.setGameSprite (9, 3, 'a');
			onechoice = false;
		}
		
		if (calen.getRoom() == 0 && onechoice == true)
		{	
			if(sprite.checkDirection() == 'd' && onechoice == true)
				{
					calen.changeRoom(2);
					sprite.setGameSprite(4,5,'w');
					onechoice = false;
				}
			
			if(sprite.checkDirection() == 'w' && onechoice == true)
			{
				calen.changeRoom(4);
				sprite.setGameSprite(1,6,'d');
				onechoice = false;
			}
		}
		
		if (calen.getRoom() == 4 && onechoice == true)
		{
			calen.changeRoom(3);
			sprite.setGameSprite(9,2,'a');
			onechoice = false;
		}
	*/}
	
	public void paintComponent(Graphics g)
	{		
		super.paintComponent(g);
		
			
		g.setColor(Color.gray);	
		
		g.fillRect(RelativeX, RelativeY, 10,50 );
		g.fillRect(RelativeX+40, RelativeY, 10,50 );
		
		g.setColor(Color.MAGENTA);
		g.fillRect(RelativeX+10, RelativeY, 30,50);
		
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
		g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
		
		g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		

	}
}
