package choice;
import java.awt.*;

import javax.swing.*;
public class Dialogue extends JPanel{
	
int scriptnumber;
int[] Choicecatcher = new int [99];

String [][] dialogue = new String [199][12];

GameMode gameinfo;
GameSprite sprite;
List list;
InteractionPanel inter;
Select select;
SystemMode system;

// 7
// 55
// 148
// 149 

	public Dialogue (GameMode gameinfo, SystemMode system, InteractionPanel inter, Select select, GameSprite sprite, List list)
	{
		this.gameinfo = gameinfo;
		this.inter = inter;
		this.list = list;
		this.select = select;
		this.sprite = sprite;
		this.system = system;

		scriptnumber = 0;
	
	
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
	
	dialogue[2][0] = "The floor boards are loose.";
	dialogue[2][1] = "You lift them.";
	dialogue[2][2] = "%";
			
	dialogue[3][0] = "The floor hollow is empty.";
	dialogue[3][1] = "@";
	
	dialogue[4][0] = "The door is locked.";
	dialogue[4][1] = "@";
	
	dialogue[5][0] = "Father: Will - behave this time.";
	dialogue[5][0] = "Father: This is a sophisticated facility - not a playground.";
	dialogue[5][1] = "Will: I have a card for you.";
	dialogue[5][2] = "Father: I will see you when I'm done with my work.";
	dialogue[5][3] = "^";
	dialogue[5][4] = "You'll just have to leave the card on his desk then.";
	dialogue[5][5] = "Somehow.";
	dialogue[5][6] = "@";
	
	dialogue[6][0] = "You take the yellow key.";
	dialogue[6][1] = "^";
	dialogue[6][2] = "Now your dad has his card.";
	dialogue[6][3] = "You hear something in the dark.";
	dialogue[6][4] = "Run back to bed.";
	dialogue[6][5] = "@";
	
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
	
	dialogue[14][0] = "You dive into bed";
	dialogue[14][1] = "And wait for dawn.";;
	dialogue[14][2] = "^";
	
	dialogue[15][0] = "Jackson: For the next generation of troublemakers.";
	dialogue[15][1] = "@";
	
	dialogue[16][0] = "Jackson: I thought I told you only big kids are allowed to sneak around, Alva.";
	dialogue[16][1] = "^";
	dialogue[16][2] = "Jackson: *Sigh* - Come on let's get you to bed.";
	dialogue[16][3] = "@";
	
	dialogue[17][0] = "Jackson: Alva's rope. She's up.";
	dialogue[17][1] = "Jackson: Little squirt.";
	dialogue[17][2] = "^";
	
	dialogue[18][0] = "If you had a rope you could climb this.";
	dialogue[18][1] = "@";
	
	dialogue[19][0] = "Jackson: No going back up. Time for bed.";
	dialogue[19][1] = "@";
	
	dialogue[20][0] = "You pick up the note on the ground.";
	dialogue[20][1] = "^";
	dialogue[20][2] = "It reads:";
	dialogue[20][3] = "Critical Notice: The power must remain on during the system tests tonight.";
	dialogue[20][4] = "Also someone close up that rat hole in the power room.";
	dialogue[20][5] = "@";

	dialogue[21][0] = "Your dad's office is the one with the yellow door.";
	dialogue[21][1] = "But you don't have a key.";
	dialogue[21][2] = "So how are you going to get in there to leave him the card?";
	dialogue[21][3] = "^";
	
	dialogue[22][0] = "Jackson: The squirt is up. Have to get her to bed.";
	dialogue[22][1] = "@";
	
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
	
	dialogue[62][0] = "You can see a space above. But you can't reach it.";
	dialogue[62][1] ="@";
	
	dialogue[63][0] = "No, you need to leave. No more time for sleeping.";
	dialogue[63][1] ="Dad... (Sob)";
	dialogue[63][2] ="@";
	
	dialogue[64][0] = "Jackson: I have to hide the key.";
	dialogue[64][1] = "@";
	
	dialogue[65][0] = "The power won't turn back on...";
	dialogue[65][1] = "@";
	
	dialogue[66][0] = "You press the button.";
	dialogue[66][1] = "^";
	dialogue[66][2] = "Nothing happens.";
	dialogue[66][3] = "It's the wrong power source.";
	dialogue[66][4] = "@";
	
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
	dialogue[107][3] = "@";
	
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
	
	dialogue[117][0] = "Jackson: Won't work - the vent is too high without help.";
	dialogue[117][1] ="Jackson: Besides opening up a new passage is always fun.";
	dialogue[117][2] = "@";
	
	dialogue[118][0] = "You wish you hadn't looked.";
	dialogue[118][1] = "It's a lot of blood.";
	dialogue[118][2] = "@";
	
	dialogue[119][0] = "No.";
	dialogue[119][1] = "You need to see this through.";
	dialogue[119][2] = "@";
	
	dialogue[120][0] = "The wires have already been pulled.";
	dialogue[120][1] = "No one has been here to fix them yet.";
	dialogue[120][2] = "@";

	dialogue[121][0] = "There's a note.";
	dialogue[121][1] = "^";
	dialogue[121][2] = "You should read it.";
	dialogue[121][3] = "@";
	
	dialogue[122][0] = "The fire is growing...";
	dialogue[122][1] = "@";

	dialogue[123][0] = "An unmoving mass of debris.";
	dialogue[123][1] = "@";
	
	dialogue[124][0] = "The mass of debris has shifted.";
	dialogue[124][1] = "You can barely squeeze through.";
	dialogue[124][2] = "If you wanted to.";
	dialogue[124][3] ="@";
	
	dialogue[125][0] = "The monster grins at you - long teeth bared.";
	dialogue[125][1] = "It waves you on.";
	dialogue[125][2] = "Time to go - it - she seems to say.";
	dialogue[125][3] = "She's trying to stay small - there's the smell of char from where she's touched the lights.";
	dialogue[125][4] = "She's trapped.";	
	dialogue[125][5] = "She pats the light anyways - pantomiming patting your cheek.";	
	dialogue[125][6] = "You smell the sizzle of flesh.";	
	dialogue[125][7] = "Wordlessly signaling - you'll be fine.";
	dialogue[125][8] = "Time to say goodbye - she seems to say.";
	dialogue[125][9] = "@";
	
	dialogue[126][0] = "The light just goes through you.";
	dialogue[126][1] = "It doesn't hurt.";
	dialogue[126][2] = "But you can't block the light.";
	dialogue[126][3] = "@";
	
	dialogue[127][0] = "The machine is silent.";
	dialogue[127][1] = "There's something ominous to it.";
	dialogue[127][2] = "@";
	
	dialogue[128][0] = "The machine is humming.";
	dialogue[128][1] = "You hit it with a rock.";
	dialogue[128][2] = "It does nothing.";
	dialogue[128][3] = "@";
	
	dialogue[129][0] = "*Creak*";
	dialogue[129][1] = "You look up - the ceiling is collapsing.";
	dialogue[129][2] = "You can't move in time.";
	dialogue[129][3] = "This is - ";
	dialogue[129][4] = "*Boom*";
	dialogue[129][5] = "^";
	dialogue[129][6] = "*Crash*";
	dialogue[129][7] = "You're alive and-";
	dialogue[129][8] = "Oh no.";
	dialogue[129][9] = "Oh no no no.";
	dialogue[129][10] = "@";
	
	dialogue[130][0] = "Goodbye.";
	dialogue[130][1] = "^";
	
	dialogue[131][0] = "The way out.";
	dialogue[131][1] = "^";
	dialogue[131][2] = "But if you leave...";
	dialogue[131][3] = "%";
	
	dialogue[132][0] = "No, you can't do it again.";
	dialogue[132][1] = "@";

	dialogue[133][0]= "A child whalking down the highway at night...";
	dialogue[133][1]= "It gets attention.";
	dialogue[133][2]= "Even before the ash in  hair.";
	dialogue[133][3]= "And tears working down through soot.";
	dialogue[133][4]= "A policeman found you - ";
	dialogue[133][5]= "Grandparents were called as bodies were pulled from the fire.";
	dialogue[133][6]= "One burnt and twisted in the main entrance way.";
	dialogue[133][7]= "You try not to dream when you sleep.";
	dialogue[133][8]= "The friendly monster carrying you to safety...";
	dialogue[133][9]= "You always wake up crying.";
	dialogue[133][10]= "^";
	
	dialogue[134][0]= "Jackson: You have to keep the door open before sacrificing a key.";
	dialogue[134][1]= "Jackson: You better hurry - ";
	dialogue[134][2]= "^";
	dialogue[134][3]= "Jackson: Squirt 2.0.";
	dialogue[134][4]= "@";
	
	dialogue[135][0]= "Backpack - is there anything useful?";
	dialogue[135][1]= "A syringe full of something.";
	dialogue[135][2]= "A spare labcoat and scrubs.";
	dialogue[135][3]= "Records.";
	dialogue[135][4]= "A notepad and pen.";
	dialogue[135][5]= "A worn screwdriver.";
	dialogue[135][6]= "You grab that last one.";
	dialogue[135][7]= "^";
	
	dialogue[136][0] = "You already searched this.";
	dialogue[136][1] = "@";
	
	dialogue[137][0] = "You could use the screwdriver to pry this loose.";
	dialogue[137][1] = "%";
	
	dialogue[138][0] = "No turning back.";
	dialogue[138][1] = "Where's the power source?";
	dialogue[138][2] = "@";

	dialogue[139][0] = "It's the wrong power source.";
	dialogue[139][1] = "@";
	
	dialogue[140][0] = "The wallpanel takes the purple key card.";
	dialogue[140][1] = "You slide yours in.";
	dialogue[140][2] = "^";
	
	dialogue[141][0] = "The wall panel would take the purple key card.";
	dialogue[141][1] = "@";
	
	dialogue[142][0] = "The purple key card is stuck.";
	dialogue[142][1] = "@";
	
	dialogue[143][0] = "You press the button.";
	dialogue[143][1] = "^";	

	dialogue[144][0] = "And then the roof falls in.";
	dialogue[144][1] = "^";	
	
	dialogue[145][0] = "You wake up outside.";
	dialogue[145][1] = "A scrawny teenager with a scar wrapping her neck hands you a note.";
	dialogue[145][2] = "-I'm Alva. What's your name?-";
	dialogue[145][2] = "You think. 'Miss Monster?' You ask.";
	dialogue[145][3] = "She nods, smiling.";
	dialogue[145][4] = "I'm Will.";
	dialogue[145][5] = "-Ready to go?-";
	dialogue[145][6] = "You stand in answer.";
	dialogue[145][7] = "@";
	
	dialogue[146][0] = "The police were called fairly quickly.";
	dialogue[146][1] = "Two individuals staggering down the road will do that.";
	dialogue[146][2] = "Though he was getting a piggy back ride when the police got there.";
	dialogue[146][3] = "Hospital treatment came soon after - though they did keep the two together.";
	dialogue[146][4] = "Alva somehow breaking through metal when Will screamed does that.";
	dialogue[146][5] = "Grandparents were called - and somehow walked away with two grandchildren.";
	dialogue[146][6] = "Will doesn't particularly care.";
	dialogue[146][7] = "Much too excited at having a 'superhero' as an older sibling.";
	dialogue[146][8] = "And sometimes if you find him talking to the wind...";
	dialogue[146][9] = "He'll just say that a friend and his father was visting.";
	dialogue[146][10] = "He sleeps silently at night.";
	dialogue[146][11] = "^";
	
	dialogue[147][0] = "Time to go.";
	dialogue[147][1] = "^";
	
	dialogue[150][0] = "But you need to give your Dad the card.";
	dialogue[150][1] = "@";
 	}
	
