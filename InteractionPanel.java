package choice;
import java.awt.*;

import javax.swing.*;

public class InteractionPanel extends JPanel {
	
	String dialogue;
	boolean endscript;

	
	public InteractionPanel ()
	{
		dialogue = "";
		endscript = false;
	}
	
	public void changeDialogue (String wantedDialogue)
	{
		dialogue = wantedDialogue;
	}
	
	public void beginEndScript ()
	{
		endscript = true;
	}
	
	public void paintComponent(Graphics g)
	{	
		if (endscript == false)
		{
			super.paintComponent(g);
		
		g.setColor(Color.gray);
		g.fillRect(000,500,500,400);
		g.setColor(Color.white);
		}
		
		else 
			g.setColor(Color.white);
			g.drawString(dialogue, 140, 550);
	}
}
