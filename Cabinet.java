package choice;
import java.awt.*;

public class Cabinet extends GameObject
{
	Inventory items;

	public Cabinet (int AbsoluteX, int AbsoluteY, GameCalendar calen, Inventory items, InteractionPanel inter, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, inter, sprite);
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
		g.fillRect(RelativeX*+110,RelativeY*50+110,50,50);
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
