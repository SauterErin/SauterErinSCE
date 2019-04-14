package choice;
import java.awt.*;
public class WallHole extends GameObject{
	
	public WallHole (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		boolean wait = true;
		
		// If Note has not been read or 
		if (list.checkNote1() == true){

			// If in Dentention 
			if (gameinfo.getRoom() == 2 && wait == true)
			{	
				gameinfo.changeRoom(3);
				sprite.setGameSprite (1, 2, 'E');
				wait = false;
			}
			
			// If in Power room and haven't triggered power switch off 
			if (gameinfo.getRoom() == 1 && list.checkEscape() == false  && wait == true)
			{
				log.readDialogue(13);
			}

			// If in Power room and have triggered power switch off 
			if (gameinfo.getRoom() == 1 && list.checkEscape() == true && wait == true)
			{	
				gameinfo.changeRoom(5);
				sprite.setGameSprite (1, 5, 'N');
				wait = false;
			}		
			
			// If in Detention - Music passage
			if (gameinfo.getRoom() == 3 && wait == true)
			{	
				// If looking towards music room 
				if(sprite.checkDirection() == 'W')
					{
						gameinfo.changeRoom(2);
						sprite.setGameSprite(5,2,'W');
						wait = false;
					}
				
				// If looking towards detention room 
				if(sprite.checkDirection() == 'E')
				{
					// If in past and haven't meet Alva
					if(gameinfo.getYear() == gameinfo.getPast() && list.checkMeetAlva() == false)
					{
						log.readDialogue(22);
					}
					
					else
					{
						gameinfo.changeRoom(4);
						sprite.setGameSprite(1,6,'E');
						wait = false;
					}
				}
			}
			
			// If in Power Office passage
			if (gameinfo.getRoom() == 5 && wait == true)
			{	
				// If looking towards Power room 
				if(sprite.checkDirection() == 'S')
				{
					gameinfo.changeRoom(1);
					sprite.setGameSprite(2,1,'S');
					wait = false;
				}
				
				// If looking towards office room
				if(sprite.checkDirection() == 'E')
				{
					gameinfo.changeRoom(6);
					sprite.setGameSprite(1,1,'E');
					wait = false;
				}
			}
			
			// If in office room 
			if (gameinfo.getRoom() == 6 && wait == true)
			{	
				gameinfo.changeRoom(5);
				sprite.setGameSprite (5, 1, 'W');
				wait = false;
			}
			
			// If in Music room 
			if (gameinfo.getRoom() == 4 && wait == true)
			{
				gameinfo.changeRoom(3);
				sprite.setGameSprite(9,2,'W');
				wait = false;
			}
			
			// if in East Hall Spare passage 
			if (gameinfo.getRoom() == 11 && wait == true)
			{
				// Towards Spare room
				if(sprite.getX() != 1 && wait == true)
				{
					// if not Running away as Will
					if((list.checkRun() == true && list.checkNightofHorrors() == true) || list.checkRun() == false)
					{
						gameinfo.changeRoom(12);
						sprite.setGameSprite(9,1,'S');
						gameinfo.changeRoom(13);
						sprite.setGameSprite(1,1,'S');
						wait = false;
					}
					
					// Running away
					else
					{
						log.readDialogue(85);
					}
				}
				
				// Towards East Hall
				if(sprite.getX() == 1 && wait == true)
				{
					gameinfo.changeRoom(7);
					sprite.setGameSprite(3,1,'S');
					list.actPastBreakWall();
					
					// Leaving 
					if(gameinfo.getYear() == gameinfo.getPast() && sprite.checkAlvaFollow() == false)
					{	
						sprite.changeAlvaDirection('N');
						sprite.startAlvaFollow();
					}
					
					// Running away 
					if(list.checkRun() == true && list.checkNightofHorrors() == false)
					{
						log.readDialogue(86);
					}
					wait = false;
				}
			}
			
			// Spare Room 
			if (gameinfo.getRoom() == 13 && list.checkRemovePanel() == true && wait == true)
			{	
					gameinfo.changeRoom(11);
					sprite.setGameSprite(17,8,'N');
					wait = false;
			}
			
			// Past - Jackson attempting to leave with screwdriver
			if (gameinfo.getRoom() == 13 && list.checkRemovePanel() == false && list.checkRetrieveScrewdriver() == true  && wait == true)
			{
				log.readDialogue(41);
			}

			// Past - Jackson attempting to leave without screwdriver
			if (gameinfo.getRoom() == 13 && wait == true && list.checkRemovePanel() == false && list.checkRetrieveScrewdriver() == false)
			{
				log.readDialogue(68);
			}
		}
		
		else 
		{
			log.readDialogue(10);
		}
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

		// Paint instructions past
		g.setColor(new Color(250, 44, 0));
				
		// Paint instructions present
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(new Color(250, 156, 155));
		}
				
		// Paint instructions for building on fire
		if(list.checkNightofFire() == true)
		{
			g.setColor(new Color(247, 87, 85));
		}
				
		// Paint instructions for building on fire continuing 
		if(list.checkNightofFireRescue() == true)
		{	
			g.setColor(new Color(244, 51, 27));
		}
		
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
		
		// Not read note or not pressed power button 
		if(list.checkNote1() == false || (gameinfo.getRoom() == 1 && list.checkEscape() == false))
		{	
			g.setColor(Color.white);
		}
		
		else 
		{
			g.setColor(Color.black);
		}
		
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			g.setColor(Color.black);
		}
		
		// - Not removed panel 
		if (gameinfo.getRoom() == 13 && list.checkRemovePanel() == false)
		{
			g.setColor(Color.white);			
		}
		
		g.fillRect(RelativeX+20, RelativeY + 15, 20, 35);
	}
}