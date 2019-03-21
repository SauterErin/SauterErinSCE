package choice;
import java.awt.*;


public class Piano2 extends GameObject {

	List list;
	GameSprite sprite;
	
	public Piano2(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interactObject()
	{		
		if(list.checkRedKey() == false)
			{list.switchRedKey();
			log.readDialogue(9);
			}
		else
			log.readDialogue(11);
		if(gameinfo.returnYear() == gameinfo.gameyearpast)
		{
			if(list.checkDoorHold1() == true)
			{
				if(list.checkHideRedKey() == false)
				{
					log.readDialogue(25);
				}
				
				else
				{
					log.readDialogue(26);
				}
			}
			
			else
			{
				log.readDialogue(27);
			}
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	
		if(gameinfo.currentyear == 2052)
		{
			if(list.checkRedKey() == true)
		
			{
				g.setColor(Color.black);
				g.fillRect(RelativeX, RelativeY+25, 50, 25);
				g.setColor(Color.white);
				g.fillRect(RelativeX, RelativeY, 50,25);
				g.setColor(Color.yellow);
				g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
			}
			else
			{
				g.setColor(Color.white);
				g.fillRect(RelativeX, RelativeY, 50,50);
			}
		}
		
		else{
			g.setColor(Color.black);
			g.fillRect(RelativeX, RelativeY+25, 50, 25);
			g.setColor(Color.white);
			g.fillRect(RelativeX, RelativeY, 50,25);
			g.setColor(Color.yellow);
			g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		}

		
	}

}