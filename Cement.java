package choice;
import java.awt.*;

public class Cement extends GameObject{
	
	public Cement(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
	}
			
	public void interactObject()
	{	
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.gray);
		g.fillRect(RelativeX, RelativeY, 50,50 );
	}
}