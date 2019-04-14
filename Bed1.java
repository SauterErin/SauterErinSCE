package choice;
import java.awt.*;
public class Bed1 extends GameObject{
	
	public Bed1 (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);		
		move = false;
	}
	
	public void interactObject()
	{
		// If before Night 2 - and Will has released Alva/pressed power switch
		if(list.checkEscape() == true && list.checkNight2() == false && gameinfo.getYear() == gameinfo.getPresent())
		{	
			log.readDialogue(14);
		}
		
		// If Player hasn't pressed power switch
		if(list.checkEscape() == false)
		{
			log.readDialogue(0);
		}
		
		// If during Night 2
		if(list.checkNight2() == true && list.checkNightofFire() == false)
		{
			log.readDialogue(69);
		}
		
		// If during first escape attempt in the present
		if(list.checkNightofFire() == true && list.checkNightofFireRescue() == false)
		{
			log.readDialogue(70);
		}
		
		// If during the attempt to rescue Alva
		if(list.checkNightofFireRescue() == true)
		{
			log.readDialogue(71);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		// If in present 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			move = false;
			g.setColor(new Color(12,196,221));	
			g.fillRect(RelativeX, RelativeY, 50,50);
		}
		
		// If in past
		else 
		{
			move = true;
			// Color Instructions - Past 
			g.setColor(new Color(96,45, 6));	
				
			g.fillRect(RelativeX, RelativeY+1, 50,16 );
			g.fillRect(RelativeX, RelativeY+18, 50,16 );
			g.fillRect(RelativeX, RelativeY+34, 50,16 );			

			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY, RelativeX+50, RelativeY);
			g.drawLine(RelativeX, RelativeY+50, RelativeX+50, RelativeY+50);		
			g.drawLine(RelativeX, RelativeY+17, RelativeX+50, RelativeY+17);
			g.drawLine(RelativeX, RelativeY+33, RelativeX+50, RelativeY+33);
		}
	}
}