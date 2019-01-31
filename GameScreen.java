package choice;
import javax.swing.*;

import java.awt.*;

public class GameScreen extends JPanel {
	
	public GameObject [][][][] room = new GameObject [2][5][20][20];
	
	GameCalendar calen;
	String dialogue;
	Inventory items;
	List list;
	InteractionPanel inter;
	public GameSprite sprite;
	Countdown clock;
	Dialogue log;
	
	int Xsprite;
	int Ysprite;
	
	public GameScreen (GameCalendar calen, Countdown clock)
	{	
		setBackground(Color.black);
		this.calen = calen;
		dialogue = "";
		items = new Inventory();
		list = new List();
		inter = new InteractionPanel();						
		this.clock = clock;
		sprite = new GameSprite (5, 5);
		log = new Dialogue(calen, inter);
		Xsprite = 5;
		Ysprite = 5;
		for (int k = 0; k < 2; k++){	
			for(int i = 0; i < 20; i++){
					for(int j = 0; j < 20; j++){
						if(j == 0 || j == 19){
							room[0][k][i][j] = new Boundary(i, j, calen, list, log, sprite);
						}
						
						if(j > 0 && j < 19){
							room[0][k][i][j] = new RedTestFloor(i,j,calen,list, log, sprite);
						}
						
						if(j > 10 && j < 19){
							room[0][k][i][j] = new BlueTestFloor(i,j,calen,list, log, sprite);
						}
						
						if(i == 0 || i == 19)
						{
							room[0][k][i][j] = new Boundary(i,j,calen,list,log, sprite);
						}
					
					}
	
			}
		}
		
		for(int l=0; l < 6; l++)
		{
			for (int m=0; m <6; m++)
			{
				room [0][2][l][m] = new WoodFloor(l,m, calen, list, log, sprite);
			}
		}
		
		room[0][1][15][0] = new DoorTest(15,0,calen, list, log, sprite);
		room[0][0][4][19] = new DoorTest(4,19,calen,list,log,sprite);
		room[0][1][3][4] = new Window(3,4, calen, list, log, sprite);
		room[0][0][3][4] = new Bed2(3,4, calen, list, log, sprite);
		room[0][0][3][5] = new Floor(3,5, calen, list, inter, log, sprite);
		
		room[0][2][1][0] = new BrickWall(1,0, calen, list, log, sprite);
		room[0][2][2][0] = new BrickWall(2,0, calen, list, log, sprite);
		room[0][2][3][0] = new BrickWall(3,0, calen, list, log, sprite);
		room[0][2][4][0] = new Window(4,0, calen, list, log, sprite);
		room[0][2][5][0] = new BrickWall(5,0, calen, list, log, sprite);
		room[0][2][6][0] = new BrickWall(6,0, calen, list, log, sprite);
		room[0][2][0][0] = new BrickWall(0,0, calen, list, log, sprite);
		

		room[0][2][0][1] = new BrickWall(0,1, calen, list, log, sprite);
		room[0][2][0][2] = new BrickWall(0,2, calen, list, log, sprite);
		room[0][2][0][3] = new BrickWall(0,3, calen, list, log, sprite);
		room[0][2][0][4] = new BrickWall(0,4, calen, list, log, sprite);
		room[0][2][0][5] = new BrickWall(0,5, calen, list, log, sprite);
		

		room[0][2][6][1] = new BrickWall(6,1, calen, list, log, sprite);
		room[0][2][6][2] = new WallHole(6,2, calen, list, log, sprite);
		room[0][2][6][3] = new BrickWall(6,3, calen, list, log, sprite);
		room[0][2][6][4] = new BrickWall(6,4, calen, list, log, sprite);
		room[0][2][6][5] = new BrickWall(6,5, calen, list, log, sprite);

		room[0][2][1][6] = new BrickWall(1,6, calen, list, log, sprite);
		room[0][2][2][6] = new BrickWall(2,6, calen, list, log, sprite);
		room[0][2][3][6] = new BrickWall(3,6, calen, list, log, sprite);
		room[0][2][4][6] = new PurpleDoor(4,6, calen, list, log, sprite);
		room[0][2][5][6] = new BrickWall(5,6, calen, list, log, sprite);
		room[0][2][6][6] = new BrickWall(6,6, calen, list, log, sprite);
		room[0][2][0][6] = new BrickWall(0,6, calen, list, log, sprite);
		
		room[0][2][1][2] = new Bed1(1,2, calen, list, log, sprite);
		room[0][2][1][3] = new Bed2(1,3, calen, list, log, sprite);

		room[0][2][3][3] = new TrapDoor(3,3, calen, list, log, sprite);
		
		room[0][3][0][1] = new BrickWall(0,1, calen, list, log, sprite);
		room[0][3][0][2] = new WallHole(0,2, calen, list, log, sprite);
		room[0][3][0][3] = new BrickWall(0,3, calen, list, log, sprite);
		room[0][3][1][1] = new BrickWall(1,1, calen, list, log, sprite);
		room[0][3][2][1] = new BrickWall(2,1, calen, list, log, sprite);
		room[0][3][3][1] = new BrickWall(3,1, calen, list, log, sprite);
		room[0][3][4][1] = new BrickWall(4,1, calen, list, log, sprite);
		room[0][3][5][1] = new BrickWall(5,1, calen, list, log, sprite);
		room[0][3][6][1] = new ClimbingWall(6,1, calen, list, log, sprite);
		room[0][3][7][1] = new BrickWall(7,1, calen, list, log, sprite);
		room[0][3][8][1] = new BrickWall(8,1, calen, list, log, sprite);
		room[0][3][9][1] = new BrickWall(9,1, calen, list, log, sprite);
		room[0][3][10][1] = new BrickWall(10,1, calen, list, log, sprite);
		room[0][3][1][2] = new WoodFloor(1,2, calen, list, log, sprite);
		room[0][3][2][2] = new WoodFloor(2,2, calen, list, log, sprite);
		room[0][3][3][2] = new WoodFloor(3,2, calen, list, log, sprite);
		room[0][3][4][2] = new WoodFloor(4,2, calen, list, log, sprite);
		room[0][3][5][2] = new WoodFloor(5,2, calen, list, log, sprite);
		room[0][3][6][2] = new WoodFloor(6,2, calen, list, log, sprite);
		room[0][3][7][2] = new WoodFloor(7,2, calen, list, log, sprite);
		room[0][3][8][2] = new WoodFloor(8,2, calen, list, log, sprite);
		room[0][3][9][2] = new WoodFloor(9,2, calen, list, log, sprite);
		room[0][3][1][3] = new BrickWall(1,3, calen, list, log, sprite);
		room[0][3][2][3] = new BrickWall(2,3, calen, list, log, sprite);
		room[0][3][3][3] = new BrickWall(3,3, calen, list, log, sprite);
		room[0][3][4][3] = new BrickWall(4,3, calen, list, log, sprite);
		room[0][3][5][3] = new BrickWall(5,3, calen, list, log, sprite);
		room[0][3][6][3] = new BrickWall(6,3, calen, list, log, sprite);
		room[0][3][7][3] = new BrickWall(7,3, calen, list, log, sprite);
		room[0][3][8][3] = new BrickWall(8,3, calen, list, log, sprite);
		room[0][3][9][3] = new BrickWall(9,3, calen, list, log, sprite);
		room[0][3][10][3] = new BrickWall(10,3, calen, list, log, sprite);
		room[0][3][10][2] = new WallHole(10,2, calen,list,log, sprite);
		
		
		room[0][4][0][0] = new BrickWall(0,0, calen,list,log, sprite);
		room[0][4][0][1] = new BrickWall(0,1, calen,list,log, sprite);
		room[0][4][0][2] = new BrickWall(0,2, calen,list,log, sprite);
		room[0][4][0][3] = new BrickWall(0,3, calen,list,log, sprite);
		room[0][4][0][4] = new BrickWall(0,4, calen,list,log, sprite);
		room[0][4][0][5] = new BrickWall(0,5, calen,list,log, sprite);
		room[0][4][0][6] = new WallHole(0,6, calen,list,log, sprite);
		room[0][4][0][7] = new BrickWall(0,7, calen,list,log, sprite);
		room[0][4][0][8] = new BrickWall(0,8, calen,list,log, sprite);
		room[0][4][1][0] = new BrickWall(1,0, calen,list,log, sprite);
		room[0][4][2][0] = new BrickWall(2,0, calen,list,log, sprite);
		room[0][4][3][0] = new BrickWall(3,0, calen,list,log, sprite);
		room[0][4][4][0] = new Window(4,0, calen,list,log, sprite);
		room[0][4][5][0] = new Window(5,0, calen,list,log, sprite);
		room[0][4][6][0] = new BrickWall(6,0, calen,list,log, sprite);
		room[0][4][7][0] = new BrickWall(7,0, calen,list,log, sprite);
		room[0][4][8][0] = new BrickWall(8,0, calen,list,log, sprite);
		room[0][4][8][1] = new BrickWall(8,1, calen,list,log, sprite);
		room[0][4][8][2] = new BrickWall(8,2, calen,list,log, sprite);
		room[0][4][8][3] = new BrickWall(8,3, calen,list,log, sprite);
		room[0][4][8][4] = new BrickWall(8,4, calen,list,log, sprite);
		room[0][4][8][5] = new BrickWall(8,5, calen,list,log, sprite);
		room[0][4][8][6] = new BrickWall(8,6, calen,list,log, sprite);
		room[0][4][8][7] = new BrickWall(8,7, calen,list,log, sprite);
		room[0][4][8][8] = new BrickWall(0,8, calen,list,log, sprite);
		room[0][4][1][8] = new BrickWall(1,8, calen,list,log, sprite);
		room[0][4][2][8] = new BrickWall(2,8, calen,list,log, sprite);
		room[0][4][3][8] = new BrickWall(3,8, calen,list,log, sprite);
		room[0][4][4][8] = new BrickWall(4,8, calen,list,log, sprite);
		room[0][4][5][8] = new RedDoor(5,8, calen,log, sprite, items, clock);
		room[0][4][6][8] = new BrickWall(6,8, calen,list,log, sprite);
		room[0][4][7][8] = new BrickWall(7,8, calen,list,log, sprite);
		room[0][4][8][8] = new BrickWall(8,8, calen,list,log, sprite);
		room[0][4][1][1] = new WoodFloor(1,1, calen,list,log, sprite);
		room[0][4][1][2] = new WoodFloor(1,2, calen,list,log, sprite);
		room[0][4][1][3] = new WoodFloor(1,3, calen,list,log, sprite);
		room[0][4][1][4] = new WoodFloor(1,4, calen,list,log, sprite);
		room[0][4][1][5] = new WoodFloor(1,5, calen,list,log, sprite);
		room[0][4][1][6] = new WoodFloor(1,6, calen,list,log, sprite);
		room[0][4][1][7] = new WoodFloor(1,7, calen,list,log, sprite);
		room[0][4][2][1] = new WoodFloor(2,1, calen,list,log, sprite);
		room[0][4][2][2] = new WoodFloor(2,2, calen,list,log, sprite);
		room[0][4][2][3] = new WoodFloor(2,3, calen,list,log, sprite);
		room[0][4][2][4] = new WoodFloor(2,4, calen,list,log, sprite);
		room[0][4][2][5] = new WoodFloor(2,5, calen,list,log, sprite);
		room[0][4][2][6] = new WoodFloor(2,6, calen,list,log, sprite);
		room[0][4][2][7] = new WoodFloor(2,7, calen,list,log, sprite);
		room[0][4][3][1] = new WoodFloor(3,1, calen,list,log, sprite);
		room[0][4][3][2] = new WoodFloor(3,2, calen,list,log, sprite);
		room[0][4][3][3] = new WoodFloor(3,3, calen,list,log, sprite);
		room[0][4][3][4] = new WoodFloor(3,4, calen,list,log, sprite);
		room[0][4][3][5] = new WoodFloor(3,5, calen,list,log, sprite);
		room[0][4][3][6] = new WoodFloor(3,6, calen,list,log, sprite);
		room[0][4][3][7] = new WoodFloor(3,7, calen,list,log, sprite);
		room[0][4][4][1] = new WoodFloor(4,1, calen,list,log, sprite);
		room[0][4][4][2] = new WoodFloor(4,2, calen,list,log, sprite);
		room[0][4][4][3] = new WoodFloor(4,3, calen,list,log, sprite);
		room[0][4][4][4] = new WoodFloor(4,4, calen,list,log, sprite);
		room[0][4][4][5] = new WoodFloor(4,5, calen,list,log, sprite);
		room[0][4][4][6] = new WoodFloor(4,6, calen,list,log, sprite);
		room[0][4][4][7] = new WoodFloor(4,7, calen,list,log, sprite);
		room[0][4][5][1] = new WoodFloor(5,1, calen,list,log, sprite);
		room[0][4][5][2] = new WoodFloor(5,2, calen,list,log, sprite);
		room[0][4][5][3] = new WoodFloor(5,3, calen,list,log, sprite);
		room[0][4][5][4] = new WoodFloor(5,4, calen,list,log, sprite);
		room[0][4][5][5] = new WoodFloor(5,5, calen,list,log, sprite);
		room[0][4][5][6] = new WoodFloor(5,6, calen,list,log, sprite);
		room[0][4][5][7] = new WoodFloor(5,7, calen,list,log, sprite);
		room[0][4][6][1] = new WoodFloor(6,1, calen,list,log, sprite);
		room[0][4][6][2] = new WoodFloor(6,2, calen,list,log, sprite);
		room[0][4][6][3] = new WoodFloor(6,3, calen,list,log, sprite);
		room[0][4][6][4] = new WoodFloor(6,4, calen,list,log, sprite);
		room[0][4][6][5] = new WoodFloor(6,5, calen,list,log, sprite);
		room[0][4][6][6] = new WoodFloor(6,6, calen,list,log, sprite);
		room[0][4][6][7] = new WoodFloor(6,7, calen,list,log, sprite);
		room[0][4][7][1] = new WoodFloor(7,1, calen,list,log, sprite);
		room[0][4][7][2] = new WoodFloor(7,2, calen,list,log, sprite);
		room[0][4][7][3] = new WoodFloor(7,3, calen,list,log, sprite);
		room[0][4][7][4] = new WoodFloor(7,4, calen,list,log, sprite);
		room[0][4][7][5] = new WoodFloor(7,5, calen,list,log, sprite);
		room[0][4][7][6] = new WoodFloor(7,6, calen,list,log, sprite);
		room[0][4][7][7] = new WoodFloor(7,7, calen,list,log, sprite);
		

	}

