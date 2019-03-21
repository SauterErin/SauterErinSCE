package choice;
import java.awt.*;
public class FloorHole extends GameObject{

	List list;
	
	public FloorHole (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
	}
	
	public void interactObject()
	{
		if(gameinfo.checkMonsterMode() == true)
		{	
			log.readDialogue(39);
		}
		
		else
		{
			log.readDialogue(40);
		}
	}
	
	public void paintComponent(Graphics g)
	{		

		super.paintComponent(g);

		g.setColor(new Color(96,45, 6));	
		if(gameinfo.returnYear() == gameinfo.gameyearpast)
			g.setColor(new Color(121,94, 32));
			
		
		
		
		g.fillRect(RelativeX, RelativeY+1, 50,16 );
		g.fillRect(RelativeX, RelativeY+18, 50,16 );
		g.fillRect(RelativeX, RelativeY+34, 50,16 );
		

		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+50, RelativeY);
		g.drawLine(RelativeX, RelativeY+50, RelativeX+50, RelativeY+50);
		
		g.drawLine(RelativeX, RelativeY+17, RelativeX+50, RelativeY+17);
		g.drawLine(RelativeX, RelativeY+33, RelativeX+50, RelativeY+33);
		
		if(gameinfo.returnYear() == gameinfo.gameyearpresent)
			{
				g.setColor(Color.black);
				g.fillRect(RelativeX+10, RelativeY+10, 30,30);
				g.setColor(Color.green);
				
				g.fillRect(RelativeX+15, RelativeY+19, 2,2);
				g.fillRect(RelativeX+22, RelativeY+28, 2,2);
				g.fillRect(RelativeX+19, RelativeY+35, 2,2);
			}
	}
	
}
