package choice;
import java.awt.*;
public class JacksonBed1 extends GameObject{

	List list;
	
	public JacksonBed1 (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
	}
	
	public void interactObject()
	{
		// In Past
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			// Go to Bed - Transtion to Night 2
			if(list.checkNightofHorrors() == false)
			{
				log.readDialogue(51);
			}
			
			// Jackson and Alva escaping 
			else
			{
				log.readDialogue(52);
			}
		}
		
		// In present 
		else
		{
			log.readDialogue(50);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			move = false;
			g.setColor(Color.white);
			g.fillRect(RelativeX, RelativeY, 50, 50);
		}
		
		if(gameinfo.getYear() == gameinfo.getPast())
		{
			g.setColor(Color.red);
			g.fillRect(RelativeX, RelativeY, 50, 50);
		}
	}
}