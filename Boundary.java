package choice;
import java.awt.*;
public class Boundary extends GameObject{

	List list;
	int testx = 0;
	int testy = 0;
	
	public Boundary (int x, int y, GameCalendar calen, List list, InteractionPanel inter)
	{
		super(x, y, calen, inter);
		move = false;
		this.list = list;
	}
	
	public void interacteObject()
	{
	}
	
	public void setTest(int newX, int newY){
		testx = newX*50+110;
		testy = newY*50+110;
	}
		
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.orange);
			
		
		g.fillRect(x, y, 50, 50);
	}
}
