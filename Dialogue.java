package choice;
import java.awt.*;
import javax.swing.*;
public class Dialogue extends JPanel{
String [][] dialogue = new String [99][10];
GameCalendar calen;
InteractionPanel inter;

	public Dialogue (GameCalendar calen, InteractionPanel inter)
	{
		calen = this.calen;
		inter = this.inter;
	
	
	dialogue[0][0] = "This is a bed.";
	dialogue[0][1] = "This is YOUR bed.";
	dialogue[0][2] = "@";

	}
	
	public void readDialogue(int scriptnumber)
	{
		int testing = scriptnumber;
		boolean ongoingdialogue = true;
		int i = 0;
		while(ongoingdialogue = true){
			if(dialogue[scriptnumber][i] != "@")
				{
					if(dialogue[scriptnumber][i] != "%")
					{	System.out.println(dialogue[scriptnumber][0]);
						inter.changeDialogue("");
						inter.changeDialogue(dialogue[scriptnumber][0]);
					}
					
					else
					{
						ongoingdialogue = false;
					}
				}
			
			else
			{
				ongoingdialogue = false;
				inter.changeDialogue("");
			}
			
			i = i+1;
		
		
		}
	}
	
}
