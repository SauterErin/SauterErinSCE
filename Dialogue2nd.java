package choice;
import java.awt.*;

import javax.swing.*;
public class Dialogue2nd extends JPanel{
String [][] dialogue = new String [99][10];
GameCalendar calen;
InteractionPanel inter;
Select select;
int scriptnumber;

	public Dialogue2nd (GameCalendar calen, InteractionPanel inter)
	{
		
		this.calen = calen;
		this.inter = inter;
		int scriptnumber  =0;
	
	

	

	dialogue[1][0] = "Hello, if you're reading this you got detention!";
	dialogue[1][1] = "The camera hidden in here never works -";
	dialogue[1][2] = "There's a spare *Red Door key* hidden in the piano next door.";
	dialogue[1][3] = "And there's a hole through the wall there behind a loose panel.";
	dialogue[1][4] = "What are you going to do?";
	dialogue[1][5] = " - Jackson Watson Class of xxxx, Garland Boarding School";
	dialogue[1][6] = "@";
	
	dialogue[98][0] = "Grandfather: Dead end, my dear.";
	dialogue[98][1] = "Grandmother: Three weeks - where could they be?.";
	dialogue[98][2] = "Grandfather: We'll find them. I promise.";
	dialogue[98][3] = "@";



	}
	
	public void readDialogue(int newscript)
	{
		scriptnumber = newscript;
		calen.startDialogue2();
	}
	
	public int returnScript()
	{
		return scriptnumber;
	}
	
	public int continueDialogue(int number)
	{
		int ongoingdialogue = number+1;
		if(dialogue[scriptnumber][number] != "@")
				
		inter.changeDialogue(dialogue[scriptnumber][number]);

			
		else
		{
		ongoingdialogue = 0;
		inter.changeDialogue("");
		calen.endDialgoue2();
		
		if(calen.getGameDay() == -2)
		{
			calen.finishBadEnd1();
		}
			

		}
	
		
		return ongoingdialogue;
	}
	
}
