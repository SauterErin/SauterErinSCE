package choice;

public class SystemMode
{	
	// System Modes on/off
	
	private boolean dialogue; 
	private boolean dialogue2;
	private boolean move;
	private boolean select;
	private boolean tutorial;
	
	public SystemMode()
	{
		dialogue = false;
		dialogue2 = false;
		move = false;	
		select = false;
		tutorial = true;
	}
	
	// Checks if Dialogue (1) mode is active
	public boolean checkDialogue()
	{
		return dialogue;
	}
	
	// Checks if Dialogue2 (2) mode is active
	public boolean checkDialogue2()
	{
		return dialogue2;
	}
	
	// Checks if Move mode is active
	public boolean checkMove()
	{
		return move;
	}
	
	// Checks if Select mode is active
	public boolean checkSelect()
	{
		return select;
	}
	
	// Checks if Tutorial mode is active
	public boolean checkTutorial()
	{
		return tutorial;
	}
	
	// Ends Dialogue (1) mode
	public void endDialogue()
	{
		dialogue = false;
	}
	
	// Ends Dialogue (2) mode
	public void endDialogue2()
	{
		dialogue2 = false;
	}
	
	// Ends Move mode
	public void endMove()
	{
		move = false;
	}
	
	// Ends Select mode
	public void endSelect()
	{
		select = false;
	}
	
	// Ends Tutorial mode
	public void endTutorial()
	{
		tutorial = false;
		dialogue = true;
	}

	// Starts Dialogue (1) mode
	public void startDialogue()
	{
		dialogue = true;
	}
	
	// Starts Dialogue (2) mode
	public void startDialogue2()
	{
		dialogue2 = true;
	}
	
	// Starts Move mode
	public void startMove()
	{
		move = true;
	}
	
	// Starts Select mode
	public void startSelect()
	{
		select = true;
	}
}