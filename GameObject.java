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
	public GameMode gameinfo;
	public List list;
	protected Dialogue log;
	protected GameSprite sprite;
	
	public GameObject (int x, int y, GameMode gameinfo, Dialogue log, List list, GameSprite sprite)
	{
		this.x = x;
		this.y = y;
		this.list = list;
		RelativeX = 0;
		RelativeY = 0;
		boolean move;
		int counterday1 = 0;
		int counterday2 = 0;
		this.gameinfo = gameinfo;
		this.log = log;
		this.sprite = sprite;
	}
	
	public boolean checkMoveAction()
	{

		if(gameinfo.getRoom() == 3 && sprite.getX() == 6 && gameinfo.returnYear() == gameinfo.gameyearpast && list.checkMeetAlva() == false)
		{
			//log.readDialogue(16);
			System.out.println(list.checkMeetAlva());
		}
		return move;
		
	}
	
	abstract void interactObject();
	
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
