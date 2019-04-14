package choice;
import java.awt.*;
public class ClimbingWall extends GameObject{
	
	public ClimbingWall (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			// Haven't met Alva yet
			if(list.checkMeetAlva() == false)
			{
				log.readDialogue(17);
			}
			
			// Have met Alva
			if(list.checkMeetAlva() == true)
			{
				log.readDialogue(19);
			}
		}
		// If in present
		else
		{
			// Before Alva rescues Will
			if( list.checkNightMonster() == false)
			{
				log.readDialogue(62);
			}
			
			// If in present and after Alva rescues Will
			if( list.checkNightMonster() == true && list.checkNightofFireRescue() == false)
			{
				log.readDialogue(63);
			}
			
			// If in Present and during the attempt to rescue Alva
			if(list.checkNightofFireRescue() == true )
			{
				gameinfo.changeRoom(10);
				sprite.setGameSprite(1,1,'S');
			}
		}
	}
	
	public void paintComponent(Graphics g)
	{		
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		
		g.drawLine(RelativeX, RelativeY+10, RelativeX+49, RelativeY+10);
		g.drawLine(RelativeX, RelativeY+20, RelativeX+49, RelativeY+20);
		g.drawLine(RelativeX, RelativeY+30, RelativeX+49, RelativeY+30);
		g.drawLine(RelativeX, RelativeY+40, RelativeX+49, RelativeY+40);
		
		g.drawLine(RelativeX+15, RelativeY, RelativeX+15, RelativeY+10);
		g.drawLine(RelativeX+30, RelativeY, RelativeX+30, RelativeY+10);
		g.drawLine(RelativeX+20, RelativeY+10, RelativeX+20, RelativeY+20);
		g.drawLine(RelativeX+40, RelativeY+10, RelativeX+40, RelativeY+20);
		g.drawLine(RelativeX+15, RelativeY+20, RelativeX+15, RelativeY+30);
		g.drawLine(RelativeX+30, RelativeY+20, RelativeX+30, RelativeY+30);
		g.drawLine(RelativeX+20, RelativeY+30, RelativeX+20, RelativeY+40);
		g.drawLine(RelativeX+40, RelativeY+30, RelativeX+40, RelativeY+40);
		g.drawLine(RelativeX+15, RelativeY+40, RelativeX+15, RelativeY+49);
		g.drawLine(RelativeX+30, RelativeY+40, RelativeX+30, RelativeY+49);

		// Past
		g.setColor(new Color(218, 106, 16)); 
		
		// Present
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(new Color(244, 169, 108));
		}
		
		// Burning building
		if(list.checkNightofFireRescue() == true)
		{
			g.setColor(new Color(244, 144, 108));
		}
		
		// If returned to burning building
		if(list.checkNightofFireRescue() == true)
		{
			g.setColor(new Color(244, 119, 108));
		}
		
		g.fillRect(RelativeX+1, RelativeY+1, 14,9 );
		g.fillRect(RelativeX+1, RelativeY+21, 14,9 );
		g.fillRect(RelativeX+1, RelativeY+41, 14,9 );
		
		g.fillRect(RelativeX+16, RelativeY+1, 14,9);
		g.fillRect(RelativeX+16, RelativeY+21, 14,9);
		g.fillRect(RelativeX+16, RelativeY+41, 14,9);
		
		g.fillRect(RelativeX+31, RelativeY+1, 19, 9 );
		g.fillRect(RelativeX+31, RelativeY+21, 19,9 );
		g.fillRect(RelativeX+31, RelativeY+41, 19,9 );

		g.fillRect(RelativeX+1, RelativeY+11, 19,9);
		g.fillRect(RelativeX+1, RelativeY+31, 19,9);

		g.fillRect(RelativeX+21, RelativeY+11, 19,9);
		g.fillRect(RelativeX+21, RelativeY+31, 19,9);

		g.fillRect(RelativeX+41, RelativeY+11, 9,9);
		g.fillRect(RelativeX+41, RelativeY+31, 9,9);		
		
		// If in past - or post Rescue draw Rope 
		if (gameinfo.getYear() == gameinfo.getPast() || list.checkRescueComplete() == true)
		{	
			g.setColor(new Color(50, 31, 16));

			g.drawLine(RelativeX+20, RelativeY, RelativeX+20, RelativeY+49);
			g.drawLine(RelativeX+21, RelativeY, RelativeX+21, RelativeY+49);
			g.drawLine(RelativeX+22, RelativeY, RelativeX+22, RelativeY+49);
			g.drawLine(RelativeX+23, RelativeY, RelativeX+23, RelativeY+49);
		}
	}
}
