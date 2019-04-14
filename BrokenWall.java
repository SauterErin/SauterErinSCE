package choice;
import java.awt.*;

public class BrokenWall extends GameObject{
	
	public BrokenWall (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}

	public void interactObject()
	{
		boolean wait = true;
		
		// If in present 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			// If in North Hallway
			if(gameinfo.getRoom() == 0 && wait == true)
			{
				// If Facing Broken Wall in Southern Wall and Night 2 
				if(sprite.getX() == 7 && sprite.getY() == 8 && list.checkNight2() == true && wait == true)
				{
					gameinfo.changeRoom(9);
					sprite.setGameSprite(7,1, 'S');
					wait = false;
				}
				
				// If facing Broken Wall in East Wall and Wall has been broken
				if(sprite.getX() == 15 && list.checkBreakWallNorthEastPassage() == true && wait == true)
				{
					gameinfo.changeRoom(7);
					sprite.setGameSprite(1,3,'E');
					wait = false;
				}
				
				// If facing Broken Wall in West Wall and Wall has been broken
				if(sprite.getX() == 1 && list.checkBreakWallNorthWestPassage() == true && wait == true)
				{
					gameinfo.changeRoom(17);
					sprite.setGameSprite(3,1,'W');
					wait = false;
				}
			}
			
			// If in Central Yard
			if(gameinfo.getRoom() == 9 && wait == true)
			{
				// Facing Northern Wall and Night 2
				if(sprite.getX() == 7 && list.checkNight2() == true && wait == true)
				{
					gameinfo.changeRoom(0);
					sprite.setGameSprite(7,8,'N');
					wait = false;
				}
				
				// If facing Eastern Wall and Night 2
				if(sprite.getX() == 15 && list.checkNight2() == true && wait == true)
				{
					gameinfo.changeRoom(7);
					sprite.setGameSprite(1,6,'E');
					wait = false;
				}
			}
			
			// If in Eastern Hall 
			if(gameinfo.getRoom() == 7 && wait == true)
			{	
				// Facing upper West Wall and Wall has been broken
				if(sprite.getY() == 3 && list.checkBreakWallNorthEastPassage() == true && wait == true)
				{
					gameinfo.changeRoom(0);
					sprite.setGameSprite(15,8,'W');
					wait = false;
				}
				
				// Facing lower West Wall and Wall has been broken 
				if(sprite.getY() == 6 && list.checkNight2() == true && wait == true)
				{
					gameinfo.changeRoom(9);
					sprite.setGameSprite(15,11,'W');
					wait = false;
				}
				
				// Facing East Wall and wall has been broken 
				if(sprite.getY() == 8 && wait == true && list.checkBreakWallEastPassage())
				{
					gameinfo.changeRoom(12);
					sprite.setGameSprite(1,4,'E');
					wait = false;
				}
				
				// Facing Southern Wall and wall has been broken
				if(sprite.getY() == 10 && list.checkNight2() == true && wait == true)
				{
					gameinfo.changeRoom(8);
					sprite.setGameSprite(5,1,'S');
					wait = false;
				}
			}
			
			// If in Southern Hall
			if(gameinfo.getRoom() == 8 && wait == true)
			{
				// Facing West Wall and wall has been broken
				if(sprite.getX() == 1 && list.checkBreakWallSouthWestPassage() == true && wait == true)
				{
					gameinfo.changeRoom(17);
					sprite.setGameSprite(3,9,'W');
					wait = false;
				}
				
				// Facing North Wall and its Night 2 or later
				if(sprite.getX() == 5 && list.checkNight2() == true && wait == true)
				{
					gameinfo.changeRoom(7);
					sprite.setGameSprite(1,10,'N');
					wait = false;
				}
				
				// Facing South and Will has been captured or later
				if(sprite.getX() == 3 && list.checkNightMonster() == true && wait == true)
				{
					gameinfo.changeRoom(15);
					sprite.setGameSprite(3,1,'S');
					wait = false;
				}
			}
			
			// If in Dorm room 
			if(gameinfo.getRoom() == 15 && wait == true)
			{	
				// And Alva has retrieved her backpack - thereby Will has been captured 
				if(list.checkRetrieveBackpack() == true)
				{
					gameinfo.changeRoom(8);
					sprite.setGameSprite(3,3,'N');
					wait = false;
				}
				
				// If not turned back
				else
				{
					log.readDialogue(99);
				}
			}
			
			// If in West Hall 
			if(gameinfo.getRoom() == 17)
			{
				// Facing upper right wall and wall is broken
				if(sprite.getX() == 3 && sprite.getY() == 1 && list.checkBreakWallNorthWestPassage() == true && wait == true)
				{
					gameinfo.changeRoom(0);
					sprite.setGameSprite(1,6,'E');
					wait = false;
				}
				
				// Facing lower right wall and wall is broken
				if(sprite.getX() == 3 && sprite.getY() == 9 && list.checkBreakWallSouthWestPassage() == true && wait == true)
				{
					gameinfo.changeRoom(8);
					sprite.setGameSprite(1,3,'E');
					wait = false;
				}
				
				// Facing lower left wall and the wall has been broken
				if(sprite.getX() == 1 && sprite.getY() == 9 && list.checkBreakWallRescue() == true && wait == true)
				{			
					gameinfo.changeRoom(18);
					sprite.setGameSprite(3,3,'W');
					wait = false;
				}
				
				if(sprite.getX() == 1 && sprite.getY() == 1 && list.checkBreakWallBurial() == true && wait == true)
				{
					gameinfo.changeRoom(16);
					sprite.setGameSprite(3,1,'W');
					wait = false;
				}
			}
			if(gameinfo.getRoom() == 18 && wait == true)
			{
				if(list.checkRescueComplete() == true && list.checkBurial() == true)
				{
					gameinfo.changeRoom(17);
					sprite.setGameSprite(1,9,'E');
					wait = false;
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
			if(gameinfo.getRoom() == 16 && wait == true)
			{
				if(list.checkBurial() == true)
				{
					gameinfo.changeRoom(17);
					sprite.setGameSprite(1,1,'E');
					wait = false;
				}
				
				if(list.checkRescueComplete() == true && list.checkBurial() == false)
				{
					log.readDialogue(119);
				}
				
				if(list.checkRescueComplete() == false)
				{
					log.readDialogue(109);
				}
			}
			
			if(gameinfo.getRoom() == 12 && list.checkBreakWallEastPassage() == true && wait == true)
			{
				gameinfo.changeRoom(7);
				sprite.setGameSprite(3,8,'W');
				wait = false;
			}
		}
		if(gameinfo.checkMonsterMode() == true)
		{
			// if North Hall
			if(gameinfo.getRoom() == 0 && wait == true)
			{
				// And East Wall hasn't been broken 
				if(sprite.getX() == 15 && list.checkBreakWallNorthEastPassage() == false && wait == true)
				{
					list.actBreakWallNorthEastPassage();
					log.readDialogue(60);
					interactObject();
					wait = false;
				}
				
				// And West Wall hasn't been broken yet
				if(sprite.getX() == 1 && list.checkBreakWallNorthWestPassage() == false && wait == true)
				{
					list.actBreakWallNorthWestPassage();
					log.readDialogue(60);
					interactObject();
					wait = false;
				}
				
				// North Wall
				if(sprite.getX() == 7 && sprite.getY() == 1)
				{
					log.readDialogue(109);
				}
			}
			
			// If in East Wing 
			if(gameinfo.getRoom() == 7 && wait == true)
			{
				// And upper left passage hasn't been broken 
				if(sprite.getY() == 3 && list.checkBreakWallNorthEastPassage() == false && wait == true)
				{
					list.actBreakWallNorthEastPassage();
					log.readDialogue(60);
					wait = false;
					interactObject();
				}
				
				// And East Wall and Wall hasn't been broken
				if(sprite.getY() == 8 && list.checkBreakWallEastPassage() == false && wait == true)
				{
					list.actBreakWallEastPassage();
					log.readDialogue(60);
					wait = false;
					interactObject();
				}
			}
			
			// If in West Hall 
			if(gameinfo.getRoom() == 17 && wait == true)
			{
				// And South Western Wall hasn't been broken 
				if(sprite.getY() == 9 && sprite.getX() == 1 && wait == true)
				{
					list.actBreakWallRescue();
					log.readDialogue(60);
					wait = false;
					interactObject();
				}
			}
			
			// If in South Hall
			if(gameinfo.getRoom() == 8 && wait == true)
			{
				// And Western Wall hasn't been broken
				if(sprite.getX() == 1 && list.checkBreakWallSouthWestPassage() == false && wait == true)
				{
					list.actBreakWallSouthWestPassage();
					log.readDialogue(60);
					wait = false;
					interactObject();
				}
			}
			
			// If in West Hall
			if(gameinfo.getRoom() == 17 && wait == true)
			{
				// Upper North Wall - and wall hasn't been broken 
				if(sprite.getX() == 3 && sprite.getY() == 1 && list.checkBreakWallNorthWestPassage() == false && wait == true)
				{
					list.actBreakWallNorthWestPassage();
					log.readDialogue(60);
					wait = false;
					interactObject();
				}
				
				// If in West Hall - southern west wall and hasn't been broken 
				if(sprite.getX() == 3 && sprite.getY() == 9 && list.checkBreakWallSouthWestPassage() == false  && wait == true)
				{
					list.actBreakWallSouthWestPassage();
					log.readDialogue(60);
					wait = false;
					interactObject();
				}
			}
			
			// If East Wing 
			if(gameinfo.getRoom() == 12 && wait == true)
			{
				// And Wall hasn't been broken 
				if(list.checkBreakWallEastPassage() == false && wait == true)
				{
					list.actBreakWallEastPassage();
					log.readDialogue(60);
					wait = false;
					interactObject();
				}
			}
			
			// If in West Hall and Upper West Wall
			if(gameinfo.getRoom() == 17 && wait == true && sprite.getX() == 1 && sprite.getY() == 1)
			{
				// If Father hasn't been buried
				if(list.checkBurial() == false && wait == true)
				{
					log.readDialogue(108);
					wait = false;
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
		
		if(gameinfo.checkMonsterMode() == true)
		{
			g.setColor(Color.getHSBColor(31,80,87));
		}
		g.fillRect(RelativeX+1, RelativeY+1, 14,9);
		g.fillRect(RelativeX+1, RelativeY+21, 14,9);
		g.fillRect(RelativeX+1, RelativeY+41, 14,9);
		
		g.fillRect(RelativeX+16, RelativeY+1, 14,9);
		g.fillRect(RelativeX+16, RelativeY+21, 14,9);
		g.fillRect(RelativeX+16, RelativeY+41, 14,9);
		
		g.fillRect(RelativeX+31, RelativeY+1, 19, 9);
		g.fillRect(RelativeX+31, RelativeY+21, 19,9);
		g.fillRect(RelativeX+31, RelativeY+41, 19,9);

		g.fillRect(RelativeX+1, RelativeY+11, 19,9);
		g.fillRect(RelativeX+1, RelativeY+31, 19,9);

		g.fillRect(RelativeX+21, RelativeY+11, 19,9);
		g.fillRect(RelativeX+21, RelativeY+31, 19,9);

		g.fillRect(RelativeX+41, RelativeY+11, 9,9);
		g.fillRect(RelativeX+41, RelativeY+31, 9,9);		
		
		//If in present 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			// If in North Hall
			if(gameinfo.getRoom() == 0)
			{
				// If at Southern Wall and at or past Night 2 
				if(x == 7 && y == 9 && list.checkNight2() == true)
				{
					g.setColor(Color.black);
					g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
					g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
					g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
				}
				
				// If in North Hall and Western Wall is broken
				if(x == 0 && list.checkBreakWallNorthWestPassage() == true)
				{
					g.setColor(Color.black);
					g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
					g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
					g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
				}
				
				// If in North Hall and Northern Wall is broken
				if(y == 0 && list.checkSacrifice() == true)
				{
					g.setColor(Color.black);
					g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
					g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
					g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
				}
			}
			
			// If in North Hall and Eastern Wall or if in East Hall and Western Wall
			if((gameinfo.getRoom() == 0 && x == 16) || (gameinfo.getRoom() == 7 && y == 3))
			{
				// If Alva has broken through wall
				if(list.checkBreakWallNorthEastPassage() == true)
				{	
					g.setColor(Color.black);
					g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
					g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
					g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
				}
			}			
			
			// If in Central Yard and Night 2
			if(gameinfo.getRoom() == 9 && list.checkNight2() == true)
			{	
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
			
			// If in Dorm and if Alva is or has rescued Will 
			if(gameinfo.getRoom() == 15 && list.checkNightMonster() == true)
			{
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
			
			// If in Eastern Hall and Either lower Western Wall or Southern Wall and if in Present and Will has pressed the power button/gone back to sleep 	
			if(gameinfo.getRoom() == 7 &&(x == 1 || y == 6) == true && list.checkNight2() == true)
			{
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
			
			// If in Southern Hall 
			if(gameinfo.getRoom() == 8)
			{
				// Facing Northern Wall  Will has pressed the power button/gone back to sleep 
				if(y == 0 && list.checkNight2() == true)
				{	
					g.setColor(Color.black);
					g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
					g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
					g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
				}
				
				// If facing South Wall and Alva is rescuing Will or has 
				if(y == 4 && list.checkNightMonster() == true)
				{	
					g.setColor(Color.black);
					g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
					g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
					g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
				}
				
				// If Alva has broken through Western Wall
				if(x == 0 && list.checkBreakWallSouthWestPassage() == true)
				{	
					g.setColor(Color.black);
					g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
					g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
					g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
				}
			}
			
			// If in East Hall and Eastern Wall
			if(gameinfo.getRoom() == 7 && y == 8)
			{	
				//If Alva has broken through said wall
				if(list.checkBreakWallEastPassage() == true)
				{	
					g.setColor(Color.black);
					g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
					g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
					g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
				}
			}
			
			// If in East Wing and Alva has broken through Wall 
			if(gameinfo.getRoom() == 12 && list.checkBreakWallEastPassage() == true)
			{
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
			}
			
			// If in West Hallway 
			if(gameinfo.getRoom() == 17)
			{
				// Alva has broken through South West wall passage 
				if(x == 4 && y == 9 && list.checkBreakWallSouthWestPassage() == true)
				{	
					g.setColor(Color.black);
					g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
					g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
					g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
				}
				
				// If Alva has broken through North West wall passage 
				if(x == 4 && y == 1 && list.checkBreakWallNorthWestPassage() == true)
				{	
					g.setColor(Color.black);
					g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
					g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
					g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
				}
				
				// If Father has been buried
				if(x == 0 && y == 1 && list.checkBreakWallBurial() == true)
				{	
					g.setColor(Color.black);
					g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
					g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
					g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
				}
				
				// If Will has been rescued 
				if(x == 0 && y == 9 && list.checkBreakWallRescue() == true)
				{	
					g.setColor(Color.black);
					g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
					g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
					g.fillRect(RelativeX+9, RelativeY+32, 25, 15);
				}
			}
			
			// If in Holding Room B and Alva has broken in 
			if(gameinfo.getRoom() == 18 && list.checkBreakWallRescue() == true)
			{
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);			
			}
			
			// If in Holding Room A and Alva has broken in 
			if(gameinfo.getRoom() == 16 && list.checkBreakWallBurial() == true)
			{
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);			
			}
			
			// If in Exit Hall and Alva has entered room
			if(gameinfo.getRoom() == 19 && list.checkSacrifice() == true)
			{
				g.setColor(Color.black);
				g.fillRect(RelativeX+9, RelativeY+2, 25, 15);
				g.fillRect(RelativeX+4, RelativeY+17, 35, 15);
				g.fillRect(RelativeX+9, RelativeY+32, 25, 15);			
			}		
		}
	}
}