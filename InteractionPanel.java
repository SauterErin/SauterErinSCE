package choice;
import java.awt.*;

import javax.swing.*;

public class InteractionPanel extends JPanel {
	
	String dialogue;
	boolean endscript;
	boolean monster;

	
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
		if(monster == true)
			g.setColor(Color.black);
		g.fillRect(000,500,700,400);
		g.setColor(Color.white);
		}
		
		else 
			g.setColor(Color.white);
		if(monster == true)
			g.setColor(Color.red);
		g.drawString(dialogue, 140, 550);
	}
}
