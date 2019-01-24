package choice;
import java.awt.*;
import javax.swing.*;

public class GameSprite extends JPanel {
	
	int x;
	int y;
	char direction;
	int RelativeX = 0+110;
	int RelativeY = 0+110;

	public GameSprite(int x, int y)
	{
		this.y = y;
		this.x = x;
		direction = 'w';
	}
	
	public int getX()
	{
		return x;
	}	
	
	public void changeX(int moveX)
	{
		x += moveX;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void changeY(int moveY)
	{
		y += moveY;
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
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if (direction == 'w')
		{
			g.setColor(Color.BLUE);
			g.fillRect(RelativeX,RelativeY,50,10);
			g.setColor(Color.GREEN);
			g.fillRect(RelativeX, RelativeY+10, 50, 40);
		}
		
		if (direction == 'd')
		{
			g.setColor(Color.BLUE);
			g.fillRect(RelativeX+40,RelativeY,10,50);
			g.setColor(Color.GREEN);
			g.fillRect(RelativeX, RelativeY, 40, 50);
		}
		
		if (direction == 's')
		{
			g.setColor(Color.BLUE);
			g.fillRect(RelativeX,RelativeY+40,50,10);
			g.setColor(Color.GREEN);
			g.fillRect(RelativeX, RelativeY, 50, 40);
		}
		
		if (direction == 'a')
		{
			g.setColor(Color.BLUE);
			g.fillRect(RelativeX, RelativeY, 10,50);
			g.setColor(Color.GREEN);
			g.fillRect(RelativeX+10, RelativeY, 40, 50);
		}
	}
}
