package choice;
import java.awt.*;


public class RedDoor extends GameObject {

	List list;
	GameSprite sprite;
	
	public RedDoor(int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interacteObject()
	{
		if(list.checkRedKey() == true){
			boolean onechoice = true;
			if (calen.getRoom() == 4 && onechoice == true)
			{	
				calen.changeRoom(0);
				sprite.setGameSprite (13, 6, 's');
				onechoice = false;
			}
			
			if (calen.getRoom() == 1 && onechoice == true)
			{	
				calen.changeRoom(0);
				sprite.setGameSprite (3, 6, 's');
				onechoice = false;
			}
			
			if (calen.getRoom() == 0 && onechoice == true)
			{	
				if(sprite.checkDirection() == 'w' && onechoice == true && sprite.getX() == 13)
					{
						calen.changeRoom(4);
						sprite.setGameSprite(5,7,'w');
						onechoice = false;
					}
				
				if(sprite.checkDirection() == 'w' && onechoice == true && sprite.getX() == 3)
				{
					calen.changeRoom(1);
					sprite.setGameSprite(2,2,'w');
					onechoice = false;
				}
			}
		}
		
		else
			log.readDialogue(12);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		
		g.setColor(Color.gray);	
		
		g.fillRect(RelativeX, RelativeY, 10,50 );
		g.fillRect(RelativeX+40, RelativeY, 10,50 );
		
		g.setColor(Color.red);
		g.fillRect(RelativeX+10, RelativeY, 30,50);
		
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
		g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
		
		g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}