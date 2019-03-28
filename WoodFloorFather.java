package choice;
import java.awt.*;
public class WoodFloorFather extends GameObject{

	List list;
	
	public WoodFloorFather (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = true;
		this.list = list;
	}
	
	public void interactObject()
	{
		log.readDialogue(94);
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
		System.out.println("Painting");
		System.out.println(list.checkRescueComplete());
		System.out.println("Fire: " + list.checkNightofFire());
		
		if(list.checkRescueComplete() == true && list.checkNightofFire() == false)
		{
			move = false;
			g.setColor(Color.green);
			g.fillRect(RelativeX+8, RelativeY+8, 24, 34);
			g.setColor(Color.red);
			g.fillRect(RelativeX+32, RelativeY+8, 10,34);
		}
	}
}