package choice;
import java.awt.*;
public class Vent extends GameObject{

	List list;
	
	public Vent (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
	}
	
	public void interactObject()
	{
		if(gameinfo.returnYear() == gameinfo.gameyearpast)
		{	boolean onechoice = true;
			if (gameinfo.getRoom() == 7 && onechoice == true && list.checkPastBreakWall() == false)
			{	
				log.readDialogue(28);
			}					
			if (gameinfo.getRoom() == 7 && onechoice == true && list.checkPastBreakWall() == true)
			{
				log.readDialogue(42);
			}
							
			if (gameinfo.getRoom() == 12)
			{
				log.readDialogue(44);
			}					
			
			if (gameinfo.getRoom() == 0 && onechoice == true && list.checkNightofHorrors() == false)
			{
				log.readDialogue(43);
			}
			
			if (gameinfo.getRoom() == 8 && onechoice == true && list.checkNightofHorrors() == false && sprite.getX() == 1)
			{	
				log.readDialogue(43);
			}
			
			if (gameinfo.getRoom() == 8 && onechoice == true && list.checkNightofHorrors() == false && sprite.getX() == 5 && list.checkRemovePanel() == false)
			{	
				log.readDialogue(44);
			}
			
			if (gameinfo.getRoom() == 8 && onechoice == true && list.checkNightofHorrors() == false && sprite.getX() == 5 && list.checkRemovePanel() == true)
			{	
				log.readDialogue(46);
			}
		}
		
		if(gameinfo.returnYear() == gameinfo.gameyearpresent && list.checkNightofFire() == false)
		{
			log.readDialogue(45);
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
		
		if(gameinfo.returnYear() == gameinfo.gameyearpresent)
		{
			g.setColor(Color.darkGray);
			g.fillRect(RelativeX+10, RelativeY+5, 30,40);
		}
		
		if(gameinfo.returnYear() == gameinfo.gameyearpast)
		{
			g.setColor(Color.GRAY);
			g.fillRect(RelativeX+10, RelativeY+5, 30,40);
			g.setColor(Color.black);
			g.fillRect(RelativeX+15, RelativeY+15, 15, 3);
			
			g.fillRect(RelativeX+15, RelativeY+22, 15, 3);

			
			g.fillRect(RelativeX+15, RelativeY+29, 15, 3);

			g.fillRect(RelativeX+15, RelativeY+36, 15, 3);
		}

	}
}