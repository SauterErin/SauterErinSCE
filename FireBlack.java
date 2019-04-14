package choice;
import java.awt.*;
public class FireBlack extends GameObject{
	
	public FireBlack (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		// If after Father burial/Will trying to escape
		if(list.checkNightofFire() == true)
		{
			move = false;
			g.setColor(Color.orange);
			g.fillRect(RelativeX, RelativeY, 50, 50);
			g.setColor(Color.red);
			g.fillRect(RelativeX+10, RelativeY+10, 30,30);
			g.setColor(Color.yellow);
			g.fillRect(RelativeX+20, RelativeY+20, 10,10);
		}
	}
}