package choice;
import java.awt.*;
public class Gate extends GameObject{
	
	public Gate (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		// If rescued Alva Ending 2 
		if(list.checkNightofFireRescue() == true)
		{
			log.readDialogue(147);
		}
		// If didn't rescue Alva Ending 1
		else
			log.readDialogue(130);
	}
	
	public void paintComponent(Graphics g)
	{		
		super.paintComponent(g);
			
		g.setColor(Color.white);	
		
		g.fillRect(RelativeX, RelativeY, 10,50 );
		g.fillRect(RelativeX+40, RelativeY, 10,50 );
		
		g.fillRect(RelativeX, RelativeY+35, 50,15 );
		
		g.setColor(Color.yellow);
		g.fillRect(RelativeX+20, RelativeY+15, 10,4);
	}
}