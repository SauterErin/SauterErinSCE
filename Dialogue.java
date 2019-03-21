package choice;
import java.awt.*;

import javax.swing.*;
public class Dialogue extends JPanel{
String [][] dialogue = new String [99][10];
int[] Choicecatcher = new int [99];
GameMode gameinfo;
SystemMode system;
InteractionPanel inter;
Select select;
GameSprite sprite;
List list;
int scriptnumber;

	public Dialogue (GameMode gameinfo, SystemMode system, InteractionPanel inter, Select select, GameSprite sprite, List list)
	{
		
		this.gameinfo = gameinfo;
		this.system = system;
		this.list = list;
		this.inter = inter;
		this.select = select;
		this.sprite = sprite;
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
	
	dialogue [6][0] = "You take the yellow key.";
	dialogue [6][1] = "^";
	dialogue [6][2] = "Now your dad has his card.";
	
	dialogue [6][3] = "You hear something in the dark.";
	dialogue [6][4] = "Run back to bed.";
	dialogue [6][5] = "@";


	
	dialogue[8][0] = "%";
	dialogue[9][0] = "You open the piano - there's a red passkey inside.";
	dialogue[9][1] = "You take it.";
	dialogue[9][2] = "@";
	
	dialogue[10][0] = "There's a loose panel upon the wall.";

	dialogue[10][1] = "@";
	
	dialogue[13][0] = "The panel is stuck.";
	dialogue[13][1] = "@";

	dialogue[11][0] = "There's nothing else.";
	dialogue[11][1] = "@";
	
	dialogue[12][0] = "The door won't open. It's locked.";
	dialogue[12][1] = "@";
	
	dialogue [14][0] = "You dive into bed";
	dialogue [14][1] = "And wait for dawn.";;
	dialogue [14][2] = "^";
	
	dialogue [15][0] = "Jackson: For the next generation of troublemakers.";
	dialogue [15][1] = "@";
	
	dialogue [16][0] = "Jackson: I thought I told you only big kids are allowed to sneak around, Alva.";
	dialogue [16][1] = "^";
	dialogue [16][2] = "Jackson: *Sigh* - Come on let's get you to bed.";
	dialogue [16][3] = "@";
	
	dialogue [17][0] = "Jackson: Alva's rope. She's up.";
	dialogue [17][1] = "Jackson: Little squirt.";
	dialogue [17][2] = "^";
	
	dialogue [18][0] = "If you had a rope you could climb this.";
	dialogue [18][1] = "@";
	
	dialogue [19][0] = "Jackson: No going back up. You need to sleep.";
	dialogue [19][1] = "@";
	
	dialogue[20][0] = "You pick up the note on the ground.";
	dialogue[20][1] = "^";
	dialogue[20][2] = "It reads:";
	dialogue[20][3] = "Critical Notice: The power must remain on during the system tests tonight.";
	dialogue[20][4] = "Also someone close up that rat hole in the power room.";
	dialogue[20][5] = "@";

	dialogue [21][0] = "Your dad's office is the one with the yellow door.";
	dialogue [21][1] = "But you don't have a key.";
	dialogue [21][2] = "So how are you going to get in there to leave him the card?";
	dialogue [21][3] = "^";
	
	dialogue [22][0] = "Jackson: The squirt is up. Have to get her to bed.";
	dialogue [22][1] = "@";
	
	dialogue[23][0] = "The hole leads to the hallway.";
	dialogue[23][1] = "You're awfully high up.";
	dialogue[23][2] = "@";
	
	dialogue[24][0] = "Jackson: Good idea squirt.";
	dialogue[24][1] = "^";
	
	dialogue[25][0] = "Jackson: Good luck future kid.";
	dialogue[25][1] = "Jackson: Now I only have the *Red Key*";
	dialogue[25][2] = "^";

	
	dialogue[26][0] = "Jackson: No, Alva is holding the door for me. I won't need this.";
	dialogue[26][1] = "@";
	
	dialogue[27][0] = "Jackson: But how do we keep the door open...";
	dialogue[27][1] = "@";

	dialogue[28][0] = "Jackson: I will be right back Alva.";
	dialogue[28][1] = "^";
	dialogue[28][2] = "Jackson: Alright, second door to my... left.";
	dialogue[28][3] = "@";
	
	dialogue[29][0] = "Jackson: Yes - I have you back!";
	dialogue[29][1] = "Pockets screwdriver.";
	dialogue[29][2] = "^";
	
	dialogue[30][0] = "Jackson: Okay - I can pop the door... or I could pull a wire.";
	dialogue[30][1] = "Jackson: Choices choices...";
	dialogue[30][2]= "@";
	
	dialogue[31][0] = "Jackson: If I just pull this...";
	dialogue[31][1] = "%";

	dialogue[32][0] = "Jackson: If I just push at this angle...";
	dialogue[32][1] = "%";

	
	dialogue[33][0] = "Jackson: I already pulled the wires.";
	dialogue[33][1] = "@";

	dialogue[34][0] = "The door has been reinforced.";
	dialogue[34][1] = "@";
	
	dialogue[35][0] = "Jackson: I already opened the door.";
	dialogue[35][1] = "@";


	dialogue[36][0] = "The panel has been seared shut.";
	dialogue[36][1] = "@";
	
	dialogue[37][0] = "The door should open if you pull a wire...";
	dialogue[37][1] = "%";
	
	dialogue[38][0] = "If you push here you might be able to get the door open...";
	dialogue[38][1] = "@";

	dialogue[39][0] = "No - you're never going down there again.";
	dialogue[39][0] = "@";

	dialogue[40][0] = "You can hear the whirring of machines.";
	dialogue[40][1] = "@";
	
	dialogue[41][0] = "Jackson: Just remove this panel and...";
	dialogue[41][1] = "Pop";
	dialogue[41][2] = "^";

	dialogue[42][0] = "Jackson: No - I already got my screwdriver.";
	dialogue[42][1] = "Jackson: And you're little. It's time for you to sleep.";
	dialogue[42][2] = "@";
	
	dialogue[43][0] = "Jackson: No that's the science wing.";
	dialogue[43][1] = "Jackson: We're already pushing our luck as it is.";
	dialogue[43][2] = "@";

	dialogue[44][0] = "Jackson: I have to get my screwdriver.";
	dialogue[44][1] = "Jackson: Anyways I can't reach without help anyways.";
	dialogue[44][2] = "@";
	
	dialogue[45][0] = "The vent is welded shut.";
	dialogue[45][1] = "@";
	
	dialogue[46][0] = "Jackson: Up you go squirt.";
	dialogue[46][1] = "^";
		
	dialogue[47][0] = "Jackson: I have to get my screwdriver.";
	dialogue[47][1] = "Jackson: Anyways I can't reach without help anyways.";
	dialogue[47][2] = "@";
	
	dialogue[48][0] = "That's your father's ID.";
	dialogue[48][1] = "Where is he?";
	dialogue[48][2] = "@";
	
	dialogue[49][0] = "Someone is banging on the door.";
	dialogue[49][2] = "You need to go, you need to run.";
	dialogue[49][1] = "^";
	dialogue[49][3] = "@";
	
	dialogue[50][0] ="Just empty bed frames. Covered in dust.";
	dialogue[50][1] = "@";

	dialogue[51][0] ="Jackson: Sleep.";
	dialogue[51][1] ="^";


	dialogue[52][0] ="Jackson: No - we have to leave today.";
	dialogue[52][1] = "@";
	
	dialogue[53][0] ="Jackson: Asleep. Thank goodness.";
	dialogue[53][1] = "Jackson: Little sisters are exhausting.";
	dialogue[53][2] = "@";

	
	dialogue[54][0] ="Jackson: I'm not losing her.";
	dialogue[54][1] = "@";
	
	dialogue[56][0] ="Jackson: So many missing.";
	dialogue[56][1] = "@";
	
	dialogue[57][0] = "Jackson: Here's the screwdriver.";
	dialogue[57][1] = "Click, clack.";
	dialogue[57][2] = "Click, clack.";
	dialogue[57][3] = "^";	


	dialogue[58][0] = "Jackson: Good work, now bed.";
	dialogue[58][1] = "^";
	
	dialogue[59][0] ="Time to explore.";
	dialogue[59][1] = "@";	
			
	dialogue[98][0] = "Grandfather: Dead end, my dear.";
	dialogue[98][1] = "Grandmother: Three weeks - where could they be?.";
	dialogue[98][2] = "Grandfather: We'll find them. I promise.";
	dialogue[98][3] = "@";
	}
	
