package choice;
import java.awt.*;

public class Wall extends GameObject{

	List list;
	
	public Wall ( int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.list = list;
	}
	
	public void interacteObject()
	{
		/*String dialogue = "";
		if (calen.getGameDay()==0)
		{
			if(list.checkWall1()==false && super.counterday1 == 0)
			{
				list.actWall1();
				dialogue = "The walls are freshly painted.";
				calen.startDialogue();
			}
		}
		
		else
		{
			if (list.checkWall2()==false && super.counterday2 == 0)
			{
				list.actWall2();
				dialogue = "The walls are scorched.";
				calen.startDialogue();
			}
		}
		
		increaseCounter();
		inter.changeDialogue(dialogue);*/
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if(calen.getGameDay()== 0)
		{
			g.setColor(Color.gray);
		}
		
		else
		{
			g.setColor(Color.darkGray);
		}
		g.fillRect(RelativeX*50+110, RelativeY*50+110, 50, 50);
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
