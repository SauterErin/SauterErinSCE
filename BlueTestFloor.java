package choice;

import java.awt.Color;
import java.awt.Graphics;

public class BlueTestFloor extends GameObject {

List list;
	
	public BlueTestFloor (int x, int y, GameCalendar calen, List list, InteractionPanel inter, GameSprite sprite)
	{
		super(x, y, calen ,inter, sprite);
		move = true;
		this.list = list;
	}

	public void interacteObject() 
	{
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillRect(RelativeX, RelativeY, 50, 50);
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
