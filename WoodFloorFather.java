package choice;
import java.awt.*;
public class WoodFloorFather extends GameObject{
	
	public WoodFloorFather (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
	}
	
	public void interactObject()
	{
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
		
		// Dead Father - unburied 
		if(list.checkGoodbye() == false)
		{
			move = false;
			g.setColor(Color.green);
			g.fillRect(RelativeX+8, RelativeY+8, 34, 24);
			g.setColor(Color.blue);
			g.fillRect(RelativeX+8, RelativeY+32, 34,10);
		}

		move = true;
		
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