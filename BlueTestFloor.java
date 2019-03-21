package choice;

import java.awt.Color;
import java.awt.Graphics;

public class BlueTestFloor extends GameObject {

List list;
	
	public BlueTestFloor (int x, int y, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(x, y, gameinfo ,log, list, sprite);
		move = true;
		this.list = list;
	}

	public void interactObject() 
	{
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillRect(RelativeX, RelativeY, 50, 50);
	}
}
