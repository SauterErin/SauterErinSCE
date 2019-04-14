package choice;
import java.awt.*;


public class GrassGuardE extends GameObject {
	
	public GrassGuardE(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
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
		
		//Present Grass colors 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(new Color(12, 104, 40));
		}
		
		//Past Grass Colors
		else
		{
			g.setColor(new Color(87, 106, 54));
		}
		g.fillRect(RelativeX, RelativeY, 50,50 );
		
		// IE - Capture Jackson Flag 
		if(list.checkRetrieveGreenKey() == true && list.checkNightMonster() == false)
		{
			g.setColor(Color.white);
			g.fillRect(RelativeX+18, RelativeY+8, 24, 34);
			g.setColor(Color.blue);
			g.fillRect(RelativeX+8, RelativeY+8, 10,34);
		}
	}
}