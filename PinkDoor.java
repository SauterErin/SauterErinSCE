package choice;
import java.awt.*;

import javax.swing.*;

public class PinkDoor extends GameObject {
	
	Inventory items;
	GameSprite sprite;

	
	Countdown clock;

	public PinkDoor(int AbsoluteX, int AbsoluteY, GameCalendar calen, Inventory items, 
			GameSprite sprite, Countdown clock, InteractionPanel inter)
	{
		super(AbsoluteX, AbsoluteY, calen, inter, sprite);
		move = false;
		this.items = items;
		this.sprite = sprite;
		this.clock = clock;
	}

	
	public void interacteObject()
	{
		String dialogue = "";
		if (calen.getGameDay() == 0) 
		{
			
			if (super.counterday1 < 9)
			{
				dialogue = "The door is stuck.";
			}
			
			else
			{
				dialogue =  "Upon closer inspection the door is a painted wall.";
			}
			
			calen.startDialogue();
		}
		
		if (calen.getGameDay()==1)
		{
			
			if (items.checkPinkKey() == false && super.counterday2 < 9)
			{
				dialogue =  "The door is locked.";
				calen.startDialogue();
			}
			
			if (items.checkPinkKey() == false && super.counterday2 >= 9)
			{
				dialogue = "Try as you might, you cannot melt the door with your stare";
				calen.startDialogue();
			}
			
			if (items.checkPinkKey() == true)
			{	
				super.calen.completeGame();
				calen.startDialogue();
				clock.resetCountdown();
			}
		}
		
		increaseCounter();
		inter.changeDialogue(dialogue);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.pink);
		g.fillRect (RelativeX*50+110, RelativeY*50+110, 50, 50);
	}


	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
