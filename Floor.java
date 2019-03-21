package choice;
import java.awt.*;

public class Floor extends GameObject{

	List list;
	InteractionPanel inter;

	public Floor (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, InteractionPanel inter, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo ,log, list, sprite);
		move = true;
		this.list = list;
		this.inter = inter;
	}
	
	public boolean checkMoveAction()
	{	
		System.out.println("Checking");

		if(gameinfo.getRoom() == 3)
		{
			System.out.println("Reading");
			log.readDialogue(16);
			return false;
		}
		return move;
	}

	public void interactObject() 
	{

	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillRect(RelativeX*50+110, RelativeY*50+110, 50, 50);
	}
}
