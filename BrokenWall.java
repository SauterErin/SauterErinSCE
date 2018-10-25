package choice;
import java.awt.*;

public class BrokenWall extends GameObject{
	
	Inventory items;

	public BrokenWall (int x, int y, GameCalendar calen, Inventory items, InteractionPanel inter)
	{
		super(x, y, calen, inter);
		move = false;
		this.items = items;
	}
	
	public void interacteObject()
	{
		String dialogue = "";

		if (counterday2==0)
		{
			items.findPinkKey();
			dialogue = "A pink key was hidden in the shattered wall.";
			calen.startDialogue();
		}
		
		else
		{
			dialogue = "The wall is empty.";
			calen.startDialogue();
		}
		
		increaseCounter();
		inter.changeDialogue(dialogue);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.DARK_GRAY);
		
		g.fillRect(x, y, 50, 50);
		
		g.setColor(Color.yellow);
		g.drawLine(x, y+25, x+25, y+42);
		g.drawLine(x+10, y+32, x+40, y+27);
	}
}
