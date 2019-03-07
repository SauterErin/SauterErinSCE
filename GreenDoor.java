package choice;
import java.awt.*;


public class GreenDoor extends GameObject {

	List list;
	GameSprite sprite;
	
	public GreenDoor(int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interacteObject()
	{	if(list.checkGreenKey() == true)
		{
			boolean onechoice = true;
			
			if (calen.getRoom() == 8 && onechoice == true)
			{	
				calen.changeRoom(7);
				sprite.setGameSprite (2, 10, 'w');
				onechoice = false;
			}
			
			if (calen.getRoom() == 7 && onechoice == true)
			{	
				if(sprite.checkDirection() == 'a' && onechoice == true && sprite.getY() == 2)
					{
						calen.changeRoom(0);
						sprite.setGameSprite(15,7,'a');
						onechoice = false;
					}
				
				if(sprite.checkDirection() == 'a' && onechoice == true && sprite.getY() == 7)
				{
					calen.changeRoom(9);
					sprite.setGameSprite(15,12,'a');
					onechoice = false;
				}
				
				if(sprite.checkDirection() == 's' && onechoice == true && sprite.getX() == 2)
				{
					calen.changeRoom(8);
					sprite.setGameSprite(6,1,'s');
					onechoice = false;
				}
			}
			
			if (calen.getRoom() == 9 && onechoice == true)
			{	
				if(sprite.checkDirection() == 'w' && onechoice == true && sprite.getY() == 1)
					{
						calen.changeRoom(0);
						sprite.setGameSprite(8,8,'w');
						onechoice = false;
					}
				
				if(sprite.checkDirection() == 'd' && onechoice == true && sprite.getY() == 12)
				{
					calen.changeRoom(7);
					sprite.setGameSprite(1,7,'d');
					onechoice = false;
				}
			}
			
			if (calen.getRoom() == 0 && onechoice == true)
			{	
				if(sprite.checkDirection() == 'd' && onechoice == true && sprite.getY() == 7)
					{
						calen.changeRoom(7);
						sprite.setGameSprite(1,2,'d');
						onechoice = false;
					}
				
				if(sprite.checkDirection() == 's' && onechoice == true && sprite.getY() == 8)
				{
					calen.changeRoom(9);
					sprite.setGameSprite(8,1,'s');
					onechoice = false;
				}
			}
			
			}
		else;
		log.readDialogue(12);

	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		
		g.setColor(Color.gray);	
		
		g.fillRect(RelativeX, RelativeY, 10,50 );
		g.fillRect(RelativeX+40, RelativeY, 10,50 );
		
		g.setColor(Color.green);
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