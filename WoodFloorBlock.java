package choice;
import java.awt.*;
public class WoodFloorBlock extends GameObject{

	List list;
	
	public WoodFloorBlock (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
		this.list = list;
	}
	
	public void interactObject()
	{
		if(gameinfo.checkMonsterMode() == true && ((list.checkBlockA() == true && gameinfo.getRoom() == 8) || (list.checkBlockC() == true && gameinfo.getRoom() == 17)  || (list.checkBlockB() == true && gameinfo.getRoom() == 7)) )
			log.readDialogue(104);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.setColor(new Color(96,45, 6));	
		if(gameinfo.returnYear() == gameinfo.gameyearpast)
			g.setColor(new Color(121,94, 32));
		
		move = true;	
		
		
		
		g.fillRect(RelativeX, RelativeY+1, 50,16 );
		g.fillRect(RelativeX, RelativeY+18, 50,16 );
		g.fillRect(RelativeX, RelativeY+34, 50,16 );
		

		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+50, RelativeY);
		g.drawLine(RelativeX, RelativeY+50, RelativeX+50, RelativeY+50);
		
		g.drawLine(RelativeX, RelativeY+17, RelativeX+50, RelativeY+17);
		g.drawLine(RelativeX, RelativeY+33, RelativeX+50, RelativeY+33);
		
		if(gameinfo.getRoom() == 8 && list.checkBlockA() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX+24, RelativeY, RelativeX+24, RelativeY+50);
			g.drawLine(RelativeX+25, RelativeY, RelativeX+25, RelativeY+50);
		}
		
		if(gameinfo.getRoom() == 8 && list.checkBlockA() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX+24, RelativeY, RelativeX+24, RelativeY+50);
			g.drawLine(RelativeX+25, RelativeY, RelativeX+25, RelativeY+50);
		}
		
		if(gameinfo.getRoom() == 7 && list.checkBlockB() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX, RelativeY+25, RelativeX+50, RelativeY+25);
			g.drawLine(RelativeX, RelativeY+24, RelativeX+50, RelativeY+24);
		}
		
		if(gameinfo.getRoom() == 17 && list.checkBlockC() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX+24, RelativeY, RelativeX+24, RelativeY+50);
			g.drawLine(RelativeX+25, RelativeY, RelativeX+25, RelativeY+50);
		}
				

	}
}