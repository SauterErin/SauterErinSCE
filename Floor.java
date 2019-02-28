package choice;
import java.awt.*;

public class Floor extends GameObject{

	List list;
	InteractionPanel inter;

	public Floor (int AbsoluteX, int AbsoluteY,GameCalendar calen, List list, InteractionPanel inter, Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen ,log, sprite);
		move = true;
		this.list = list;
		this.inter = inter;
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
		
		inter.changeDialogue(dialogue);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillRect(RelativeX*50+110, RelativeY*50+110, 50, 50);
	}
}
