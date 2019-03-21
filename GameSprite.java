package choice;
import java.awt.*;

import javax.swing.*;

public class GameSprite extends JPanel {
	
	int x;
	int y;
	char direction;
	char alvaDirection;	int RelativeX = 0+110;
	GameMode gameinfo;
	int RelativeY = 0+110;
	boolean alvaFollow;
	boolean entrystart;

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
		System.out.println(alvaFollow);
		super.paintComponent(g);
		if(gameinfo.currentyear == 2052)
		{	if (direction == 'N')
			{
				g.setColor(Color.BLUE);
				g.fillRect(RelativeX+12,RelativeY+12,26,8);
				g.setColor(Color.GREEN);
				g.fillRect(RelativeX+12, RelativeY+17, 26, 18);
			}
		
		
			
			if (direction == 'E')
			{
				g.setColor(Color.BLUE);
				g.fillRect(RelativeX+31,RelativeY+12,8,26);
				g.setColor(Color.GREEN);
				g.fillRect(RelativeX+17, RelativeY+12, 18, 26);
			}
			
			if (direction == 'S')
			{
				g.setColor(Color.blue);
				g.fillRect(RelativeX+12,RelativeY+31,26,8);
				g.setColor(Color.green);
				g.fillRect(RelativeX+12, RelativeY+15, 26, 18);
			}
			
			if (direction == 'W')
			{
				g.setColor(Color.BLUE);
				g.fillRect(RelativeX, RelativeY, 8,26 );
				g.setColor(Color.GREEN);
				g.fillRect(RelativeX+10, RelativeY, 18, 26);
			}
		}
		if(gameinfo.currentyear == 2042)
		{
			if (direction == 'N')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+10,RelativeY+10,30,10);
				g.setColor(Color.red);
				g.fillRect(RelativeX+10, RelativeY+19, 30, 20);
			}
			
			if (direction == 'E')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+31,RelativeY+10,10,30);
				g.setColor(Color.red);
				g.fillRect(RelativeX+15, RelativeY+10, 20, 30);
			}
			
			if (direction == 'S')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+10,RelativeY+31,30,10);
				g.setColor(Color.red);
				g.fillRect(RelativeX+10, RelativeY+15, 30, 20);
			}
			
			if (direction == 'W')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX, RelativeY+10, 10,30);
				g.setColor(Color.red);
				g.fillRect(RelativeX+10, RelativeY+10, 10, 30);
			}
			
		}			
			
		if(alvaFollow == true && entrystart == false)
		{
			g.setColor(Color.white);
			
			if(alvaDirection == 'W')
			{
				g.setColor(Color.green);
				g.fillRect(RelativeX+50+19, RelativeY, 8,26 );
				g.setColor(Color.white);
				g.fillRect(RelativeX+50+33, RelativeY, 18, 26);
			}
			

			if(alvaDirection == 'E')
			{
				g.setColor(Color.green);
				g.fillRect(RelativeX+31-50,RelativeY+12,8,26);
				g.setColor(Color.white);
				g.fillRect(RelativeX+17-50, RelativeY+12, 18, 26);
			}
			

			if(alvaDirection == 'N')
			{	
				g.setColor(Color.green);
				g.fillRect(RelativeX+12,RelativeY+12+50,26,8);
				g.setColor(Color.white);
				g.fillRect(RelativeX+12, RelativeY+17+50, 26, 18);
								/*g.setColor(Color.green);
				g.fillRect(RelativeX+6,RelativeY+6+50,34,14);
				g.setColor(Color.white);
				g.fillRect(RelativeX+6, RelativeY+17+50, 34, 22)
								g.setColor(Color.red);

				g.drawLine(RelativeX+15, RelativeY+10, RelativeX+21, RelativeY+32);*/
				
				/*
				g.setColor(Color.darkGray);
				g.fillRect(RelativeX-5,RelativeY-5, 60,60);
				g.setColor(Color.red);
				g.fillRect(RelativeX-5, RelativeY-5, 60, 5);
				g.fillRect(RelativeX+28, RelativeY-5, 5, 30);
				g.drawLine(RelativeX+15, RelativeY+15, RelativeX+5, RelativeY+15);
				g.drawLine(RelativeX+45, RelativeY+15, RelativeX+55, RelativeY+15);
				g.drawLine(RelativeX+15, RelativeY+15, RelativeX+10, RelativeY+30);
				g.drawLine(RelativeX+45, RelativeY+15, RelativeX+45, RelativeY+30);
				g.drawLine(RelativeX+15, RelativeY+10, RelativeX+21, RelativeY+32);*/
			}
			

			if(alvaDirection == 'S')
			{
				g.setColor(Color.green);
				g.fillRect(RelativeX+12,RelativeY+31-50,26,8);
				g.setColor(Color.white);
				g.fillRect(RelativeX+12, RelativeY+15-50, 26, 18);
			}
		}

		
	}

	public boolean checkAlvaFollow() {
		return alvaFollow;
	}
		
}
