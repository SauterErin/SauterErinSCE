
package choice;
import java.awt.*;

public class DoorTest extends GameObject {

	Inventory items;
	GameSprite sprite;
	Countdown clock;
	List list;
	
	public DoorTest (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list,  Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, log, sprite);
		move = false;
		this.sprite = sprite;
	}
			
	public void interacteObject()
	{
		/*String dialogue = "";
		dialogue =  "You left the room.";
		calen.startDialogue();*/
				if (calen.getRoom() == 0)
				{	
					calen.changeRoom(1);
					sprite.setGameSprite (15, 1, 's');
					calen.ModeRed();
				}
				
				else if (calen.getRoom() == 1)
				{
					calen.changeRoom(2);
					sprite.setGameSprite(4, 4, 'n');
					calen.DefaultMode();
				}	
	}
				
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
					
		g.setColor(Color.getHSBColor(3, 26, 75));
		g.fillRect (RelativeX, RelativeY, 50, 50);
	}

}