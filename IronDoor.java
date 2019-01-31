package choice;
import java.awt.*;

public class IronDoor extends GameObject {

	Inventory items;
	GameSprite sprite;
	Countdown clock;
	public IronDoor(int AbsoluteX, int AbsoluteY,GameCalendar calen, Inventory items, 
			GameSprite sprite, Countdown clock, Dialogue log)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.items = items;
		this.sprite = sprite;
		this.clock = clock;
	}
			
	public void interacteObject()
	{
		String dialogue = "";
		
		if (items.checkIronKey() == false && super.counterday1 < 9)
		{
				dialogue =  "The door is locked.";
				calen.startDialogue();
		}
						
			if (items.checkIronKey() == false && super.counterday1 >= 9)
			{
				dialogue = "Screech as hard as you may, the door will not budge.";
				calen.startDialogue();
			}
								
			if (items.checkIronKey() == true)
			{	
				if (calen.getRoom() == 0)
				{	
					calen.changeRoom(1);
					sprite.setGameSprite (2, 1, 's');
				}
				
				else if (calen.getRoom() == 1)
				{
					calen.changeRoom(0);
					sprite.setGameSprite(2, 3, 'w');
				}
			}
			
		increaseCounter();
		//inter.changeDialogue(dialogue);
	}
				
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
					
		g.setColor(Color.getHSBColor(0, 0, 75));
		g.fillRect (RelativeX*50+110, RelativeY*50+110, 50, 50);
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}