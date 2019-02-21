package choice;
import java.awt.*;
public class WallHole extends GameObject{

	List list;
	
	public WallHole (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
	}
	
	public void interacteObject()
	{
		if (list.checkNote1() == true){

			boolean onechoice = true;
			if (calen.getRoom() == 2 && onechoice == true)
			{	
				calen.changeRoom(3);
				sprite.setGameSprite (1, 2, 'd');
				onechoice = false;
			}
			if (calen.getRoom() == 1 && onechoice == true && list.checkPowerSwitch() == true)
				log.readDialogue(13);

			
			if (calen.getRoom() == 1 && onechoice == true && list.checkPowerSwitch() == false)
			{	
				calen.changeRoom(5);
				sprite.setGameSprite (1, 5, 'w');
				onechoice = false;
			}		
			
			if (calen.getRoom() == 3 && onechoice == true)
			{	
				if(sprite.checkDirection() == 'a')
					{
						calen.changeRoom(2);
						sprite.setGameSprite(5,2,'a');
						onechoice = false;
					}
				
				if(sprite.checkDirection() == 'd')
				{
					calen.changeRoom(4);
					sprite.setGameSprite(1,6,'d');
					onechoice = false;
				}
			}
			
			if (calen.getRoom() == 5 && onechoice == true)
			{	
				if(sprite.checkDirection() == 's')
					{
						calen.changeRoom(1);
						sprite.setGameSprite(2,1,'s');
						onechoice = false;
					}
				
				if(sprite.checkDirection() == 'd')
				{
					calen.changeRoom(6);
					sprite.setGameSprite(1,1,'d');
					onechoice = false;
				}
			}
			
			if (calen.getRoom() == 6 && onechoice == true)
			{	
				calen.changeRoom(5);
				sprite.setGameSprite (5, 1, 'a');
				onechoice = false;
			}
			
			if (calen.getRoom() == 4 && onechoice == true)
			{
				calen.changeRoom(3);
				sprite.setGameSprite(9,2,'a');
				onechoice = false;
			}
		}
		
		else 
			log.readDialogue(10);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.black);
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

		g.setColor(Color.getHSBColor(245, 140, 133));	
		if(calen.getRed() == true)
			g.setColor(Color.getHSBColor(87, 89, 70));
			
		
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
		
		if(list.checkNote1() == false || (calen.getRoom() == 1 && list.checkPowerSwitch() == true))
		{
			g.setColor(Color.white);
		}
		
		else 
			g.setColor(Color.black);
		
		g.fillRect(RelativeX+20, RelativeY + 15, 20, 35);

	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}