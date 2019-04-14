package choice;
import java.awt.*;
public class AtticHole extends GameObject{
	
	public AtticHole (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
	}
	
	public void interactObject()
	{
		// If in past or if Will hasn't picked up the purple key
		if(sprite.getY() == 1 &&(gameinfo.getYear() == gameinfo.getPresent() && list.checkFinalPurpleKeyPass() != true) == false)
		{	
			gameinfo.changeRoom(3);
			sprite.setGameSprite(6,2,'S');
		}
		
		// If Will is rescuing Alva - allowed to use hole above hallway
		if(list.checkNightofFireRescue()== true && y != 0)
		{
			gameinfo.changeRoom(0);
			sprite.setGameSprite(15,6,'S');
		}
			
		//  Default response of trying to use hole above hallway 
		if(sprite.getY() == 4 && list.checkNightofFireRescue() == false)
		{
			log.readDialogue(23);
		}
			
		// If Will hasn't gotten purple key 
		if(sprite.getY() == 1 &&(gameinfo.getYear() == gameinfo.getPresent() && list.checkFinalPurpleKeyPass() == false) == true)
		{
			log.readDialogue(121);
		}
	}
	
	public void paintComponent(Graphics g)
	{		
		super.paintComponent(g);
		g.setColor(Color.gray);
		g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
		g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		
		g.drawLine(RelativeX, RelativeY+10, RelativeX+49, RelativeY+10);
		g.drawLine(RelativeX, RelativeY+20, RelativeX+49, RelativeY+20);
		g.drawLine(RelativeX, RelativeY+30, RelativeX+49, RelativeY+30);
		g.drawLine(RelativeX, RelativeY+40, RelativeX+49, RelativeY+40);
		
		g.drawLine(RelativeX+15, RelativeY, RelativeX+15, RelativeY+10);
		g.drawLine(RelativeX+30, RelativeY, RelativeX+30, RelativeY+10);
		g.drawLine(RelativeX+20, RelativeY+10, RelativeX+20, RelativeY+20);
		g.drawLine(RelativeX+40, RelativeY+10, RelativeX+40, RelativeY+20);
		g.drawLine(RelativeX+15, RelativeY+20, RelativeX+15, RelativeY+30);
		g.drawLine(RelativeX+30, RelativeY+20, RelativeX+30, RelativeY+30);
		g.drawLine(RelativeX+20, RelativeY+30, RelativeX+20, RelativeY+40);
		g.drawLine(RelativeX+40, RelativeY+30, RelativeX+40, RelativeY+40);
		g.drawLine(RelativeX+15, RelativeY+40, RelativeX+15, RelativeY+49);
		g.drawLine(RelativeX+30, RelativeY+40, RelativeX+30, RelativeY+49);

		g.setColor(Color.black);
		
		// If ran back into burning building color change
		if(list.checkNightofFireRescue() == true)
		{
			g.setColor(Color.getHSBColor(87, 89, 70));
		}
			
		g.fillRect(RelativeX+1, RelativeY+1, 14,9 );
		g.fillRect(RelativeX+1, RelativeY+21, 14,9 );
		g.fillRect(RelativeX+1, RelativeY+41, 14,9 );
		
		g.fillRect(RelativeX+16, RelativeY+1, 14,9);
		g.fillRect(RelativeX+16, RelativeY+21, 14,9);
		g.fillRect(RelativeX+16, RelativeY+41, 14,9);
		
		g.fillRect(RelativeX+31, RelativeY+1, 19, 9 );
		g.fillRect(RelativeX+31, RelativeY+21, 19,9 );
		g.fillRect(RelativeX+31, RelativeY+41, 19,9 );

		g.fillRect(RelativeX+1, RelativeY+11, 19,9);
		g.fillRect(RelativeX+1, RelativeY+31, 19,9);

		g.fillRect(RelativeX+21, RelativeY+11, 19,9);
		g.fillRect(RelativeX+21, RelativeY+31, 19,9);

		g.fillRect(RelativeX+41, RelativeY+11, 9,9);
		g.fillRect(RelativeX+41, RelativeY+31, 9,9);		
		
		g.setColor(Color.white);
		g.fillRect(RelativeX+10, RelativeY+10, 30,30);
	}
}