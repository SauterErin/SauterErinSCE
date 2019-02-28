package choice;
import java.awt.*;

import javax.swing.*;
public class Select extends JPanel{
String [][] select = new String [99][10];
GameCalendar calen;
InteractionPanel inter;
List list;
int selectionnumber;
boolean choice;
String dialogue;
Dialogue2nd log2; 

	public Select (GameCalendar calen, InteractionPanel inter, List list)
	{
		
		this.calen = calen;
		this.inter = inter;
		this.list = list;
		 boolean choice = true;
		int selectionnumber  = 0;
		String dialogue = "Testing";
		System.out.println(dialogue);
		log2 = new Dialogue2nd(calen, inter);
	
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
			dialogue = "The paneling is stuck on the power switch, move it?";
	}
	
	public void changeChoice(){

		if (choice == true)
			{choice = false;}
		else
			choice = true;
	}
	
	public void optionSelect()
	
	{
		if (selectionnumber == 0)
				{
					if (choice == true)
					{
						calen.endSelect();
						calen.startBadEnd1();
						log2.readDialogue(98);
					}
					
					else
					{
						calen.endSelect();
					}
				}
		
		if (selectionnumber == 2)
		{
			if (choice == true)
			{
				calen.endSelect();
				
				list.actNote1();
				calen.increaseInventoryTotal();
				
				log2.readDialogue(3);
			}
			
			else
			{
				calen.endSelect();
			}
		}
		
		if (selectionnumber == 8)
			if (choice == true)
				{calen.endSelect();
				list.switchPowerSwitch();
				log2.readDialogue(8);}
		choice = true;
	}
	
	public void paintComponent(Graphics g)
	{	
		super.paintComponent(g);
		g.setColor(Color.darkGray);
		g.fillRect(000,400,400,300);
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
