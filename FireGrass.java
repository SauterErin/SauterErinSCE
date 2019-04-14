package choice;
import java.awt.*;

public class FireGrass extends GameObject {
	
	public FireGrass(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
	}
			
	public void interactObject()
	{	
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// Present Colors
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(new Color(12, 104, 40));
		}
		
		// Past Colors
		else
		{
			g.setColor(new Color(87, 106, 54));
		}
		
		g.fillRect(RelativeX, RelativeY, 50,50 );
		
		// If after Father burial/Will trying to escape
		if(list.checkNightofFire() == true)
		{
			move = false;
			g.setColor(Color.orange);
			g.fillRect(RelativeX, RelativeY, 50, 50);
			g.setColor(Color.red);
			g.fillRect(RelativeX+10, RelativeY+10, 30,30);
			g.setColor(Color.yellow);
			g.fillRect(RelativeX+20, RelativeY+20, 10,10);
		}
	}
}