package choice;
import java.awt.*;

import javax.swing.*;
public class Dialogue2nd extends JPanel{
	
	int scriptnumber;
	String [][] dialogue = new String [99][10];
	
	GameMode gameinfo;
	GameSprite sprite;
	InteractionPanel inter;
	List list;
	Select select;
	SystemMode system;

	public Dialogue2nd (GameMode gameinfo, SystemMode system, InteractionPanel inter, GameSprite sprite, List list)
	{	
		this.gameinfo = gameinfo;
		this.list = list;
		this.inter = inter;
		this.sprite = sprite;
		this.system = system;
		
		scriptnumber = 0;
	
		//Dialogue List
			
		dialogue[0][0] = "Hello, if you're reading this you got detention!";
		dialogue[0][1] = "The camera hidden in here never works -";
		dialogue[0][2] = "There's a spare *Red Door key* hidden in the piano next door.";
		dialogue[0][3] = "And there's a hole through the wall there behind a loose panel.";
		dialogue[0][4] = "What are you going to do?";
		dialogue[0][5] = " - Jackson Watson Class of xxxx, Garland Boarding School";
		dialogue[0][6] = "@";
		
		dialogue[1][0] = "You pull the paneling.";
		dialogue[1][1] = "It presses the power off.";
		dialogue[1][2] = "*ROAR* *CRASH* *BANG*";
		dialogue[1][3] = "The switch won't power back on.";
		dialogue[1][4] = "@";
		
		dialogue[2][0] = "^";
		dialogue[2][1] = "You feel sick.";
		dialogue[2][2] = "There's no angry roar.";
		dialogue[2][3] = "No outrage.";
		dialogue[2][4] = "Just silence.";
		dialogue[2][5] = "You don't have the strength to go back inside.";
		dialogue[2][6] = "@";
		
		dialogue[3][0] = "*Pry* *Thunk*";
		dialogue[3][1] = "^";
		
		dialogue[4][0] = "^";
		
		dialogue[5][0] = "Grandfather: Dead end, my dear.";
		dialogue[5][1] = "Grandmother: Three weeks - where could they be?.";
		dialogue[5][2] = "Grandfather: We'll find them. I promise.";
		dialogue[5][3] = "^";
	}
	
	// Go through dialogue array accoring to scriptnumber
	public int continueDialogue(int number)
	{
		boolean wait = true;
		
		int ongoingdialogue = number+1;
		
		// @ means end script 
		if(dialogue[scriptnumber][number] != "@")
				
		{
			// ^ - means non simple interactions
			if(dialogue[scriptnumber][number] == "^")
			{
				if(scriptnumber == 2)
				{
					ongoingdialogue = 1;
					gameinfo.changeRoom(20);
					sprite.endPresentMonster();
					sprite.setGameSprite(4,14,'N');
					continueDialogue(1);
				}
				
				if(scriptnumber == 3)
				{
					sprite.endPresentMonster();
					gameinfo.changeRoom(0);
					sprite.setGameSprite(9,1,'S');
					list.actNightofFireRescue();
					system.endDialogue2();
					system.startMove();
					ongoingdialogue = 0;
				}
				
				//Prep to bad ending
				if(scriptnumber == 4 && wait == true)
				{
					wait = false;
					gameinfo.changeEnding(-1);
					ongoingdialogue = 0;
					readDialogue(5);
				}
				
				//Bad Ending screen
				if(scriptnumber == 5 && wait == true)
				{
					gameinfo.changeEnding(3);
					wait = false;
					repaint();
					system.endDialogue2();
				}
				
			}
			
			//If not special then default
			if(dialogue[scriptnumber][number] != "^")
			{
				inter.changeDialogue(dialogue[scriptnumber][number]);
			}
		}
			
		//If @ - aka ending dialogue 
		else
		{	
			//Revert ongoingdialogue to 0 
			ongoingdialogue = 0;
			
			//Revert Dialogue to null
			inter.changeDialogue("");
			
			//End Dialogue2() mode
			system.endDialogue2();
			
			//Start Move mode
			system.startMove();
		}
		return ongoingdialogue;
	}
	
	// Starts/Changes Dialogue 
	public void readDialogue(int newscript)
	{
		scriptnumber = newscript;
		system.startDialogue2();
		system.endMove();
		continueDialogue(0);	
	}
	
	//Return script 
	public int returnScript()
	{
		return scriptnumber;
	}
}