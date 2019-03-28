package choice;
import java.awt.*;
public class WoodFloorBackpack extends GameObject{

	List list;
	
	public WoodFloorBackpack (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
		this.list = list;
	}
	
	public void interactObject()
	{
		if(list.checkRetrieveBackpack() == false && list.checkNightMonster() == true)
		{
			list.actRetrieveBackpack();
			log.readDialogue(100);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		move = true;
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
		
		if(list.checkRetrieveBackpack() == false && list.checkNightMonster() == true)
		{
			move = false;
			g.setColor(Color.blue);
			g.fillRect(RelativeX+10, RelativeY+10, 30, 30);
			

			g.setColor(Color.ORANGE);
			g.fillRect(RelativeX+12, RelativeY+15, 5, 10);
			g.fillRect(RelativeX+22, RelativeY+15, 5, 10);
			

			g.setColor(Color.blue);
			g.fillRect(RelativeX+15, RelativeY+18, 3, 5);
			g.fillRect(RelativeX+25, RelativeY+18, 3, 5);

			

		}	

	}
}