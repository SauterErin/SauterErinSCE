package choice;
import java.awt.*;

import javax.swing.*;

public class GameSprite extends JPanel {
	
	private boolean alvaFollow;
	private boolean carrying;
	private boolean entrystart;
	private boolean presentMonster;
	
	private char alvaDirection;
	private char direction;
	private char monsterDirection;
	
	private int RelativeX ;
	private int RelativeY ;
	private int monsterRelativeX;
	private int monsterRelativeY;
	private int monsterX ;
	private int monsterY ;
	private int x;
	private int y;

	GameMode gameinfo;
	List list;

	public GameSprite(int x, int y, GameMode gameinfo, List list)
	{
		this.gameinfo = gameinfo;
		this.list = list;
		this.x = x;
		this.y = y;

		alvaFollow = false;
		carrying = false;
		direction = 'S';
		entrystart = false;
		monsterDirection = 'N';
		monsterX = 0;
		monsterY = 0;
		RelativeX = 0+110;
		RelativeY = 0+110;
	}
	
	// Change direction of Alva sprite (child and adult) as NPC character
	public void changeAlvaDirection(char newDirection)
	{
		alvaDirection = newDirection;
	}
	
	// Change direction of player sprite
	public void changeDirection(char newDirection)
	{
		direction = newDirection;
	}
	
	// Change direction of Monster sprite as NPC character
	public void changeMonsterDirection(char newDirection)
	{
		monsterDirection = newDirection;
	}
	
	// Change direction of Monster sprite as NPC character
	public void changeMonsterX( int moveX)
	{
		monsterX =+ moveX;
	}
	
	// Move Monster Sprite up or down by one
	public void changeMonsterY(int moveY)
	{
		monsterY =+ moveY;
	}
	
	// Move sprite to left or right
	public void changeX(int moveX)
	{
		// Automatic changing of AlvaDirection
		if (x+moveX < x)
			alvaDirection = 'W';
		else
			alvaDirection = 'E';
			
		x += moveX;
		entrystart = false;
	}
	
	// Move sprite up or down 
	public void changeY(int moveY)
	{
		// Automatic changing of alvaDirection
		if (y+moveY < y)
			alvaDirection = 'N';
		else
			alvaDirection = 'S';
		y += moveY;
		entrystart = false;
	}
	
	// Check if Alva is following player sprite 
	public boolean checkAlvaFollow() 
	{
		return alvaFollow;
	}
	
	// Return direction of player sprite
	public char checkDirection()
	{
		return direction;
	}
	
	// Return direction of monster NPC sprite 
	public char checkMonsterDirection() {
		return monsterDirection;
	}
	
	// Check if Monster NPC sprite is present 
	public boolean checkPresentMonster() 
	{
		return presentMonster;
	}
	
	// End Alva Following player sprite
	public void endAlvaFollow()
	{
		alvaFollow = false;
	}
	
	// End Alva carrying Will
	public void endCarrying() 
	{
		carrying = false;
	}
	
	// End Monster NPC presence
	public void endPresentMonster()
	{
		presentMonster = false;
	}
	
	// Return X coordinate of Monster sprite as NPC 
	public int getMonsterX()
	{
		return monsterX;
	}
		
	// Return Y coordinate of Monster sprite as NPC
	public int getMonsterY()
	{
		return monsterY;
	}
	
	// Return X coordinate of player sprite
	public int getX()
	{
		return x;
	}
	
	// Return Y coordinate of player sprite
	public int getY()
	{
		return y;
	}	
	
	// Set player sprite in new starting position 
	public void setGameSprite(int newX, int newY, char newDirection)
	{
		x = newX;
		y = newY;

		direction = newDirection;
		entrystart = true;
	}
	
	// Set Monster sprite as NPC character in new starting position
	public void setMonsterSprite(int newX, int newY, char newDirection)
	{
		monsterX = newX;
		monsterY = newY;
		monsterDirection = newDirection;
	}
	
