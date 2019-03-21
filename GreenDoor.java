package choice;
import java.awt.*;


public class GreenDoor extends GameObject {

	List list;
	GameSprite sprite;
	
	public GreenDoor(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interactObject()
	{	if(list.checkGreenKey() == true)
		{
			boolean onechoice = true;
			
			if (gameinfo.getRoom() == 8 && onechoice == true)
			{	
				gameinfo.changeRoom(7);
				sprite.setGameSprite (2, 10, 'N');
				onechoice = false;
			}
			
			if (gameinfo.getRoom() == 7 && onechoice == true)
			{	
				if(sprite.checkDirection() == 'W' && onechoice == true && sprite.getY() == 2)
					{
						gameinfo.changeRoom(0);
						sprite.setGameSprite(15,7,'W');
						onechoice = false;
					}
				
				if(sprite.checkDirection() == 'W' && onechoice == true && sprite.getY() == 7)
				{
					gameinfo.changeRoom(9);
					sprite.setGameSprite(15,12,'W');
					onechoice = false;
				}
				
				if(sprite.checkDirection() == 'S' && onechoice == true && sprite.getX() == 2)
				{
					gameinfo.changeRoom(8);
					sprite.setGameSprite(6,1,'S');
					onechoice = false;
				}
			}
			
			if (gameinfo.getRoom() == 9 && onechoice == true)
			{	
				if(sprite.checkDirection() == 'N' && onechoice == true && sprite.getY() == 1)
					{
						gameinfo.changeRoom(0);
						sprite.setGameSprite(8,8,'N');
						onechoice = false;
					}
				
				if(sprite.checkDirection() == 'E' && onechoice == true && sprite.getY() == 12)
				{
					gameinfo.changeRoom(7);
					sprite.setGameSprite(1,7,'E');
					onechoice = false;
				}
			}
			
			if (gameinfo.getRoom() == 0 && onechoice == true)
			{	
				if(sprite.checkDirection() == 'E' && onechoice == true && sprite.getY() == 7)
					{
						gameinfo.changeRoom(7);
						sprite.setGameSprite(1,2,'E');
						onechoice = false;
					}
				
				if(sprite.checkDirection() == 'S' && onechoice == true && sprite.getY() == 8)
				{
					gameinfo.changeRoom(9);
					sprite.setGameSprite(8,1,'S');
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