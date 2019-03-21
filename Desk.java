package choice;
import java.awt.*;


public class Desk extends GameObject {

	List list;
	GameSprite sprite;
	
	public Desk(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interactObject()
	{		
		if(gameinfo.getRoom() == 6)
		{
			if(list.checkYellowKey() == false)
			{	
				log.readDialogue(6);
			}
		}
		
		if (gameinfo.getRoom() == 13)
		{
			if(list.checkRetrieveScrewdriver() == false)
			{
				log.readDialogue(29);
			}
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
				
		g.setColor(Color.magenta);
		g.fillRect(RelativeX, RelativeY, 50,50);

			if(gameinfo.getRoom() == 6)
			{
				if(list.checkYellowKey() == false)
			
				{
					g.setColor(Color.yellow);	
				}
				
				else
				{
					g.setColor(Color.white);	
				}
					g.fillRect(RelativeX+15, RelativeY, 10,10 );
			}
			
			if(gameinfo.getRoom() == 13)
			{
				System.out.println("Ready");
				if(list.checkRetrieveScrewdriver() == false)
				{
					g.setColor(Color.white);
					g.fillRect(RelativeX+5, RelativeY+5, 3, 3);
					g.setColor(Color.black);
					g.fillRect(RelativeX+6, RelativeY+9, 1, 3);
				}
			}
			
			if(gameinfo.getRoom() == 14)
			{
				g.setColor(Color.black);
				{
					g.drawLine(RelativeX+7, RelativeY, RelativeX+10, RelativeY +15);
					g.drawLine(RelativeX+2, RelativeY+9, RelativeX+42, RelativeY + 38);
					g.drawLine(RelativeX+12, RelativeY+19, RelativeX+9, RelativeY + 41);
					g.drawLine(RelativeX+15, RelativeY+13, RelativeX+17, RelativeY + 31);
				}
			}

	}
}