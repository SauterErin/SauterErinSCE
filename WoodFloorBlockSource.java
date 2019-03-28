package choice;
import java.awt.*;
public class WoodFloorBlockSource extends GameObject{

	List list;
	
	public WoodFloorBlockSource (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
		this.list = list;
	}
	
	public void interactObject()
	{
		if(gameinfo.getRoom() == 7 && list.checkBlockB() == true)
		{
			if(gameinfo.checkMonsterMode() == true)
			{
				log.readDialogue(101);
				list.actBlockB();
			}
			
			else
			{
				log.readDialogue(102);
			}
			
		}
		
		if(gameinfo.getRoom() == 8 && list.checkBlockA() == false)
		{
			log.readDialogue(103);
		}
		
		if(gameinfo.getRoom() == 8 && list.checkBlockA() == true)
		{
			if(gameinfo.checkMonsterMode() == true)
			{
				log.readDialogue(101);
				list.actBlockA();
			}
			
			else
			{
				log.readDialogue(102);
			}	
		}
		
		if(gameinfo.getRoom() == 7 && list.checkBlockB() == false)
		{
			log.readDialogue(103);
		}
		
		if(gameinfo.getRoom() == 17 && list.checkBlockC() == true)
		{
			if(gameinfo.checkMonsterMode() == true)
			{
				log.readDialogue(101);
				list.actBlockC();
			}
			
			else
			{
				log.readDialogue(102);
			}
		}
		
		if(gameinfo.getRoom() == 17 && list.checkBlockC() == false)
		{
			log.readDialogue(103);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.setColor(new Color(96,45, 6));	
		if(gameinfo.returnYear() == gameinfo.gameyearpast)
			g.setColor(new Color(121,94, 32));
			
		
		
		
		g.fillRect(RelativeX, RelativeY+1, 50,16 );
		g.fillRect(RelativeX, RelativeY+18, 50,16 );
		g.fillRect(RelativeX, RelativeY+34, 50,16 );
		

		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+50, RelativeY);
		g.drawLine(RelativeX, RelativeY+50, RelativeX+50, RelativeY+50);
		
		g.drawLine(RelativeX, RelativeY+17, RelativeX+50, RelativeY+17);
		g.drawLine(RelativeX, RelativeY+33, RelativeX+50, RelativeY+33);
		
		if(gameinfo.returnYear() == gameinfo.gameyearpresent)
		{
			g.setColor(Color.orange);
			if(gameinfo.getRoom() == 8 && list.checkBlockA() == true)
			{
				g.fillRect(RelativeX+20, RelativeY, 10, 10);
			}
			
			if(gameinfo.getRoom() == 8 && list.checkBlockA() == false)
			{
				g.fillRect(RelativeX+15, RelativeY, 4, 10);
				g.fillRect(RelativeX+26, RelativeY, 6, 10);
				move = true;
			}
			
			if(gameinfo.getRoom() == 7 && list.checkBlockB() == true)
			{
				g.fillRect(RelativeX, RelativeY+20, 10, 10);

			}
			
			if(gameinfo.getRoom() == 7 && list.checkBlockB() == false)
			{
				g.fillRect(RelativeX, RelativeY+15, 10, 4);
				g.fillRect(RelativeX, RelativeY+26, 10, 6);
				move = true;

			}
			
			if(gameinfo.getRoom() == 17 && list.checkBlockC() == true)
			{
				g.fillRect(RelativeX+20, RelativeY, 10, 10);
			}
			
			if(gameinfo.getRoom() == 17 && list.checkBlockC() == false)
			{
				move = true;
				g.fillRect(RelativeX+15, RelativeY, 4, 10);
				g.fillRect(RelativeX+26, RelativeY, 6, 10);

			}
		}
		
		if(gameinfo.getRoom() == 8 && list.checkBlockA() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX+24, RelativeY+11, RelativeX+24, RelativeY+50);
			g.drawLine(RelativeX+25, RelativeY+11, RelativeX+25, RelativeY+50);
		}
		
		if(gameinfo.getRoom() == 7 && list.checkBlockB() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX+11, RelativeY+25, RelativeX+50, RelativeY+25);
			g.drawLine(RelativeX+11, RelativeY+24, RelativeX+50, RelativeY+24);
		}
		
		if(gameinfo.getRoom() == 17 && list.checkBlockC() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX+24, RelativeY+11, RelativeX+24, RelativeY+50);
			g.drawLine(RelativeX+25, RelativeY+11, RelativeX+25, RelativeY+50);
		}
				

	}
}