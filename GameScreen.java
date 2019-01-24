package choice;
import javax.swing.*;

import java.awt.*;

public class GameScreen extends JPanel {
	
	public GameObject [][][][] room = new GameObject [2][3][20][20];
	
	GameCalendar calen;
	String dialogue;
	Inventory items;
	List list;
	InteractionPanel inter;
	public GameSprite sprite;
	Countdown clock;
	
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
		Xsprite = 5;
		Ysprite = 5;
		for (int k = 0; k < 2; k++){	
			for(int i = 0; i < 20; i++){
					for(int j = 0; j < 20; j++){
						if(j == 0 || j == 19){
							room[0][k][i][j] = new Boundary(i, j, calen, list, inter, sprite);
						}
						
						if(j > 0 && j < 19){
							room[0][k][i][j] = new RedTestFloor(i,j,calen,list, inter, sprite);
						}
						
						if(j > 10 && j < 19){
							room[0][k][i][j] = new BlueTestFloor(i,j,calen,list, inter, sprite);
						}
						
						if(i == 0 || i == 19)
						{
							room[0][k][i][j] = new Boundary(i,j,calen,list,inter, sprite);
						}
					
					}
	
			}
		}
		
		for(int l=0; l < 6; l++)
		{
			for (int m=0; m <6; m++)
			{
				room [0][2][l][m] = new WoodFloor(l,m, calen, list, inter, sprite);
			}
		}
		
		room[0][1][15][0] = new DoorTest(15,0,calen, list, inter, sprite);
		room[0][0][4][19] = new DoorTest(4,19,calen,list,inter,sprite);
		room[0][1][3][4] = new Window(3,4, calen, list, inter, sprite);
		room[0][0][3][4] = new Bed1(3,4, calen, list, inter, sprite);
		room[0][0][3][5] = new Bed2(3,5, calen, list, inter, sprite);
		
		room[0][2][1][0] = new BrickWall(1,0, calen, list, inter, sprite);
		room[0][2][2][0] = new BrickWall(2,0, calen, list, inter, sprite);
		room[0][2][3][0] = new BrickWall(3,0, calen, list, inter, sprite);
		room[0][2][4][0] = new Window(4,0, calen, list, inter, sprite);
		room[0][2][5][0] = new BrickWall(5,0, calen, list, inter, sprite);
		room[0][2][6][0] = new BrickWall(6,0, calen, list, inter, sprite);
		room[0][2][0][0] = new BrickWall(0,0, calen, list, inter, sprite);
		

		room[0][2][0][1] = new BrickWall(0,1, calen, list, inter, sprite);
		room[0][2][0][2] = new BrickWall(0,2, calen, list, inter, sprite);
		room[0][2][0][3] = new BrickWall(0,3, calen, list, inter, sprite);
		room[0][2][0][4] = new BrickWall(0,4, calen, list, inter, sprite);
		room[0][2][0][5] = new BrickWall(0,5, calen, list, inter, sprite);
		

		room[0][2][6][1] = new BrickWall(6,1, calen, list, inter, sprite);
		room[0][2][6][2] = new WallHole(6,2, calen, list, inter, sprite);
		room[0][2][6][3] = new BrickWall(6,3, calen, list, inter, sprite);
		room[0][2][6][4] = new BrickWall(6,4, calen, list, inter, sprite);
		room[0][2][6][5] = new BrickWall(6,5, calen, list, inter, sprite);

		room[0][2][1][6] = new BrickWall(1,6, calen, list, inter, sprite);
		room[0][2][2][6] = new BrickWall(2,6, calen, list, inter, sprite);
		room[0][2][3][6] = new BrickWall(3,6, calen, list, inter, sprite);
		room[0][2][4][6] = new PurpleDoor(4,6, calen, list, inter, sprite);
		room[0][2][5][6] = new BrickWall(5,6, calen, list, inter, sprite);
		room[0][2][6][6] = new BrickWall(6,6, calen, list, inter, sprite);
		room[0][2][0][6] = new BrickWall(0,6, calen, list, inter, sprite);
		
