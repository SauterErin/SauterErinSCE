package choice;
import java.awt.*;

public class NewGraveStone extends GameObject{
	
	List list;

	public NewGraveStone (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
		this.list = list;
	}

	public void interactObject()
	{
		// If after Father is burried
		if(list.checkNightofFire() == true)
			log.readDialogue(78);
	}
		
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		move = true;

		g.setColor(new Color(12, 104, 40));
		g.fillRect(RelativeX, RelativeY, 50, 50);

		// If Father is buried 
		if(list.checkNightofFire() == true)
		{
			move = false;
			g.setColor(Color.DARK_GRAY);
			g.fillRect(RelativeX, RelativeY, 50, 50);
			
			if(list.checkGift() == true)
			{	
				g.setColor(Color.CYAN);
				g.fillRect(RelativeX+25, RelativeY+25, 5, 5);
				g.setColor(Color.white);
				g.fillRect(RelativeX+25, RelativeY+35, 5, 5);
			}
		}
		
		// If in past 
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			move = true;
			g.setColor(new Color(87, 106, 54));
			g.fillRect(RelativeX, RelativeY, 50,50 );}
	}
}