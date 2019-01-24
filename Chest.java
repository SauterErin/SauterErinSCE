package choice;
import java.awt.*;

public class Chest extends GameObject
{
	Inventory items;

	
	public Chest (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, InteractionPanel inter, GameSprite sprite, Inventory items)
	{
		super(AbsoluteX, AbsoluteY, calen, inter, sprite);
		move = false;
		this.items = items;
	}

	
	public void interacteObject()
	{
		String dialogue = "";
		
		if (calen.getGameDay() == 0)
		{
			if (counterday1 == 0)
			{	
				items.findRedKey();
				dialogue = "You found a red key.";
				calen.startDialogue();
			}
			
			else
			{
				dialogue = "The chest is empty.";
				calen.startDialogue();
			}
		}
	
		else 
		{
			dialogue = "A pile of ashes.";
			calen.startDialogue();
		}
		
		increaseCounter();
		
		inter.changeDialogue(dialogue);
	}
	
	public boolean checkMove()
	{
		if (calen.getGameDay() == 1)
		{
			return true;
		}
		else 
		{
			return move;
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.white);
		g.fillRect(RelativeX*50+110,RelativeY*50+110,50,50);
	}


	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}