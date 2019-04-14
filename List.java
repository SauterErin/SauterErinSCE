package choice;

public class List 
{
	private boolean blockA;
	private boolean blockB;
	private boolean blockC;		
	private boolean breakWallBurial;
	private boolean breakWallEastPassage;
	private boolean breakWallNorthEastPassage;
	private boolean breakWallNorthWestPassage;
	private boolean breakWallRescue;
	private boolean breakWallSouthWestPassage;
	private boolean brokenSimpleDoor;
	private boolean brokenWireBox;	
	private boolean burial;
	private boolean card;
	private boolean doorHold1;
	private boolean doorHold2;
	private boolean enterNorthHallway;
	private boolean escape;
	private boolean finalSwitch;	
	private boolean finalPurpleKeyPass;
	private boolean gift;
	private boolean giftCard;
	private boolean goodbye;
	private boolean greenKey;
	private boolean hideRedKey;
	private boolean keyslot;
	private boolean meetAlva;
	private boolean meetMonster;
	private boolean nightMonster;
	private boolean nightofFire;
	private boolean nightofFireRescue;
	private boolean nightofHorrors;
	private boolean night2;
	private boolean note1;
	private boolean note2;
	private boolean note3;
	private boolean pastBreakWall;
	private boolean powerSwitch;	
	private boolean pryDormVent;
	private boolean pryNorthWestVent;
	private boolean prySouthWestVent;
	private boolean purpleKey;
	private boolean redKey;
	private boolean reinforcedSimpleDoor;
	private boolean removePanel;
	private boolean rescueComplete;
	private boolean retrieveBackpack;
	private boolean retrieveFatherID;
	private boolean retrieveGreenKey;
	private boolean retrieveOldScrewdriver;
	private boolean retrievePurpleKey;
	private boolean retrieveRedKey;
	private boolean retrieveScrewdriver;
	private boolean run;
	private boolean sacrifice;
	private boolean startTrigger;
	private boolean takeYellowKey;
	private boolean trapDoor;
	private boolean weldWireBox;
	private boolean yellowKey;
	
	public List ()
	{			
		blockA = true;
		blockB = true;
		blockC = true;
		breakWallEastPassage = false;
		breakWallBurial = false;
		breakWallNorthEastPassage = false;
		breakWallNorthWestPassage = false;
		breakWallRescue = false;
		breakWallSouthWestPassage = false;
		brokenSimpleDoor = false;
		brokenWireBox = false;
		burial = false;
		card = true;
		doorHold1 = false;
		doorHold2 = false;
		enterNorthHallway = false;
		escape = false;		
		finalPurpleKeyPass = false;	
		finalSwitch = true;
		gift = false;
		giftCard = false;
		goodbye = false;
		greenKey = false;
		hideRedKey = false;
		keyslot = false;
		meetAlva = false;
		meetMonster = false;
		nightMonster = false;
		nightofFire = false;
		nightofFireRescue = false;
		nightofHorrors = false;
		night2 = false;
		note1 = false;
		note2 = false;
		note3 = false;
		pastBreakWall = false;
		powerSwitch = true;
		pryDormVent = false;
		pryNorthWestVent = false;
		prySouthWestVent = false;
		purpleKey = false;
		redKey = false;
		reinforcedSimpleDoor = false;
		removePanel = false;
		rescueComplete = false;
		retrieveBackpack = false;
		retrieveFatherID = false;
		retrieveGreenKey = false;
		retrieveOldScrewdriver = false;
		retrievePurpleKey = false;
		retrieveRedKey = false;
		retrieveScrewdriver = false;
		run = false;
		sacrifice = false;
		startTrigger = false;
		takeYellowKey = false;
		trapDoor = false;
		weldWireBox = false;
		yellowKey = false;
	}
	
	// Break block A - South Hall
	public void actBlockA() {
		 blockA = false;
	}	
	
	// Break block B - East Hall
	public void actBlockB() {
		 blockB = false;		
	}	
	
