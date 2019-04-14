package choice;
import java.awt.*;
import javax.swing.*;

public class InteractionPanel extends JPanel {
	
	boolean monster;
	String dialogue;
	
	GameMode gameinfo;
	
	public InteractionPanel (GameMode gameinfo)
	{
		this.gameinfo = gameinfo;

		dialogue = "";
		monster = false;
	}	
	
	//Change Dialogue 
	public void changeDialogue (String wantedDialogue)
	{
		dialogue = wantedDialogue;
	}
	
	//Ends Monster Dialogue
	public void endMonsterDialogue ()
	{
		monster = false;
	}
	
	//Start Monster Dialogue
	public void startMonsterDialogue ()
	{
		monster = true;
	}
	
	public void paintComponent(Graphics g)
	{	
		super.paintComponent(g);
		
		if(gameinfo.getEnding() == 0)
		{	
			g.setColor(Color.gray);
			if(monster == true)
			{	
				g.setColor(Color.black);
			}
			g.fillRect(000,500,700,400);
			
			if(monster == true)
			{
				g.setColor(Color.red);
			}
			
			else 
			{
				g.setColor(Color.white);
			}
			g.drawString(dialogue, 140, 550);
		}
		
		// Transition to Ending Titles
		if (gameinfo.getEnding()== -1)
		{
			g.setColor(Color.white);
			g.drawString(dialogue, 140, 550);
		}
				
		// Bad Ending 
		if (gameinfo.getEnding() == 3)
		{
			g.setColor(Color.red);
			g.drawString("You were never found.", 250, 250-15);
			g.drawString("Game Over", 250, 250);
		}
			
		// Alva left Behind Ending 
		if (gameinfo.getEnding()== 1)
		{
			g.setColor(Color.blue);
			g.drawString("You survived.", 250, 250-15);
			g.drawString("Sole Survivor Ending", 250, 250);
		}
			
		// Both survive Ending 
		if(gameinfo.getEnding() == 2)
		{
			g.setColor(Color.white);
			g.drawString("What a beautiful day.", 250, 250-15);
			g.drawString("Through the Fire Ending", 250, 250);
		}
	}
}