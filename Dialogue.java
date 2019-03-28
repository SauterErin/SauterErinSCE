package choice;
import java.awt.*;

import javax.swing.*;
public class Dialogue extends JPanel{
String [][] dialogue = new String [199][12];
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

	dialogue[11][0] = "There's nothing else.";
	dialogue[11][1] = "@";
	
	dialogue[12][0] = "The door won't open. It's locked.";
	dialogue[12][1] = "@";
	
	dialogue[13][0] = "The panel is stuck.";
	dialogue[13][1] = "@";
	
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

	dialogue[24][0] = "Jackson: Need key to open door - but need to hide key...";
	dialogue[24][1] = "^";
	dialogue[24][2] = "Jackson: Good idea squirt.";
	dialogue[24][3] = "@";

	
	dialogue[25][0] = "Jackson: Good luck future kid.";
	dialogue[25][1] = "Jackson: Now I only have the *Green Door Key*";
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


	dialogue[36][0] = "The panel has been welded shut.";
	dialogue[36][1] = "@";
	
	dialogue[37][0] = "The door should open if you pull a wire...";
	dialogue[37][1] = "%";
	
	dialogue[38][0] = "If you push here you might be able to get the door open...";
	dialogue[38][1] = "%";

	dialogue[39][0] = "No - you're never going down there again.";
	dialogue[39][1] = "@";

	dialogue[40][0] = "You can hear the whirring of machines.";
	dialogue[40][1] = "@";
	
	dialogue[41][0] = "Jackson: Just remove this panel and...";
	dialogue[41][1] = "*Pop*";
	dialogue[41][2] = "^";

	dialogue[42][0] = "Jackson: No - I already got my screwdriver.";
	dialogue[42][1] = "Jackson: And you're little. It's time for you to sleep.";
	dialogue[42][2] = "@";
	
	dialogue[43][0] = "Jackson: No that's the science wing.";
	dialogue[43][1] = "Jackson: We're already pushing our luck as it is.";
	dialogue[43][2] = "@";

	dialogue[44][0] = "Jackson: I have to get my screwdriver.";
	dialogue[44][1] = "Jackson: It's in the East Wing.";
	dialogue[44][2] = "@";
	
	dialogue[45][0] = "The vent is welded shut.";
	dialogue[45][1] = "@";
	
	dialogue[46][0] = "Jackson: Up you go squirt.";
	dialogue[46][1] = "^";
	
	dialogue[47][0] = "Jackson: I need to get some sleep.";
	dialogue[47][1] = "@";
	
	dialogue[48][0] = "That's your father's ID.";
	dialogue[48][1] = "Where is he?";
	dialogue[48][2] = "^";
	
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
	
	dialogue[60][0] = "*Boom*";
	dialogue[60][1] = "@";

	dialogue[61][0] = "Jackson: No, no midnight fieldtrips.";
	dialogue[61][1] = "@";
	
	dialogue [62][0] = "You can see a space above. But you can't reach it.";
	dialogue [62][1] ="@";
	
	dialogue [63][0] = "No, you need to leave. No more time for sleeping.";
	dialogue [63][1] ="Dad... (Sob)";
	dialogue [63][2] ="@";
	
	dialogue[64][0] = "Jackson: I have to hide the key.";
	dialogue[64][1] = "@";
	
	dialogue[65][0] = "The power won't turn back on...";
	dialogue[65][1] = "@";
	
	dialogue[66][0] = "%";
	
	dialogue[67][0]= "You probably shouldn't touch this.";
	dialogue[67][1] = "@";

	dialogue[68][0]= "Jackson: I need to pry this off with my screwdriver.";
	dialogue[68][1] = "@";
	
	dialogue[69][0]= "You're too excited to sleep.";
	dialogue[69][1] = "@";
	
	dialogue[70][0]= "You couldn't sleep here again if you tried.";
	dialogue[70][1] = "@";
	
	dialogue[71][0]= "Why are you even thinking about it!";
	dialogue[71][1] = "@";
	
	dialogue[72][0]= "The grave is unmarked.";
	dialogue[72][1] = "The flower is fresh.";
	dialogue[72][2] = "@";
	
	dialogue[73][0]= "Your dad hasn't seen your card...";
	dialogue[73][1] = "@";
	
