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
		boolean onechoice = true;
		if (calen.getRoom() == 2 && onechoice == true)
		{	
			calen.changeRoom(3);
			sprite.setGameSprite (1, 2, 'd');
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
		
		if (calen.getRoom() == 4 && onechoice == true)
		{
			calen.changeRoom(3);
			sprite.setGameSprite(9,2,'a');
			onechoice = false;
		}

	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.lightGray);
		g.fillRect(RelativeX, RelativeY, 50, 50);
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}