	// Break block C - West Hall
	public void actBlockC() {
		 blockC = false;
	}
	
	// Enter/Break wall to enter Holding Room A
	public void actBreakWallBurial() 
	{
		breakWallBurial = true;	
	}
	
	// Break the wall between East Wing and East Hall
	public void actBreakWallEastPassage() 
	{
		breakWallEastPassage = true;
	}
	
	// Enter/Break wall to enter Holding Room B
	public void actBreakWallRescue() 
	{
		breakWallRescue = true;	
	}
	
	// Break Wall between North and East Halls
	public void actBreakWallNorthEastPassage() 
	{
		breakWallNorthEastPassage = true;
	}

	// Break Wall between North and West Halls
	public void actBreakWallNorthWestPassage() 
	{		
		breakWallNorthWestPassage = true;	
	}
	
	// Break Wall between South and West Halls 
	public void actBreakWallSouthWestPassage()
	{
		breakWallSouthWestPassage = true;
	}

	// Break door in Spare Room 
	public void actBrokenSimpleDoor() 
	{
		brokenSimpleDoor = true;
	}
	
	// Break Wire Box
	public void actBrokenWireBox()
	{
		brokenWireBox = true;	
	}
	
	// Bury Father 
	public void actBurial()
	{
		burial = true;
	}
	
	// Take card off desk
	public void actCard() 
	{
		card = false;
	}
	
	// Enter North Hallway for first time - story check point 
	public void actEnterNorthHallway()
	{
		enterNorthHallway = true;
	}
	
	// Has Alva been released - ie has player pressed power switch once
	public void actEscape()
	{
		escape = true;
	}
	
	// Will picks up purple key 
	public void actFinalPurpleKeyPass() 
	{
		finalPurpleKeyPass = true;
		startPurpleKey();
	}
	
	// Press final power switch
	public void actFinalSwitch() 
	{
		finalSwitch = false;
	}
	
	// Alva places flower/ID on Father's grave
	public void actGift() 
	{
		gift = true;
	}
	
	// Resolve event flags in regards to gift card on desk
	public void actGiftCard()
	{
		giftCard = true;
	}
	
	// Father leaves detention room
	public void actGoodbye() 
	{
		goodbye = true;
	}
	
	// Hides Red Key in piano
	public void actHideRedKey()
	{
		hideRedKey = true;
		endRedKey();
	}
	
	// Insert purple key into key slot
	public void actKeySlot()
	{
		keyslot = true;
		endPurpleKey();
	}
	
	// Jackson meets Alva in attic
	public void actMeetAlva()
	{
		meetAlva = true;
	}
	
	// Will meets Alva (Monster)
	public void actMeetMonster() 
	{
		meetMonster = true;
	}
	
	// Alva starts rescue mission
	public void actNightMonster()
	{
		nightMonster = true;
	}
	
	// Will attempts escape
	public void actNightofFire()
	{
		nightofFire = true;
	}
	
	// Will attempts to rescue Alva
	public void actNightofFireRescue()
	{
		nightofFireRescue = true;
	}
	
	// Alva and Jackson attempt to escape 
	public void actNightofHorrors()
	{
		nightofHorrors = true;
	}
	
	// Start Night 2
	public void actNight2()
	{
		night2 = true;
		
		// If Jackson broke door - reinforce it 
		if(checkBrokenSimpleDoor() == true)
		{
			actReinforcedSimpleDoor();
		}
		
		// else Weld Wire Box shut
		else
		{
			actWeldWireBox();
		}
	}
	
	// Pick up Note in TrapDoor
	public void actNote1()
	{
		note1 = true;
	}	
	
	//Picks up second note in hallway 
	public void actNote2()
	{
		note2 = true;
	}
	
	// Read Alva's note
	public void actNote3() 
	{
		note3 = true;
		actRetrievePurpleKey();
	}
	
	// Jackson breaks wall between East Hall and East Hall - Spare Passage
	public void actPastBreakWall()
	{
		pastBreakWall = true;
	}
	
