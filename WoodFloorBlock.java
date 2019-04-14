package choice;
import java.awt.*;
public class WoodFloorBlock extends GameObject{
	
	public WoodFloorBlock (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
	}
	
	public void interactObject()
	{
		// If as Alva and in room 7,8, or 17 with coordinating block active
		if(gameinfo.checkMonsterMode() == true && ((gameinfo.getRoom() == 8 && list.checkBlockA() == true) || (gameinfo.getRoom() == 7 && list.checkBlockB() == true)  || (gameinfo.getRoom() == 17 && list.checkBlockC() == true)) )
		{
			log.readDialogue(104);
		}
		
		// If Alva sacrificed herself 
		if(gameinfo.getRoom() == 19 && list.checkSacrifice() == true) 
		{
			log.readDialogue(126);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		// Color Instructions - Past 
		g.setColor(new Color(96,45, 6));	
		
		// Color instructions - Present 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(new Color(220, 166, 132));
		}
		move = true;	
		
		g.fillRect(RelativeX, RelativeY+1, 50,16 );
		g.fillRect(RelativeX, RelativeY+18, 50,16 );
		g.fillRect(RelativeX, RelativeY+34, 50,16 );
		
		g.setColor(Color.black);
		
		// Fire backlit Stage 1
		if(list.checkNightofFire() == true)
		{
			g.setColor(new Color(227, 111, 25));
		}
		
		// Fire backlit Stage 2 
		if(list.checkNightofFireRescue() == true)
		{
			g.setColor(new Color(227, 86, 25));
		}
		
		g.drawLine(RelativeX, RelativeY, RelativeX+50, RelativeY);
		g.drawLine(RelativeX, RelativeY+50, RelativeX+50, RelativeY+50);
		
		g.drawLine(RelativeX, RelativeY+17, RelativeX+50, RelativeY+17);
		g.drawLine(RelativeX, RelativeY+33, RelativeX+50, RelativeY+33);
		
		// If in South Hall and block is active 
		if(gameinfo.getRoom() == 8 && list.checkBlockA() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX+24, RelativeY, RelativeX+24, RelativeY+50);
			g.drawLine(RelativeX+25, RelativeY, RelativeX+25, RelativeY+50);
		}
		
		// If in East Hall and block is active 
		if(gameinfo.getRoom() == 7 && list.checkBlockB() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX, RelativeY+25, RelativeX+50, RelativeY+25);
			g.drawLine(RelativeX, RelativeY+24, RelativeX+50, RelativeY+24);
		}
		
		// If in West Hall and block is active 
		if(gameinfo.getRoom() == 17 && list.checkBlockC() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX+25, RelativeY, RelativeX+25, RelativeY+50);
			g.drawLine(RelativeX+24, RelativeY, RelativeX+24, RelativeY+50);
		}

		// If in Exit Hall and block is active 	 - Left Laser			
		if(gameinfo.getRoom() == 19 && list.checkSacrifice() == true && x == 2)
		{
			g.setColor(Color.white);
			g.drawLine(RelativeX+40, RelativeY, RelativeX+40, RelativeY+50);
			g.drawLine(RelativeX+41, RelativeY, RelativeX+41, RelativeY+50);
		}
		
		// If in Exit Hall and block is active 	 - Right Laser			
		if(gameinfo.getRoom() == 19 && list.checkSacrifice() == true && x == 4)
		{
			g.setColor(Color.white);
			g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+50);
			g.drawLine(RelativeX+11, RelativeY, RelativeX+11, RelativeY+50);
		}
		
		// If in Exit Hall and block is active 	 - Forward Laser			
		if(gameinfo.getRoom() == 19 && list.checkSacrifice() == true && y == 6)
		{
			g.setColor(Color.white);
			g.drawLine(RelativeX, RelativeY+40, RelativeX+50, RelativeY+40);
			g.drawLine(RelativeX, RelativeY+41, RelativeX+50, RelativeY+41);
		}

		// If in Exit Hall and block is active 	 - Backward Laser			
		if(gameinfo.getRoom() == 19 && list.checkSacrifice() == true && y == 8)
		{
			g.setColor(Color.white);
			g.drawLine(RelativeX, RelativeY+10, RelativeX+50, RelativeY+10);
			g.drawLine(RelativeX, RelativeY+11, RelativeX+50, RelativeY+11);
		}
		
		// Raging Fire emphasis 
		if(list.checkNightofFire() == true)
		{
			g.setColor(new Color(227, 50, 25));
			g.drawLine(RelativeX, RelativeY +5, RelativeX+15, RelativeY+5);
			g.drawLine(RelativeX+34, RelativeY +5, RelativeX+49, RelativeY+5);
			g.drawLine(RelativeX+5, RelativeY +22, RelativeX+35, RelativeY+22);
			g.drawLine(RelativeX+22, RelativeY +42, RelativeX+25, RelativeY+45);
		}
		
		// Fire worsening visual emphasis 
		if(list.checkNightofFireRescue() == true)
		{	
			g.setColor(new Color(227, 118, 25));
			g.drawLine(RelativeX+18, RelativeY +28, RelativeX+48, RelativeY+28);
			
			g.setColor(new Color(227, 50, 25));
			g.drawLine(RelativeX+30, RelativeY +12, RelativeX+33, RelativeY+15);
			g.drawLine(RelativeX+6, RelativeY +28, RelativeX+9, RelativeY+31);	
		}
	}
}