package choice;
import java.awt.*;


public class YellowDoor extends GameObject {

	List list;
	GameSprite sprite;
	Countdown clock;
	
	public YellowDoor(int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
		this.sprite = sprite;
	}
			
		// TODO Auto-generated constructor stub

	public void interacteObject()
	{if(list.checkYellowKey() == true){
			boolean onechoice = true;
			if (calen.getRoom() == 6 && onechoice == true)
			{	
				calen.changeRoom(0);
				sprite.setGameSprite (7, 3, 'd');
				onechoice = false;
			}
			if (calen.getRoom() == 0 && onechoice == true)
			{	
				calen.changeRoom(6);
				sprite.setGameSprite (2, 2, 'a');
				onechoice = false;
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
		
		g.setColor(Color.yellow);
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