package choice;
import java.awt.*;

public class Chest extends GameObject
{
	Inventory items;

	int testx = 0;
	int testy = 0;
	
	public Chest (int x, int y, GameCalendar calen, Inventory items, InteractionPanel inter)
	{
		super(x, y, calen, inter);
		move = false;
		this.items = items;
	}
	
	public void setTest(int newX, int newY){
		testx = newX*50+110;
		testy = newY*50+110;
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
		g.fillRect(x,y,50,50);
	}
}