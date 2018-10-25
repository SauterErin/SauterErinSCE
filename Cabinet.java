package choice;
import java.awt.*;

public class Cabinet extends GameObject
{
	Inventory items;

	int testx = 0;
	int testy = 0;
	
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
	
	public void setTest(int newX, int newY){
		testx = newX*50+110;
		testy = newY*50+110;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.orange);
		g.fillRect(x,y,50,50);
	}
}
