package choice;
import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.Timer;

public class GameFrame extends JFrame {
	
	GameMode gameinfo;
	SystemMode system;
	GameScreen screen;
	Countdown clock;
	int wait;
		
	public GameFrame()
	{
		setFocusTraversalKeysEnabled(false);
		
		gameinfo = new GameMode();
		system = new SystemMode();
		screen = new GameScreen (gameinfo, system);
		
		int delay = 1000;
		
		ActionListener taskPerformer = new ActionListener() 
		{
		
			public void actionPerformed (ActionEvent e)
			{
				//clock.increaseCountdown();
				repaint();
			}
		};
		
		new Timer(delay, taskPerformer).start();
		
		this.add(screen, BorderLayout.CENTER);
	
		addKeyListener(new KeyAdapter() 
		{		
			int script = 0;

			public void keyPressed(KeyEvent e)
			{
				if (system.checkTutorial() == true)
				{
					system.endTutorial();
				}
				
				else
				{
					int wait = 1;
					
					if (system.checkDialogue() == true)
			    	{	
						
						
						if(e.getKeyCode() == KeyEvent.VK_ENTER)
						{	
							screen.inter.changeDialogue("");
							script = screen.log.continueDialogue(script);
							wait = 2;
						}
					}
					
					if (system.checkDialogue2() == true && wait == 1)
			    	{	
						
						
						if(e.getKeyCode() == KeyEvent.VK_ENTER)
						{	
							screen.inter.changeDialogue("");
							script = screen.select.log2.continueDialogue(script);
							wait = 2;
						}
					}
					
					if (system.checkSelect() == true && wait == 1)
					{
						if(e.getKeyCode() == KeyEvent.VK_ENTER)
						{
							screen.select.optionSelect();
						}
						
						if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_UP)
							screen.select.changeChoice();
						
						wait = 2;
					}

					
					if(system.checkInventoryMenu() == true)
					{
						repaint();
						if(e.getKeyCode() == KeyEvent.VK_UP){
						
							if(system.getInventoryCursor() -1 > -1)
							{
								system.changeInventoryCursor(-1);	
							}
						}
						if(e.getKeyCode() == KeyEvent.VK_DOWN){
							if(system.getInventoryCursor() +1 <= system.getInventoryTotal())
							{
								system.changeInventoryCursor(+1);
							}
						}
						if(e.getKeyCode() == KeyEvent.VK_ENTER)
						{
							if(system.getInventoryCursor()== system.getInventoryTotal())
							{
								system.endInventoryMenu();
								system.resetInventoryCursor();
							}
						}

						
					}
					
					if(system.checkMenu() == true)
					{
						if(e.getKeyCode() == KeyEvent.VK_DOWN)
						{
							if(system.getMenuCursor() == 0)
								system.setMenuCursor(1);
							else
								system.setMenuCursor(0);
						}
						
						if(e.getKeyCode() == KeyEvent.VK_UP)
						{
							if(system.getMenuCursor() == 0)
								system.setMenuCursor(1);
							else
								system.setMenuCursor(0);
						}
						
						
						if(e.getKeyCode() == KeyEvent.VK_ENTER)
						{							
							if(system.getMenuCursor() == 0)
							{
								system.endMenu();
								system.startInventoryMenu();
								repaint();

							}
							else
							{
								system.endMenu();
							}
							system.setMenuCursor(0);

						}

					}
					
					
					
					if (system.checkMove() == true && wait == 1)
					{
						if(e.getKeyCode() == 81)
						{
							system.startMenu();
						}
						
						if(e.getKeyCode() == 87)
						{
							//calen.ModeRed();
							gameinfo.currentyear = gameinfo.gameyearpast;

						}
						
						if(e.getKeyCode() == 69)
						{
							gameinfo.currentyear = gameinfo.gameyearpresent;
						}
						
						if(e.getKeyCode() == KeyEvent.VK_3)
						{
							screen.log.readDialogue(51);
						}
						
						if(e.getKeyCode() == KeyEvent.VK_LEFT)
						{
							if (screen.sprite.checkDirection() != 'W')
							{
								screen.sprite.changeDirection('W');
							}
							
							else if (screen.sprite.checkDirection() =='W') 
							{
								if(screen.room[gameinfo.getRoom()][screen.sprite.getX()-1][screen.sprite.getY()].checkMoveAction()==true)
								{
									screen.sprite.changeX(-1);
									screen.changeX(-1);

								}
							}	
						}
						
						if(e.getKeyCode() == KeyEvent.VK_UP)
						{
							if (screen.sprite.checkDirection() != 'N')
							{
								screen.sprite.changeDirection('N');
							}
							
							else if (screen.sprite.checkDirection() =='N') 
							{
								if(screen.room[gameinfo.getRoom()][screen.sprite.getX()][screen.sprite.getY()-1].checkMoveAction()==true)
								{
									screen.sprite.changeY(-1);
									screen.changeY(-1);

								}
							}
						}
						
						if(e.getKeyCode() == KeyEvent.VK_DOWN)
						{
							if(screen.sprite.checkDirection() != 'S')
							{
								screen.sprite.changeDirection('S');
							}
							
							else if(screen.sprite.checkDirection() == 'S')
							{
								if(screen.room[gameinfo.getRoom()][screen.sprite.getX()][screen.sprite.getY()+1].checkMoveAction() ==true)
								{

									screen.sprite.changeY(+1);
									screen.changeY(+1);
								}
							}
						}
						
						if(e.getKeyCode() == KeyEvent.VK_RIGHT)
						{
							if (screen.sprite.checkDirection() != 'E')
							{
								screen.sprite.changeDirection('E');
							}
							
							else if (screen.sprite.checkDirection() == 'E')
							{
								if(screen.room[gameinfo.getRoom()][screen.sprite.getX()+1][screen.sprite.getY()].checkMoveAction() == true)
								{
									screen.sprite.changeX(+1);
									screen.changeX(+1);

								}
							}
						}
						
						if (e.getKeyCode() == KeyEvent.VK_ENTER)
						{
					    	if (system.checkDialogue()==false && wait == 1)
					    	{
					 
						    	if(screen.sprite.checkDirection()== 'W')
						    	{
						    		screen.room[gameinfo.getRoom()][screen.sprite.getX()-1][screen.sprite.getY()].interactObject();
						    	}
						    	
						    	if(screen.sprite.checkDirection()== 'S')
						    	{
						    		screen.room[gameinfo.getRoom()][screen.sprite.getX()][screen.sprite.getY()+1].interactObject();
						    	}
						    		
						    	if(screen.sprite.checkDirection()== 'N')
						    	{	
						    		screen.room[gameinfo.getRoom()][screen.sprite.getX()][screen.sprite.getY()-1].interactObject();
						    	}
						    		
						    	if(screen.sprite.checkDirection()== 'E')
						    	{
						    		screen.room[gameinfo.getRoom()][screen.sprite.getX()+1][screen.sprite.getY()].interactObject();	
						    	}
					    	}
						}
					}
	
					repaint();
				}
			};
		});
	}
}

