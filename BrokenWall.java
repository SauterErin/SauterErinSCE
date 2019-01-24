package choice;
import java.awt.*;

public class BrokenWall extends GameObject{
	
	Inventory items;


	public BrokenWall (int RelativeX, int RelativeY, int AbsoluteX, int AbsoluteY, GameCalendar calen, Inventory items, InteractionPanel inter, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, inter, sprite);
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
		
		g.fillRect(RelativeX*110+50, RelativeY*110+50, 50, 50);
		
		g.setColor(Color.yellow);
		g.drawLine(RelativeX*110+50, RelativeY*110+50+25, RelativeX*110+50+25, RelativeY*110+50+42);
		g.drawLine(RelativeX*110+50+10, RelativeY*110+50+32, RelativeX*110+50+40, RelativeY*110+50+27);
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
