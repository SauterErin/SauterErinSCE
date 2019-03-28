package choice;
import java.awt.*;

import javax.swing.*;

public class GameSprite extends JPanel {
	
	int x;
	int y;
	char direction;
	char alvaDirection;
	int RelativeX = 0+110;
	GameMode gameinfo;
	int RelativeY = 0+110;
	boolean alvaFollow;
	boolean entrystart;
	boolean presentMonster;
	int monsterX = 0;
	int monsterY = 0;
	char monsterDirection = 'N';
	int monsterRelativeX;
	int monsterRelativeY;
	boolean carrying = false;

	public GameSprite(int x, int y, GameMode gameinfo)
	{
		this.y = y;
		this.x = x;
		this.gameinfo = gameinfo;
		direction = 'N';
		alvaFollow = false;
		entrystart = false;
	}
	
	public int getX()
	{
		return x;
	}	
	
	public void changeX(int moveX)
	{
		if (x+moveX < x)
			alvaDirection = 'W';
		else
			alvaDirection = 'E';
			
		x += moveX;
		entrystart = false;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void changeY(int moveY)
	{
		if (y+moveY < y)
			alvaDirection = 'N';
		else
			alvaDirection = 'S';
		y += moveY;
		entrystart = false;
	}
	
	public char checkDirection()
	{
		return direction;
	}
	
	public void changeDirection(char newDirection)
	{
		direction = newDirection;
	}
	
	public void changeMonsterX( int moveX)
	{
		monsterX =+ moveX;
	}
	
	public void changeMonsterY(int moveY)
	{
		monsterY =+ moveY;
	}
	
	public void changeMonsterDirection(char newDirection)
	{
		monsterDirection = newDirection;
	}
	
	public void setMonsterSprite(int newX, int newY, char newDirection)
	{
		monsterX = newX;
		monsterY = newY;
		monsterDirection = newDirection;
	}
	
	public void switchPresentMonster()
	{
		if(presentMonster == false)
			presentMonster = true;
		else
			presentMonster = false;
			
	}
	
	public void setGameSprite(int newX, int newY, char newDirection)
	{
		x = newX;
		y = newY;

		direction = newDirection;
		entrystart = true;
	}
	
	public void switchAlvaFollow()
	{
		if (alvaFollow == true)
		{
			alvaFollow = false;
		}
		
		else
		{	
			alvaFollow = true;
			entrystart = false;
		}
	}
		
	
	public void paintComponent(Graphics g)
	{

		monsterRelativeX = (monsterX-getX())*50+110;
		monsterRelativeY = (monsterY-getY())*50+110;
		
		super.paintComponent(g);
		if(gameinfo.currentyear == 2052)
		{	if (direction == 'N' && gameinfo.checkMonsterMode() == false)
			{
				g.setColor(Color.BLUE);
				g.fillRect(RelativeX+12,RelativeY+12,26,8);
				g.setColor(Color.GREEN);
				g.fillRect(RelativeX+12, RelativeY+20, 26, 18);
			}
		
			if (direction == 'N' && gameinfo.checkMonsterMode() == true)
			{
				g.setColor(Color.darkGray);
				g.fillRect(RelativeX-5,RelativeY-5, 60,60);
				
				//Red T
				g.setColor(Color.red);
				g.fillRect(RelativeX-5, RelativeY-5, 60, 5);
				g.fillRect(RelativeX+23, RelativeY-5, 4, 30);
				
				//Parallel With Top of T
				g.drawLine(RelativeX+15, RelativeY+15, RelativeX+5, RelativeY+15);
				g.drawLine(RelativeX+35, RelativeY+15, RelativeX+45, RelativeY+15);
				
				
				//Parallel with short part of T
				g.drawLine(RelativeX+15, RelativeY+15, RelativeX+10, RelativeY+30);
				g.drawLine(RelativeX+35, RelativeY+15, RelativeX+35, RelativeY+30);
				
				//Scar
				g.drawLine(RelativeX+15, RelativeY+10, RelativeX+21, RelativeY+32);	
				
				if(carrying == true)
				{
					g.setColor(Color.BLUE);
					g.fillRect(RelativeX+12,RelativeY+12,26,8);
					g.setColor(Color.GREEN);
					g.fillRect(RelativeX+12, RelativeY+20, 26, 18);
				}

			}
		
		
			
			if (direction == 'E' && gameinfo.checkMonsterMode() == false)
			{
				g.setColor(Color.BLUE);
				g.fillRect(RelativeX+30,RelativeY+12,8,26);
				g.setColor(Color.GREEN);
				g.fillRect(RelativeX+12, RelativeY+12, 18, 26);
			}
			
			if (direction == 'E' && gameinfo.checkMonsterMode() == true)
			{
				g.setColor(Color.darkGray);
				g.fillRect(RelativeX-5,RelativeY-5, 60,60);
				
				//Red T
				g.setColor(Color.red);
				g.fillRect(RelativeX+50, RelativeY-5, 5, 60);
				g.fillRect(RelativeX+25, RelativeY+24, 30, 4);
				
				//Parallel With Top of T
				g.drawLine(RelativeX+35, RelativeY+5, RelativeX+35, RelativeY+15);
				g.drawLine(RelativeX+35, RelativeY+35, RelativeX+35, RelativeY+45);
				
				
				//Parallel with short part of T
				g.drawLine(RelativeX+35, RelativeY+15, RelativeX+20, RelativeY+10);
				g.drawLine(RelativeX+35, RelativeY+35, RelativeX+20, RelativeY+35);
				
				//Scar
				g.drawLine(RelativeX+40, RelativeY+15, RelativeX+18, RelativeY+21);	
				
				if(carrying == true)
				{
					g.setColor(Color.BLUE);
					g.fillRect(RelativeX+30,RelativeY+12,8,26);
					g.setColor(Color.GREEN);
					g.fillRect(RelativeX+12, RelativeY+12, 18, 26);
				}
			}
			
			if (direction == 'S' && gameinfo.checkMonsterMode() == false)
			{
				g.setColor(Color.blue);
				g.fillRect(RelativeX+12,RelativeY+30,26,8);
				g.setColor(Color.green);
				g.fillRect(RelativeX+12, RelativeY+12, 26, 18);
			}
			
			if (direction == 'S' && gameinfo.checkMonsterMode() == true)
			{
				g.setColor(Color.darkGray);
				g.fillRect(RelativeX-5,RelativeY-5, 60,60);
				
				//Red T
				g.setColor(Color.red);
				g.fillRect(RelativeX-5, RelativeY+50, 60, 5);
				g.fillRect(RelativeX+23, RelativeY+25, 4, 30);
				
				//Parallel With Top of T
				g.drawLine(RelativeX+5, RelativeY+35, RelativeX+15, RelativeY+35);
				g.drawLine(RelativeX+35, RelativeY+35, RelativeX+45, RelativeY+35);
				
				
				//Parallel with short part of T
				g.drawLine(RelativeX+40, RelativeY+20, RelativeX+35, RelativeY+35);
				g.drawLine(RelativeX+15, RelativeY+20, RelativeX+15, RelativeY+35);
				
				//Scar
				g.drawLine(RelativeX+29, RelativeY+18, RelativeX+35, RelativeY+40);	
				
				
				if(carrying == true)
				{
					g.setColor(Color.blue);
					g.fillRect(RelativeX+12,RelativeY+30,26,8);
					g.setColor(Color.green);
					g.fillRect(RelativeX+12, RelativeY+12, 26, 18);
				}

			}
			
			if (direction == 'W' && gameinfo.checkMonsterMode() == false)
			{
				g.setColor(Color.BLUE);
				g.fillRect(RelativeX+12, RelativeY+12, 8,26 );
				g.setColor(Color.GREEN);
				g.fillRect(RelativeX+20, RelativeY+12, 18, 26);
			}
			
			if (direction == 'W' && gameinfo.checkMonsterMode() == true)
			{
				g.setColor(Color.darkGray);
				g.fillRect(RelativeX-5,RelativeY-5, 60,60);
				
				//Red T
				g.setColor(Color.red);
				g.fillRect(RelativeX-5, RelativeY-5, 5, 60);
				g.fillRect(RelativeX-5, RelativeY+23, 30, 4);
				
				//Parallel With Top of T
				g.drawLine(RelativeX+15, RelativeY+35, RelativeX+15, RelativeY+45);
				g.drawLine(RelativeX+15, RelativeY+5, RelativeX+15, RelativeY+15);
				
				
				//Parallel with short part of T
				g.drawLine(RelativeX+15, RelativeY+35, RelativeX+30, RelativeY+40);
				g.drawLine(RelativeX+15, RelativeY+15, RelativeX+30, RelativeY+15);
				
				//Scar
				g.drawLine(RelativeX+10, RelativeY+35, RelativeX+32, RelativeY+29);		
				
				if(carrying == true)
				{
					g.setColor(Color.BLUE);
					g.fillRect(RelativeX+12, RelativeY+12, 8,26 );
					g.setColor(Color.GREEN);
					g.fillRect(RelativeX+20, RelativeY+12, 18, 26);
				}

			}
			if(presentMonster == true)
			{
				if(monsterDirection == 'N')
				{
					g.setColor(Color.darkGray);
					g.fillRect(monsterRelativeX-5,monsterRelativeY-5, 60,60);
					
					//Red T
					g.setColor(Color.red);
					g.fillRect(monsterRelativeX-5, monsterRelativeY-5, 60, 5);
					g.fillRect(monsterRelativeX+23, monsterRelativeY-5, 4, 30);
					
					//Parallel With Top of T
					g.drawLine(monsterRelativeX+15, monsterRelativeY+15, monsterRelativeX+5, monsterRelativeY+15);
					g.drawLine(monsterRelativeX+35, monsterRelativeY+15, monsterRelativeX+45, monsterRelativeY+15);
					
					
					//Parallel with short part of T
					g.drawLine(monsterRelativeX+15, monsterRelativeY+15, monsterRelativeX+10, monsterRelativeY+30);
					g.drawLine(monsterRelativeX+35, monsterRelativeY+15, monsterRelativeX+35, monsterRelativeY+30);
					
					//Scar
					g.drawLine(monsterRelativeX+15, monsterRelativeY+10, monsterRelativeX+21, monsterRelativeY+32);	
				}
				
				if(monsterDirection == 'S')
				{
					g.setColor(Color.darkGray);
					g.fillRect(monsterRelativeX-5,monsterRelativeY-5, 60,60);
					
					//Red T
					g.setColor(Color.red);
					g.fillRect(monsterRelativeX-5, monsterRelativeY+50, 60, 5);
					g.fillRect(monsterRelativeX+23, monsterRelativeY+25+((y-monsterY)*25), 4, 30);
					
					//Parallel With Top of T
					g.drawLine(monsterRelativeX+5, monsterRelativeY+35, monsterRelativeX+15, monsterRelativeY+35);
					g.drawLine(monsterRelativeX+35, monsterRelativeY+35, monsterRelativeX+45, monsterRelativeY+35);
					
					
					//Parallel with short part of T
					g.drawLine(monsterRelativeX+40, monsterRelativeY+20, monsterRelativeX+35, monsterRelativeY+35);
					g.drawLine(monsterRelativeX+15, monsterRelativeY+20, monsterRelativeX+15, monsterRelativeY+35);
					
					//Scar
					g.drawLine(monsterRelativeX+29, monsterRelativeY+18, monsterRelativeX+35, monsterRelativeY+40);	

				}
				
				if(monsterDirection == 'E')
				{
					g.setColor(Color.darkGray);
					g.fillRect(monsterRelativeX-5+((monsterX-x)*50),monsterRelativeY-5+((monsterY-y)*50), 60,60);
					
					//Red T
					g.setColor(Color.red);
					g.fillRect(monsterRelativeX+50, monsterRelativeY-5, 5, 60);
					g.fillRect(monsterRelativeX+25, monsterRelativeY+24, 30, 4);
					
					//Parallel With Top of T
					g.drawLine(monsterRelativeX+35, monsterRelativeY+5, monsterRelativeX+35, monsterRelativeY+15);
					g.drawLine(monsterRelativeX+35, monsterRelativeY+35, monsterRelativeX+35, monsterRelativeY+45);
					
					
					//Parallel with short part of T
					g.drawLine(monsterRelativeX+35, monsterRelativeY+15, monsterRelativeX+20, monsterRelativeY+10);
					g.drawLine(monsterRelativeX+35, monsterRelativeY+35, monsterRelativeX+20, monsterRelativeY+35);
					
					//Scar
					g.drawLine(monsterRelativeX+40, monsterRelativeY+15, monsterRelativeX+18, monsterRelativeY+21);	
					
				}
				
				if(monsterDirection == 'W')
				{
					g.setColor(Color.darkGray);
					g.fillRect(monsterRelativeX-5,monsterRelativeY-5, 60,60);
					
					//Red T
					g.setColor(Color.red);
					g.fillRect(monsterRelativeX-5, monsterRelativeY-5, 5, 60);
					g.fillRect(monsterRelativeX-5, monsterRelativeY+23, 30, 4);
					
					//Parallel With Top of T
					g.drawLine(monsterRelativeX+15, monsterRelativeY+35, monsterRelativeX+15, monsterRelativeY+45);
					g.drawLine(monsterRelativeX+15, monsterRelativeY+5, monsterRelativeX+15, monsterRelativeY+15);
					
					
					//Parallel with short part of T
					g.drawLine(monsterRelativeX+15, monsterRelativeY+35, monsterRelativeX+30, monsterRelativeY+40);
					g.drawLine(monsterRelativeX+15, monsterRelativeY+15, monsterRelativeX+30, monsterRelativeY+15);
					
					//Scar
					g.drawLine(monsterRelativeX+10, monsterRelativeY+35, monsterRelativeX+32, monsterRelativeY+29);	
					
				}
			}
		}
		if(gameinfo.currentyear == 2042)
		{
			if (direction == 'N')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+10,RelativeY+10,30,10);
				g.setColor(Color.red);
				g.fillRect(RelativeX+10, RelativeY+20, 30, 20);
			}
			
			if (direction == 'E')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+30,RelativeY+10,10,30);
				g.setColor(Color.red);
				g.fillRect(RelativeX+10, RelativeY+10, 20, 30);
			}
			
			if (direction == 'S')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+10,RelativeY+30,30,10);
				g.setColor(Color.red);
				g.fillRect(RelativeX+10, RelativeY+10, 30, 20);
			}
			
			if (direction == 'W')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+10, RelativeY+10, 10,30);
				g.setColor(Color.red);
				g.fillRect(RelativeX+20, RelativeY+10, 20, 30);
			}
			
		}			
			
		if(alvaFollow == true && entrystart == false)
		{
			g.setColor(Color.white);
			
			if(alvaDirection == 'W')
			{
				g.setColor(Color.green);
				g.fillRect(RelativeX+12+50, RelativeY+12, 8,26 );
				g.setColor(Color.white);
				g.fillRect(RelativeX+20+50, RelativeY+12, 18, 26);
			}
			

			if(alvaDirection == 'E')
			{
				g.setColor(Color.green);
				g.fillRect(RelativeX+30-50,RelativeY+12,8,26);
				g.setColor(Color.white);
				g.fillRect(RelativeX+12-50, RelativeY+12, 18, 26);
			}
			

			if(alvaDirection == 'N')
			{	
				g.setColor(Color.green);
				g.fillRect(RelativeX+12,RelativeY+12+50,26,8);
				g.setColor(Color.white);
				g.fillRect(RelativeX+12, RelativeY+20+50, 26, 18);
								/*g.setColor(Color.green);
				g.fillRect(RelativeX+6,RelativeY+6+50,34,14);
				g.setColor(Color.white);
				g.fillRect(RelativeX+6, RelativeY+17+50, 34, 22)
								g.setColor(Color.red);

				g.drawLine(RelativeX+15, RelativeY+10, RelativeX+21, RelativeY+32);*/
				
				/*
				*/
			}
			

			if(alvaDirection == 'S')
			{
				g.setColor(Color.green);
				g.fillRect(RelativeX+12,RelativeY+30-50,26,8);
				g.setColor(Color.white);
				g.fillRect(RelativeX+12, RelativeY+12-50, 26, 18);
			}
		}

		
	}

	public boolean checkAlvaFollow() {
		return alvaFollow;
	}

	public void switchCarrying() {
		if(carrying == false)
		{
			carrying = true;
		}
		
		else
			carrying = false;
		
	}
		
}