	public void changeX(int changeBy){
		
		Xsprite = Xsprite + changeBy;
	}

	public void changeY(int changeBy){
		
		Ysprite = Ysprite + changeBy;
	}

	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		
		if (calen.checkTutorial() == true)
		{	
			g.drawString("Find the keys to escape.", 50, 15);
			g.drawString("To move left press the left arrow key.", 50, 30);
			g.drawString("To move up press the up arrow key.", 50, 45);
			g.drawString("To move down press the down arrow key.", 50, 60);
			g.drawString("To move right press the right arrow key.", 50, 75);
			g.drawString("To inspect objects press the shift key.", 50, 90);
			g.drawString("Press any key to begin.", 50, 105);
		}
		
		else
		{	
			clock.paintComponent(g);	
				
			if (calen.getGameDay()== -1)
			{
				g.setColor(Color.red);
				g.drawString("You never left.", getWidth()/2, getHeight()/2-15);
				g.drawString("Game Over", getWidth()/2, getHeight()/2);
			}
			
			if (calen.getGameDay() != -1 && calen.getGameDay() != 357)
			{
				
				
				
				for (int i = 0; i < 20; i++)
				{
					for (int j = 0; j < 20; j++)
					{
						if (room[calen.getGameDay()][calen.getRoom()][i][j] != null)
						{	
							room[calen.getGameDay()][calen.getRoom()][i][j].setRelative();
						
								room[calen.getGameDay()][calen.getRoom()][i][j].paintComponent(g);
													
						}
					}
				}	
			
			sprite.paintComponent(g);
			
				if(calen.checkDialogue() == true)
				{
					inter.paintComponent(g);
				}
				
				if(calen.checkMenu() == true)
				{
					g.setColor(Color.CYAN);
					g.fillRect(100,100,200,500);
					g.setColor(Color.green);
					g.drawString("INVENTORY", 140, 150);
					g.drawString("EXIT", 140, 300);
					g.setColor(Color.MAGENTA);
					
					calen.paintComponent(g);


					if(calen.getMenuCursor() == 0)
					{
						g.fillRect(120,150, 25,25);
					}
					
					else
						g.fillRect(120,300,25,25);
				}	
			}
			
			if(calen.checkInventoryMenu() == true)
			{
				g.setColor(Color.YELLOW);
				g.fillRect(100,100,400,500);
				g.setColor(Color.green);
				if(calen.getInventoryTotal() > 0)
					{g.drawString("NOTE", 140, 150);}
				g.drawString("EXIT", 140, 470);
				g.setColor(Color.MAGENTA);
				
				calen.paintComponent(g);


				if(calen.getInventoryCursor() == calen.getInventoryTotal())
				{
					g.fillRect(120,470, 25,25);
				}
				
				else
					g.fillRect(120,140+(30*calen.getInventoryTotal()),25,25);
			}	
		}
			
					
					
				

			if (calen.getGameDay()==357)
			{
				g.drawString("It's a nice day to be outside.", getWidth()/2, getHeight()/2);
			}
		}
	}
