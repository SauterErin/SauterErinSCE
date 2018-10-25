package choice;
import java.awt.*;
import javax.swing.*;

public class GameSprite extends JPanel {
	
	int x;
	int y;
	char direction;

	public GameSprite(int x, int y)
	{
		this.y = y;
		this.x = x;
		direction = 'w';
	}
	
	public int getX()
	{
		return (x-110)/50;
	}	
	
	public void changeX(int moveX)
	{
		x += moveX;
	}
	
	public int getY()
	{
		return (y-110)/50;
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
		x = 110+newX*50;
		y = 110+newY*50;
		direction = newDirection;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if (direction == 'w')
		{
			g.setColor(Color.BLUE);
			g.fillRect(x,y,50,10);
			g.setColor(Color.GREEN);
			g.fillRect(x, y+10, 50, 40);
		}
		
		if (direction == 'd')
		{
			g.setColor(Color.BLUE);
			g.fillRect(x+40,y,10,50);
			g.setColor(Color.GREEN);
			g.fillRect(x, y, 40, 50);
		}
		
		if (direction == 's')
		{
			g.setColor(Color.BLUE);
			g.fillRect(x,y+40,50,10);
			g.setColor(Color.GREEN);
			g.fillRect(x, y, 50, 40);
		}
		
		if (direction == 'a')
		{
			g.setColor(Color.BLUE);
			g.fillRect(x, y, 10,50);
			g.setColor(Color.GREEN);
			g.fillRect(x+10, y, 40, 50);
		}
	}
}
