package choice;
import java.awt.*;
public class Test2 extends GameObject{

	List list;
	
	public Test2 (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, InteractionPanel inter, GameSprite sprite)
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
		
		g.setColor(Color.getHSBColor(235, 150, 23));
		
		if(calen.getRed() == true)
			g.setColor(Color.getHSBColor(235, 29, 70));
			
		
		g.fillRect(RelativeX, RelativeY, 50, 50);
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