	dialogue[74][0]= "Your dad never saw the card.";
	dialogue[74][1] = "They don't get to keep it.";
	dialogue[74][2] = "^";
	
	dialogue[75][0]= "Something very big and very powerful broke this.";
	dialogue[75][1] = "You want your father.";
	dialogue[75][2] = "@";
	
	dialogue[76][0]= "There's nothing here.";
	dialogue[76][1] = "@";
	
	
	dialogue[77][0]= "The dirt is still upturned...";
	dialogue[77][1] = "The grave looks deep.";
	dialogue[77][2] = "@";
	
	dialogue[78][0]= "It's a new grave. The stone was carved by claws.";
	dialogue[78][1] = "Your father's spare ID is left on the grave.";
	dialogue[78][2] = "@";
	
	dialogue[79][0]= "Something is very wrong.";
	dialogue[79][1] = "What's that on the ground?";
	dialogue[79][2] = "@";

	dialogue[80][0]= "Something broke through the door.";
	dialogue[80][1] = "Your dad keeps records in here...";
	dialogue[80][2] = "^";
	
	dialogue[81][0] = "Uh-oh";
	dialogue[81][1] = "@";
	
	dialogue[82][0] = "^";

	dialogue[83][0] = "He - Hello, Mr, Mr. Mo- Monster.";
	dialogue[83][1] = "Pl- Please don't hurt me.";
	dialogue[83][2] = "^";
	
	dialogue[84][0] = "*Bam*";
	dialogue[84][1] = "*Bam*";
	dialogue[84][2] = "Guard: The brat is in here!";
	dialogue[84][3] = "The door holds firm.";
	dialogue[84][4] = "You need to run.";
	dialogue[84][5] = "^";
	
	dialogue[85][0] = "You need to run.";
	dialogue[85][1] = "@";
	
	dialogue[86][0] = "Guard: Oh look, there's our newest test subject.";
	dialogue[86][1] = "^";
	
	dialogue[87][0] = "Jackson: Let me see your throat Alva.";
	dialogue[87][1] = "Jackson: Can you make any sounds?";
	dialogue[87][2] = "Jackson: ... It's alright. It's not your fault.";
	dialogue[87][3] = "Jackson: Everyone else is gone. We need to leave now.";
	dialogue[87][4] = "Jackson: They took my *Green Key* but...";
	dialogue[87][5] = "Jackson: But I still have my screwdriver.";
	dialogue[87][6] = "Jackson: Let's go.";
	dialogue[87][7] = "@";
	
	
	dialogue[88][0] = "*Pry* *Thunk*";
	dialogue[88][1] = "^";


	dialogue[89][0] = "Guard: Caught the mute!";
	dialogue[89][1] = "Jackson: Alva, Alva!";
	dialogue[89][2] = "@";
	
	dialogue[90][0] = "Jackson: I'm not leaving without her.";
	dialogue[90][1] = "@";
	

	dialogue[91][0] = "Guard: It's the trouble maker! We got him!";
	dialogue[91][1] = "Jackson: I'm sorry Alva.";
	dialogue[91][2] = "^";
	
	dialogue[92][0] = "Jackson: I'm so sorry.";
	dialogue[92][1] = "^";

	dialogue[93][0] = "Jackson: Green key!";
	dialogue[93][1] =  "^";
	
	dialogue[94][0] = "...He's dead.";
	dialogue[94][1] = "He was helping me.";
	dialogue[94][2] = "@";
	
	dialogue[95][0] = "Jackson: No - he's expecting that.";
	dialogue[95][1] = "Jackson: I need another way.";
	dialogue[95][2] = "@";
	
	dialogue[96][0] = "^";
	
	dialogue[97][0] = "Not this time.";
	dialogue[97][1] = "Not again.";
	dialogue[97][2] = "They will not hurt another child.";
	dialogue[97][3] = "@";
	
	dialogue[98][0] = "Grandfather: Dead end, my dear.";
	dialogue[98][1] = "Grandmother: Three weeks - where could they be?.";
	dialogue[98][2] = "Grandfather: We'll find them. I promise.";
	dialogue[98][3] = "@";
	
	dialogue[99][0] = "The backpack.";
	dialogue[99][1] = "@";
	
	dialogue[100][0] = "There.";
	dialogue[100][1] = "@";


