package choice;
import java.awt.*;

public class NewGraveStone extends GameObject{
	
	List list;

	public NewGraveStone (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
	}

	public void interactObject()
	{
		if(list.checkNightofFire() == true)
			log.readDialogue(78);
	}
		
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		move = false;

		g.setColor(Color.green);	
		g.fillRect(RelativeX, RelativeY, 50, 50);

		
		if(list.checkNightofFire() == true)
		{
			g.setColor(Color.DARK_GRAY);
			g.fillRect(RelativeX, RelativeY, 50, 50);
			
			g.setColor(Color.CYAN);
			g.fillRect(RelativeX+25, RelativeY+25, 5, 5);
			g.setColor(Color.white);
			g.fillRect(RelativeX+25, RelativeY+35, 5, 5);

		}
		
		if(gameinfo.currentyear == 2042){
			move = true;
			g.setColor(new Color(87, 106, 54));
		
			g.fillRect(RelativeX, RelativeY, 50,50 );}
	}
}