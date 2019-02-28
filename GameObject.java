package choice;
import java.awt.*;
import javax.swing.*;

abstract class GameObject extends JPanel {
	protected int x;
	protected int y;
	protected int RelativeX;
	protected int RelativeY;
	protected boolean move;
	protected int counterday1;
	protected int counterday2;
	public GameCalendar calen;
	protected Dialogue log;
	protected GameSprite sprite;
	
	public GameObject (int x, int y, GameCalendar calen, Dialogue log, GameSprite sprite)
	{
		this.x = x;
		this.y = y;
		RelativeX = 0;
		RelativeY = 0;
		boolean move;
		int counterday1 = 0;
		int counterday2 = 0;
		this.calen = calen;
		this.log = log;
		this.sprite = sprite;
	}
	
	public boolean checkMove ()
	{
		return move;
	}
	
	abstract void interacteObject();
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}	
	public int RetrieveRelativeX()
	{
		return (RelativeX-110)/50;
	}
	
	public int RetrieveRelativeY()
	{
		return (RelativeY-110)/50;
	}
	
	public void setRelative()
	{
		RelativeX = (x-sprite.getX())*50+110;
		RelativeY = (y-sprite.getY())*50+110;
	}
}
