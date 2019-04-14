package choice;
import java.awt.*;


public class Desk extends GameObject {
	
	public Desk(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
			
	public void interactObject()
	{		
		// If in Father's office 
		if(gameinfo.getRoom() == 6)
		{
			// If haven't taken key
			if(list.checkYellowKey() == false)
			{	
				log.readDialogue(6);
			}
			
			// If Night 2  - Will exploring 
			if(list.checkNight2() == true && gameinfo.getRoom() == 6 && list.checkNightofFire() == false)
			{
				log.readDialogue(73);
			}
			
			// If Night of Fire - escape attempt in present 
			if(gameinfo.getRoom() == 6 && list.checkCard() == true && list.checkNightofFire() == true)
			{
				log.readDialogue(74);
			}
		}

		// If in Wrecked Room and Night 2 - prior to Will getting caught
		if(gameinfo.getRoom() == 14 && list.checkNight2() == true && list.checkNightMonster() == false)
		{
			log.readDialogue(75);
		}
			
		// If in Wrecked Room post Will getting caught
		if(gameinfo.getRoom() == 14 && list.checkNightMonster() == true)
		{
			log.readDialogue(76);
		}
		
		// If in Spare Room 
		if (gameinfo.getRoom() == 13 && list.checkRetrieveScrewdriver() == false)
		{
			log.readDialogue(29);
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
				
		g.setColor(Color.magenta);
		g.fillRect(RelativeX, RelativeY, 50,50);
			
		if(gameinfo.getRoom() == 6)
		{
			// If the yellow key hasn't been picked up 
			if(list.checkTakeYellowKey() == false)
			{
				g.setColor(Color.yellow);
				g.fillRect(RelativeX+15, RelativeY, 10,10 );
			}
			
			// If card has been placed on the desk 
			if(list.checkTakeYellowKey() == true && list.checkCard() == true)
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+15, RelativeY, 10,10 );
			}
		}
		
		// If in spare room and if Screwdriver hasn't been picked up
		if(gameinfo.getRoom() == 13 && list.checkRetrieveScrewdriver() == false)
		{
			g.setColor(Color.white);
			g.fillRect(RelativeX+5, RelativeY+5, 3, 3);
			g.setColor(Color.black);
			g.fillRect(RelativeX+6, RelativeY+9, 1, 3);
		}
		
		// If in wrecked room - broken desk 
		if(gameinfo.getRoom() == 14)
		{
			g.setColor(Color.black);
			g.drawLine(RelativeX+7, RelativeY, RelativeX+10, RelativeY +15);
			g.drawLine(RelativeX+2, RelativeY+9, RelativeX+42, RelativeY + 38);					
			g.drawLine(RelativeX+12, RelativeY+19, RelativeX+9, RelativeY + 41);
			g.drawLine(RelativeX+15, RelativeY+13, RelativeX+17, RelativeY + 31);
		}
	}
}