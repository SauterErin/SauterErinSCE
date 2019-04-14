package choice;
import java.awt.*;
public class Bed2 extends GameObject{
	
	public Bed2 (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);		
		move = false;
	}
	
	public void interactObject()
	{
		// If between releasing Alva and Start of Night 2 
		if(list.checkYellowKey() == true && list.checkNight2() == false && gameinfo.getYear() == gameinfo.getPresent())
		{
			log.readDialogue(14);
		}
		
		// If before releasing Alva/powerswitch press
		if(list.checkYellowKey() == false && gameinfo.getYear() == gameinfo.getPresent())
		{
			log.readDialogue(0);
		}
		
		// If before Will is captured - Night 2 
		if(list.checkNight2() == true && list.checkNightofFire() == false)
		{
			log.readDialogue(63);
		}
		
		// If during first exit in present
		if(list.checkNightofFire() == true && list.checkNightofFireRescue() == false)
		{
			log.readDialogue(70);
		}
		
		// If during rescue of Alva in present 
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
			g.fillRect(RelativeX, RelativeY, 50, 50);
	
			g.setColor(Color.white);
			g.fillRect(RelativeX+15, RelativeY+30, 20, 15);
			
			g.fillRect(RelativeX, RelativeY+40, 10, 10);
			g.fillRect(RelativeX+40, RelativeY+40, 10, 10);
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