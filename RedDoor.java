package choice;
import java.awt.*;


public class RedDoor extends GameObject {

	List list;
	GameSprite sprite;
	
	public RedDoor(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interactObject()
	{
		if(list.checkRedKey() == true){
			boolean onechoice = true;
			if(gameinfo.returnYear() == gameinfo.gameyearpresent)
			{
				if (gameinfo.getRoom() == 4 && onechoice == true)
				{	
					gameinfo.changeRoom(0);
					sprite.setGameSprite (13, 6, 'S');
					onechoice = false;
					if(list.checkEnterNorthHallway() == false)
					{
						log.readDialogue(21);
					}
				}
				
				if (gameinfo.getRoom() == 1 && onechoice == true)
				{	
					gameinfo.changeRoom(0);
					sprite.setGameSprite (3, 6, 'S');
					onechoice = false;
				}
				
				if (gameinfo.getRoom() == 0 && onechoice == true)
				{	
					if(sprite.checkDirection() == 'N' && onechoice == true && sprite.getX() == 13)
						{
							gameinfo.changeRoom(4);
							sprite.setGameSprite(5,7,'N');
							onechoice = false;
						}
					
					if(sprite.checkDirection() == 'N' && onechoice == true && sprite.getX() == 3)
					{
						gameinfo.changeRoom(1);
						sprite.setGameSprite(2,2,'N');
						onechoice = false;
					}
				}
			}
			
			else
			{
				if(gameinfo.getRoom() == 4)
				{
					if(list.checkHideRedKey() == false && sprite.checkAlvaFollow() == true)
					{
						log.readDialogue(24);
					}
					
					if(list.checkHideRedKey() == false && sprite.checkAlvaFollow() == false)
					{
						log.readDialogue(64);
					}	
					
					if(list.checkHideRedKey() == true)
					{
						gameinfo.changeRoom(0);
						sprite.setGameSprite (13, 6, 'S');
						list.switchDoorHold1();
						sprite.switchAlvaFollow();	
					}
				}
				
				else
				{
					log.readDialogue(12);
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
		
		if(list.checkDoorHold1() == true)
		{
			g.setColor(Color.green);
			g.fillRect(RelativeX+12,RelativeY+12,26,8);
			g.setColor(Color.white);
			g.fillRect(RelativeX+12, RelativeY+17, 26, 18);
		}
	}
}