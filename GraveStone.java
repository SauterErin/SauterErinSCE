package choice;
import java.awt.*;

public class GraveStone extends GameObject{
	
	List list;

	public GraveStone (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
		this.list = list;
	}

	public void interactObject()
	{
		if(gameinfo.currentyear == gameinfo.gameyearpresent)
		{
			if(gameinfo.checkMonsterMode() == true)
				log.readDialogue(105);
		
			else
				log.readDialogue(72);
		}
	}
		
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		move = false;
		g.setColor(Color.DARK_GRAY);
		
		g.fillRect(RelativeX, RelativeY, 50, 50);
		
		if(list.checkMeetAlva() == true)
			{g.setColor(Color.CYAN);
			g.fillRect(RelativeX+25, RelativeY+25, 5, 5);}
		if(gameinfo.currentyear == 2042){
			move = true;
			g.setColor(new Color(87, 106, 54));
		
			g.fillRect(RelativeX, RelativeY, 50,50 );}
	}
}