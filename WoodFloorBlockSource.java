package choice;
import java.awt.*;
public class WoodFloorBlockSource extends GameObject{
	
	public WoodFloorBlockSource (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
	}
	
	public void interactObject()
	{
		// If in present
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			boolean wait = true;
			
			// If in East Hall and Block B active
			if(gameinfo.getRoom() == 7 && list.checkBlockB() == true && wait == true)
			{
				// If Alva
				if(gameinfo.checkMonsterMode() == true)
				{
					wait = false;
					log.readDialogue(101);
					list.actBlockB();
				}
				
				// If Will 
				if(gameinfo.checkMonsterMode() == false && gameinfo.getYear() == gameinfo.getPresent())
				{
					log.readDialogue(102);
				}
				
			}
			
			// If in South Hall and Block is broken 
			if(gameinfo.getRoom() == 8 && list.checkBlockA() == false && wait == true)
			{
				wait = false;
				log.readDialogue(103);
			}
			
			// If in South Hall and Block is active 
			if(gameinfo.getRoom() == 8 && list.checkBlockA() == true  && wait == true)
			{
				// If Alva
				if(gameinfo.checkMonsterMode() == true)
				{
					wait = false;
					log.readDialogue(101);
					list.actBlockA();
				}
				
				// If Will
				else
				{
					wait = false;
					log.readDialogue(102);
				}	
			}
			
			// If East Hall and Block is broken
			if(gameinfo.getRoom() == 7 && list.checkBlockB() == false  && wait == true)
			{
				wait = false;
				log.readDialogue(103);
			}
			
			// If West Hall and Block is Active
			if(gameinfo.getRoom() == 17 && list.checkBlockC() == true  && wait == true)
			{
				// If Alva
				if(gameinfo.checkMonsterMode() == true)
				{
					wait = false;
					log.readDialogue(101);
					list.actBlockC();
				}
				
				// If Will
				else
				{
					log.readDialogue(102);
				}
			}
			
			// If in West Hall and block is broken 
			if(gameinfo.getRoom() == 17 && list.checkBlockC() == false  && wait == true)
			{
				wait = false;
				log.readDialogue(103);
			}
			
			// If in Exit Hall and Alva hasn't sacrificed herself
			if(gameinfo.getRoom() == 19 && list.checkSacrifice() == false  && wait == true)
			{
				wait = false;
				log.readDialogue(127);
			}
			
			// If in Exit Hall and Alva has sacrificed herself
			if(gameinfo.getRoom() == 19 && list.checkSacrifice() == true  && wait == true)
			{
				wait = false;
				log.readDialogue(128);
			}
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
		
		// if Present 
		if(gameinfo.getYear() == gameinfo.getPresent())
		{
			g.setColor(Color.orange);
			
			// South Hall - unbroken
			if(gameinfo.getRoom() == 8 && list.checkBlockA() == true)
			{
				g.fillRect(RelativeX+20, RelativeY, 10, 10);
			}
			
			// South Hall - broken
			if(gameinfo.getRoom() == 8 && list.checkBlockA() == false)
			{
				g.fillRect(RelativeX+15, RelativeY, 4, 10);
				g.fillRect(RelativeX+26, RelativeY, 6, 10);
				move = true;
			}
			
			// East Hall - unbroken
			if(gameinfo.getRoom() == 7 && list.checkBlockB() == true)
			{
				g.fillRect(RelativeX, RelativeY+20, 10, 10);
			}
			
			// East Hall - broken
			if(gameinfo.getRoom() == 7 && list.checkBlockB() == false)
			{
				g.fillRect(RelativeX, RelativeY+15, 10, 4);
				g.fillRect(RelativeX, RelativeY+26, 10, 6);
				move = true;
			}
			
			// West Hall - unbroken
			if(gameinfo.getRoom() == 17 && list.checkBlockC() == true)
			{
				g.fillRect(RelativeX+20, RelativeY, 10, 10);
			}
			
			// Weset Hall - broken
			if(gameinfo.getRoom() == 17 && list.checkBlockC() == false)
			{
				move = true;
				g.fillRect(RelativeX+15, RelativeY, 4, 10);
				g.fillRect(RelativeX+26, RelativeY, 6, 10);
			}
		}
		
		// North Exit North East
		if(gameinfo.getRoom() == 19 && x == 4 && y == 1)
		{
			g.setColor(Color.WHITE);
			g.fillRect(RelativeX+7, RelativeY, 10, 10);
		}
		
		// North Exit North West
		if(gameinfo.getRoom() == 19 && x == 2 && y == 1)
		{
			g.setColor(Color.white);
			g.fillRect(RelativeX+35, RelativeY, 10, 10);
		}
		
		// North Exit Forward movement block
		if(gameinfo.getRoom() == 19 && y == 6)
		{
			g.setColor(Color.white);
			g.fillRect(RelativeX+40, RelativeY+35, 10, 10);
		}
		
		// North Exit Backward movement block
		if(gameinfo.getRoom() == 19 && y == 8)
		{
			g.setColor(Color.white);
			g.fillRect(RelativeX, RelativeY+5, 10, 10);
		}
		
		// South Hall Light Beam 
		if(gameinfo.getRoom() == 8 && list.checkBlockA() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX+24, RelativeY+11, RelativeX+24, RelativeY+50);
			g.drawLine(RelativeX+25, RelativeY+11, RelativeX+25, RelativeY+50);
		}
		
		// East Hall Light Beam
		if(gameinfo.getRoom() == 7 && list.checkBlockB() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX+11, RelativeY+25, RelativeX+50, RelativeY+25);
			g.drawLine(RelativeX+11, RelativeY+24, RelativeX+50, RelativeY+24);
		}
		
		// West Hall Light Beam
		if(gameinfo.getRoom() == 17 && list.checkBlockC() == true && gameinfo.checkMonsterMode() == true)
		{
			move = false;
			g.setColor(Color.cyan);
			g.drawLine(RelativeX+24, RelativeY+11, RelativeX+24, RelativeY+50);
			g.drawLine(RelativeX+25, RelativeY+11, RelativeX+25, RelativeY+50);
		}
		
		// North Hall Light Beam - Left Block
		if(gameinfo.getRoom() == 19 && this.x == 2 && list.checkSacrifice() == true)
		{
			g.setColor(Color.white);
			g.drawLine(RelativeX+40, RelativeY, RelativeX+40, RelativeY+50);
			g.drawLine(RelativeX+41, RelativeY, RelativeX+41, RelativeY+50);
		}
		
		// North Hall Light Beam - Right Block
		if(gameinfo.getRoom() == 19 && this.x == 4 && list.checkSacrifice() == true)
		{
			g.setColor(Color.white);
			g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+50);
			g.drawLine(RelativeX+11, RelativeY, RelativeX+11, RelativeY+50);
		}
		
		// North Hall Light Beam - Forward Block 
		if(gameinfo.getRoom() == 19 && this.y == 6 && list.checkSacrifice() == true)
		{
			g.setColor(Color.white);
			g.drawLine(RelativeX, RelativeY+40, RelativeX+50, RelativeY+40);
			g.drawLine(RelativeX, RelativeY+41, RelativeX+50, RelativeY+41);
		}
		
		// North Hall Light Beam - Backwards Block
		if(gameinfo.getRoom() == 19 && this.y == 8 && list.checkSacrifice() == true)
		{
			g.setColor(Color.white);
			g.drawLine(RelativeX, RelativeY+10, RelativeX+50, RelativeY+10);
			g.drawLine(RelativeX, RelativeY+11, RelativeX+50, RelativeY+11);
		}
	}
}