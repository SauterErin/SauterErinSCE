package choice;
import java.awt.*;


public class GrassGuardN extends GameObject {

	List list;
	GameSprite sprite;
	
	public GrassGuardN(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interactObject()
	{	
		
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if(gameinfo.returnYear() == gameinfo.gameyearpresent)
			g.setColor(Color.green);	
		else
			g.setColor(new Color(87, 106, 54));
		g.fillRect(RelativeX, RelativeY, 50,50 );
		
		if(list.checkRetrieveGreenKey() == true && list.checkAlvaRampage() == false)
		{
			g.setColor(Color.blue);
			g.fillRect(RelativeX+8, RelativeY+8, 34, 10);
			g.setColor(Color.white);
			g.fillRect(RelativeX+8, RelativeY+18, 34,24);
		}
	}
}