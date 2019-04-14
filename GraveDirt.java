package choice;
import java.awt.*;

public class GraveDirt extends GameObject{
	
	public GraveDirt (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
	}

	public void interactObject()
	{
		// If Father is buried
		if(list.checkNightofFire() == true)
			log.readDialogue(77);
	}
		
	public void paintComponent(Graphics g)
	{
		move = true;		
		super.paintComponent(g);
		
		// If Father is buried
		if(list.checkNightofFire() == true)
		{
			move = false;
			g.setColor(new Color(28, 68, 66));
		}
		
		// Present and Father isn't buried
		else
		{
			g.setColor(new Color(12, 104, 40));
		}
		
		g.fillRect(RelativeX, RelativeY, 50,50 );
		
		// If in past 
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			g.setColor(new Color(87, 106, 54));
		}
		
		g.fillRect(RelativeX, RelativeY, 50,50 );
	}
}