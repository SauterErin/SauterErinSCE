package choice;
import java.awt.*;
import javax.swing.*;

public class GameSprite extends JPanel {
	
	int x;
	int y;
	char direction;
	int AlvaX;
	int AlvaY;
	GameCalendar calen;
	int RelativeX = 0+110;
	int RelativeY = 0+110;
	boolean alvaFollow;
	boolean entrystart;

	public GameSprite(int x, int y, GameCalendar calen)
	{
		this.y = y;
		this.x = x;
		this.calen = calen;
		direction = 'w';
		alvaFollow = false;
		entrystart = false;
	}
	
	public int getX()
	{
		return x;
	}	
	
	public void changeX(int moveX)
	{
		AlvaX = x;
		x += moveX;
		entrystart = false;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void changeY(int moveY)
	{
		AlvaY = y;
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
		AlvaX = x;
		AlvaY = y;
		direction = newDirection;
		entrystart = true;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(calen.currentyear == 2052)
		{	if (direction == 'w')
			{
				g.setColor(Color.BLUE);
				g.fillRect(RelativeX+12,RelativeY+12,26,8);
				g.setColor(Color.GREEN);
				g.fillRect(RelativeX+12, RelativeY+17, 26, 18);
			}
			
			if (direction == 'd')
			{
				g.setColor(Color.BLUE);
				g.fillRect(RelativeX+31,RelativeY+12,8,26);
				g.setColor(Color.GREEN);
				g.fillRect(RelativeX+17, RelativeY+12, 18, 26);
			}
			
			if (direction == 's')
			{
				g.setColor(Color.blue);
				g.fillRect(RelativeX+12,RelativeY+31,26,8);
				g.setColor(Color.green);
				g.fillRect(RelativeX+12, RelativeY+15, 26, 18);
			}
			
			if (direction == 'a')
			{
				g.setColor(Color.BLUE);
				g.fillRect(RelativeX, RelativeY, 8,26 );
				g.setColor(Color.GREEN);
				g.fillRect(RelativeX+10, RelativeY, 18, 26);
			}
		}
		if(calen.currentyear == 2042)
		{
			if (direction == 'w')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+10,RelativeY+10,30,10);
				g.setColor(Color.red);
				g.fillRect(RelativeX+10, RelativeY+19, 30, 20);
			}
			
			if (direction == 'd')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+31,RelativeY+10,10,30);
				g.setColor(Color.red);
				g.fillRect(RelativeX+15, RelativeY+10, 20, 30);
			}
			
			if (direction == 's')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX+10,RelativeY+31,30,10);
				g.setColor(Color.red);
				g.fillRect(RelativeX+10, RelativeY+15, 30, 20);
			}
			
			if (direction == 'a')
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX, RelativeY+10, 10,30);
				g.setColor(Color.red);
				g.fillRect(RelativeX+10, RelativeY+10, 10, 30);
			}
			
			if(alvaFollow == true && entrystart == false)
			{
				g.setColor(Color.white);
				g.fillRect(AlvaX, AlvaY, 50,50);
			}
		}
	}

}
