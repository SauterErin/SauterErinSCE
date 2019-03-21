package choice;
import java.awt.*;


public class YellowDoor extends GameObject {

	List list;
	GameSprite sprite;
	Countdown clock;
	
	public YellowDoor(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
		this.sprite = sprite;
	}
			
		// TODO Auto-generated constructor stub

	public void interactObject()
	{if(list.checkYellowKey() == true){
			boolean onechoice = true;
			if (gameinfo.getRoom() == 6 && onechoice == true)
			{	
				gameinfo.changeRoom(0);
				sprite.setGameSprite (7, 3, 'E');
				onechoice = false;
			}
			if (gameinfo.getRoom() == 0 && onechoice == true)
			{	
				gameinfo.changeRoom(6);
				sprite.setGameSprite (2, 2, 'N');
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

}