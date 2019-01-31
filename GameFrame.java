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
	
	GameCalendar calen;
	InteractionPanel interact;
	GameScreen screen;
	Countdown clock;
	int wait;
		
	public GameFrame()
	{
		setFocusTraversalKeysEnabled(false);
		
		calen = new GameCalendar();
		clock = new Countdown(calen);
		screen = new GameScreen (calen, clock);
		
		int delay = 1000;
		
		ActionListener taskPerformer = new ActionListener() 
		{
		
			public void actionPerformed (ActionEvent e)
			{
				clock.increaseCountdown();
				repaint();
			}
		};
		
		new Timer(delay, taskPerformer).start();
		
		this.add(screen, BorderLayout.CENTER);
	
		addKeyListener(new KeyAdapter() 
		{		
			public void keyPressed(KeyEvent e)
			{
				if (calen.checkTutorial() == true)
				{
					calen.endTutorial();
				}
				
				else
				{
					int wait = 1;
					
					if (calen.checkDialogue() == true)
			    	{	
						
						
						if(e.getKeyCode() == 16)
						{	
							screen.inter.changeDialogue("");
							calen.endDialgoue();
							wait = 2;
						}
					}
					
					if(calen.checkInventoryMenu() == true)
					{
						repaint();
						System.out.println("Pop");
						if(e.getKeyCode() == KeyEvent.VK_UP){
						
							if(calen.getInventoryCursor() -1 > -1)
							{
								calen.changeInventoryCursor(-1);	
							}
						}
						if(e.getKeyCode() == KeyEvent.VK_DOWN){
							if(calen.getInventoryCursor() +1 <= calen.getInventoryTotal())
							{
								calen.changeInventoryCursor(+1);
							}
						}
						if(e.getKeyCode() == 16)
						{
							if(calen.getInventoryCursor()== calen.getInventoryTotal())
							{
								calen.endInventoryMenu();
								calen.resetInventoryCursor();
							}
						}

						
					}
					
					if(calen.checkMenu() == true)
					{
						if(e.getKeyCode() == KeyEvent.VK_DOWN)
						{
							if(calen.getMenuCursor() == 0)
								calen.setMenuCursor(1);
							else
								calen.setMenuCursor(0);
						}
						
						if(e.getKeyCode() == KeyEvent.VK_UP)
						{
							if(calen.getMenuCursor() == 0)
								calen.setMenuCursor(1);
							else
								calen.setMenuCursor(0);
						}
						
						
						if(e.getKeyCode() == 16)
						{							
							if(calen.getMenuCursor() == 0)
							{
								calen.endMenu();
								calen.startInventoryMenu();
								System.out.println("QUITE");
								repaint();

							}
							else
							{
							calen.endMenu();
							}
							calen.setMenuCursor(0);

						}

					}
					
					
					
					if (calen.checkDialogue() == false && calen.checkMenu() == false && calen.checkInventoryMenu() == false && wait == 1)
					{
						if(e.getKeyCode() == 81)
						{
							calen.startMenu();
						}
						
						if(e.getKeyCode() == 87)
						{
							//calen.ModeRed();
							calen.currentyear = calen.gameyearpast;

						}
						
						if(e.getKeyCode() == 69)
						{
							calen.DefaultMode();
							calen.currentyear = calen.gameyearpresent;
						}
						
						if(e.getKeyCode() == KeyEvent.VK_LEFT)
						{
							if (screen.sprite.checkDirection() != 'a')
							{
								screen.sprite.changeDirection('a');
							}
							
							else if (screen.sprite.checkDirection() =='a') 
							{
								if(screen.room[calen.getGameDay()][calen.getRoom()][screen.sprite.getX()-1][screen.sprite.getY()].checkMove()==true)
								{
									screen.sprite.changeX(-1);
									screen.changeX(-1);

								}
							}	
						}
						
						if(e.getKeyCode() == KeyEvent.VK_UP)
						{
							if (screen.sprite.checkDirection() != 'w')
							{
								screen.sprite.changeDirection('w');
							}
							
							else if (screen.sprite.checkDirection() =='w') 
							{
								if(screen.room[calen.getGameDay()][calen.getRoom()][screen.sprite.getX()][screen.sprite.getY()-1].checkMove()==true)
								{
									screen.sprite.changeY(-1);
									screen.changeY(-1);

								}
							}
						}
						
						if(e.getKeyCode() == KeyEvent.VK_DOWN)
						{
							if(screen.sprite.checkDirection() != 's')
							{
								screen.sprite.changeDirection('s');
							}
							
							else if(screen.sprite.checkDirection() == 's')
							{
								if(screen.room[calen.getGameDay()][calen.getRoom()][screen.sprite.getX()][screen.sprite.getY()+1].checkMove() ==true)
								{
									screen.sprite.changeY(+1);
									screen.changeY(+1);
								}
							}
						}
						
						if(e.getKeyCode() == KeyEvent.VK_RIGHT)
						{
							if (screen.sprite.checkDirection() != 'd')
							{
								screen.sprite.changeDirection('d');
							}
							
							else if (screen.sprite.checkDirection() == 'd')
							{
								if(screen.room[calen.getGameDay()][calen.getRoom()][screen.sprite.getX()+1][screen.sprite.getY()].checkMove() == true)
								{
									screen.sprite.changeX(+1);
									screen.changeX(+1);

								}
							}
						}
						
						if (e.getKeyCode() == 16)
						{
					    	if (calen.checkDialogue()==false && wait == 1)
					    	{
					 
						    	if(screen.sprite.checkDirection()== 'a')
						    	{
						    		screen.room[calen.getGameDay()][calen.getRoom()][screen.sprite.getX()-1][screen.sprite.getY()].interacteObject();
						    	}
						    	
						    	if(screen.sprite.checkDirection()== 's')
						    	{
						    		screen.room[calen.getGameDay()][calen.getRoom()][screen.sprite.getX()][screen.sprite.getY()+1].interacteObject();
						    	}
						    		
						    	if(screen.sprite.checkDirection()== 'w')
						    	{	
						    		screen.room[calen.getGameDay()][calen.getRoom()][screen.sprite.getX()][screen.sprite.getY()-1].interacteObject();
						    	}
						    		
						    	if(screen.sprite.checkDirection()== 'd')
						    	{
						    		screen.room[calen.getGameDay()][calen.getRoom()][screen.sprite.getX()+1][screen.sprite.getY()].interacteObject();	
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

