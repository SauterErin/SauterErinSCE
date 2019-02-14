package choice;
import java.awt.*;


public class Grass extends GameObject {

	List list;
	GameSprite sprite;
	
	public Grass(int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = true;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interacteObject()
	{	
		
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if(calen.returnYear() == calen.gameyearpresent)
			g.setColor(Color.green);	
		else
			g.setColor(new Color(87, 106, 54));
		g.fillRect(RelativeX, RelativeY, 50,50 );
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}