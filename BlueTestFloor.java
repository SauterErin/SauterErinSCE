package choice;

import java.awt.Color;
import java.awt.Graphics;

public class BlueTestFloor extends GameObject {

List list;
int testx = 0;
int testy = 0;
	
	public BlueTestFloor (int x, int y, GameCalendar calen, List list, InteractionPanel inter)
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
		g.setColor(Color.blue);
		g.fillRect(x, y, 50, 50);
	}
}