	// Remove Vent cover from Dorms (past)
	public void actPryDormVent()
	{
		pryDormVent = true;
	}
	
	// Remove vent cover from wall between North and West halls
	public void actPryNorthWestVent()
	{
		pryNorthWestVent = true;
	}
	
	// Remove vent cover from wall between North and South halls
	public void actPrySouthWestVent()
	{
		prySouthWestVent = true;
	}
	
	// Reinforce Simple Door
	public void actReinforcedSimpleDoor()
	{
		reinforcedSimpleDoor = true;
	}
	
	// Remove Wall Panel in Spare Room 
	public void actRemovePanel()
	{
		removePanel = true;
	}
	
	// Alva rescued Will
	public void actRescueComplete()
	{
		rescueComplete = true;
	}
	
	// Alva picks up her backpack
	public void actRetrieveBackpack() 
	{
		 retrieveBackpack = true;
	}
	
	// Will picks up his father's ID
	public void actRetrieveFatherID() 
	{
		 retrieveFatherID = true;
	}
	
	// Jackson picks up Green Key - Event Flag
	public void actRetrieveGreenKey() {
		retrieveGreenKey = true;
	}
	
	// Retrieve purple key
	public void actRetrievePurpleKey()
	{
		retrievePurpleKey = true;
	}
	
	// Will gets Jackson's old screwdriver
	public void actRetrieveOldScrewdriver() 
	{	
		retrieveOldScrewdriver = true;	
	}
	
	// Retrieve red key from piano
	public void actRetrieveRedKey()
	{
		retrieveRedKey = true;
		startRedKey();
	}
	
	// Jackson retrieves his screwdriver
	public void actRetrieveScrewdriver()
	{
		retrieveScrewdriver = true;
	}
	
	// Will is running away from Alva
	public void actRun()
	{
		run = true;
	}
	
	// Alva saves Will by pushing him out of way
	public void actSacrifice() 
	{
		sacrifice = true;
	}
	
	// Triggers Will/Ceiling/Alva event
	public void actStartTrigger() 
	{
		startTrigger = true;
	}
	
	// take yellow key off desk
	public void actTakeYellowKey() 
	{
		takeYellowKey = true;
		startYellowKey();
	}
	
	// open trap door
	public void actTrapDoor()
	{
		trapDoor = true;
	}
	
	// Weld Wire Box shut
	public void actWeldWireBox()
	{
		weldWireBox = true;
	}
	
	// Check to see if Block A is still operating (South Hall)
	public boolean checkBlockA() {
		return blockA;
	}
	
	// Check to see if Block B is still operating (East Hall)
	public boolean checkBlockB() {
		return blockB;
	}

	// Check to see if Block C is still operating (West Hall)
	public boolean checkBlockC() {
		return blockC;
	}
	
	// Check if Alva has entered Holding Room A
	public boolean checkBreakWallBurial() 
	{
		return breakWallBurial;
	}
	
	// Check if the wall between East Wing and East Hall is broken
	public boolean checkBreakWallEastPassage() 
	{
		return breakWallEastPassage;
	}
	
	// Check to see if the wall between North and East halls is broken
	public boolean checkBreakWallNorthEastPassage() 
	{
		return breakWallNorthEastPassage;
	}

// Check to see if the wall between North and Wast halls is broken
	public boolean checkBreakWallNorthWestPassage() 
	{
		return breakWallNorthWestPassage;
	}
	
	// Has Alva enter Holding Room B
	public boolean checkBreakWallRescue() 
	{
		
		return breakWallRescue;
	}
	
	// Check if wall between South and West Halls have been broken
	public boolean checkBreakWallSouthWestPassage() 
	{
		return breakWallSouthWestPassage;
	}
	
	// Check to see if Simple Door is broken
	public boolean checkBrokenSimpleDoor() 
	{
		return brokenSimpleDoor;
	}
		
	// Check to see if Wire Box is broken
	public boolean checkBrokenWireBox() 
	{
		return brokenWireBox;
	}
	
