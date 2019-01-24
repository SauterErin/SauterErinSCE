package choice;
import java.awt.*;
public class Boundary extends GameObject{

	List list;
	
	public Boundary (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, InteractionPanel inter, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, inter, sprite);
		move = false;
		this.list = list;
	}
	
	public void interacteObject()
	{
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.getHSBColor(235, 99, 23));
		
		if(calen.getRed() == true)
			g.setColor(Color.getHSBColor(100,92,145));
			
		
		g.fillRect(RelativeX, RelativeY, 50, 50);
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
