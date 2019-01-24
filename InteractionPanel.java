package choice;
import java.awt.*;
import javax.swing.*;

public class InteractionPanel extends JPanel {
	
	public String dialogue;

	
	public InteractionPanel ()
	{
		dialogue = "";
	}
	
	public void changeDialogue (String wantedDialogue)
	{
		dialogue = wantedDialogue;
	}
	
	public void paintComponent(Graphics g)
	{	
		super.paintComponent(g);
		g.setColor(Color.gray);
		g.fillRect(100,100,200,200);
		g.setColor(Color.white);
		g.drawString(dialogue, 140, 150);
	}
}