	// Check to see if the father has been buried
	public boolean checkBurial() 
	{
		return burial;
	}
	
	// Checks if Alva is holding door
	public boolean checkDoorHold1()
	{
		return doorHold1;
	}	
	
	// Checks if Jackson is holding door
	public boolean checkDoorHold2()
	{
		return doorHold2;		
	}
	
	// Checks if Player has entered North Hallway for first time
	public boolean checkEnterNorthHallway()
	{
		return enterNorthHallway;
	}
	
	// Checks if Alva has escaped - ie Has Player pressed power switch once
	public boolean checkEscape()
	{
		return escape;
	}
	
	// Has Will picked up Purple Key
	public boolean checkFinalPurpleKeyPass() 
	{
		return finalPurpleKeyPass;
	}
	
	// Checks to see if final power switch has been pressed
	public boolean checkFinalSwitch() 
	{
		return finalSwitch;
	}
	
	// Check to see if Alva has placed flower/ID on Father's grave
	public boolean checkGift() 
	{
		return gift;
	}
	
	// Check to see if player has placed gift card on desk
	public boolean checkGiftCard()
	{
		return giftCard;
	}
	
	// Checks if player has Green Key
	public boolean checkGreenKey()
	{
		return greenKey;
	}
	
	// check to see if Father has left Detention Room
	public boolean checkGoodbye() 
	{
		return goodbye;
	}
	
	// Checks if player has hidden red key with Jackson
	public boolean checkHideRedKey()
	{
		return hideRedKey;
	}
	
	// Check to see if Purple Key has been inserted into key slot
	public boolean checkKeySlot() 
	{
		return keyslot;
	}
	
	// Checks if player has met Alva
	public boolean checkMeetAlva()
	{
		return meetAlva;
	}
	
	// Check if Will has met Alva
	public boolean checkMeetMonster()
	{
		return meetMonster;
	}
	
	// See if Alva has started rescue mission
	public boolean checkNightMonster() 
	{
		return nightMonster;
	}
	
	// Check to see if Will has attempted escape
	public boolean checkNightofFire() 
	{
		return nightofFire;
	}
	
	// Check to see if Will has attempted rescue of Alva
	public boolean checkNightofFireRescue() 
	{
		return nightofFireRescue;
	}
	
	// Check to see if Alva and Jackson have attempted escape
	public boolean checkNightofHorrors() 
	{
		return nightofHorrors;
	}
	
	// Check if night2 has or is happening 
	public boolean checkNight2() {
		return night2;
	}
	
	// Checks if player has picked up note in trapdoor
	public boolean checkNote1()
	{
		return note1;
	}	
	
	// Checks if Player has picked up second note in Hallway 
	public  boolean checkNote2() 
	{
		return note2;
	}	
	
	// Check to see if Alva's note has been read
	public boolean checkNote3() 
	{
		return note3;
	}
	
	// Check to see if Card is on desk
	public boolean checkCard() 
	{
		return card;
	}
	
	// Checks if Jackson has broken wall
	public boolean checkPastBreakWall() 
	{
		return pastBreakWall;
	}
	
	// Checks status of power switch
	public boolean checkPowerSwitch()
	{
		return powerSwitch;
	}
	
	// check if Vent cover has been removed from Dorms (past)
	public boolean checkPryDormVent()
	{
		return pryDormVent;
	}

	// check if vent cover has been removed from wall between North and West Halls 
	public boolean checkPryNorthWestVent()
	{
		return pryNorthWestVent;
	}
	
	// check if vent cover has been removed from wall between South and West Halls
	public boolean checkPrySouthWestVent()
	{
		return prySouthWestVent;
	}
	
	// check to see if player has purple key 
	public boolean checkPurpleKey() 
	{
		return purpleKey;
	}
	
	// Checks if player has Red key
	public boolean checkRedKey()
	{
		return redKey;
	}
	
	// Check to see if simple Door is reinforced
	public boolean checkReinforcedSimpleDoor()
	{
		return reinforcedSimpleDoor;
	}
	
