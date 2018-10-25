package choice;
import java.awt.*;

public class Cabinet extends GameObject
{
	Inventory items;
	
	public Cabinet (int x, int y, GameCalendar calen, Inventory items, InteractionPanel inter)
	{
		super(x, y, calen, inter);
		move = false;
		this.items = items;
	}
	
	public void interacteObject()
	{
		String dialogue = "";
		
		if (counterday1 == 0)
		{	
			items.findIronKey();
			dialogue = "You found an iron key.";
			calen.startDialogue();
		}
		
		else
		{
			dialogue = "The cabinet is empty.";
			calen.startDialogue();
		}
		
		increaseCounter();
		
		inter.changeDialogue(dialogue);
	
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.orange);
		g.fillRect(x,y,50,50);
	}
}
