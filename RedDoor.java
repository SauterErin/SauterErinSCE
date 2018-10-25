package choice;
import java.awt.*;


public class RedDoor extends GameObject {

	Inventory items;
	GameSprite sprite;
	Countdown clock;
	
	public RedDoor(int x, int y, GameCalendar calen, Inventory items, 
			GameSprite sprite, Countdown clock, InteractionPanel inter)
	{
		super(x, y, calen, inter);
		move = false;
		this.items = items;
		this.sprite = sprite;
		this.clock = clock;
	}
			
	public void interacteObject()
	{
		String dialogue = "";
		
		if (calen.getGameDay() == 1) 
		{	
		
			if (super.counterday2 < 9)
			{
				dialogue = "The door is stuck.";
			}
						
			else
			{
				dialogue =  "Upon closer inspection the door is rusted shut.";
			}
						
			calen.startDialogue();
		}
					
		else 
		{
			if (items.checkRedKey() == false && super.counterday1 < 9)
			{
				dialogue =  "The door is locked.";
				calen.startDialogue();
			}
						
			if (items.checkRedKey() == false && super.counterday1 >= 9)
			{
				dialogue = "Try as you might, you cannot melt the door with your stare.";
				calen.startDialogue();
			}
						
			if (items.checkRedKey() == true)
			{	
				super.calen.completeDay();
				sprite.setGameSprite(2,3,'w');
				clock.resetCountdown();
			}
		}
		
		increaseCounter();
		
		inter.changeDialogue(dialogue);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
					
		g.setColor(Color.red);
		g.fillRect (x, y, 50, 50);
	}
}