	// Check if panel has been removed in Spare Room 
	public boolean checkRemovePanel() 
	{
		return removePanel;
	}
	
	// Check to see if Alva has rescued Will
	public boolean checkRescueComplete() 
	{
		return rescueComplete;
	}
	
	// Check to see if Alva has picked up her backpack 
	public boolean checkRetrieveBackpack() 
	{
		return retrieveBackpack;
	}
	
	// Check to see if Will has found his father's ID
	public boolean checkRetrieveFatherID() 
	{
		return retrieveFatherID;
	}
	
	// Check to see if the green key has been picked up (Jackson - Event Flag)
	public boolean checkRetrieveGreenKey() 
	{
		return retrieveGreenKey;
	}
	
	// Check to see if Will has Jackson's old screwdriver
	public boolean checkRetrieveOldScrewdriver()
	{
		return retrieveOldScrewdriver;
	}
	
	// Check to see if purple key has been retrieved
	public boolean checkRetrievePurpleKey() 
	{
		return retrievePurpleKey;
	}
	
	// check to see if Red key has been retrieved from piano
	public boolean checkRetrieveRedKey() 
	{
		return retrieveRedKey;
	}
	
	// Check to see if Jackson has retrieved his screwdriver
	public boolean checkRetrieveScrewdriver() 
	{
		return retrieveScrewdriver;
	}
	
	// Has Will ran away from Alva (Monster)
	public boolean checkRun() 
	{
		return run;
	}
	

	// Check to see if Alva has sacrificed herself
	public boolean checkSacrifice() 
	{
		return sacrifice;
	}
	
	// Checks to see if Will / Ceiling / Alva event has been triggered
	public boolean checkStartTrigger() 
	{
		return startTrigger;
	}
	
	// check to see if yellow key has been taken off desk
	public boolean checkTakeYellowKey() 
	{
		return takeYellowKey;
	}	
	
	// checks to see if trap door has been opened
	public boolean checkTrapDoor() 
	{
		return trapDoor;
	}
		
	// Check to see if Wire Box has been welded
	public boolean checkWeldWireBox() 
	{
		return weldWireBox;
	}
	
	// Checks if player has Yellow Key
	public boolean checkYellowKey()
	{
		return yellowKey;
	}
	// Alva starts holding door
	public void endDoorHold1()
	{
		doorHold1 = false;
	}
	
	// Jackson starts holding door
	public void endDoorHold2()
	{
		doorHold2 = false;
	}
	
	// Green Key is designated as false/not in possession
	public void endGreenKey()
	{
		greenKey = false;
	}
	
	//Turns off power switch 
	public void endPowerSwitch()
	{
		powerSwitch = false;
		
		//if Escape hasn't happened - enacts escape
		if(checkEscape() == false)
		{
			actEscape();
		}
	}
	
	// Purple Key is designated as false/not in possession
	public void endPurpleKey()
	{
		purpleKey = false;
	}
	
	// Red Key is designated as false/not in possession
	public void endRedKey()
	{
		redKey = false;
	}
	
	// Yellow Key is designated as false/not in possession
	public void endYellowKey()
	{
		yellowKey = false;
	}	
	
	// Alva starts holding door
	public void startDoorHold1()
	{
		doorHold1 = true;
	}
	
	// Jackson starts holding door
	public void startDoorHold2()
	{
		doorHold2 = true;
	}
	
	// Green Key is designated as true/had
	public void startGreenKey()
	{
		greenKey = true;
	}
	
	//Turns on power switch 
	public void startPowerSwitch()
	{
		powerSwitch = true;
	}
	
	// Purple key set as true for door usage
	public void startPurpleKey() 
	{
		purpleKey = true;
	}
	
	// Red Key is designated as true/had
	public void startRedKey()
	{
		redKey = true;
	}
	
	// Yellow Key is designated as true/had
	public void startYellowKey()
	{
		yellowKey = true;
	}
}