package choice;
import java.awt.*;

import javax.swing.*;
public class Select extends JPanel{
String [][] select = new String [99][10];
GameMode gameinfo;
SystemMode system;
InteractionPanel inter;
List list;
int selectionnumber;
boolean choice;
String dialogue;
Dialogue2nd log2; 

	public Select (GameMode gameinfo, SystemMode system, InteractionPanel inter, List list)
	{
		
		this.gameinfo = gameinfo;
		this.system = system;
		this.inter = inter;
		this.list = list;
		 boolean choice = true;
		int selectionnumber  = 0;
		String dialogue = "Testing";
		log2 = new Dialogue2nd(gameinfo, system, inter);
	
	}
	
	public void changeSelectionNumber (int change)
	{
		dialogue = "error";
		selectionnumber = change;
		if(change ==0)
		{
			dialogue = "Do you want to go back to bed?";
		}
		
		if(change == 2)
		{
			dialogue = "There's a note here, do you take it?";
		}
		
		if(change == 8)
		{
			dialogue = "The paneling is stuck on the power switch, move it?";
		}
		
		if(change == 31)
		{
			dialogue = "Do you pull the wires?";
		}
		
		if(change == 32)
		{
			dialogue = "Do you pop the door?";
		}
		
		if(change == 37)
		{
			dialogue = "Do you pull the wires?";
		}
	}
	
	public void changeChoice(){

		if (choice == true)
			{
				choice = false;
			}
		else
			choice = true;
	}
	
	public void optionSelect()
	
	{
		if (selectionnumber == 0)
				{
					if (choice == true)
					{
						system.endSelect();
						gameinfo.startBadEnd1();
						log2.readDialogue(98);
					}
					
					else
					{
						system.endSelect();
						system.startMove();
					}
				}
		
		if (selectionnumber == 2)
		{
			if (choice == true)
			{
				system.endSelect();
				
				list.actNote1();
				
				log2.readDialogue(3);
			}
			
			else
			{
				system.endSelect();
				system.startMove();
			}
		}
		
		if (selectionnumber == 8)
			if (choice == true)
				{
					system.endSelect();
					system.startMove();
					list.switchPowerSwitch();
					list.Escape();
					log2.readDialogue(8);
				}
			else
			{
				system.endSelect();
				system.startMove();
			}
		
		if (selectionnumber == 31 ||  selectionnumber == 37)
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
		if (selectionnumber == 32 ||  selectionnumber == 38)
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
		if(choice == true)
			g.fillRect(100,500,10,10);
		else
			g.fillRect(100,550,10,10);
	}
	
}