	dialogue[101][0] = "*Crick*";
	dialogue[101][1] = "@";
	

	dialogue[102][0] = "The block has a strange humming sound.";
	dialogue[102][1] = "@";
	
	dialogue[103][0] = "A mechanical block in two pieces.";
	dialogue[103][1] = "@";
	
	dialogue[104][0] = "The light burns. You can't cross.";
	dialogue[104][1] = "@";
	
	dialogue[105][0] = "No time to add names...";
	dialogue[105][1] = "The flowers don't need to be replaced yet.";
	dialogue[105][2] = "@";
	
	dialogue[106][0] = "He's alive.";
	dialogue[106][1] = "^";
	dialogue[106][2] = "Time to get you out of here...";
	dialogue[106][3] = "Squirt.";
	dialogue[106][4] = "@";

	dialogue[107][0] = "^";
	dialogue[107][1] = "*Boom*";
	dialogue[107][2] = "You'd been afraid of this.";
	dialogue[107][2] = "@";
	
	dialogue[108][0] = "*Sniff*";
	dialogue[108][1] = "The boy's not there.";
	dialogue[108][2] = "@";
	
	dialogue[109][0] = "You will not leave the boy here.";
	dialogue[109][1] = "@";
	
	dialogue[110][0] = "The key out.";
	dialogue[110][1] = "^";
	
	dialogue[111][0] = "I know somewhere safe for you to be.";
	dialogue[111][1] = "^";
	
	dialogue[112][0] = "...";
	dialogue[112][1] = "^";
	
	dialogue[113][0] = "And one way to repay.";
	dialogue[113][1] = "^";
	
	dialogue[114][0] = "It's not enough but thank you.";
	dialogue[114][1] = "^";	
	
	dialogue[115][0] = "Your son will survive.";
	dialogue[115][1] ="He will get out of here.";
	dialogue[115][2] = "I promise.";
	dialogue[115][3] = "^";
	
	dialogue[116][0] = "Scrawled on torn paper - ";
	dialogue[116][1] ="You are awake..";
	dialogue[116][2] = "Time for you to leave.";
	dialogue[116][3] = "Your father is dead.";
	dialogue[116][4] = "I'm sorry.";
	dialogue[116][5] = "*Crash*";
	dialogue[116][6] = "Just take the purple key and GO.";
	dialogue[116][7] = "The people here won't hurt anyone else..";
	dialogue[116][8] = "I'll make sure of it.";
	dialogue[116][9] = "I'll make sure of it.";
	dialogue[116][10] = " - Miss Monster";
	dialogue[116][11] = "^";


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
						sprite.setGameSprite(1,2, 'E');
						list.Note1= true;
						list.switchYellowKey();
						list.switchGreenKey();
						list.switchPowerSwitch();
						System.out.println(list.checkBrokenWireBox());
						if(list.checkBrokenWireBox() == true)
						{
							list.actSearWireBox();
						}
						
						else
							list.actReinforcedSimpleDoor();
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
						sprite.setGameSprite(1,1,'S');
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
						ongoingdialogue = 2;
						sprite.switchAlvaFollow();
						list.switchDoorHold1();
						firstbranch = false;
						continueDialogue(2);

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
						sprite.setGameSprite (17, 8, 'N');
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
					
