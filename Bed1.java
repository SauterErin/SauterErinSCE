package choice;
import java.awt.*;
public class Bed1 extends GameObject{

	List list;
	
	public Bed1 (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
	}
	
	public void interacteObject()
	{

		if(list.checkYellowKey() == true)
			log.readDialogue(14);
		else
			log.readDialogue(0);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.green);
		g.fillRect(RelativeX, RelativeY, 50, 50);

		g.setColor(Color.white);
		g.fillRect(RelativeX, RelativeY, 10, 10);
		g.fillRect(RelativeX+40, RelativeY, 10, 10);

	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}