package choice;
import java.awt.*;

public class Wall extends GameObject{

	List list;

	int testx = 0;
	int testy = 0;
	
	public Wall (int x, int y, GameCalendar calen, List list, InteractionPanel inter)
	{
		super(x, y, calen, inter);
		move = false;
		this.list = list;
	}
	
	public void setTest(int newX, int newY){
		testx = newX*50+110;
		testy = newY*50+110;
	}
	
	public void interacteObject()
	{
		String dialogue = "";
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
		inter.changeDialogue(dialogue);
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
		g.fillRect(x, y, 50, 50);
	}
}
