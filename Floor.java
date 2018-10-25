package choice;
import java.awt.*;

public class Floor extends GameObject{

	List list;
	
	public Floor (int x, int y, GameCalendar calen, List list, InteractionPanel inter)
	{
		super(x, y, calen ,inter);
		move = true;
		this.list = list;
	}

	public void interacteObject() 
	{
		String dialogue = "";
		
		if (calen.getGameDay()== 0)
		{
			if (counterday1 == 0 && list.checkFloor1() == false)
			{	
				list.actFloor1();
				dialogue = "The floor is dusty today.";
				calen.startDialogue();
			}
		}
		
		else 
		{
			if (super.calen.getGameDay() == 1)
			{
				if (counterday2 == 0 && list.checkFloor2() == false)
				{	
					list.actFloor2();
					dialogue = "The floor is coated with ash.";
					calen.startDialogue();
				}
			}
		}
		
		increaseCounter();
		inter.changeDialogue(dialogue);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, 50, 50);
	}
}
