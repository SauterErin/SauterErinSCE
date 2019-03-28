
package choice;
import java.awt.*;

public class DoorTest extends GameObject {

	Inventory items;
	GameSprite sprite;
	Countdown clock;
	List list;
	
	public DoorTest (int AbsoluteX, int AbsoluteY, GameMode gameinfo, List list,  Dialogue log, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, gameinfo, log, list, sprite);
		move = false;
		this.sprite = sprite;
	}
			
	public void interactObject()
	{
		/*String dialogue = "";
		dialogue =  "You left the room.";
		gameinfo.startDialogue();*/
				if (gameinfo.getRoom() == 0)
				{	
					gameinfo.changeRoom(1);
					sprite.setGameSprite (15, 1, 's');
					gameinfo.ModeRed();
				}
				
				else if (gameinfo.getRoom() == 1)
				{
					gameinfo.changeRoom(2);
					sprite.setGameSprite(4, 4, 'n');
					gameinfo.DefaultMode();
				}	
	}
				
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
					
		g.setColor(Color.getHSBColor(3, 26, 75));
		g.fillRect (RelativeX, RelativeY, 50, 50);
	}

}