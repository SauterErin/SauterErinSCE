package choice;
import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel {
	
	public GameObject [][][][] room = new GameObject [1][1][20][20];
	
	GameCalendar calen;
	Inventory items;
	List list;
	InteractionPanel inter;
	public GameSprite sprite;
	Countdown clock;
	
	int Xsprite = 2;
	int Ysprite = 3;
	
	public GameScreen (GameCalendar calen, InteractionPanel interact, Countdown clock)
	{	
		setBackground(Color.black);
		this.calen = calen;
		items = new Inventory();
		list = new List();
		inter = interact;
		this.clock = clock;
		sprite = new GameSprite (110+50*2, 110+3*50);
		
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				if(j == 0 || j == 19){
					room[0][0][i][j] = new Boundary(i, j, calen, list, inter);
				}
				
				if(j > 0 && j < 19){
					room[0][0][i][j] = new RedTestFloor(i,j,calen,list, inter);
				}
				
				if(j > 10 && j < 19){
					room[0][0][i][j] = new BlueTestFloor(i,j,calen,list, inter);
				}
				
				if(i == 0 || i == 19)
				{
					room[0][0][i][j] = new Boundary(i,j,calen,list,inter);
				}
			
			}

		
		}
		
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
			inter.paintComponent(g);
			calen.paintComponent(g);
			clock.paintComponent(g);	
				
			if (calen.getGameDay()== -1)
			{
				g.setColor(Color.red);
				g.drawString("You never left.", getWidth()/2, getHeight()/2-15);
				g.drawString("Game Over", getWidth()/2, getHeight()/2);
			}
			
			if (calen.getGameDay() != -1 && calen.getGameDay() != 357)
			{
				int Xhigh = 4;
				int Xlow = 0;
				int Yhigh =4;
				int Ylow = 0;
				if((Xsprite - 4) >= 0)
				{
					Xlow = Xsprite - 4;
				}
				
				if((Xsprite + 4) <= 20)
				{
					Xhigh = Xsprite + 4;
				}
				if((Ysprite - 4) >= 0)
				{
					Ylow = Ysprite - 4;
				}
				
				if((Ysprite + 4) <= 20)
				{
					Yhigh = Ysprite + 4;
				}				
				
				
				for (int i = Xlow; i < Xhigh; i++)
				{
					for (int j = Ylow = 0; j < Yhigh; j++)
					{
						if (room[calen.getGameDay()][calen.getRoom()][i][j] != null)
						{	
							room[calen.getGameDay()][calen.getRoom()][i][j].setTest(i,j);
							room[calen.getGameDay()][calen.getRoom()][i][j].paintComponent(g);
						}
					}
				}	
			
			sprite.paintComponent(g);
			}
			
					
					
				

			if (calen.getGameDay()==357)
			{
				g.drawString("It's a nice day to be outside.", getWidth()/2, getHeight()/2);
			}
		}
	}
}