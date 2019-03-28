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
		{	
			boolean onechoice = true;
			System.out.println(gameinfo.getRoom());
			System.out.println(sprite.checkDirection());

			if (gameinfo.getRoom() == 7 && onechoice == true && list.checkPastBreakWall() == false)
			{
				onechoice = false;
				log.readDialogue(28);
			}					
			if (gameinfo.getRoom() == 7 && onechoice == true && list.checkPastBreakWall() == true)
			{
				log.readDialogue(42);
				onechoice = false;
			}
							
			if (gameinfo.getRoom() == 12)
			{
				log.readDialogue(44);
				onechoice = false;
			}					
			
			if (gameinfo.getRoom() == 0 && onechoice == true && list.checkNightofHorrors() == false && sprite.checkDirection() == 'N')
			{
				onechoice = false;
				log.readDialogue(61);			}
			
			if (gameinfo.getRoom() == 0 && onechoice == true && list.checkNightofHorrors() == false && sprite.checkDirection() == 'W')
			{
				log.readDialogue(43);
			}
			
			if (gameinfo.getRoom() == 0 && onechoice == true && list.checkNightofHorrors() == true && sprite.checkDirection() == 'N')
			{
				log.readDialogue(90);
			}
			
			if (gameinfo.getRoom() == 0 && onechoice == true && list.checkNightofHorrors() == true && sprite.checkDirection() == 'W')
			{
				log.readDialogue(95);
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
				onechoice = false;
			}
			
			if (gameinfo.getRoom() == 8 && onechoice == true && list.checkNightofHorrors() == true && sprite.getX() == 1)
			{	
				if(list.prySouthWestVent() == false)
					log.readDialogue(88);
				else
				{
					sprite.setGameSprite(3,7,'W');
					gameinfo.changeRoom(17);
				}
				onechoice = false;
			}
			
			if (gameinfo.getRoom() == 8 && onechoice == true && list.checkNightofHorrors() == true && sprite.getY() == 3)
			{	
				sprite.setGameSprite(5,1,'S');
				gameinfo.changeRoom(15);
				onechoice = false;
			}
			
			if (gameinfo.getRoom() == 17 && onechoice == true && list.checkNightofHorrors() == true && sprite.getY() == 7)
			{	
				sprite.setGameSprite(1,1,'E');
				gameinfo.changeRoom(8);
				onechoice = false;
			}
			
			if (gameinfo.getRoom() == 17 && onechoice == true && list.checkNightofHorrors() == true && sprite.getY() == 3)
			{	
				log.readDialogue(88);
			}
			
			if (gameinfo.getRoom() == 15 && onechoice == true && list.checkNightofHorrors() == false)
			{	
				log.readDialogue(47);
				onechoice = false;
			}
		
			if (gameinfo.getRoom() == 15 && onechoice == true && list.checkNightofHorrors() == true)
			{	
				if(list.pryDormVent() == false)
					log.readDialogue(88);
				else
				{
					sprite.setGameSprite(5,3,'N');
					gameinfo.changeRoom(8);
				}
				onechoice = false;
			}
			
			// if game room North Exit
			/*{
				gamenifo.changeRoom(0);
				onechoice = false;
				sprite.setGameSprite(9,1,'S');
			}*/
			
			// if game room West Hall
			/*{
				gamenifo.changeRoom(0);
				sprite.setGameSprite(1,8,'E');
			}*/
			
			
		}
		
		if(gameinfo.returnYear() == gameinfo.gameyearpresent)
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
		
		if(gameinfo.returnYear() == gameinfo.gameyearpresent || list.checkNightofHorrors() == true)
		{
			g.setColor(Color.darkGray);
			g.fillRect(RelativeX+10, RelativeY+5, 30,40);
		}
		

		
		if(gameinfo.returnYear() == gameinfo.gameyearpast &&  list.checkNightofHorrors() == true && list.pryDormVent() == true  && ((gameinfo.getRoom() == 15 && y == 0) || gameinfo.getRoom() == 8 && y == 4))
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
		
		if(gameinfo.returnYear() == gameinfo.gameyearpast &&  list.checkNightofHorrors() == true && list.pryNorthWestVent() == true  == true && list.prySouthWestVent() == true && ((gameinfo.getRoom() == 17 && y == 2) || gameinfo.getRoom() == 0 && x == 0))
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
		
		if(gameinfo.returnYear() == gameinfo.gameyearpast &&  list.checkNightofHorrors() == true && list.prySouthWestVent() == true && ((gameinfo.getRoom() == 17 && y == 7) || gameinfo.getRoom() == 8 && x == 0))
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