package choice;
import java.awt.*;
public class ClimbingWall extends GameObject{

	List list;
	
	public ClimbingWall (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
	}
	
	public void interactObject()
	{
		if(gameinfo.returnYear() == gameinfo.gameyearpast && list.checkMeetAlva() == false)
		{
			log.readDialogue(17);
		}
		
		if(gameinfo.returnYear() == gameinfo.gameyearpast && list.checkMeetAlva() == true)
		{
			log.readDialogue(19);
		}
		
		if(gameinfo.returnYear() == gameinfo.gameyearpresent & list.checkNightofFire() == false &list.checkAlvaRampage() == false)
		{
			log.readDialogue(62);
		}
		
		if(gameinfo.returnYear() == gameinfo.gameyearpresent & list.checkNightofFire() == false &list.checkAlvaRampage() == true)
		{
			log.readDialogue(63);
		}
		
		if(gameinfo.returnYear() == gameinfo.gameyearpresent & list.checkNightofFire() == true &list.checkAlvaRampage() == true)
		{
			
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

		g.setColor(Color.getHSBColor(245, 34, 133));	
		if(gameinfo.getRed() == true)
			g.setColor(Color.getHSBColor(87, 34, 70));
			
		
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
		
		if (gameinfo.returnYear() == gameinfo.gameyearpast || list.checkAlvaRampage() == true)
		{	g.setColor(Color.getHSBColor(169, 104, 54));

			g.drawLine(RelativeX+20, RelativeY, RelativeX+20, RelativeY+49);
			g.drawLine(RelativeX+21, RelativeY, RelativeX+21, RelativeY+49);
			g.drawLine(RelativeX+22, RelativeY, RelativeX+22, RelativeY+49);
			g.drawLine(RelativeX+23, RelativeY, RelativeX+23, RelativeY+49);
		}

	}

}
