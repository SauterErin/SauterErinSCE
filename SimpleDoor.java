package choice;
import java.awt.*;


public class SimpleDoor extends GameObject {

	List list;
	GameSprite sprite;
	
	public SimpleDoor(int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.list = list;
		this.sprite = sprite;
	}
			
	public void interactObject()
	{
		if(gameinfo.returnYear() == gameinfo.gameyearpast)
		{
			if(list.checkBrokenSimpleDoor() == false && list.checkBrokenWireBox() == false)
			{
				log.readDialogue(32);
			}
			
			if(list.checkBrokenSimpleDoor() == true || list.checkBrokenWireBox() == true)
			{
				if(gameinfo.getRoom() == 12)
				{
					gameinfo.changeRoom(13);
					sprite.setGameSprite(1,2,'N');
				}
				
				else
				{
					gameinfo.changeRoom(12);
					sprite.setGameSprite(9,1,'S');	
				}
			}
		}
		
		else
		{
			if((list.checkReinforcedSimpleDoor() == true && list.checkBrokenWireBox() == false) || (list.checkSearWireBox() == true && list.checkBrokenSimpleDoor() == false))
			{
				if(list.checkReinforcedSimpleDoor() == true)
				
				{
					log.readDialogue(34);
				}
				
				else
				{	
					log.readDialogue(38);
				}
			}
			
			else
			{
				if(gameinfo.getRoom() == 12)
				{
					gameinfo.changeRoom(13);
					sprite.setGameSprite(1,2,'N');
					sprite.presentMonster = false;
				}
				
				else
				{
					if((list.checkRun() == true && list.checkNightofHorrors() == true) || list.checkRun() == false)
					{
						gameinfo.changeRoom(12);
						sprite.setGameSprite(9,1,'S');
					}
					
					else
						log.readDialogue(85);
				}
			}
		}
	}
	

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if(list.checkBrokenSimpleDoor() == false)
		{
			g.setColor(Color.gray);	
			
			g.fillRect(RelativeX, RelativeY, 10,50 );
			g.fillRect(RelativeX+40, RelativeY, 10,50 );
			
			g.setColor(new Color(44,92,51));
			g.fillRect(RelativeX+10, RelativeY, 30,50);
			
			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
			g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
			
			g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		}
		if(list.checkBrokenSimpleDoor() == false)
		{
			g.setColor(Color.gray);	
			
			g.fillRect(RelativeX, RelativeY, 10,50 );
			g.fillRect(RelativeX+40, RelativeY, 10,50 );
			
			g.setColor(new Color(44,92,51));
			g.fillRect(RelativeX+10, RelativeY, 30,50);
			
			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
			g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
			
			g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		}
		if(list.checkBrokenSimpleDoor() == true && list.checkReinforcedSimpleDoor() == false)
		{
			g.setColor(Color.gray);	
			
			g.fillRect(RelativeX, RelativeY, 10,50 );
			g.fillRect(RelativeX+40, RelativeY, 10,50 );
			
			g.setColor(new Color(44,92,51));
			g.fillRect(RelativeX+10, RelativeY, 30,50);
			
			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
			g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
			
			g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			
			g.fillRect(RelativeX+35, RelativeY, 5, 50);
		}
		
		if(list.checkBrokenSimpleDoor() == true && list.checkReinforcedSimpleDoor() == true)
		{
			g.setColor(Color.gray);	
			
			g.fillRect(RelativeX, RelativeY, 10,50 );
			g.fillRect(RelativeX+40, RelativeY, 10,50 );
			
			g.setColor(Color.darkGray);
			g.fillRect(RelativeX+10, RelativeY, 30,50);
			
			g.setColor(Color.black);
			g.drawLine(RelativeX, RelativeY, RelativeX+49, RelativeY);
			g.drawLine(RelativeX, RelativeY+49, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
			g.drawLine(RelativeX, RelativeY+49, RelativeX, RelativeY+49);
			
			g.drawLine(RelativeX+10, RelativeY, RelativeX+10, RelativeY+49);
			g.drawLine(RelativeX+49, RelativeY, RelativeX+49, RelativeY+49);
		}
	}
}