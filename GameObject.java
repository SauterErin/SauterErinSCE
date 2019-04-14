package choice;
import java.awt.*;

import javax.swing.*;

abstract class GameObject extends JPanel{
	protected boolean move;

	protected int RelativeX;
	protected int RelativeY;
	protected int x;
	protected int y;
	
	public GameMode gameinfo;
	public List list;
	protected Dialogue log;
	protected GameSprite sprite;
	
	public GameObject (int x, int y, GameMode gameinfo, Dialogue log, List list, GameSprite sprite)
	{
		this.gameinfo = gameinfo;
		this.list = list;
		this.log = log;
		this.sprite = sprite;
		this.x = x;
		this.y = y;
		
		boolean move;		
		RelativeX = 0;
		RelativeY = 0;
	}
	
	//Checks if user controlled sprite can move into into square
	public boolean checkMoveAction()
	{
		return move;	
	}
	
	abstract void interactObject();
	
	// Returns RelativeX coordinate  value 
	public int RetrieveRelativeX()
	{
		return (RelativeX-110)/50;
	}
	
	// Returns RelativeY coordinate  value 
	public int RetrieveRelativeY()
	{
		return (RelativeY-110)/50;
	}
	
	// Sets Relative values for painting
	public void setRelative()
	{
		RelativeX = (x-sprite.getX())*50+110;
		RelativeY = (y-sprite.getY())*50+110;
	}
	
	// Paints object
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}
}