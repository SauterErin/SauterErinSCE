package choice;
import java.awt.*;
public class WoodFloorPurpleKey extends GameObject{
	
	public WoodFloorPurpleKey (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
	}
	
	public void interactObject()
	{
		// Alva hasn't picked up key - prior to Will's escape attempt
		if(list.checkBurial() == false)
		{
			log.readDialogue(110);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		move = true;
		
		// Color Instructions - Past 
		g.setColor(new Color(96,45, 6));	
		
		// Color instructions - Present 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(new Color(220, 166, 132));
		}		
		g.fillRect(RelativeX, RelativeY+1, 50,16 );
		g.fillRect(RelativeX, RelativeY+18, 50,16 );
		g.fillRect(RelativeX, RelativeY+34, 50,16 );

		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+50, RelativeY);
		g.drawLine(RelativeX, RelativeY+50, RelativeX+50, RelativeY+50);
		
		g.drawLine(RelativeX, RelativeY+17, RelativeX+50, RelativeY+17);
		g.drawLine(RelativeX, RelativeY+33, RelativeX+50, RelativeY+33);
		
		// Scene changes before pick up - Purple Key on ground 
		if(list.checkBurial() == false)
		{
			move = false;
			g.setColor(new Color(51, 5, 66));
			g.fillRect(RelativeX+10, RelativeY+10, 5, 5);
		}	
		
		// Transition from boards to fire 
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