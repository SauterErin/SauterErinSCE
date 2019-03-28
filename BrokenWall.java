package choice;
import java.awt.*;

public class BrokenWall extends GameObject{
	
	List list;

	public BrokenWall (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
	}

	public void interactObject()
	{
		boolean onechoice = true;
		
		if(gameinfo.currentyear == gameinfo.gameyearpresent)
		{
			if(gameinfo.getRoom() == 0 && onechoice == true)
			{
				if(sprite.getX() == 7 && sprite.getY() == 8 && list.checkNight2() == true)
				{
					gameinfo.changeRoom(9);
					sprite.setGameSprite(7,1, 'S');
					onechoice = false;
				}
				
				if(sprite.getX() == 15 && list.checkBreakWallNorthEastPassage() == true && onechoice == true)
				{
					gameinfo.changeRoom(7);
					sprite.setGameSprite(1,3,'E');
					onechoice = false;
				}
				
				if(sprite.getX() == 1 && list.checkBreakWallNorthWestPassage() == true && onechoice == true)
				{
					gameinfo.changeRoom(17);
					sprite.setGameSprite(3,1,'W');
					onechoice = false;
				}
			}
			
			if(gameinfo.getRoom() == 9 && onechoice == true)
			{
				if(sprite.getX() == 7 && list.checkNight2() == true && onechoice == true)
				{
					gameinfo.changeRoom(0);
					sprite.setGameSprite(7,8,'N');
					onechoice = false;
				}
				
				if(sprite.getX() == 15 && list.checkNight2() == true && onechoice == true)
				{
					gameinfo.changeRoom(7);
					sprite.setGameSprite(1,6,'E');
					onechoice = false;
				}
			}
			
			if(gameinfo.getRoom() == 7 && onechoice == true)
			{	
				if(sprite.getY() == 3 && list.checkBreakWallNorthEastPassage() == true && onechoice == true)
				{
					gameinfo.changeRoom(0);
					sprite.setGameSprite(15,8,'W');
					onechoice = false;
				}
				
				if(sprite.getY() == 6 && list.checkNight2() == true && onechoice == true)
				{
					gameinfo.changeRoom(9);
					sprite.setGameSprite(15,11,'W');
					onechoice = false;
				}
				
				if(sprite.getY() == 8 && list.checkNightMonster() == true && onechoice == true && list.checkBreakEastPassage())
				{
					gameinfo.changeRoom(12);
					sprite.setGameSprite(1,4,'E');
					onechoice = false;
				}
				
				if(sprite.getY() == 10 && list.checkNight2() == true && onechoice == true)
				{
					gameinfo.changeRoom(8);
					sprite.setGameSprite(5,1,'S');
					onechoice = false;
				}
				
				
			}
			
			if(gameinfo.getRoom() == 8 && onechoice == true)
			{
				if(sprite.getX() == 1 && list.checkBreakWallSouthWestPassage() == true && onechoice == true)
				{
					gameinfo.changeRoom(17);
					sprite.setGameSprite(3,9,'W');
					onechoice = false;
				}
				
				if(sprite.getX() == 5 && list.checkNight2() == true && onechoice == true)
				{
					gameinfo.changeRoom(7);
					sprite.setGameSprite(1,10,'N');
					onechoice = false;
				}
				
				if(sprite.getX() == 3 && list.checkAlvaRampage() == true && onechoice == true)
				{
					gameinfo.changeRoom(15);
					sprite.setGameSprite(3,1,'S');
					onechoice = false;
				}
			}
			
			if(gameinfo.getRoom() == 15 && onechoice == true)
			{
				if(list.checkRetrieveBackpack() == true)
				{
					gameinfo.changeRoom(8);
					sprite.setGameSprite(3,3,'N');
					onechoice = false;
				}
				else
					log.readDialogue(99);
				
			}
			
			if(gameinfo.getRoom() == 15 && onechoice == true)
			{
				if(list.checkRetrieveBackpack() == true)
				{
					gameinfo.changeRoom(8);
					sprite.setGameSprite(3,3,'N');
					onechoice = false;
				}
				else
					log.readDialogue(99);
				
			}
			
			if(gameinfo.getRoom() == 15 && onechoice == true)
			{
				if(list.checkRetrieveBackpack() == true)
				{
					gameinfo.changeRoom(8);
					sprite.setGameSprite(3,3,'N');
					onechoice = false;
				}
				else
					log.readDialogue(99);
				
			}
			
			if(gameinfo.getRoom() == 15 && onechoice == true)
			{
				if(list.checkRetrieveBackpack() == true)
				{
					gameinfo.changeRoom(8);
					sprite.setGameSprite(3,3,'N');
					onechoice = false;
				}
				else
					log.readDialogue(99);
				
			}
			
			if(gameinfo.getRoom() == 17 && onechoice == true && sprite.getY() == 1 && sprite.getX() == 3)
			{
				if(list.checkBreakWallNorthWestPassage() == true)
				{
					gameinfo.changeRoom(0);
					sprite.setGameSprite(1,6,'E');
					onechoice = false;
				}
			}
			
			if(gameinfo.getRoom() == 17 && onechoice == true && sprite.getY() == 9 && sprite.getX() == 3)
			{
				if(list.checkBreakWallSouthWestPassage() == true)
				{
					gameinfo.changeRoom(8);
					sprite.setGameSprite(1,3,'E');
					onechoice = false;
				}
			}
			
			if(gameinfo.getRoom() == 17 && onechoice == true && sprite.getY() == 9 && sprite.getX() == 1)
			{
				if(list.checkBreakWallRescue() == true)
				{
					gameinfo.changeRoom(18);
					sprite.setGameSprite(3,3,'W');
					onechoice = false;
				}
			}
			
			if(gameinfo.getRoom() == 17 && onechoice == true && sprite.getY() == 1 && sprite.getX() == 1)
			{
				if(list.checkBreakWallBurial() == true)
				{
					gameinfo.changeRoom(16);
					sprite.setGameSprite(3,1,'W');
					onechoice = false;
				}
			}
			
			if(gameinfo.getRoom() == 18 && onechoice == true)
			{
				if(list.checkRescueComplete() == true && list.checkBurial() == true)
				{
					gameinfo.changeRoom(17);
					sprite.setGameSprite(1,9,'E');
					onechoice = false;
				}
				
				if(list.checkRescueComplete() == true && list.checkBurial() == false)
				{
					log.readDialogue(111);
				}
				
				if(list.checkRescueComplete() == false)
				{
					log.readDialogue(109);
				}
			}
			if(gameinfo.getRoom() == 16 && onechoice == true)
			{
				if(list.checkBurial() == true)
				{
					gameinfo.changeRoom(17);
					sprite.setGameSprite(1,1,'E');
					onechoice = false;
				}
				
				if(list.checkRescueComplete() == true && list.checkBurial() == false)
				{
					log.readDialogue(107);
				}
				
				if(list.checkRescueComplete() == false)
				{
					log.readDialogue(109);
				}
			}
			
			if(gameinfo.getRoom() == 12 && list.checkBreakEastPassage() == true && onechoice == true)
			{
				gameinfo.changeRoom(7);
				sprite.setGameSprite(3,8,'W');
				onechoice = false;
			}
		}
		if(gameinfo.checkMonsterMode() == true)
		{
			if(gameinfo.getRoom() == 0 && onechoice == true)
			{
				if(sprite.getX() == 15 && list.checkBreakWallNorthEastPassage() == false && onechoice == true)
				{
					list.actBreakWallNorthEastPassage();
					log.readDialogue(60);
					interactObject();
					onechoice = false;

				}
				
				if(sprite.getX() == 1 && list.checkBreakWallNorthWestPassage() == false && onechoice == true)
				{
					list.actBreakWallNorthWestPassage();
					log.readDialogue(60);
					interactObject();
					onechoice = false;
				}
				
				if(sprite.getX() == 7 && sprite.getY() == 1)
				{
					log.readDialogue(109);
				}
			}
			
			if(gameinfo.getRoom() == 7 && onechoice == true)
			{
				if(sprite.getY() == 3 && list.checkBreakWallNorthWestPassage() == false && onechoice == true)
				{
					list.actBreakWallNorthEastPassage();
					log.readDialogue(60);
					onechoice = false;
					interactObject();
				}
			}
			
			if(gameinfo.getRoom() == 17 && onechoice == true)
			{
				if(sprite.getY() == 9 && sprite.getX() == 1 && onechoice == true)
				{
					list.actBreakWallRescue();
					log.readDialogue(60);
					onechoice = false;
					interactObject();
				}
			}
			
			if(gameinfo.getRoom() == 8 && onechoice == true)
			{
				if(sprite.getX() == 1 && list.checkBreakWallSouthWestPassage() == false && onechoice == true)
				{
					list.actBreakWallSouthWestPassage();
					log.readDialogue(60);
					onechoice = false;
					interactObject();
				}
			}
			
			if(gameinfo.getRoom() == 17 && onechoice == true)
			{
				if(sprite.getX() == 3 && sprite.getY() == 1 && list.checkBreakWallNorthWestPassage() == false && onechoice == true)
				{
					list.actBreakWallNorthWestPassage();
					log.readDialogue(60);
					onechoice = false;
					interactObject();
				}
			}
			
			if(gameinfo.getRoom() == 17 && onechoice == true)
			{
				if(sprite.getX() == 3 && list.checkBreakWallSouthWestPassage() == false && sprite.getY() ==9 && onechoice == true)
				{
					list.actBreakWallSouthWestPassage();
					log.readDialogue(60);
					onechoice = false;
					interactObject();
				}
			}
			
			if(gameinfo.getRoom() == 12 && onechoice == true)
			{
				if(list.checkBreakEastPassage() == false && onechoice == true)
				{
					list.actBreakEastPassage();
					log.readDialogue(60);
					onechoice = false;
					interactObject();
				}
			}
			
			if(gameinfo.getRoom() == 17 && onechoice == true && sprite.getX()  == 1 && sprite.getY() == 1)
			{
				if(list.checkBurial() == false && onechoice == true)
				{
					log.readDialogue(108);
					onechoice = false;
				}
			}
			
			if(gameinfo.getRoom() == 7 && onechoice == true)
			{
				if(sprite.getY() == 8 && list.checkBreakEastPassage() == false && onechoice == true)
				{
					list.actBreakEastPassage();
					log.readDialogue(60);
					onechoice = false;
					interactObject();
				}
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

		g.setColor(Color.getHSBColor(245, 140, 133));	
		if(gameinfo.getRed() == true)
			g.setColor(Color.getHSBColor(87, 89, 70));
		if(gameinfo.checkMonsterMode() == true)
			g.setColor(Color.getHSBColor(31,80,87));
		
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
		
		if(gameinfo.getRoom() == 0 && x == 7 && y == 9)
		{
			if(list.checkNight2() == true && gameinfo.currentyear == gameinfo.gameyearpresent)
			{
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
		}
		
		if((gameinfo.getRoom() == 0 && x == 16) || (gameinfo.getRoom() == 7 && y == 3))
		{
			if(list.checkBreakWallNorthEastPassage() == true)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
		}
		
		if(gameinfo.getRoom() == 0 && x == 0)
		{
			if(list.checkBreakWallNorthWestPassage() == true)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
		}
		
		if(gameinfo.getRoom() == 9)
		{
			if(list.checkNight2() == true  && gameinfo.currentyear == gameinfo.gameyearpresent)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
		}
		
		if(gameinfo.getRoom() == 15)
		{
			if(list.checkAlvaRampage() == true)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
		}
		
		if((gameinfo.getRoom() == 7 && x == 1) || gameinfo.getRoom() == 7 && y == 6)
		{
			if(list.checkNight2() == true  && gameinfo.currentyear == gameinfo.gameyearpresent)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
		}
		
		if(gameinfo.getRoom() == 8 && y == 0)
		{
			if(list.checkNight2() == true  && gameinfo.currentyear == gameinfo.gameyearpresent)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
		}
		
		if(gameinfo.getRoom() == 8 && y == 4)
		{
			if(list.checkAlvaRampage() == true)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
		}
		
		if(gameinfo.getRoom() == 8 && x == 0)
		{
			if(list.checkBreakWallSouthWestPassage() == true)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
		}
		
		if(gameinfo.getRoom() == 7 && y == 8)
		{
			if(list.checkBreakEastPassage() == true)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
		}
		
		if(gameinfo.getRoom() == 12)
		{
			if(list.checkBreakEastPassage() == true)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
		}
		
		if(gameinfo.getRoom() == 17)
		{
			if(list.checkBreakWallSouthWestPassage() == true && x == 4 && y == 9)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
			
			if(list.checkBreakWallNorthWestPassage() == true && x == 4 && y == 1)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
			
			if(list.checkBreakWallBurial() == true && x == 0 && y == 1)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
			
			if(list.checkBreakWallRescue() == true && x == 0 && y == 9)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
		}
		
		if(gameinfo.getRoom() == 18 && list.checkBreakWallRescue() == true)
		{
			g.setColor(Color.black);
			g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
			g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
			g.fillRect(RelativeX+9, RelativeY+32, 25, 15);			
		}
		
		if(gameinfo.getRoom() == 16 && list.checkBreakWallBurial() == true)
		{
			g.setColor(Color.black);
			g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
			g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
			g.fillRect(RelativeX+9, RelativeY+32, 25, 15);			
		}
	}
}