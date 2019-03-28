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
			

	public void interactObject()
	{
		if(list.checkYellowKey() == true)
		{
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
			
			if(gameinfo.getRoom() == 12 && onechoice == true)
			{
				if(list.checkNight2() == true && list.checkRun() == false)
				{
					log.readDialogue(80);
				}
				
				else
				{
					if ((list.checkRun() == true && list.checkNightofHorrors() == true) || list.checkRun() == false)
					{
						gameinfo.changeRoom(14);	
						sprite.setGameSprite (2, 2, 'N');
						onechoice = false;
					}
					
					else
						log.readDialogue(85);
				}

			}
				
			if(gameinfo.getRoom() == 8 && onechoice == true)
			{
				gameinfo.changeRoom(15);	
				sprite.setGameSprite (4, 1, 'S');
				onechoice = false;
			}
			
			if(gameinfo.getRoom() == 15 && onechoice == true)
			{
				gameinfo.changeRoom(8);	
				sprite.setGameSprite (4, 3, 'N');
				onechoice = false;
			}
			
			
			if(gameinfo.getRoom() == 14 && onechoice == true && list.checkRetrieveFatherID() == false)
			{
				log.readDialogue(81);
			}
			
			if(gameinfo.getRoom() == 14 && onechoice == true && list.checkRetrieveFatherID() == true && list.checkRun() == true)
			{
				gameinfo.changeRoom(12);	
				sprite.setGameSprite (1, 2, 'S');
				onechoice = false;
			}
			
			if(gameinfo.getRoom() == 14 && onechoice == true && list.checkRetrieveFatherID() == true && list.checkRun() == false)
			{
				log.readDialogue(82);
				onechoice = false;
			}
		

	
		
		}
		
		boolean onechoice = true;
		
		if(list.checkYellowKey() == false && gameinfo.checkMonsterMode() == false)
			log.readDialogue(12);
		
		if(list.checkYellowKey() == false && gameinfo.checkMonsterMode() == true && gameinfo.getRoom() != 12 && onechoice == true && gameinfo.getRoom() != 14)
			log.readDialogue(12);
		
		
		if(list.checkYellowKey() == false && gameinfo.checkMonsterMode() == true && gameinfo.getRoom() == 12 && onechoice == true)
		{
			gameinfo.changeRoom(14);	
			sprite.setGameSprite (1, 2, 'N');
			onechoice = false;
		}
		
		if(list.checkYellowKey() == false && gameinfo.checkMonsterMode() == true && gameinfo.getRoom() == 14 && onechoice == true)
		{
			gameinfo.changeRoom(12);	
			sprite.setGameSprite (4, 1, 'S');
			onechoice = false;
		}

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
		
		if(gameinfo.returnYear() == gameinfo.gameyearpresent && gameinfo.getRoom() == 12)
		{
			g.setColor(Color.gray);	
			
			g.fillRect(RelativeX, RelativeY, 10,50 );
			g.fillRect(RelativeX+40, RelativeY, 10,50 );
			
			g.setColor(Color.yellow);
			g.fillRect(RelativeX+10, RelativeY, 20,20);
			
			g.fillRect(RelativeX+10, RelativeY+30, 20,15);
			
			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
			g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
			
			g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			

			g.setColor(Color.black);
			g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
			g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
			g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
		}
	}

}