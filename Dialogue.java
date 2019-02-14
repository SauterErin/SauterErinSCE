package choice;
import java.awt.*;

import javax.swing.*;
public class Dialogue extends JPanel{
String [][] dialogue = new String [99][10];
int[] Choicecatcher = new int [99];
GameCalendar calen;
InteractionPanel inter;
Select select;
int scriptnumber;

	public Dialogue (GameCalendar calen, InteractionPanel inter, Select select)
	{
		
		this.calen = calen;
		this.inter = inter;
		this.select = select;
		int scriptnumber  =0;
	
	
	dialogue[0][0] = "This is a bed.";
	dialogue[0][1] = "This is YOUR bed.";
	dialogue[0][2] = "%";
	

	dialogue[1][0] = "Hello, if you're reading this you got detention!";
	dialogue[1][1] = "The camera hidden in there never works -";
	dialogue[1][2] = "There's a spare *Red Door key* hidden in the piano next door.";
	dialogue[1][3] = "And there's a hole through the wall there behind a loose panel.";
	dialogue[1][4] = "What are you going to do?";
	dialogue[1][5] = " - Jackson Watson Class of xxxx, Garland Boarding School";
	dialogue[1][6] = "@";
	
	dialogue[4][0] = "The door is locked.";
	dialogue[4][1] = "@";
	
	dialogue[2][0] = "The floor boards are loose.";
	dialogue [2][1] = "You lift them.";
	dialogue[2][2] = "%";

			
	dialogue [3][0] = "The floor hollow is empty.";

	dialogue [3][1] = "@";
	
	dialogue[8][0] = "%";




	
	dialogue[98][0] = "Grandfather: Dead end, my dear.";
	dialogue[98][1] = "Grandmother: Three weeks - where could they be?.";
	dialogue[98][2] = "Grandfather: We'll find them. I promise.";
	dialogue[98][3] = "@";



	}
	
	public void readDialogue(int newscript)
	{
		scriptnumber = newscript;
		calen.startDialogue();
		continueDialogue(0);

	}
	
	public void shortcutSelect(int skip)
	{

		calen.startSelect();
		select.changeSelectionNumber(skip);
	}
	
	public int returnScript()
	{
		return scriptnumber;
	}
	
	public int continueDialogue(int number)
	{
		int ongoingdialogue = number+1;
		if(dialogue[scriptnumber][number] != "@")

			if(dialogue[scriptnumber][number] != "%")
			{
				inter.changeDialogue(dialogue[scriptnumber][number]);
			}
			
			else
			{	
				ongoingdialogue = 0;
				calen.endDialgoue();
				calen.startSelect();
				select.changeSelectionNumber(scriptnumber);
			}
		
	
		else
		{
		ongoingdialogue = 0;
		inter.changeDialogue("");
		calen.endDialgoue();
		
		if(calen.getGameDay() == -2)
		{
			calen.finishBadEnd1();
		}
			

		}
	
		
		return ongoingdialogue;
	}
	
}