	public int continueDialogue(int number)
	{
		int ongoingdialogue = number+1;
		
		// @ means end of script 
		if(dialogue[scriptnumber][number] != "@")
		{
			// Normal dialogue 
			if(dialogue[scriptnumber][number] != "%" && dialogue[scriptnumber][number] != "^")
			{
				inter.changeDialogue(dialogue[scriptnumber][number]);
			}
			
			// Select or Non standard reaction
			else
			{	
				// Select link
				if(dialogue[scriptnumber][number] == "%")
				{
					ongoingdialogue = 0; // -> reset dialogue counter
					system.endDialogue();
					system.startSelect();
					select.changeSelectionNumber(scriptnumber);
				}
				
				if(dialogue[scriptnumber][number] == "^")
				{ 
					ongoingdialogue = 0;
					boolean wait = true;

					if(scriptnumber == 5 && wait == true)
					{
						
						list.actGoodbye();
						ongoingdialogue = 4;
						wait = false;
						continueDialogue(4);
					}
					
					if(scriptnumber == 14 && wait == true)
					{
						gameinfo.startPast();
						sprite.setGameSprite(3,4, 'N');
						list.endYellowKey();
						list.startGreenKey();
						list.startPowerSwitch();
						readDialogue(15);
						wait = false;
					}
					
					if(scriptnumber == 51 && wait == true)
					{
						gameinfo.startPresent();
						gameinfo.changeRoom(2);
						sprite.setGameSprite(1,2, 'E');
						list.startYellowKey();
						list.startRedKey();
						list.endGreenKey();
						list.startPowerSwitch();
						list.actNight2();
						readDialogue(59);
						wait = false;
					}
					
					if(scriptnumber == 20 && wait == true)
					{
						ongoingdialogue = 2;
						list.actNote2();
						wait = false;
						continueDialogue(2);
					}
					
					if(scriptnumber == 6 && wait == true)
					{
						ongoingdialogue = 2;
						list.actTakeYellowKey();
						list.actGiftCard();
						wait = false;
						continueDialogue(2);
					}
					
					if(scriptnumber == 16 && wait == true)
					{	ongoingdialogue = 2;
						sprite.changeAlvaDirection('N');
						sprite.startAlvaFollow();
						list.actMeetAlva();
						wait = false;
						continueDialogue(2);
					}
					
					if(scriptnumber == 17 && wait == true)
					{
						gameinfo.changeRoom(10);
						sprite.setGameSprite(1,1,'S');
						readDialogue(16);
						wait = false;
					}
					
					if(scriptnumber == 21 && wait == true)
					{
						list.actEnterNorthHallway();
						system.endDialogue();
						wait = false;
						system.startMove();
					}
					
					if (scriptnumber == 24 && wait == true)
					{
						ongoingdialogue = 2;
						sprite.endAlvaFollow();
						list.startDoorHold1();
						wait = false;
						continueDialogue(2);

					}
					
					if (scriptnumber == 25 && wait == true)
					{
						list.actHideRedKey();
						system.endDialogue();
						wait = false;
						system.startMove();
					}
					
					if (scriptnumber == 28 && wait == true)
					{	
						ongoingdialogue = 2;
						sprite.endAlvaFollow();
						gameinfo.changeRoom(12);
						sprite.setGameSprite (1, 2, 'E');
						wait = false;
						continueDialogue(2);
					}
					
					if (scriptnumber == 29 && wait == true)
					{	
						list.actRetrieveScrewdriver();
						system.endDialogue();
						wait = false;
						system.startMove();
					}
					
					if (scriptnumber == 41 && wait == true)
					{	
						list.actRemovePanel();
						gameinfo.changeRoom(11);
						sprite.setGameSprite (17, 8, 'N');
						system.endDialogue();
						wait = false;
						system.startMove();
					}
					
					if(scriptnumber == 46 && wait == true)
					{
						sprite.endAlvaFollow();
						readDialogue(57);
						wait = false;
					}
					
					if(scriptnumber == 48 && wait == true)
					{
						list.actRetrieveFatherID();
						system.endDialogue();
						wait = false;
						system.startMove();
					}
					
					if(scriptnumber == 57 && wait == true)
					{
						sprite.startAlvaFollow();
						sprite.changeAlvaDirection('E');
						readDialogue(58);	
						wait = false;

					}
					
					if(scriptnumber == 58 && wait == true)
					{
						gameinfo.changeRoom(15);
						sprite.endAlvaFollow();
						sprite.setGameSprite(4,1,'S');
						system.endDialogue();
						system.startMove();
						wait = false;
					}
					
					if(scriptnumber == 66 && wait == true)
					{
						wait = false;
						list.endPowerSwitch();
						ongoingdialogue = 2;
						continueDialogue(2);
					}
					
					if(scriptnumber == 74 && wait == true)
					{				
						list.actCard();
						system.endDialogue();
						system.startMove();
						wait = false;
					}
					
					if(scriptnumber == 80 && wait == true)
					{
						wait = false;

						gameinfo.changeRoom(14);	
						sprite.setGameSprite (1, 2, 'N');
						readDialogue(81);
					}
					
					if(scriptnumber == 82 && wait == true)					
					{
						list.actMeetMonster();
						gameinfo.changeRoom(12);	
						sprite.startPresentMonster();
						sprite.setGameSprite (4, 1, 'S');
						sprite.setMonsterSprite(4,2,'N');
						readDialogue(83);
						wait = false;
					}

					if(scriptnumber == 83 && wait == true)					
					{
						sprite.changeDirection('W');
						sprite.changeMonsterDirection('W');
						sprite.setMonsterSprite(1,3, 'W');
						readDialogue(84);
						wait = false;
					}
					
					if(scriptnumber == 84 && wait == true)					
					{
						list.actRun();
						system.endDialogue();
						system.startMove();
						wait = false;
					}
					
					if(scriptnumber == 86 && wait == true)					
					{
						wait = false;

						list.actNightofHorrors();
						gameinfo.startPast();
						gameinfo.changeRoom(15);
						sprite.setGameSprite(1,5,'E');
						list.endRedKey();
						list.endYellowKey();
						sprite.startAlvaFollow();
						sprite.changeAlvaDirection('W');
						readDialogue(87);
					}
					
					if(scriptnumber == 88 && wait == true)
					{
						wait = false;

						if(gameinfo.getRoom() == 17)
						{	
							list.actPryNorthWestVent();
							sprite.setGameSprite(1,8,'E');
							gameinfo.changeRoom(0);
							sprite.endAlvaFollow();
							readDialogue(89);
						}

						if(gameinfo.getRoom() == 8)
						{
							list.actPrySouthWestVent();
							gameinfo.changeRoom(17); 
							sprite.setGameSprite(3,7, 'W');
							system.endDialogue();
							system.startMove();
						}
						
						if(gameinfo.getRoom() == 15)
						{
							list.actPryDormVent();
							sprite.setGameSprite(5,3,'N');
							gameinfo.changeRoom(8);
							system.endDialogue();
							system.startMove();
						}
					}
					
					if(scriptnumber == 91 && wait == true)					
					{
						readDialogue(92);
						wait = false;
					}
					if(scriptnumber == 92 && wait == true)					
					{
						readDialogue(96);
						wait = false;
					}
					
					if(scriptnumber == 96 && wait == true)					
					{
						wait = false;
						list.endGreenKey();
						gameinfo.startPresent();
						gameinfo.startMonsterMode();
						list.actNightMonster();
						gameinfo.changeRoom(15);
						sprite.setGameSprite(1,18,'N');
						inter.startMonsterDialogue();
						readDialogue(97);
					}
					
					if(scriptnumber == 93 && wait == true)					
					{
						list.actRetrieveGreenKey();
						list.startGreenKey();
						system.endDialogue();
						system.startMove();
						wait = false;
					}
					
					if(scriptnumber == 106 && wait == true)					
					{
						list.actRescueComplete();
						sprite.startCarrying();
						ongoingdialogue = 2;
						continueDialogue(2);
						wait = false;
					}
					
					if(scriptnumber == 107 && wait == true)					
					{
						gameinfo.changeRoom(16);
						sprite.setGameSprite(3,1,'W');
						list.actBreakWallBurial();
						ongoingdialogue = 1;
						continueDialogue(1);
					}
					
					if(scriptnumber == 110 && wait == true)
					{					
						sprite.changeDirection('W');
						readDialogue(112);
						wait = false;
					}
					
					if(scriptnumber == 111 && wait == true)
					{					
						wait = false;
						sprite.endCarrying();
						readDialogue(107);
					}
					
					if(scriptnumber == 112 && wait == true)
					{					
						readDialogue(113);
						wait = false;
					}
					
					if(scriptnumber == 113 && wait == true)
					{					
						gameinfo.changeRoom(9);
						sprite.setGameSprite(11,3,'N');
						list.actBurial();
						list.actNightofFire();
						readDialogue(114);
						wait = false;
					}
					
					if(scriptnumber == 114 && wait == true)
					{
						list.actGift();
						readDialogue(115);
						wait = false;
					}
					
					if(scriptnumber == 115 && wait == true)
					{
						list.actNightofFire();
						gameinfo.endMonsterMode();
						inter.endMonsterDialogue();
						gameinfo.changeRoom(10);
						sprite.setGameSprite(2,2,'N');
						wait = false;
						list.actBreakWallEastPassage();
						system.endDialogue();
						system.startMove();
						list.startYellowKey();
						list.startRedKey();
					}
					
					if(scriptnumber == 116 && wait == true)
					{
						list.actFinalPurpleKeyPass();
						system.endDialogue();
						system.startMove();
						wait = false;
					}
					
					if(scriptnumber == 121 && wait == true)
					{
						sprite.changeDirection('S');
						ongoingdialogue = 2;
						continueDialogue(2);
					}
					
					if(scriptnumber == 129 && wait == true)
					{
						sprite.setGameSprite(3,1,'W');
						list.actSacrifice();
						sprite.startPresentMonster();
						sprite.setMonsterSprite(3,7,'N');
						ongoingdialogue = 6;
						continueDialogue(6);
					}
					
					if(scriptnumber == 130 && wait == true)
					{
						wait = false;
						gameinfo.changeEnding(-1);
						readDialogue(133);
					}
					
					if(scriptnumber == 131 && wait == true)
					{
						wait = false;
						ongoingdialogue = 2;
						continueDialogue(2);
						sprite.changeDirection('S');
					}
					
					if(scriptnumber == 133 && wait == true)
					{
						wait = false;
						gameinfo.changeEnding(1);
					}		
					
					if(scriptnumber == 134 && wait == true)
					{
						wait = false;
						gameinfo.changeRoom(12);
						sprite.setGameSprite(4,5,'N');
						list.endDoorHold2();
						ongoingdialogue = 3;
						continueDialogue(3);
					}	
					
					if(scriptnumber == 135 && wait == true)
					{
						wait = false;
						list.actRetrieveOldScrewdriver();
						system.endDialogue();
						system.startMove();
					}	
					
					if(scriptnumber == 140 && wait == true)
					{
						wait = false;
						list.actKeySlot();
						list.startDoorHold2();
						system.endDialogue();
						system.startMove();
					}
					
					if(scriptnumber == 143 && wait == true)
					{
						wait = false;
						list.actFinalSwitch();
						readDialogue(144);
					}
					
					if(scriptnumber == 144 && wait == true)
					{
						wait = false;
						sprite.setGameSprite(3,5,'N');
						sprite.changeAlvaDirection('S');
						sprite.startAlvaFollow();
						gameinfo.changeRoom(20);
						readDialogue(145);
					}
					
					if(scriptnumber == 146 && wait == true)
					{
						gameinfo.changeEnding(2);
					}
					
					if(scriptnumber == 147 && wait == true)
					{
						wait = false;
						gameinfo.changeEnding(-1);
						readDialogue(146);
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
		}
		return ongoingdialogue;
	}
	
	// Start Dialogue script 
	public void readDialogue(int newscript)
	{
		scriptnumber = newscript;
		system.startDialogue();
		system.endMove();
		continueDialogue(0);
	}

	// get Scriptnumber
	public int returnScript()
	{
		return scriptnumber;
	}
	
	// Shortcut to Select 
	public void shortcutSelect(int skip)
	{
		system.startSelect();
		select.changeSelectionNumber(skip);
	}
}