package choice;

public class List {
	
	boolean Note1;
	boolean Note2;
	boolean wall2;
	boolean floor1;
	boolean floor2;
	boolean redkey;
	boolean yellowkey;
	boolean greenkey;
	boolean powerswitch;
	boolean doorhold1;
	boolean doorhold2;
	boolean escape;
	boolean enterNorthHallway;
	boolean meetAlva;
	boolean hideRedKey;
	boolean pastBreakWall;
	boolean brokenWireBox;
	boolean brokenSimpleDoor;
	boolean removeWallPanel;
	boolean reinforcedSimpleDoor;
	boolean searWireBox;
	boolean retrieveScrewdriver;
	boolean retrieveFatherID;
	boolean retrievePurpleKey;
	boolean removePanel;
	boolean nightofHorrors;
	boolean nightofFire;
	boolean night2;
	boolean alvaRampage;
	boolean NightofFireRescue;
	boolean breakWallNorthWestPassage;
	boolean breakWallSouthWestPassage;
	boolean breakWallNorthEastPassage;
	boolean run;
	boolean meetMonster;
	boolean nightMonster;
	boolean northWestVent;
	boolean southWestVent;
	boolean dormVent;
	boolean blockA;
	boolean blockB;
	boolean blockC;
	boolean retrieveGreenKey;
	 boolean retrieveBackpack;
	 boolean breakEastPassage;
	boolean rescueComplete;
	boolean breakWallBurial;
	boolean burial;
	 boolean breakWallRescue;

	
	public List ()
	
	{	
		breakWallRescue = false;
		burial = false;
		breakWallBurial = false;
		rescueComplete = false;
		night2 = false;
		Note1 = false;
		Note2 = false;
		breakEastPassage = false;
		wall2 = false;
		floor1 = false;
		floor2 = false;
		redkey = false;
		greenkey = false;
		yellowkey = false;
		powerswitch = true;
		doorhold1 = false;
		doorhold2 = false;
		escape = false;
		enterNorthHallway = false;
		meetAlva = false;
		hideRedKey = false;
		pastBreakWall = false;
		brokenWireBox = false;
		reinforcedSimpleDoor = false;
		brokenSimpleDoor = false;
		removeWallPanel = false;
		searWireBox = false;
		retrieveScrewdriver = false;
		retrieveFatherID = false;
		retrievePurpleKey = false;
		removePanel = false;
		nightofHorrors = false;
		nightofFire = false;
		alvaRampage = false;
		NightofFireRescue = false;
		breakWallNorthWestPassage = false;
		breakWallNorthEastPassage = false;
		breakWallSouthWestPassage = false;
		run = false;
		meetMonster = false;
		nightMonster = false;
		northWestVent = false;
		southWestVent = false;
		dormVent = false;
		blockA = true;
		blockB = true;
		blockC = true;
		retrieveGreenKey = false;
		retrieveBackpack = false;





	}
	
	public void actNote1()
	{
		Note1 = true;

	}
	
	public void actWall2()
	{
		wall2 = true;
	}
	
	public void actFloor1()
	{
		floor1 = true;
	}
	
	public void actFloor2()
	{
		floor2 = true;
	}
	
	public boolean checkNote1()
	{
		return Note1;
	}
	
	public boolean checkHideRedKey()
	{
		return hideRedKey;
	}
	
	public void actHideRedKey()
	{
		hideRedKey = true;
	}
	
	public boolean checkWall2()
	{
		return wall2;
	}
	
	public boolean checkFloor1()
	{
		return floor1;
	}
	
	public boolean checkFloor2()
	{
		return floor2;
	}
	
	public boolean checkRedKey()
	{
		return redkey;
	}
	
	public boolean checkGreenKey()
	{
		return greenkey;
	}
	
	public boolean checkYellowKey()
	{
		return yellowkey;
	}
	
	public boolean checkDoorHold1()
	{
		return doorhold1;
	}	public boolean checkDoorHold2()
	{
		return doorhold2;
		
	}
	
	public boolean checkPowerSwitch()
	{
		return powerswitch;
	}
	
	public boolean checkEscape()
	{
		return escape;
	}
	
	public void Escape()
	{
		escape = true;
	}
	
	public void switchRedKey()
	{
		if(redkey == false)
			redkey = true;
		else
			redkey = false;
	}
	
	public void switchGreenKey()
	{
		if(greenkey == false)
			greenkey = true;
		else
			greenkey = false;
	}
	
	public void switchYellowKey()
	{
		if(yellowkey == false)
			yellowkey = true;
		else
			yellowkey = false;
	}
	
	public void switchDoorHold1()
	{
		if(doorhold1 == false)
			doorhold1 = true;
		else
			doorhold1 = false;
	}
	
	public void switchDoorHold2()
	{
		if(doorhold2 == false)
			doorhold2 = true;
		else
			doorhold2 = false;
	}
	
	public void switchPowerSwitch()
	{
		if(powerswitch == false)
			powerswitch = true;
		else
			powerswitch = false;
		
		if(checkEscape() == false)
		{
			escape = true;
		}
	}
	
	public void meetAlva()
	{
		meetAlva = true;
	}
	
	public boolean checkMeetAlva()
	{
		return meetAlva;
	}
	
	public void enterNorthHallway()
	{
		enterNorthHallway = true;
	}
	
	public boolean checkEnterNorthHallway()
	{
		return enterNorthHallway;
	}

	public  boolean checkNote2() {
		return Note2;
	}
	
	public void actNote2()
	{
		Note2 = true;
	}

