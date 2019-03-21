package choice;

public class SystemMode {
	int menucursor;
	int inventorycursor;
	int inventorytotal;
	boolean dialogue;
	boolean dialogue2;
	boolean select;
	boolean move;
	boolean tutorial;
	boolean menu;
	boolean inventorymenu;
	
	public SystemMode(){
		menucursor = 0;
		inventorycursor = 0;
		inventorytotal = 0;
		dialogue = false;
		dialogue2 = false;
		menu = false;
		inventorymenu = false;
		select = false;
		tutorial = true;
		move = false;
	
	}
	
	public boolean checkDialogue()
	{
		return dialogue;
	}

	public void startDialogue()
	{
		dialogue = true;
	}

	public void endDialogue()
	{
		dialogue = false;
	}

	public boolean checkDialogue2()
	{
		return dialogue2;
	}

	public void startDialogue2()
	{
		dialogue2 = true;
	}

	public void endDialogue2()
	{
		dialogue2 = false;
	}

	public boolean checkMenu()
	{
		return menu;
	}

	public void startMenu()
	{
		menu = true;
	}

	public void endMenu()
	{
		menu = false;
	}
	public boolean checkSelect()
	{
		return select;
	}

	public void startSelect()
	{
		select = true;
	}

	public void endSelect()
	{
		select = false;
	}
	public int getMenuCursor()
	{
		return menucursor;
	}

	public void setMenuCursor(int newposition)
	{
		menucursor = newposition;
	}

	public boolean checkInventoryMenu()
	{
		return inventorymenu;
	}

	public void startInventoryMenu()
	{
		System.out.println("Inven - start");
		inventorymenu = true;
	}

	public void endInventoryMenu()
	{
		inventorymenu = false;
	}

	public int getInventoryTotal()
	{
		return inventorytotal;
	}

	public void increaseInventoryTotal()
	{
		inventorytotal = inventorytotal +1;
	}

	public int getInventoryCursor()
	{
		return inventorycursor;
	}

	public void resetInventoryCursor()
	{
		inventorycursor = 0;
	}

	public void changeInventoryCursor( int change)
	{
		inventorycursor = inventorycursor + change;
	}


	public boolean checkTutorial()
	{
		return tutorial;
	}

	public void endTutorial()
	{
		tutorial = false;
		move = true;
	}
	
	public boolean checkMove()
	{
		return move;
	}
	
	public void startMove()
	{
		move = true;
	}
	
	public void endMove()
	{
		move = false;
	}
}