	public void readDialogue(int newscript)
	{
		scriptnumber = newscript;
		system.startDialogue();
		system.endMove();
		continueDialogue(0);

	}
	
	public void shortcutSelect(int skip)
	{

		system.startSelect();
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
		{
			if(dialogue[scriptnumber][number] != "%" && dialogue[scriptnumber][number] != "^")
			{
				inter.changeDialogue(dialogue[scriptnumber][number]);
			}
			
			else
			{	

				
				if(dialogue[scriptnumber][number] == "%")
				{
				ongoingdialogue = 0;
				system.endDialogue();
				system.startSelect();
				select.changeSelectionNumber(scriptnumber);
				}
				
				if(dialogue[scriptnumber][number] == "^")
				{ 
					ongoingdialogue = 0;
					boolean firstbranch = true;

					if(scriptnumber == 14 && firstbranch == true)
					{
						gameinfo.currentyear = 2042;
						sprite.setGameSprite(3,4, 'N');
						list.Note1= false;
						list.switchYellowKey();
						list.switchGreenKey();
						readDialogue(15);
						firstbranch = false;
					}
					
					if(scriptnumber == 51 && firstbranch == true)
					{
						gameinfo.currentyear = 2052;
						gameinfo.changeRoom(2);
						sprite.setGameSprite(1,3, 'E');
						list.Note1= true;
						list.switchYellowKey();
						list.switchGreenKey();
						list.switchRedKey();
						list.actNight2();
						readDialogue(59);
						firstbranch = false;
					}
					
					if(scriptnumber == 20 && firstbranch == true)
					{
						ongoingdialogue = 2;
						list.actNote2();
						firstbranch = false;
						continueDialogue(2);
					}
					
					if(scriptnumber == 6 && firstbranch == true)
					{
						ongoingdialogue = 2;
						list.switchYellowKey();
						firstbranch = false;
						continueDialogue(2);
					}
					
					if(scriptnumber == 16 && firstbranch == true)
					{	ongoingdialogue = 2;
						sprite.alvaDirection ='N';
						sprite.switchAlvaFollow();
						list.meetAlva();
						firstbranch = false;
						continueDialogue(2);
					}
					
					if(scriptnumber == 17 && firstbranch == true)
					{
						gameinfo.changeRoom(10);
						sprite.setGameSprite(2,1,'S');
						readDialogue(16);
						firstbranch = false;

					}
					
					if(scriptnumber == 21 && firstbranch == true)
					{
						list.enterNorthHallway();
						system.endDialogue();
						firstbranch = false;
						system.startMove();
					}
					
					if (scriptnumber == 24 && firstbranch == true)
					{
						sprite.switchAlvaFollow();
						list.switchDoorHold1();
						system.endDialogue();
						system.startMove();
						firstbranch = false;
					}
					
					if (scriptnumber == 25 && firstbranch == true)
					{
						list.actHideRedKey();
						system.endDialogue();
						firstbranch = false;
						system.startMove();
					}
					
					if (scriptnumber == 28 && firstbranch == true)
					{	
						ongoingdialogue = 2;
						sprite.switchAlvaFollow();
						gameinfo.changeRoom(12);
						sprite.setGameSprite (1, 2, 'E');
						firstbranch = false;
						continueDialogue(2);
					}
					
					if (scriptnumber == 29 && firstbranch == true)
					{	
						list.actRetrieveScrewdriver();
						system.endDialogue();
						firstbranch = false;
						system.startMove();
					}
					
					if (scriptnumber == 41 && firstbranch == true)
					{	
						list.actRemovePanel();
						gameinfo.changeRoom(11);
						sprite.setGameSprite (17, 7, 'N');
						system.endDialogue();
						firstbranch = false;
						system.startMove();
					}
					
					if(scriptnumber == 46 && firstbranch == true)
					{
						sprite.switchAlvaFollow();
						readDialogue(57);
						firstbranch = false;

					}
					
					if(scriptnumber == 57 && firstbranch == true)
					{
						sprite.switchAlvaFollow();
						sprite.alvaDirection = 'E';
						readDialogue(58);	
						firstbranch = false;

					}
					
					if(scriptnumber == 58 && firstbranch == true)
					{
						gameinfo.changeRoom(15);
						sprite.switchAlvaFollow();
						sprite.setGameSprite(4,1,'S');
						system.endDialogue();
						system.startMove();
						firstbranch = false;

					}
					

				}				
			}
		}
		else
		{
			ongoingdialogue = 0;
			inter.changeDialogue("");
			system.endDialogue();
			system.startMove();
			
			if(gameinfo.getGameDay() == -2)
			{
				gameinfo.finishBadEnd1();
			}
				
	
		}
		
		return ongoingdialogue;
	}
	
}
