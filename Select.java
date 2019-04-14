package choice;
import java.awt.*;

import javax.swing.*;
public class Select extends JPanel{

private boolean choice;
private int selectionnumber;
private String dialogue;
private String [][] select = new String [99][10];

Dialogue2nd log2; 
GameMode gameinfo;
GameSprite sprite;
InteractionPanel inter;
List list;
SystemMode system;

	public Select (GameMode gameinfo, SystemMode system, InteractionPanel inter, List list, GameSprite sprite)
	{
		this.gameinfo = gameinfo;
		this.inter = inter;
		this.list = list;
		this.system = system;
		this.sprite = sprite;
		
		choice = true;
		dialogue = "";
		log2 = new Dialogue2nd(gameinfo, system, inter, sprite, list);
		selectionnumber  = 0;		
	}
	
	// Used for switching between Yes/No
	public void changeChoice(){

		if (choice == true)
			{
				choice = false;
			}
		else
			choice = true;
	}
	
	public void changeSelectionNumber (int change)
	{
		//Invalid entry 
		dialogue = "error";
		
		// - Go back to bed early
		if(change == 0)
		{
			dialogue = "Do you want to go back to bed?";
		}
		
		// - Open Trap Door
		if(change == 2)
		{
			change = 1;
			dialogue = "There's a note here, do you take it?";
		}
		
		// - Power Switch
		if(change == 8)
		{
			change = 2;
			dialogue = "The paneling is stuck on the power switch, move it?";
		}
		
		// - Jackson Pull Wires 
		if(change == 31)
		{
			change = 3;
			dialogue = "Do you pull the wires?";
		}
		
		// - Force door open 
		if(change == 32 || change == 38)
		{
			change = 4;
			dialogue = "Do you pop the door?";
		}
		
		// - Will Pull Wires
		if(change == 37)
		{
			change = 5;
			dialogue = "Do you pull the wires?";
		}
		
		// Leave Purple Door - Exit Hall x1
		if(change == 131)
		{
			change = 6;
			dialogue = "Do you leave?";
		}
		
		// Lock in Ending 1
		if(change == 701)
		{
			change = 7;
			dialogue = "She'll burn. She'll die. Is this your choice?";
		}
		
		// Leave via Vent - Exit Hall x1
		if(change == 137)
		{
			change = 8;
			dialogue = "Do you pry open the vent?";
		}
		
		// Lock in Ending 2
		if(change == 702)
		{
			change = 9;
			dialogue = "You might die. Is this your choice?";
		}
		
		selectionnumber = change;
	}
	
	// Acts upon user chice
	public void optionSelect()
	{		
		boolean wait = true;
		
		// Go back to bed Early
		if (selectionnumber == 0)
		{
			if (choice == true)
			{
				system.endSelect();
				gameinfo.changeEnding(-1);
				log2.readDialogue(4);
			}
					
			else
			{
				system.endSelect();
				system.startMove();
			}
		}
		
		// Read Jackson's Note
		if (selectionnumber == 1)
		{
			if (choice == true)
			{
				system.endSelect();
				list.actNote1();
				log2.readDialogue(0);
			}
			
			else
			{
				system.endSelect();
				system.startMove();
			}
		}
		
		// Press Power switch
		if (selectionnumber == 2)
		{
			if (choice == true)
			{
				system.endSelect();
				system.startMove();
				list.endPowerSwitch();
				list.actEscape();
				log2.readDialogue(1);
			}
		
			else
			{
				system.endSelect();
				system.startMove();
			}
		}
		
		// Pull Wires
		if (selectionnumber == 3 ||  selectionnumber == 5)
		{
			if (choice == true)
			{
				system.endSelect();
				system.startMove();
				list.actBrokenWireBox();
			}
			
			else
			{
				system.endSelect();
				system.startMove();
			}
		}	
		
		// Pop Door 
		if (selectionnumber == 4)
		{
			if (choice == true)
			{
				system.endSelect();
				system.startMove();
				list.actBrokenSimpleDoor();
			}
			
			else
			{
				system.endSelect();
				system.startMove();
			}
		}
		
		// Ending 1 x1
		if (selectionnumber == 6 && wait == true)
		{
			wait = false;
			if (choice == true)
			{				
				changeSelectionNumber(701);	
			}

			else
			{
				system.endSelect();
				system.startMove();
			}
		}
		
		// Ending 1 confirmed
		if (selectionnumber == 7 && wait == true)
		{	
			wait = false;
			if (choice == true)
				{
					system.endSelect();
					system.startDialogue2();
					log2.readDialogue(2);
				}
			
			else
			{
				system.endSelect();
				system.startMove();
			}
		}
		
		// Ending 2 x1 
		if (selectionnumber == 8 && wait == true)
		{
			wait = false;
			if (choice == true)
			{				
				changeSelectionNumber(702);	
			}
			
			else
			{
				system.endSelect();
				system.startMove();
			}
		}
		
		// Ending 2 Confirmed
		if (selectionnumber == 9 && wait == true)
		{	
			wait = false;
			if (choice == true)
			{
				system.endSelect();
				system.startDialogue2();
				log2.readDialogue(3);
			}
			
			else
			{
				system.endSelect();
				system.startMove();
			}
		}
		choice = true;
	}
	
	public void paintComponent(Graphics g)
	{	
		super.paintComponent(g);
		g.setColor(Color.gray);
		g.fillRect(000,400,600,300);
		g.setColor(Color.white);
		g.drawString(dialogue, 140, 450);
		g.drawString("Yes", 140, 500);
		g.drawString("No", 140, 550);

		// Pointer shows that user is pointed at yes
		if(choice == true)
		{
			g.fillRect(100,500,10,10);
		}
		
		// Pointer shows that user is point at no
		else
		{
			g.fillRect(100,550,10,10);
		}
	}
}