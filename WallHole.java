package choice;
import java.awt.*;
public class WallHole extends GameObject{

	List list;
	
	public WallHole (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
	}
	
	public void interactObject()
	{
		if (list.checkNote1() == true || gameinfo.returnYear() == gameinfo.gameyearpast || list.checkNight2() == true){

			boolean onechoice = true;
			if (gameinfo.getRoom() == 2 && onechoice == true)
			{	
				gameinfo.changeRoom(3);
				sprite.setGameSprite (1, 2, 'E');
				onechoice = false;
			}
			if (gameinfo.getRoom() == 1 && onechoice == true && list.checkEscape() == false)
				log.readDialogue(13);

			
			if (gameinfo.getRoom() == 1 && onechoice == true && list.checkEscape() == true)
			{	
				gameinfo.changeRoom(5);
				sprite.setGameSprite (1, 5, 'N');
				onechoice = false;
			}		
			
			if (gameinfo.getRoom() == 3 && onechoice == true)
			{	
				if(sprite.checkDirection() == 'W')
					{
						gameinfo.changeRoom(2);
						sprite.setGameSprite(5,2,'W');
						onechoice = false;
					}
				
				if(sprite.checkDirection() == 'E')
				{
					if(gameinfo.returnYear() == gameinfo.gameyearpast && list.checkMeetAlva() == false)
					{
						log.readDialogue(22);
					}
					else
					{
						gameinfo.changeRoom(4);
						sprite.setGameSprite(1,6,'E');
						onechoice = false;
					}
				}
			}
			
			if (gameinfo.getRoom() == 5 && onechoice == true)
			{	
				if(sprite.checkDirection() == 'S')
				{
					gameinfo.changeRoom(1);
					sprite.setGameSprite(2,1,'S');
					onechoice = false;
				}
				
				if(sprite.checkDirection() == 'E')
				{
					gameinfo.changeRoom(6);
					sprite.setGameSprite(1,1,'E');
					onechoice = false;
				}
			}
			
			if (gameinfo.getRoom() == 6 && onechoice == true)
			{	
				gameinfo.changeRoom(5);
				sprite.setGameSprite (5, 1, 'W');
				onechoice = false;
			}
			
			if (gameinfo.getRoom() == 4 && onechoice == true)
			{
				gameinfo.changeRoom(3);
				sprite.setGameSprite(9,2,'W');
				onechoice = false;
			}
			
			if (gameinfo.getRoom() == 11 && onechoice == true)
			{
				if(sprite.getX() != 1 && onechoice == true)
				{

					if((list.checkRun() == true && list.checkNightofHorrors() == true) || list.checkRun() == false)
					{
						gameinfo.changeRoom(12);
						sprite.setGameSprite(9,1,'S');
						gameinfo.changeRoom(13);
						sprite.setGameSprite(1,1,'S');
						onechoice = false;
					}
					
					else
						log.readDialogue(85);
				}
				
				if(sprite.getX() == 1 && onechoice == true)
				{
					gameinfo.changeRoom(7);
					sprite.setGameSprite(3,1,'S');
					list.actPastBreakWall();
					if(gameinfo.returnYear() == gameinfo.gameyearpast && sprite.checkAlvaFollow() == false)
					{	
						sprite.alvaDirection = 'N'; 
						sprite.switchAlvaFollow();
					}
					
					if(list.checkRun() == true && list.checkNightofHorrors() == false)
					{
						log.readDialogue(86);
					}
					onechoice = false;
				}
			}
			
			if (gameinfo.getRoom() == 13 && onechoice == true && list.checkRemovePanel() == true)
			{	
			
					gameinfo.changeRoom(11);
					sprite.setGameSprite(17,8,'N');
					onechoice = false;
			}
			
			if (gameinfo.getRoom() == 13 && onechoice == true && list.checkRemovePanel() == false && list.checkRetrieveScrewdriver() == true)
			{
				log.readDialogue(41);
			}
			
			if (gameinfo.getRoom() == 13 && onechoice == true && list.checkRemovePanel() == false && list.checkRetrieveScrewdriver() == false)
			{
				log.readDialogue(68);
			}
			
			

		}
		
		else 
			log.readDialogue(10);
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
		
		if(list.checkNote1() == false || (gameinfo.getRoom() == 1 && list.checkEscape() == false))
		{
			
			g.setColor(Color.white);
		}
		
		else 
			g.setColor(Color.black);
		
		if(gameinfo.returnYear() == gameinfo.gameyearpast)
		{
			g.setColor(Color.black);
		}
		
		if (gameinfo.getRoom() == 13 && list.checkRemovePanel() == false)
		{
			g.setColor(Color.white);			
		}
		
		
		
		g.fillRect(RelativeX+20, RelativeY + 15, 20, 35);

	}
}