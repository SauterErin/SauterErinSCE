package choice;
import java.awt.*;


public class GrassGuardW extends GameObject {

	List list;
	GameSprite sprite;
	
	public GrassGuardW(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
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
			g.setColor(Color.white);
			g.fillRect(RelativeX+8, RelativeY+8, 24, 34);
			g.setColor(Color.blue);
			g.fillRect(RelativeX+32, RelativeY+8, 10,34);
		}
	}
}