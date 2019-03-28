package choice;
import java.awt.*;
public class RedCarpetNote extends GameObject{

	List list;
	
	public RedCarpetNote (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
		this.list = list;
	}
	
	public void interactObject()
	{
		if(list.checkNightofFire() == true && list.checkFinalPurpleKeyPass() == false)
		{
			list.actNote3();
			log.readDialogue(116);
		}
	}
	
	public void paintComponent(Graphics g)
	{		
		super.paintComponent(g);
		g.setColor(Color.getHSBColor(340, 96, 89));	
		
		if (gameinfo.returnYear() == gameinfo.gameyearpresent)
		{	
			g.setColor(Color.getHSBColor(0, 89, 78));
		}
		
		g.fillRect(RelativeX, RelativeY, 50,50);
		
		if(list.checkNightofFire() == true && list.checkFinalPurpleKeyPass() == false)
		{
			move = false;
			g.setColor(Color.magenta);
			g.fillRect(RelativeX+25, RelativeY+25, 4,4);
		}
		
		if(list.checkNightofFire() == true && list.checkNote3() == false)
		{
			g.setColor(Color.ORANGE);
			g.fillRect(RelativeX+15, RelativeY+15, 4,4);
		}
	}

}