					if(scriptnumber == 48 && firstbranch == true)
					{
						list.actRetrieveFatherID();
						system.endDialogue();
						firstbranch = false;
						system.startMove();
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
					
					if(scriptnumber == 80 && firstbranch == true)
					{
						firstbranch = false;

						gameinfo.changeRoom(14);	
						sprite.setGameSprite (1, 2, 'N');
						readDialogue(81);
					}
					
					if(scriptnumber == 82 && firstbranch == true)					
					{
						list.actMeetMonster();
						gameinfo.changeRoom(12);	
						sprite.switchPresentMonster();
						sprite.setGameSprite (4, 1, 'S');
						sprite.setMonsterSprite(4,2,'N');
						readDialogue(83);
						firstbranch = false;
					}

					if(scriptnumber == 83 && firstbranch == true)					
					{
						sprite.changeDirection('W');
						sprite.changeMonsterDirection('W');
						sprite.setMonsterSprite(1,3, 'W');
						readDialogue(84);
						firstbranch = false;
					}
					
					if(scriptnumber == 84 && firstbranch == true)					
					{
						list.actRun();
						system.endDialogue();
						system.startMove();
						firstbranch = false;
					}
					
					if(scriptnumber == 86 && firstbranch == true)					
					{
						firstbranch = false;

						list.actNightofHorrors();
						gameinfo.currentyear = gameinfo.gameyearpast;
						gameinfo.changeRoom(15);
						sprite.setGameSprite(1,5,'E');
						list.switchRedKey();
						list.switchYellowKey();
						sprite.switchAlvaFollow();
						sprite.alvaDirection = 'W';
						readDialogue(87);
					}
					
					if(scriptnumber == 88 && firstbranch == true)
					{
						firstbranch = false;

						if(gameinfo.room == 17)
						{	
							list.actNorthWestVent();
							sprite.setGameSprite(1,8,'E');
							gameinfo.changeRoom(0);
							sprite.switchAlvaFollow();
							readDialogue(89);
						}

						
						if(gameinfo.room == 8)
						{
							list.actSouthWestVent();
							gameinfo.changeRoom(17); 
							sprite.setGameSprite(3,7, 'W');
							system.endDialogue();
							system.startMove();
						}
						
						if(gameinfo.room == 15)
						{
							list.actDormVent();
							sprite.setGameSprite(5,3,'N');
							gameinfo.changeRoom(8);
							system.endDialogue();
							system.startMove();
						}

						
						
						
					}
					
					if(scriptnumber == 91 && firstbranch == true)					
					{
						firstbranch = false;
						readDialogue(92);
					}
					if(scriptnumber == 92 && firstbranch == true)					
					{

						readDialogue(96);
						firstbranch = false;
					}
					
					
					
					if(scriptnumber == 96 && firstbranch == true)					
					{
						firstbranch = false;
						gameinfo.gameday = 0;
						gameinfo.currentyear = gameinfo.gameyearpresent;
						gameinfo.MonsterMode();
						list.actAlvaRampage();
						list.actNightMonster();
						gameinfo.changeRoom(15);
						sprite.setGameSprite(1,18,'N');
						inter.monster = true;
						readDialogue(97);
					}
					
					if(scriptnumber == 93 && firstbranch == true)					
					{
						list.actRetrieveGreenKey();
						list.switchGreenKey();
						system.endDialogue();
						system.startMove();
						firstbranch = false;

					}
					
					if(scriptnumber == 106 && firstbranch == true)					
					{
						list.actRescueComplete();
						sprite.switchCarrying();
						ongoingdialogue = 2;
						continueDialogue(2);
						firstbranch = false;
					}
					
					if(scriptnumber == 107 && firstbranch == true)					
					{
						gameinfo.changeRoom(16);
						sprite.setGameSprite(3,1,'W');
						list.actBreakWallBurial();
						ongoingdialogue = 1;
						continueDialogue(1);
					}
					
					if(scriptnumber == 110 && firstbranch == true)
					{					
						sprite.changeDirection('W');
						readDialogue(112);
						firstbranch = false;

					}
					
					if(scriptnumber == 111 && firstbranch == true)
					{					
						firstbranch = false;
						sprite.switchCarrying();
						readDialogue(107);
					}
					
					if(scriptnumber == 112 && firstbranch == true)
					{					
						readDialogue(113);
						firstbranch = false;

					}
					
					
					
					if(scriptnumber == 113 && firstbranch == true)
					{					
						gameinfo.changeRoom(9);
						sprite.setGameSprite(11,3,'N');
						list.actBurial();
						list.actNightofFire();
						readDialogue(114);
						firstbranch = false;

					}
					
					if(scriptnumber == 114 && firstbranch == true)
					{
						list.actGift();
						readDialogue(115);
						firstbranch = false;
					}
					
					if(scriptnumber == 115 && firstbranch == true)
					{
						list.actNightofFire();
						gameinfo.DefaultMode();
						gameinfo.changeRoom(10);
						sprite.setGameSprite(2,2,'N');
						firstbranch = false;
						system.endDialogue();
						system.startMove();
						list.switchYellowKey();
						list.switchRedKey();
					}
					
					if(scriptnumber == 116 && firstbranch == true)
					{
						list.actFinalPurpleKeyPass();
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
