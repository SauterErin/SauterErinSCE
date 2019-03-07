package choice;
import java.awt.*;


public class MonsterGrass extends GameObject {

	List list;
	GameSprite sprite;
	
	public MonsterGrass(int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = true;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interacteObject()
	{	
		
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if(calen.returnYear() == calen.gameyearpresent)
			g.setColor(Color.green);	
		else
			g.setColor(new Color(87, 106, 54));
		g.fillRect(RelativeX, RelativeY, 50,50 );
		
		if(list.checkEscape() == true && list.checkMeetAlva() == false)
		{
			g.setColor(Color.black);
			g.fillRect(RelativeX, RelativeY, 50,50 );
		}
	}
}