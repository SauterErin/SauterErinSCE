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

	boolean wait;
	
	GameMode gameinfo;
	GameScreen screen;
	SystemMode system;
		
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
					screen.log.readDialogue(5);
				}
				
				else
				{
					wait = false;
					
					//Dialogue (1) Mode
					if (system.checkDialogue() == true)
			    	{	
						if(e.getKeyCode() == KeyEvent.VK_ENTER)
						{	
							screen.inter.changeDialogue("");
							script = screen.log.continueDialogue(script);
							wait = true;
						}
					}
					
					//Dialogue (2) Mode
					if (system.checkDialogue2() == true && wait == false)
			    	{	
						if(e.getKeyCode() == KeyEvent.VK_ENTER)
						{	
							screen.inter.changeDialogue("");
							script = screen.select.log2.continueDialogue(script);
							wait = true;
						}
					}
					
					//Select Mode
					if (system.checkSelect() == true && wait == false)
					{
						if(e.getKeyCode() == KeyEvent.VK_ENTER)
						{
							screen.select.optionSelect();
						}
						
						if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_UP)
						{
							screen.select.changeChoice();	
						}
						
						wait = true;
					}
					
					//Arrow key system - movement
					if (system.checkMove() == true && wait == false)
					{	
						if(e.getKeyCode() == KeyEvent.VK_LEFT)
						{
							if (screen.sprite.checkDirection() != 'W')
							{
								screen.sprite.changeDirection('W');
							}
							
							else if (screen.sprite.checkDirection() =='W') 
							{
								if(screen.room[gameinfo.getRoom()][screen.sprite.getX()-1][screen.sprite.getY()].checkMoveAction()==true && (screen.sprite.getY() == screen.sprite.getMonsterY() && screen.sprite.getX()-1 == screen.sprite.getMonsterX() && screen.sprite.checkPresentMonster() == true) != true)
								{
									screen.sprite.changeX(-1);
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
								if(screen.room[gameinfo.getRoom()][screen.sprite.getX()][screen.sprite.getY()-1].checkMoveAction()==true  && (screen.sprite.getY()-1 == screen.sprite.getMonsterY() && screen.sprite.getX() == screen.sprite.getMonsterX() && screen.sprite.checkPresentMonster() == true) != true)
								{
									screen.sprite.changeY(-1);
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
								if(screen.room[gameinfo.getRoom()][screen.sprite.getX()][screen.sprite.getY()+1].checkMoveAction() ==true  && (screen.sprite.getY()+1 == screen.sprite.getMonsterY() && screen.sprite.getX() == screen.sprite.getMonsterX() && screen.sprite.checkPresentMonster() == true) != true)
								{
									screen.sprite.changeY(+1);
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
								if(screen.room[gameinfo.getRoom()][screen.sprite.getX()+1][screen.sprite.getY()].checkMoveAction() == true  && (screen.sprite.getY() == screen.sprite.getMonsterY() && screen.sprite.getX()+1 == screen.sprite.getMonsterX() && screen.sprite.checkPresentMonster() == true) != true)
								{
									screen.sprite.changeX(+1);
								}
							}
						}
						
						//Enter Key actions
						if (e.getKeyCode() == KeyEvent.VK_ENTER)
						{	
							//If in Move mode
					    	if (system.checkMove()== true && wait == false)
					    	{
					    		//Grid selection of interactObjct() by direction of sprite
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