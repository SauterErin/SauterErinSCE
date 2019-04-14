package choice;
import java.awt.*;
public class RedCarpetNote extends GameObject{
	
	public RedCarpetNote (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
	}
	
	public void interactObject()
	{
		// If Will is escaping and hasn't gotten the purple key yet
		if(list.checkNightofFire() == true && list.checkFinalPurpleKeyPass() == false)
		{
			list.actNote3();
			log.readDialogue(116);
		}
	}
	
	public void paintComponent(Graphics g)
	{		
		move = true;
		super.paintComponent(g);
		g.setColor(new Color(84, 0, 31));	
		
		if (gameinfo.getYear() == gameinfo.getPresent())
		{	
			g.setColor(new Color(255, 128, 174));
		}
		
		g.fillRect(RelativeX, RelativeY, 50,50);
		
		// If Will hasn't picked up the key
		if(list.checkNightofFire() == true && list.checkFinalPurpleKeyPass() == false)
		{
			move = false;
			g.setColor(new Color(51, 5, 66));
			g.fillRect(RelativeX+25, RelativeY+25, 4,4);
		}
		
		// If Will hasn't read Alva's note
		if(list.checkNightofFire() == true && list.checkNote3() == false)
		{
			g.setColor(Color.ORANGE);
			g.fillRect(RelativeX+15, RelativeY+15, 4,4);
		}
	}
}