	public boolean checkPastBreakWall() {
		return pastBreakWall;
	}
	
	public void actPastBreakWall()
	{
		pastBreakWall = true;
	}

	public boolean checkBrokenWireBox() {
		return brokenWireBox;
	}

	public boolean checkSearWireBox() {
		return searWireBox;
	}

	public boolean checkBrokenSimpleDoor() {
		return brokenSimpleDoor;
	}

	public void actBrokenWireBox() {
		brokenWireBox = true;
		
	}

	public boolean checkReinforcedSimpleDoor() {
		return reinforcedSimpleDoor;
	}
	
	public void actReinforcedSimpleDoor()
	{
		reinforcedSimpleDoor = true;
	}
	
	public boolean checkRemoveWallPanel()
	{
		return removeWallPanel;
	}
	
	public void actRemoveWallPanel()
	{
		removeWallPanel = true;
	}

	public void actBrokenSimpleDoor() 
	{
		brokenSimpleDoor = true;
	}
	
	public void actSearWireBox()
	{
		System.out.println("Sear");
		searWireBox = true;
	}

	public boolean checkRetrieveScrewdriver() {
		return retrieveScrewdriver;
	}
	
	public void actRetrieveScrewdriver()
	{
		retrieveScrewdriver = true;
	}
	
	public boolean checkRemovePanel() {
		return removePanel;
	}
	
	public void actRemovePanel()
	{
		removePanel = true;
	}

	public boolean checkNightofHorrors() {
		return nightofHorrors;
	}
	
	public void actNightofHorrors()
	{
		nightofHorrors = true;
	}
	


	public boolean checkNightofFire() {
		return nightofHorrors;
	}

	public void actNightofFire()
	{
		nightofHorrors = true;
	}

	public boolean checkRetrieveFatherID() {
		return retrieveFatherID;
	}
	
	public void actRetrieveFatherID() {
		 retrieveFatherID = true;
	}

	public boolean checkNight2() {
		return night2;
	}
	
	public void actNight2()
	{
		night2 = true;
	}

	public boolean checkBreakWallNorthEastPassage() 
	{
		return breakWallNorthEastPassage;
	}

	public boolean checkBreakWallNorthWestPassage() 
	{
		return breakWallNorthWestPassage;
	}

	public void actBreakWallNorthEastPassage() 
	{
		breakWallNorthEastPassage = true;
	}

	public void actBreakWallNorthWestPassage() 
	{		
		breakWallNorthWestPassage = true;	
	}

	public boolean checkNightMonster() 
	{
		return nightMonster;
	}
	
	public void actNightMonster()
	{
		nightMonster = true;
	}

	public boolean checkAlvaRampage() {
		return alvaRampage;
	}
	
	public void actAlvaRampage()
	{
		alvaRampage = true;
	}

	public boolean checkNightofFireRescue() {
		return NightofFireRescue;
	}
	
	public void actNightofFireRescue()
	{
		NightofFireRescue = true;
	}

	public boolean checkRun() 
	{
		return run;
	}
	
	public void actRun()
	{
		run = true;
	}

	public boolean checkBreakWallSouthWestPassage() 
	{
		return breakWallSouthWestPassage;
	}

	public void actBreakWallSouthWestPassage()
	{
		breakWallSouthWestPassage = true;
	}

	public void actMeetMonster() 
	{
		meetMonster = true;
	}
	
	public boolean checkMeetMonster()
	{
		return meetMonster;
	}

	public boolean pryDormVent()
	{
		return dormVent;
	}

	public boolean prySouthWestVent()
	{
		return southWestVent;
	}
	
	public boolean pryNorthWestVent()
	{
		return northWestVent;
	}
	
	public void actDormVent()
	{
		dormVent = true;
	}
	
	public void actNorthWestVent()
	{
		northWestVent = true;
	}
	
	public void actSouthWestVent()
	{
		southWestVent = true;
	}

	public boolean checkRetrievePurpleKey() {
		return retrievePurpleKey;
	}
	
	public void actRetrievePurpleKey()
	{
		retrievePurpleKey = true;
	}

	public boolean checkBlockA() {
		return blockA;
	}
	public void actBlockA() {
		 blockA = false;
	}	
	
	public void actBlockB() {
		 blockB = false;
		
	}	
	public void actBlockC() {
		 blockC = false;
	}

	public boolean checkBlockB() {
		return blockB;
	}

	public boolean checkBlockC() {
		return blockC;
	}

	public boolean checkRetrieveGreenKey() {
		return retrieveGreenKey;
	}
	
	public void actRetrieveGreenKey() {
		retrieveGreenKey = true;
	}

	public boolean checkRetrieveBackpack() {
		return retrieveBackpack;
	}
	
	public void actRetrieveBackpack() {
		 retrieveBackpack = true;
	}

	public boolean checkBreakWallRescue() {
		
		return breakWallRescue;
	}

	public boolean checkBreakWallBurial() {
		return breakWallBurial;
	}

	public boolean checkBreakEastPassage() {
		return breakEastPassage;
	}
	
	public void actBreakEastPassage() {
		breakEastPassage = true;
	}

	public boolean checkRescueComplete() {
		// TODO Auto-generated method stub
		return rescueComplete;
	}
	
	public void actRescueComplete()
	{
		rescueComplete = true;
	}

	public void actBreakWallBurial() {
		breakWallBurial = true;
		
	}

	public boolean checkBurial() {
		return burial;
	}
	
	public void actBurial() {
		burial = true;
	}

	public void actBreakWallRescue() {
		breakWallRescue = true;
		
	}


}
	