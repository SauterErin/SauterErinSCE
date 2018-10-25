package choice;
import java.awt.*;

public class RedTestFloor extends GameObject {
	List list;
	int testx = 0;
	int testy = 0;
	public RedTestFloor (int x, int y, GameCalendar calen, List list, InteractionPanel inter)
	{
		super(x, y, calen ,inter);
		move = true;
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
		g.setColor(Color.red);
		g.fillRect(testx, testy, 50, 50);
	}
}
