package choice;
import java.awt.*;
public class TrapDoor extends GameObject{

	List list;
	boolean positionopen;
	
	public TrapDoor (int AbsoluteX, int AbsoluteY, GameCalendar calen, List list, InteractionPanel inter, GameSprite sprite)
	{
		super(AbsoluteX, AbsoluteY, calen, inter, sprite);
		move = true;
		this.list = list;
		positionopen = false;
	}
	
	public void interacteObject()
	{
		String dialogue = "";
		calen.startDialogue();

		if (positionopen == false)
		{
			dialogue =  "You opened the trapdoor";
			positionopen = true;
			move = false;
		}
		
		else
		{
			dialogue = "It's empty.";
		}
		
		inter.changeDialogue(dialogue);

	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(RelativeX, RelativeY, RelativeX+50, RelativeY);
		g.drawLine(RelativeX, RelativeY+50, RelativeX+50, RelativeY+50);
		g.drawLine(RelativeX+50, RelativeY, RelativeX+50, RelativeY+50);
		g.drawLine(RelativeX, RelativeY, RelativeX, RelativeY+50);
		
		g.setColor(Color.yellow);
		if(positionopen == false)
		{
			g.fillRect(RelativeX, RelativeY, 50, 50);
		}
		
		else 
		{
			g.fillRect(RelativeX, RelativeY, 50, 10);
			g.setColor(Color.black);
			g.fillRect(RelativeX, RelativeY+11, 50, 40);
		}
	}

	@Override
	void setTest(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}