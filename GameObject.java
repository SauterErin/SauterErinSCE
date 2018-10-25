package choice;
import java.awt.*;
import javax.swing.*;

abstract class GameObject extends JPanel {
	protected int x;
	protected int y;
	protected boolean move;
	protected int counterday1;
	protected int counterday2;
	protected GameCalendar calen;
	protected InteractionPanel inter;
	
	public GameObject (int x, int y, GameCalendar calen, InteractionPanel inter)
	{
		this.x = x*50 + 110;
		this.y = y*50 + 110;
		boolean move;
		int counterday1 = 0;
		int counterday2 = 0;
		this.calen = calen;
		this.inter = inter;
	}
	
	public boolean checkMove ()
	{
		return move;
	}
	
	abstract void interacteObject();
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}
	
	abstract void setTest(int a, int b);
	
	public void increaseCounter()
	{
		if(calen.getGameDay() == 0) 
		{
			counterday1 += 1;
		}
		
		if (calen.getGameDay() == 1)
		{
			counterday2 += 2;
		}
	}
}
