package choice;
import java.awt.*;

public class IronDoor extends GameObject {

	Inventory items;
	GameSprite sprite;
	Countdown clock;

	int testx = 0;
	int testy = 0;
	
	public IronDoor(int x, int y, GameCalendar calen, Inventory items, 
			GameSprite sprite, Countdown clock, InteractionPanel inter)
	{
		super(x, y, calen, inter);
		move = false;
		this.items = items;
		this.sprite = sprite;
		this.clock = clock;
	}
	
	public void setTest(int newX, int newY){
		testx = newX*50+110;
		testy = newY*50+110;
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
		inter.changeDialogue(dialogue);
	}
				
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
					
		g.setColor(Color.getHSBColor(0, 0, 75));
		g.fillRect (x, y, 50, 50);
	}
}