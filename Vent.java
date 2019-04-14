package choice;
import java.awt.*;
public class Vent extends GameObject{
	
	public Vent (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		boolean wait = true;
		
		// If in Past
		if(gameinfo.getYear() == gameinfo.getPast())
		{	
			// If in East Hall - and haven't gotten screwdriver
			if (gameinfo.getRoom() == 7 && list.checkPastBreakWall() == false && wait == true)
			{
				log.readDialogue(28);
				wait = false;
			}					
			
			// If in East Hall and have gotten screwdriver
			if (gameinfo.getRoom() == 7 && list.checkPastBreakWall() == true && wait == true)
			{
				log.readDialogue(42);
				wait = false;
			}
							
			// If in East Wing 
			if (gameinfo.getRoom() == 12)
			{
				log.readDialogue(117);
				wait = false;
			}					
			
			// If in North Hall - heading back to bed - towards Exit Hall
			if (gameinfo.getRoom() == 0 && list.checkNightofHorrors() == false && sprite.checkDirection() == 'N'  && wait == true)
			{
				wait = false;
				log.readDialogue(61);
			}
			
			// If in North Hall - heading back to bed - towards West Hall 
			if (gameinfo.getRoom() == 0 && list.checkNightofHorrors() == false && sprite.checkDirection() == 'W' && wait == true)
			{
				log.readDialogue(43);
			}
			
			// If in North Hall - escaping - towards Exit Hall
			if (gameinfo.getRoom() == 0 && list.checkNightofHorrors() == true && sprite.checkDirection() == 'N' && wait == true)
			{
				log.readDialogue(90);
			}
			
			// If in North Hall - escaping - towards Weset Hall
			if (gameinfo.getRoom() == 0 && list.checkNightofHorrors() == true && sprite.checkDirection() == 'W' && wait == true)
			{
				log.readDialogue(95);
			}
			
			// If in South Hall - facing West Hall - Heading to Bed
			if (gameinfo.getRoom() == 8 && sprite.getX() == 1 && list.checkNightofHorrors() == false && wait == true)
			{	
				log.readDialogue(43);
			}
			
			// If in South Hall - Heading to Bed - Facing Dorm - before getting screwdriver back 
			if (gameinfo.getRoom() == 8 && sprite.getX() == 5 && list.checkRemovePanel() == false && list.checkNightofHorrors() == false && wait == true )
			{	
				log.readDialogue(44);
			}
			
			// If in South Hall - heading to bed - facing dorm - after getting screwdriver back
			if (gameinfo.getRoom() == 8 && sprite.getX() == 5 && list.checkRemovePanel() == true && list.checkNightofHorrors() == false && wait == true )
			{	
				log.readDialogue(46);
				wait = false;
			}
			
			// South Hall - Escape - Facing West Wing 
			if (gameinfo.getRoom() == 8 && sprite.getX() == 1 && list.checkNightofHorrors() == true && wait == true)
			{	
				// Remove Vent
				if(list.checkPrySouthWestVent() == false)
					log.readDialogue(88);
				else
				{
					sprite.setGameSprite(3,7,'W');
					gameinfo.changeRoom(17);
				}
				wait = false;
			}
			
			// South Hall - Escape - South Vent
			if (gameinfo.getRoom() == 8  && sprite.getY() == 3 && list.checkNightofHorrors() == true && wait == true)
			{	
				sprite.setGameSprite(5,1,'S');
				gameinfo.changeRoom(15);
				wait = false;
			}
			
			// West Hall - Escape - South Vent
			if (gameinfo.getRoom() == 17 && sprite.getY() == 7 && list.checkNightofHorrors() == true && wait == true)
			{	
				sprite.setGameSprite(1,1,'E');
				gameinfo.changeRoom(8);
				wait = false;
			}
			
			// West Hall - Escape - North Vent
			if (gameinfo.getRoom() == 17 && sprite.getY() == 3 && list.checkNightofHorrors() == true && wait == true)
			{	
				log.readDialogue(88);
			}
			
			// Dorm Room - Going to Bed
			if (gameinfo.getRoom() == 15 && list.checkNightofHorrors() == false && wait == true)
			{	
				log.readDialogue(47);
				wait = false;
			}
		
			// Dorm Room - Escape 
			if (gameinfo.getRoom() == 15 && list.checkNightofHorrors() == true && wait == true)
			{	
				// Pry off vent
				if(list.checkPryDormVent() == false)
				{	
					log.readDialogue(88);
				}
				// Go Through without impedation 
				else
				{
					sprite.setGameSprite(5,3,'N');
					gameinfo.changeRoom(8);
				}
				wait = false;
			}
		}
		
		// if in Present 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			// If in Exit hall with screwdriver - Trigger Ending 2 
			if (gameinfo.getRoom() == 19 && list.checkRetrieveOldScrewdriver() == true && wait == true)
			{
				log.readDialogue(137);
			}
			
			// If in North Hall with screwdriver
			if (gameinfo.getRoom() == 0 && list.checkRetrieveOldScrewdriver() == true && wait == true)
			{
				log.readDialogue(138);
			}
			
			// If do not have Old Screwdriver
			if(list.checkRetrieveOldScrewdriver() == false)
			{
				log.readDialogue(45);
			}
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
		
		// If in Past
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			g.setColor(Color.GRAY);
			g.fillRect(RelativeX+10, RelativeY+5, 30,40);
			g.setColor(Color.black);
			g.fillRect(RelativeX+15, RelativeY+15, 15, 3);
			
			g.fillRect(RelativeX+15, RelativeY+22, 15, 3);

			
			g.fillRect(RelativeX+15, RelativeY+29, 15, 3);

			g.fillRect(RelativeX+15, RelativeY+36, 15, 3);
		}
		