		room[0][2][1][2] = new Bed1(1,2, calen, list, inter, sprite);
		room[0][2][1][3] = new Bed2(1,3, calen, list, inter, sprite);

		room[0][2][3][3] = new TrapDoor(3,3, calen, list, inter, sprite);

		
		/*room [0][0][0][0] = new Wall (0, 0, calen, list, inter);
		room [0][0][0][1] = new Wall (0, 1, calen, list, inter);
		room [0][0][0][2] = new Wall (0, 2, calen, list, inter);
		room [0][0][0][3] = new Wall (0, 3, calen, list, inter);
		room [0][0][0][4] = new Wall (0, 4, calen, list, inter);
		room [0][0][1][0] = new Wall (1, 0, calen, list, inter);
		room [0][0][1][1] = new Floor (1, 1, calen,list, inter);
		room [0][0][1][2] = new Floor (1, 2, calen, list, inter);
		room [0][0][1][3] = new Floor (1, 3, calen, list, inter);
		room [0][0][1][4] = new Wall (1, 4, calen, list, inter);
		room [0][0][2][0] = new RedDoor (2, 0, calen, items, sprite, clock,inter);
		room [0][0][2][1] = new Floor (2, 1, calen, list, inter);
		room [0][0][2][2] = new Cabinet (2, 2, calen, items, inter);
		room [0][0][2][3] = new Floor (2, 3, calen, list, inter);
		room [0][0][2][4] = new IronDoor (2, 4, calen, items, sprite, clock, inter);
		room [0][0][3][0] = new Wall (3, 0, calen, list, inter);
		room [0][0][3][1] = new Floor (3, 1, calen, list, inter);
		room [0][0][3][2] = new Floor (3, 2, calen, list, inter);
		room [0][0][3][3] = new Floor (3, 3, calen, list, inter);
		room [0][0][3][4] = new Wall (3, 4, calen, list, inter);
		room [0][0][4][0] = new Wall (4, 0, calen, list, inter);
		room [0][0][4][1] = new Wall (4, 1, calen, list, inter);
		room [0][0][4][2] = new PinkDoor(4, 2, calen, items, sprite, clock,inter);
		room [0][0][4][3] = new Wall (4, 3, calen, list, inter);
		room [0][0][4][4] = new Wall (4, 4, calen, list, inter);
		
		room [0][1][0][0] = new Wall (0, 0, calen, list, inter);
		room [0][1][0][1] = new Wall (0, 1, calen, list, inter);
		room [0][1][0][2] = new Wall (0, 2, calen, list, inter);
		room [0][1][0][3] = new Wall (0, 3, calen, list, inter);
		room [0][1][0][4] = new Wall (0, 4, calen, list, inter);
		room [0][1][0][5] = new Wall (0, 5, calen, list, inter);
		room [0][1][0][6] = new Wall (0, 6, calen, list, inter);
		room [0][1][1][0] = new Wall (1, 0, calen, list, inter);
		room [0][1][1][1] = new Wall (1, 1, calen, list, inter);
		room [0][1][1][2] = new Floor (1, 2, calen, list, inter);
		room [0][1][1][3] = new Floor (1, 3, calen, list, inter);
		room [0][1][1][4] = new Floor (1, 4, calen, list, inter);
		room [0][1][1][5] = new Wall (1, 5, calen, list, inter);
		room [0][1][1][6] = new Wall (1, 6, calen, list, inter);
		room [0][1][2][0] = new IronDoor (2, 0, calen, items,sprite,clock,inter);
		room [0][1][2][1] = new Floor (2, 1, calen, list, inter);
		room [0][1][2][2] = new Floor (2, 2, calen, list, inter);
		room [0][1][2][3] = new Wall (2, 3, calen, list, inter);
		room [0][1][2][4] = new Floor (2, 4, calen, list, inter);
		room [0][1][2][5] = new Wall (2, 5, calen, list, inter);
		room [0][1][2][6] = new Wall (2, 6, calen, list, inter);
		room [0][1][3][0] = new Wall (3, 0, calen, list, inter);
		room [0][1][3][1] = new Wall (3, 1, calen, list, inter);
		room [0][1][3][2] = new Wall (3, 2, calen, list, inter);
		room [0][1][3][3] = new Floor (3, 3, calen, list, inter);
		room [0][1][3][4] = new Floor (3, 4, calen, list, inter);
		room [0][1][3][5] = new Floor (3, 5, calen, list, inter);
		room [0][1][3][6] = new Wall (3, 6, calen, list, inter);
		room [0][1][4][0] = new Wall (4, 0, calen, list, inter);
		room [0][1][4][1] = new Chest (4, 1, calen, items, inter);
		room [0][1][4][2] = new Wall (4, 2, calen, list, inter);
		room [0][1][4][3] = new Floor (4, 3, calen, list, inter);
		room [0][1][4][4] = new Wall (4, 4, calen, list, inter);
		room [0][1][4][5] = new Floor (4, 5, calen, list, inter);
		room [0][1][4][6] = new Wall (4, 6, calen, list, inter);
		room [0][1][5][0] = new Wall (5, 0, calen, list, inter);
		room [0][1][5][1] = new Floor (5, 1, calen, list, inter);
		room [0][1][5][2] = new Floor (5, 2, calen, list, inter);
		room [0][1][5][3] = new Floor (5, 3, calen, list, inter);
		room [0][1][5][4] = new Wall (5, 4, calen, list, inter);
		room [0][1][5][5] = new Floor (5, 5, calen, list, inter);
		room [0][1][5][6] = new Wall (5, 6, calen, list, inter);
		room [0][1][6][0] = new Wall (6, 0, calen, list, inter);
		room [0][1][6][1] = new Wall (6, 1, calen, list, inter);
		room [0][1][6][2] = new Wall (6, 2, calen, list, inter);
		room [0][1][6][3] = new Wall (6, 3, calen, list, inter);
		room [0][1][6][4] = new Wall (6, 4, calen, list, inter);
		room [0][1][6][5] = new Wall (6, 5, calen, list, inter);
		room [0][1][6][6] = new Wall (6, 6, calen, list, inter);
		
		room [1][0][0][0] = new Wall (0, 0, calen, list, inter);
		room [1][0][0][1] = new Wall (0, 1, calen, list, inter);
		room [1][0][0][2] = new BrokenWall (0, 2, calen, items, inter);
		room [1][0][0][3] = new Wall (0, 3, calen, list, inter);
		room [1][0][0][4] = new Wall (0, 4, calen, list, inter);
		room [1][0][1][0] = new Wall (1, 0, calen, list, inter);
		room [1][0][1][1] = new Floor (1, 1, calen, list, inter);
		room [1][0][1][2] = new Floor (1, 2, calen, list, inter);
		room [1][0][1][3] = new Floor (1, 3, calen, list, inter);
		room [1][0][1][4] = new Wall (1, 4, calen, list, inter);
		room [1][0][2][0] = new RedDoor (2, 0, calen, items, sprite, clock, inter);
		room [1][0][2][1] = new Floor (2, 1, calen,list, inter);
		room [1][0][2][2] = new Floor (2, 2, calen, list, inter);
		room [1][0][2][3] = new Floor (2, 3, calen, list, inter);
		room [1][0][2][4] = new IronDoor (2, 4, calen, items, sprite, clock, inter);
		room [1][0][3][0] = new Wall (3, 0, calen, list, inter);
		room [1][0][3][1] = new Floor (3, 1, calen, list, inter);
		room [1][0][3][2] = new Floor (3, 2, calen, list, inter);
		room [1][0][3][3] = new Floor (3, 3, calen, list, inter);
		room [1][0][3][4] = new Wall (3, 4, calen, list, inter);
		room [1][0][4][0] = new Wall (4, 0, calen, list, inter);
		room [1][0][4][1] = new Wall (4, 1, calen, list, inter);
		room [1][0][4][2] = new PinkDoor(4, 2, calen, items, sprite, clock, inter);
		room [1][0][4][3] = new Wall (4, 3, calen, list, inter);
		room [1][0][4][4] = new Wall (4, 4, calen, list, inter);
		
		room [1][1][0][0] = new Wall (0, 0, calen, list, inter);
		room [1][1][0][1] = new Wall (0, 1, calen, list, inter);
		room [1][1][0][2] = new Wall (0, 2, calen, list, inter);
		room [1][1][0][3] = new Wall (0, 3, calen, list, inter);
		room [1][1][0][4] = new Wall (0, 4, calen, list, inter);
		room [1][1][0][5] = new Wall (0, 5, calen, list, inter);
		room [1][1][0][6] = new Wall (0, 6, calen, list, inter);
		room [1][1][1][0] = new Wall (1, 0, calen, list, inter);
		room [1][1][1][1] = new Wall (1, 1, calen, list, inter);
		room [1][1][1][2] = new Floor (1, 2, calen, list, inter);
		room [1][1][1][3] = new Floor (1, 3, calen, list, inter);
		room [1][1][1][4] = new Floor (1, 4, calen, list, inter);
		room [1][1][1][5] = new Wall (1, 5, calen, list, inter);
		room [1][1][1][6] = new Wall (1, 6, calen, list, inter);
		room [1][1][2][0] = new IronDoor (2, 0, calen, items, sprite, clock, inter);
		room [1][1][2][1] = new Floor (2, 1, calen, list, inter);
		room [1][1][2][2] = new Chest (2, 2, calen, items, inter);
		room [1][1][2][3] = new Chest (2, 3, calen, items, inter);
		room [1][1][2][4] = new Chest (2, 4, calen, items, inter);
		room [1][1][2][5] = new Floor (2, 5, calen, list, inter);
		room [1][1][2][6] = new Wall (2, 6, calen, list, inter);
		room [1][1][3][0] = new Wall (3, 0, calen, list, inter);
		room [1][1][3][1] = new Floor (3, 1, calen, list, inter);
		room [1][1][3][2] = new Chest (3, 2, calen, items, inter);
		room [1][1][3][3] = new Chest (3, 3, calen, items, inter);
		room [1][1][3][4] = new Chest (3, 4, calen, items, inter);
		room [1][1][3][5] = new Floor (3, 5, calen, list, inter);
		room [1][1][3][6] = new Wall (3, 6, calen, list, inter);
		room [1][1][4][0] = new Wall (4, 0, calen, list, inter);
		room [1][1][4][1] = new Floor (4, 1,calen, list, inter);
		room [1][1][4][2] = new Chest (4, 2, calen, items, inter);
		room [1][1][4][3] = new Chest (4, 3, calen, items, inter);
		room [1][1][4][4] = new Chest (4, 4, calen, items, inter);
		room [1][1][4][5] = new Floor (4, 5, calen, list, inter);
		room [1][1][4][6] = new Wall (4, 6, calen, list, inter);
		room [1][1][5][0] = new Wall (5, 0, calen, list, inter);
		room [1][1][5][1] = new Wall (5, 1, calen, list, inter);
		room [1][1][5][2] = new Floor (5, 2, calen, list, inter);
		room [1][1][5][3] = new Floor (5, 3, calen, list, inter);
		room [1][1][5][4] = new Floor (5, 4, calen, list, inter);
		room [1][1][5][5] = new Wall (5, 5, calen, list, inter);
		room [1][1][5][6] = new Wall (5, 6, calen, list, inter);
		room [1][1][6][0] = new Wall (6, 0, calen, list, inter);
		room [1][1][6][1] = new Wall (6, 1, calen, list, inter);
		room [1][1][6][2] = new Wall (6, 2, calen, list, inter);
		room [1][1][6][3] = new Wall (6, 3, calen, list, inter);
		room [1][1][6][4] = new Wall (6, 4, calen, list, inter);
		room [1][1][6][5] = new Wall (6, 5, calen, list, inter);
		room [1][1][6][6] = new Wall (6, 6, calen, list, inter);*/
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
			
					
					
				

			if (calen.getGameDay()==357)
			{
				g.drawString("It's a nice day to be outside.", getWidth()/2, getHeight()/2);
			}
		}
	}
}