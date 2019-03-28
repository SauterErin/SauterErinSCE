package choice;
import java.awt.*;

public class GraveDirt extends GameObject{
	
	List list;

	public GraveDirt (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
		this.list = list;
	}

	public void interactObject()
	{
		if(list.checkNightofFire() == true)
			log.readDialogue(77);
	}
		
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		move = true;		
		if(list.checkNightofFire() == true)
		{
			move = false;
			g.setColor(new Color(28, 68, 66));
		}
		else
			g.setColor(Color.green);
		
		g.fillRect(RelativeX, RelativeY, 50,50 );
		
		if(gameinfo.currentyear == 2042){
			move = true;
			g.setColor(new Color(87, 106, 54));
		
			g.fillRect(RelativeX, RelativeY, 50,50 );}
	}
}