	// Trigger Alva follow player sprite
	public void startAlvaFollow()
	{
			alvaFollow = true;
			entrystart = false;
	}

	// Trigger Alva carrying Will
	public void startCarrying() 
	{
		carrying = true;
	}	

	// Trigger Monster NPC 
	public void startPresentMonster()
	{
		presentMonster = true;
	}
	
	public void paintComponent(Graphics g)
	{
		// Set relative coordinates as according to schema used by GameObject
		monsterRelativeX = (monsterX-getX())*50+110;
		monsterRelativeY = (monsterY-getY())*50+110;
		
		super.paintComponent(g);
		
		// Present Time - Sprites
		if(gameinfo.getYear() == gameinfo.getPresent())
		{				
			// Will North Facing Sprite
			if (direction == 'N' && gameinfo.checkMonsterMode() == false)
			{
				g.setColor(Color.BLUE);
				g.fillRect(RelativeX+12,RelativeY+12,26,8);
				g.setColor(Color.GREEN);
				g.fillRect(RelativeX+12, RelativeY+20, 26, 18);
			}
		
			// Monster North Facing Sprite - Player Controlled
			if (direction == 'N' && gameinfo.checkMonsterMode() == true)
			{
				g.setColor(Color.darkGray);
				g.fillRect(RelativeX-5,RelativeY-5, 60,60);
				
				// Red T
				g.setColor(Color.red);
				g.fillRect(RelativeX-5, RelativeY-5, 60, 5);
				g.fillRect(RelativeX+23, RelativeY-5, 4, 30);
				
				// Parallel With Top of T
				g.drawLine(RelativeX+15, RelativeY+15, RelativeX+5, RelativeY+15);
				g.drawLine(RelativeX+35, RelativeY+15, RelativeX+45, RelativeY+15);
				
				
				// Parallel with short part of T
				g.drawLine(RelativeX+15, RelativeY+15, RelativeX+10, RelativeY+30);
				g.drawLine(RelativeX+35, RelativeY+15, RelativeX+35, RelativeY+30);
				
				// Scar
				g.drawLine(RelativeX+15, RelativeY+10, RelativeX+21, RelativeY+32);	
				
				// If carrying Will
				if(carrying == true)
				{
					g.setColor(Color.BLUE);
					g.fillRect(RelativeX+12,RelativeY+12,26,8);
					g.setColor(Color.GREEN);
					g.fillRect(RelativeX+12, RelativeY+20, 26, 18);
				}
			}
			
			// Will East Facing Sprite
			if (direction == 'E' && gameinfo.checkMonsterMode() == false)
			{
				g.setColor(Color.BLUE);
				g.fillRect(RelativeX+30,RelativeY+12,8,26);
				g.setColor(Color.GREEN);
				g.fillRect(RelativeX+12, RelativeY+12, 18, 26);
			}
			
			// Monster East Facing Sprite - Player controlled
			if (direction == 'E' && gameinfo.checkMonsterMode() == true)
			{
				g.setColor(Color.darkGray);
				g.fillRect(RelativeX-5,RelativeY-5, 60,60);
				
				// Red T
				g.setColor(Color.red);
				g.fillRect(RelativeX+50, RelativeY-5, 5, 60);
				g.fillRect(RelativeX+25, RelativeY+24, 30, 4);
				
				// Parallel With Top of T
				g.drawLine(RelativeX+35, RelativeY+5, RelativeX+35, RelativeY+15);
				g.drawLine(RelativeX+35, RelativeY+35, RelativeX+35, RelativeY+45);
				
				
				// Parallel with short part of T
				g.drawLine(RelativeX+35, RelativeY+15, RelativeX+20, RelativeY+10);
				g.drawLine(RelativeX+35, RelativeY+35, RelativeX+20, RelativeY+35);
				
				// Scar
				g.drawLine(RelativeX+40, RelativeY+15, RelativeX+18, RelativeY+21);	
				
				// If carrying Will
				if(carrying == true)
				{
					g.setColor(Color.BLUE);
					g.fillRect(RelativeX+30,RelativeY+12,8,26);
					g.setColor(Color.GREEN);
					g.fillRect(RelativeX+12, RelativeY+12, 18, 26);
				}
			}
			
			// Will South Facing Sprite
			if (direction == 'S' && gameinfo.checkMonsterMode() == false)
			{
				g.setColor(Color.blue);
				g.fillRect(RelativeX+12,RelativeY+30,26,8);
				g.setColor(Color.green);
				g.fillRect(RelativeX+12, RelativeY+12, 26, 18);
			}
			
			// Monster South Facing Sprite - Player controlled
			if (direction == 'S' && gameinfo.checkMonsterMode() == true)
			{
				g.setColor(Color.darkGray);
				g.fillRect(RelativeX-5,RelativeY-5, 60,60);
				
				// Red T
				g.setColor(Color.red);
				g.fillRect(RelativeX-5, RelativeY+50, 60, 5);
				g.fillRect(RelativeX+23, RelativeY+25, 4, 30);
				
				// Parallel With Top of T
				g.drawLine(RelativeX+5, RelativeY+35, RelativeX+15, RelativeY+35);
				g.drawLine(RelativeX+35, RelativeY+35, RelativeX+45, RelativeY+35);
				
				
				// Parallel with short part of T
				g.drawLine(RelativeX+40, RelativeY+20, RelativeX+35, RelativeY+35);
				g.drawLine(RelativeX+15, RelativeY+20, RelativeX+15, RelativeY+35);
				
				// Scar
				g.drawLine(RelativeX+29, RelativeY+18, RelativeX+35, RelativeY+40);	
				
				// If carrying Will
				if(carrying == true)
				{
					g.setColor(Color.blue);
					g.fillRect(RelativeX+12,RelativeY+30,26,8);
					g.setColor(Color.green);
					g.fillRect(RelativeX+12, RelativeY+12, 26, 18);
				}
			}
			
			// Will West Facing Sprite
			if (direction == 'W' && gameinfo.checkMonsterMode() == false)
			{
				g.setColor(Color.BLUE);
				g.fillRect(RelativeX+12, RelativeY+12, 8,26 );
				g.setColor(Color.GREEN);
				g.fillRect(RelativeX+20, RelativeY+12, 18, 26);
			}
			
			// Monster West Facing Sprite - Player Controlled
			if (direction == 'W' && gameinfo.checkMonsterMode() == true)
			{
				g.setColor(Color.darkGray);
				g.fillRect(RelativeX-5,RelativeY-5, 60,60);
				
				// Red T
				g.setColor(Color.red);
				g.fillRect(RelativeX-5, RelativeY-5, 5, 60);
				g.fillRect(RelativeX-5, RelativeY+23, 30, 4);
				
				// Parallel With Top of T
				g.drawLine(RelativeX+15, RelativeY+35, RelativeX+15, RelativeY+45);
				g.drawLine(RelativeX+15, RelativeY+5, RelativeX+15, RelativeY+15);
				
				
				// Parallel with short part of T
				g.drawLine(RelativeX+15, RelativeY+35, RelativeX+30, RelativeY+40);
				g.drawLine(RelativeX+15, RelativeY+15, RelativeX+30, RelativeY+15);
				
				// Scar
				g.drawLine(RelativeX+10, RelativeY+35, RelativeX+32, RelativeY+29);		
				
				// If carrying Will
				if(carrying == true)
				{
					g.setColor(Color.BLUE);
					g.fillRect(RelativeX+12, RelativeY+12, 8,26 );
					g.setColor(Color.GREEN);
					g.fillRect(RelativeX+20, RelativeY+12, 18, 26);
				}
			}
			
			// If Monster NPC is present - Monster NPC Sprites
			if(presentMonster == true)
			{				
				// Monster North Facing Sprite
				if(monsterDirection == 'N')
				{
					g.setColor(Color.darkGray);
					g.fillRect(monsterRelativeX-5,monsterRelativeY-5, 60,60);
					
					// Red T
					g.setColor(Color.red);
					g.fillRect(monsterRelativeX-5, monsterRelativeY-5, 60, 5);
					g.fillRect(monsterRelativeX+23, monsterRelativeY-5, 4, 30);
					
					// Parallel With Top of T
					g.drawLine(monsterRelativeX+15, monsterRelativeY+15, monsterRelativeX+5, monsterRelativeY+15);
					g.drawLine(monsterRelativeX+35, monsterRelativeY+15, monsterRelativeX+45, monsterRelativeY+15);
					
					
					// Parallel with short part of T
					g.drawLine(monsterRelativeX+15, monsterRelativeY+15, monsterRelativeX+10, monsterRelativeY+30);
					g.drawLine(monsterRelativeX+35, monsterRelativeY+15, monsterRelativeX+35, monsterRelativeY+30);
					
					// Scar
					g.drawLine(monsterRelativeX+15, monsterRelativeY+10, monsterRelativeX+21, monsterRelativeY+32);	
				}
				
				// Monster South Facing Sprite
				if(monsterDirection == 'S')
				{
					g.setColor(Color.darkGray);
					g.fillRect(monsterRelativeX-5,monsterRelativeY-5, 60,60);
					
					// Red T
					g.setColor(Color.red);
					g.fillRect(monsterRelativeX-5, monsterRelativeY+50, 60, 5);
					g.fillRect(monsterRelativeX+23, monsterRelativeY+25, 4, 30);
					
					// Parallel With Top of T
					g.drawLine(monsterRelativeX+5, monsterRelativeY+35, monsterRelativeX+15, monsterRelativeY+35);
					g.drawLine(monsterRelativeX+35, monsterRelativeY+35, monsterRelativeX+45, monsterRelativeY+35);
					
					
					// Parallel with short part of T
					g.drawLine(monsterRelativeX+40, monsterRelativeY+20, monsterRelativeX+35, monsterRelativeY+35);
					g.drawLine(monsterRelativeX+15, monsterRelativeY+20, monsterRelativeX+15, monsterRelativeY+35);
					
					// Scar
					g.drawLine(monsterRelativeX+29, monsterRelativeY+18, monsterRelativeX+35, monsterRelativeY+40);	
				}
				
				// Monster East Facing Sprite
				if(monsterDirection == 'E')
				{
					g.setColor(Color.darkGray);
					g.fillRect(monsterRelativeX-5,monsterRelativeY-5, 60,60);
					
					// Red T
					g.setColor(Color.red);
					g.fillRect(monsterRelativeX+50, monsterRelativeY-5, 5, 60);
					g.fillRect(monsterRelativeX+25, monsterRelativeY+24, 30, 4);
					
					// Parallel With Top of T
					g.drawLine(monsterRelativeX+35, monsterRelativeY+5, monsterRelativeX+35, monsterRelativeY+15);
					g.drawLine(monsterRelativeX+35, monsterRelativeY+35, monsterRelativeX+35, monsterRelativeY+45);
					
					
					// Parallel with short part of T
					g.drawLine(monsterRelativeX+35, monsterRelativeY+15, monsterRelativeX+20, monsterRelativeY+10);
					g.drawLine(monsterRelativeX+35, monsterRelativeY+35, monsterRelativeX+20, monsterRelativeY+35);
					
					// Scar
					g.drawLine(monsterRelativeX+40, monsterRelativeY+15, monsterRelativeX+18, monsterRelativeY+21);	
				}
				
				// Monster West Facing Sprite
				if(monsterDirection == 'W')
				{
					g.setColor(Color.darkGray);
					g.fillRect(monsterRelativeX-5,monsterRelativeY-5, 60,60);
					
					// Red T
					g.setColor(Color.red);
					g.fillRect(monsterRelativeX-5, monsterRelativeY-5, 5, 60);
					g.fillRect(monsterRelativeX-5, monsterRelativeY+23, 30, 4);
					
					// Parallel With Top of T
					g.drawLine(monsterRelativeX+15, monsterRelativeY+35, monsterRelativeX+15, monsterRelativeY+45);
					g.drawLine(monsterRelativeX+15, monsterRelativeY+5, monsterRelativeX+15, monsterRelativeY+15);
					
					
					// Parallel with short part of T
					g.drawLine(monsterRelativeX+15, monsterRelativeY+35, monsterRelativeX+30, monsterRelativeY+40);
					g.drawLine(monsterRelativeX+15, monsterRelativeY+15, monsterRelativeX+30, monsterRelativeY+15);
					
					// Scar
					g.drawLine(monsterRelativeX+10, monsterRelativeY+35, monsterRelativeX+32, monsterRelativeY+29);	
				}
			}
			
			// Adult Alva sprites
			if(alvaFollow == true && entrystart == false)
			{
				g.setColor(Color.white);
				// Alva North Facing Sprite - Adult
				if(alvaDirection == 'N')
				{	
					g.setColor(Color.green);
					g.fillRect(RelativeX+9,RelativeY+9+50,32,9);
					g.setColor(Color.white);
					g.fillRect(RelativeX+9, RelativeY+18+50, 32, 23);
					
					g.setColor(Color.red);
					g.drawLine(RelativeX+20, RelativeY+15+50+5, RelativeX+10, RelativeY+20+50);					
					g.drawLine(RelativeX+20, RelativeY+15+50+5, RelativeX+15, RelativeY+35+50);
					g.drawLine(RelativeX+20, RelativeY+10+50+5, RelativeX+26, RelativeY+37+50);	
				}
				
				// Alva South Facing Sprite - Adult 
				if(alvaDirection == 'S')
				{
					g.setColor(Color.green);
					g.fillRect(RelativeX+9,RelativeY+32-50,32,9);
					g.setColor(Color.white);
					g.fillRect(RelativeX+9, RelativeY+9-50, 32, 23);
					
					//Scar
					g.setColor(Color.red);					
					g.drawLine(RelativeX+30, RelativeY+30-50, RelativeX+40, RelativeY+30-50);					
					g.drawLine(RelativeX+35, RelativeY+15-50, RelativeX+30, RelativeY+30-50);
					g.drawLine(RelativeX+24, RelativeY+13-50, RelativeX+30, RelativeY+35-50);	
				}

				// Alva West Facing Sprite - Adult
				if(alvaDirection == 'W')
				{
					g.setColor(Color.green);
					g.fillRect(RelativeX+9+50, RelativeY+9, 9,32 );
					g.setColor(Color.white);
					g.fillRect(RelativeX+18+50, RelativeY+9, 23, 32);
					
					//Scar
					
					g.setColor(Color.red);
					g.drawLine(RelativeX+20+50, RelativeY+30, RelativeX+20+50, RelativeY+40);					
					g.drawLine(RelativeX+20+50, RelativeY+30, RelativeX+35+50, RelativeY+35);					
					g.drawLine(RelativeX+15+50, RelativeY+30, RelativeX+37+50, RelativeY+24);	
				}
				
				// Alva East Facing Sprite - Adult
				if(alvaDirection == 'E')
				{
					g.setColor(Color.green);
					g.fillRect(RelativeX+32-50,RelativeY+9,9,32);
					g.setColor(Color.white);
					g.fillRect(RelativeX+9-50, RelativeY+9, 23, 32);
					
					// Scar
					g.setColor(Color.red);
					g.drawLine(RelativeX+30-50, RelativeY+10, RelativeX+30-50, RelativeY+20);					
					g.drawLine(RelativeX+30-50, RelativeY+20, RelativeX+15-50, RelativeY+15);
					g.drawLine(RelativeX+35-50, RelativeY+20, RelativeX+13-50, RelativeY+26);	
				}
			}
		}
		
		// Sprites for past time period
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			// Jackson Sprites
			
			// Jackson North Facing Sprite
			if (direction == 'N')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+10,RelativeY+10,30,10);
				g.setColor(Color.red);
				g.fillRect(RelativeX+10, RelativeY+20, 30, 20);
			}
			
			// Jackson South Facing Sprite
			if (direction == 'S')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+10,RelativeY+30,30,10);
				g.setColor(Color.red);
				g.fillRect(RelativeX+10, RelativeY+10, 30, 20);
			}
			
			// Jackson East Facing Sprite
			if (direction == 'E')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+30,RelativeY+10,10,30);
				g.setColor(Color.red);
				g.fillRect(RelativeX+10, RelativeY+10, 20, 30);
			}
			
			// Jackson West Facing Sprite
			if (direction == 'W')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+10, RelativeY+10, 10,30);
				g.setColor(Color.red);
				g.fillRect(RelativeX+20, RelativeY+10, 20, 30);
			}
			
			// If Alva is present in past
			if(alvaFollow == true && entrystart == false)
			{
				// Alva North Facing Sprite - Child
				if(alvaDirection == 'N')
				{	
					g.setColor(Color.green);
					g.fillRect(RelativeX+12,RelativeY+12+50,26,8);
					g.setColor(Color.white);
					g.fillRect(RelativeX+12, RelativeY+20+50, 26, 18);
					
					if(list.checkNightofHorrors() == true)
					{
						g.setColor(Color.red);
						g.drawLine(RelativeX+25, RelativeY+15+50+5, RelativeX+15, RelativeY+20+50);					
						g.drawLine(RelativeX+25, RelativeY+15+50+5, RelativeX+20, RelativeY+35+50);
						g.drawLine(RelativeX+25, RelativeY+10+50+5, RelativeX+31, RelativeY+37+50);	
					}
				}
			
				// Alva South Facing Sprite - Child
				if(alvaDirection == 'S')
				{
					g.setColor(Color.green);
					g.fillRect(RelativeX+12,RelativeY+30-50,26,8);
					g.setColor(Color.white);
					g.fillRect(RelativeX+12, RelativeY+12-50, 26, 18);
					
					if(list.checkNightofHorrors() == true)
					{
						//Scar
						g.setColor(Color.red);					
						g.drawLine(RelativeX+25, RelativeY+30-50, RelativeX+35, RelativeY+30-50);					
						g.drawLine(RelativeX+30, RelativeY+15-50, RelativeX+25, RelativeY+30-50);
						g.drawLine(RelativeX+19, RelativeY+13-50, RelativeX+25, RelativeY+35-50);	
					}
				}
								
				// Alva East Facing Sprite - Child
				if(alvaDirection == 'E')
				{
					g.setColor(Color.green);
					g.fillRect(RelativeX+30-50,RelativeY+12,8,26);
					g.setColor(Color.white);
					g.fillRect(RelativeX+12-50, RelativeY+12, 18, 26);
					
					if(list.checkNightofHorrors() == true)
					{
						g.setColor(Color.red);
						g.drawLine(RelativeX+30-50, RelativeY+15, RelativeX+30-50, RelativeY+25);					
						g.drawLine(RelativeX+30-50, RelativeY+25, RelativeX+15-50, RelativeY+20);
						g.drawLine(RelativeX+35-50, RelativeY+25, RelativeX+13-50, RelativeY+31);	
					}
				}
	
				// Alva West Facing Sprite - Child
				if(alvaDirection == 'W')
				{
					g.setColor(Color.green);
					g.fillRect(RelativeX+12+50, RelativeY+12, 8,26 );
					g.setColor(Color.white);
					g.fillRect(RelativeX+20+50, RelativeY+12, 18, 26);
					
					if(list.checkNightofHorrors() == true)
					{
						g.setColor(Color.red);
						g.drawLine(RelativeX+20+50, RelativeY+25, RelativeX+20+50, RelativeY+35);					
						g.drawLine(RelativeX+20+50, RelativeY+25, RelativeX+35+50, RelativeY+30);					
						g.drawLine(RelativeX+15+50, RelativeY+25, RelativeX+37+50, RelativeY+19);	
					}
				}
			}
		}				
	}
}