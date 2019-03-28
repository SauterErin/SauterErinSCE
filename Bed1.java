package choice;
import java.awt.*;
public class Bed1 extends GameObject{

	List list;
	
	public Bed1 (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
	}
	
	public void interactObject()
	{
		if(list.checkYellowKey() == true && list.checkNight2() == false && gameinfo.currentyear == 2052)
			log.readDialogue(14);
		if(list.checkYellowKey() == false && gameinfo.currentyear == 2052 )
			log.readDialogue(0);
		if(list.checkNight2() == true && list.checkNightofFire() == false)
		{
			log.readDialogue(69);
		}
		
		if(list.checkNightofFire() == true && list.checkNightofFireRescue() == false)
		{
			log.readDialogue(70);
		}
		
		if(list.checkNightofFireRescue() == true)
		{
			log.readDialogue(71);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		if(gameinfo.currentyear == 2052)
		{
			move = false;
			g.setColor(Color.blue);
			g.fillRect(RelativeX, RelativeY, 50,50);
		}
		
		if(gameinfo.currentyear == 2042)

		{
			move = true;
			g.setColor(new Color(121,94, 32));
				
			
			
			g.fillRect(RelativeX, RelativeY+1, 50,16 );
			g.fillRect(RelativeX, RelativeY+18, 50,16 );
			g.fillRect(RelativeX, RelativeY+34, 50,16 );
			

			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY, RelativeX+50, RelativeY);
			g.drawLine(RelativeX, RelativeY+50, RelativeX+50, RelativeY+50);
			
			g.drawLine(RelativeX, RelativeY+17, RelativeX+50, RelativeY+17);
			g.drawLine(RelativeX, RelativeY+33, RelativeX+50, RelativeY+33);
			
		}

	}

	
	
}