		// If in present - or during/after Escape attempt of Alva and Jackson
		if(gameinfo.getYear() == gameinfo.getPresent() || list.checkNightofHorrors() == true)
		{
			g.setColor(Color.darkGray);
			g.fillRect(RelativeX+10, RelativeY+5, 30,40);
		}

		// In past - and pried Dorm Vent - in South Hall or Dorm - during escape of Alva and Jackson
		if(gameinfo.getYear() == gameinfo.getPast() &&  list.checkNightofHorrors() == true && list.checkPryDormVent() == true  && ((gameinfo.getRoom() == 15 && y == 0) || gameinfo.getRoom() == 8 && y == 4))
		{
			g.setColor(Color.GRAY);
			g.fillRect(RelativeX+10, RelativeY+5, 30,40);
			g.setColor(Color.black);
			g.fillRect(RelativeX+15, RelativeY+15, 15, 3);
			
			g.fillRect(RelativeX+15, RelativeY+22, 15, 3);

			
			g.fillRect(RelativeX+15, RelativeY+29, 15, 3);

			g.fillRect(RelativeX+15, RelativeY+36, 15, 3);
			
			g.setColor(Color.darkGray);
			g.fillRect(RelativeX+20, RelativeY+10, 30,40);
		}
		
		// In past - and pried North West Vent - in West Hall or North Hall - during escape of Alva and Jackson
		if(gameinfo.getYear() == gameinfo.getPast() &&  list.checkNightofHorrors() == true && list.checkPryNorthWestVent() == true  == true && list.checkPrySouthWestVent() == true && ((gameinfo.getRoom() == 17 && y == 2) || gameinfo.getRoom() == 0 && x == 0))
		{
			g.setColor(Color.GRAY);
			g.fillRect(RelativeX+10, RelativeY+5, 30,40);
			g.setColor(Color.black);
			g.fillRect(RelativeX+15, RelativeY+15, 15, 3);
			
			g.fillRect(RelativeX+15, RelativeY+22, 15, 3);
			
			g.fillRect(RelativeX+15, RelativeY+29, 15, 3);

			g.fillRect(RelativeX+15, RelativeY+36, 15, 3);
			
			g.setColor(Color.darkGray);
			g.fillRect(RelativeX+20, RelativeY+10, 30,40);
		}
		
		// In past - and pried South West Vent - in West Hall or South Hall - during escape of Alva and Jackson
		if(gameinfo.getYear() == gameinfo.getPast() &&  list.checkNightofHorrors() == true && list.checkPrySouthWestVent() == true && ((gameinfo.getRoom() == 17 && y == 7) || gameinfo.getRoom() == 8 && x == 0))
		{
			g.setColor(Color.GRAY);
			g.fillRect(RelativeX+10, RelativeY+5, 30,40);
			g.setColor(Color.black);
			g.fillRect(RelativeX+15, RelativeY+15, 15, 3);
			
			g.fillRect(RelativeX+15, RelativeY+22, 15, 3);
			
			g.fillRect(RelativeX+15, RelativeY+29, 15, 3);

			g.fillRect(RelativeX+15, RelativeY+36, 15, 3);
			
			g.setColor(Color.darkGray);
			g.fillRect(RelativeX+20, RelativeY+10, 30,40);
		}
		
		// North Hall - Alva Rescue
		if(gameinfo.getYear() == gameinfo.getPresent() && gameinfo.getRoom() == 0 && y == 0 && list.checkNightofFireRescue() == true)
		{
			g.setColor(Color.GRAY);
			g.fillRect(RelativeX+10, RelativeY+5, 30,40);
			g.setColor(Color.black);
			g.fillRect(RelativeX+15, RelativeY+15, 15, 3);
			
			g.fillRect(RelativeX+15, RelativeY+22, 15, 3);

			g.fillRect(RelativeX+15, RelativeY+29, 15, 3);

			g.fillRect(RelativeX+15, RelativeY+36, 15, 3);
			
			g.setColor(Color.darkGray);
			g.fillRect(RelativeX+20, RelativeY+10, 30,40);
		}
	}
}