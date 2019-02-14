package choice;
import java.awt.*;


public class Piano extends GameObject {

	List list;
	GameSprite sprite;
	
	public Piano(int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interacteObject()
	{		
		if(list.checkRedKey() == false)
			list.switchRedKey();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
				
		g.setColor(Color.white);
		g.fillRect(RelativeX, RelativeY, 50,50);
		
		g.setColor(Color.yellow);	
		
		
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}