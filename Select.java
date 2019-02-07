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
		Dialogue2nd log2 = new Dialogue2nd(calen, inter);
	
	}
	
	public void changeSelectionNumber (int change)
	{

		selectionnumber = change;
		if(change ==0)
		{
			dialogue = "Do you want to go back to bed?";
		}
		
		if(change == 2)
		{
			dialogue = "There's a note here, do you take it?";
		}
		
	}
	
	public void changeChoice(){

		if (choice == true)
			{choice = false;}
		else
			choice = true;
	}
	
	public void optionSelect()
	
	{
		
		System.out.println(dialogue+ "Choosing");

		if (selectionnumber == 0)
				{
					if (choice == true)
					{
						calen.endSelect();
						calen.startBadEnd1();
						inter.beginEndScript();
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
				
				//log2.readDialogue(1);
			}
			
			else
			{
				calen.endSelect();
			}
		}
		choice = true;
	}
	
	public void paintComponent(Graphics g)
	{	
		super.paintComponent(g);
		g.setColor(Color.darkGray);
		g.fillRect(100,100,200,200);
		g.setColor(Color.white);
		g.drawString(dialogue, 140, 150);
		g.drawString("Yes", 140, 200);
		g.drawString("No", 140, 250);
		if(choice == true)
			g.fillRect(100,200,10,10);
		else
			g.fillRect(100,250,10,10);
	}
	
}
