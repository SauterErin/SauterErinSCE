package choice;
import javax.swing.*;

import java.awt.*;

public class GameScreen extends JPanel {
	
	public GameObject [][][][] room = new GameObject [2][15][20][20];
	
	GameCalendar calen;
	String dialogue;
	Inventory items;
	List list;
	Select select;
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
		sprite = new GameSprite (2, 2, calen);
		select = new Select(calen, inter, list);
		log = new Dialogue(calen, inter, select, sprite, list);
		Xsprite = 2;
		Ysprite = 2;

		//Room 2- Detention 
		
		for(int l=0; l < 6; l++)
		{
			for (int m=0; m <6; m++)
			{
				room [0][2][l][m] = new WoodFloor(l,m, calen, list, log, sprite);
			}
		}
		
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
		
		//Room 3 Detention - Music Wall
		
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
		
		//Room 4 - Music Room
		
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
		room[0][4][5][8] = new RedDoor(5,8, calen, list, log, sprite );
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
		room[0][4][6][1] = new Piano(6,1, calen,list,log, sprite);
		room[0][4][6][2] = new Piano2(6,2, calen,list,log, sprite);
		room[0][4][6][3] = new WoodFloor(6,3, calen,list,log, sprite);
		room[0][4][6][4] = new WoodFloor(6,4, calen,list,log, sprite);
		room[0][4][6][5] = new WoodFloor(6,5, calen,list,log, sprite);
		room[0][4][6][6] = new WoodFloor(6,6, calen,list,log, sprite);
		room[0][4][6][7] = new WoodFloor(6,7, calen,list,log, sprite);
		room[0][4][7][1] = new Piano(7,1, calen,list,log, sprite);
		room[0][4][7][2] = new Piano2(7,2, calen,list,log, sprite);
		room[0][4][7][3] = new WoodFloor(7,3, calen,list,log, sprite);
		room[0][4][7][4] = new WoodFloor(7,4, calen,list,log, sprite);
		room[0][4][7][5] = new WoodFloor(7,5, calen,list,log, sprite);
		room[0][4][7][6] = new WoodFloor(7,6, calen,list,log, sprite);
		room[0][4][7][7] = new WoodFloor(7,7, calen,list,log, sprite);
		
		
		//Room 0 - North Hallway
		room[0][0][6][0] = new BrickWall(6,0,calen,list,log, sprite);
		room[0][0][7][0] = new BrickWall(7,0,calen,list,log, sprite);
		room[0][0][8][0] = new PurpleDoor(8,0,calen,list,log, sprite);
		room[0][0][9][0] = new BrickWall(9,0,calen,list,log, sprite);
		room[0][0][10][0] = new BrickWall(10,0,calen,list,log, sprite);

		room[0][0][6][1] = new BrickWall(6,1, calen,list, log, sprite);
		room[0][0][6][2] = new BrickWall(6,2, calen,list, log, sprite);
		room[0][0][6][3] = new YellowDoor(6,3, calen, list, log, sprite);
		room[0][0][6][4] = new BrickWall(6,4, calen,list, log, sprite);
		room[0][0][6][5] = new BrickWall(6,5, calen,list, log, sprite);
		

		room[0][0][10][1] = new BrickWall(10,1, calen,list, log, sprite);
		room[0][0][10][2] = new BrickWall(10,2, calen,list, log, sprite);
		room[0][0][10][3] = new PurpleDoor(10,3, calen, list, log, sprite);
		room[0][0][10][4] = new BrickWall(10,4, calen,list, log, sprite);
		room[0][0][10][5] = new BrickWall(10,5, calen,list, log, sprite);

		room[0][0][0][5] = new BrickWall(0,5, calen, list, log, sprite);
		room[0][0][1][5] = new BrickWall(1,5, calen, list, log, sprite);
		room[0][0][2][5] = new BrickWall(2,5, calen, list, log, sprite);
		room[0][0][0][5] = new RedDoor(3,5, calen, list, log, sprite);
		room[0][0][4][5] = new BrickWall(4,5, calen, list, log, sprite);
		room[0][0][5][5] = new BrickWall(5,5, calen, list, log, sprite);

		room[0][0][11][5] = new BrickWall(11,5, calen, list, log, sprite);
		room[0][0][12][5] = new BrickWall(12,5, calen, list, log, sprite);
		room[0][0][13][5] = new RedDoor(13,5, calen, list, log, sprite);		
		room[0][0][14][5] = new BrickWall(14,5, calen, list, log, sprite);
		room[0][0][15][5] = new BrickWall(15,5, calen, list, log, sprite);
		room[0][0][16][5] = new BrickWall(16,5, calen, list, log, sprite);
		room[0][0][16][6] = new BrickWall(16,5, calen, list, log, sprite);
		room[0][0][16][7] = new GreenDoor(16,5, calen, list, log, sprite);
		room[0][0][16][8] = new BrickWall(16,5, calen, list, log, sprite);
		room[0][0][3][5] = new RedDoor(3,5,calen, list, log, sprite);

		room[0][0][0][5] = new BrickWall(0,5,calen, list, log, sprite);
		room[0][0][0][6] = new BrickWall(0,6,calen, list, log, sprite);
		room[0][0][0][7] = new BlueDoor(0,7,calen, list, log, sprite);
		room[0][0][0][8] = new BrickWall(0,8,calen, list, log, sprite);
		room[0][0][0][9] = new BrickWall(0,9,calen, list, log, sprite);
		room[0][0][1][9] = new BrickWall(1,9, calen, list, log, sprite);
		room[0][0][2][9] = new BrickWall(2,9, calen, list, log, sprite);
		room[0][0][3][9] = new BrickWall(3,9, calen, list, log, sprite);
		room[0][0][4][9] = new BrickWall(4,9, calen, list, log, sprite);
		room[0][0][5][9] = new BrickWall(5,9, calen, list, log, sprite);
		room[0][0][6][9] = new BrickWall(6,9, calen, list, log, sprite);
		room[0][0][7][9] = new BrokenWall(7,9, calen, list, log, sprite);
		room[0][0][8][9] = new GreenDoor(8,9, calen, list, log, sprite);
		room[0][0][9][9] = new BrickWall(9,9, calen, list, log, sprite);
		room[0][0][10][9] = new BrickWall(10,9, calen, list, log, sprite);
		room[0][0][11][9] = new BrickWall(11,9, calen, list, log, sprite);
		room[0][0][12][9] = new BrickWall(12,9, calen, list, log, sprite);
		room[0][0][13][9] = new BrickWall(13,9, calen, list, log, sprite);
		room[0][0][14][9] = new BrickWall(14,9, calen, list, log, sprite);
		room[0][0][15][9] = new BrickWall(15,9, calen, list, log, sprite);
		room[0][0][16][9] = new BrickWall(16,9, calen, list, log, sprite);
		room[0][0][16][6] = new BrickWall(16,6, calen, list, log, sprite);
		room[0][0][16][7] = new GreenDoor(16,7, calen, list, log, sprite);
		room[0][0][16][8] = new BrickWall(16,8, calen, list, log, sprite);

		for (int i = 0; i < 3; i++)
		{ for (int j = 0; j < 17; j++)
			{
				room[0][0][j][i+10] = new Grass(j,i+10,calen, list, log, sprite);
			}
		}
		
		for (int i = 1; i < 16; i++)
		{ for (int j = 6; j < 9; j++)
			{
				room[0][0][i][j] = new WoodFloor(i,j,calen, list, log, sprite);
			}
		}
		
		for (int i = 7; i < 10; i++)
		{ for (int j = 1; j < 6; j++)
			{
				room[0][0][i][j] = new WoodFloor(i,j,calen, list, log, sprite);
			}
		}
		
		room[0][0][6][11] = new GraveStone(6, 11, calen, list, log, sprite);
		room[0][0][7][11] = new MonsterGrass(7, 11, calen, list, log, sprite);

	
		// Room 1 - Power Room
		room[0][1][0][0] = new BrickWall(0,0, calen, list, log, sprite);
		room[0][1][1][0] = new PowerSwitch(1,0, calen, list, log, sprite);
		room[0][1][2][0] = new WallHole(2,0, calen, list, log, sprite);
		room[0][1][0][3] = new BrickWall(0,3, calen, list, log, sprite);
		room[0][1][0][1] = new BrickWall(0,1, calen, list, log, sprite);
		room[0][1][0][2] = new BrickWall(0,2, calen, list, log, sprite);
		room[0][1][3][0] = new BrickWall(3,0, calen, list, log, sprite);
		room[0][1][3][1] = new BrickWall(3,1, calen, list, log, sprite);
		room[0][1][2][3] = new RedDoor(2,3, calen, list, log, sprite);
		room[0][1][3][3] = new BrickWall(3,3, calen, list, log, sprite);
		room[0][1][1][1] = new WoodFloor(1,1,calen,list,log,sprite);
		room[0][1][2][1] = new WoodFloor(2,1,calen,list,log,sprite);
		room[0][1][1][2] = new WoodFloor(1,2,calen,list,log,sprite);
		room[0][1][2][2] = new WoodFloor(2,2,calen,list,log,sprite);

		room[0][1][3][2] = new BrickWall(3,2, calen, list, log, sprite);
		room[0][1][1][3] = new BrickWall(1,3, calen, list, log, sprite);
		
		
		//Room 5 Power - Office Wall
		room[0][5][1][1] = new WoodFloor(1,1, calen, list,log,sprite);
		room[0][5][2][1] = new WoodFloor(2,1, calen, list,log,sprite);
		room[0][5][3][1] = new WoodFloor(3,1, calen, list,log,sprite);
		room[0][5][4][1] = new WoodFloor(4,1, calen, list,log,sprite);
		room[0][5][5][1] = new WoodFloor(5,1, calen, list,log,sprite);
		room[0][5][6][1] = new WallHole(6,1, calen, list,log,sprite);
		room[0][5][1][2] = new WoodFloor(1,2, calen, list,log,sprite);
		room[0][5][1][3] = new WoodFloor(1,3, calen, list,log,sprite);
		room[0][5][1][4] = new WoodFloor(1,4, calen, list,log,sprite);
		room[0][5][1][5] = new WoodFloor(1,5, calen, list,log,sprite);
		room[0][5][1][6] = new WallHole(1,6, calen, list,log,sprite);		
		room[0][5][0][0] = new BrickWall(0,0, calen, list, log, sprite);
		room[0][5][0][1] = new BrickWall(0,1, calen, list, log, sprite);
		room[0][5][0][2] = new BrickWall(0,2, calen, list, log, sprite);
		room[0][5][0][3] = new BrickWall(0,3, calen, list, log, sprite);
		room[0][5][0][4] = new BrickWall(0,4, calen, list, log, sprite);
		room[0][5][0][5] = new BrickWall(0,5, calen, list, log, sprite);
		room[0][5][0][6] = new BrickWall(0,6, calen, list, log, sprite);
		room[0][5][2][6] = new BrickWall(2,6, calen, list, log, sprite);
		room[0][5][2][5] = new BrickWall(2,5, calen, list, log, sprite);
		room[0][5][2][4] = new BrickWall(2,4, calen, list, log, sprite);
		room[0][5][2][3] = new BrickWall(2,3, calen, list, log, sprite);
		room[0][5][2][2] = new BrickWall(2,2, calen, list, log, sprite);
		room[0][5][3][2] = new BrickWall(3,2, calen, list, log, sprite);
		room[0][5][4][2] = new BrickWall(4,2, calen, list, log, sprite);
		room[0][5][5][2] = new BrickWall(5,2, calen, list, log, sprite);
		room[0][5][6][2] = new BrickWall(6,2, calen, list, log, sprite);
		room[0][5][6][0] = new BrickWall(6,0, calen, list, log, sprite);
		room[0][5][5][0] = new BrickWall(5,0, calen, list, log, sprite);
		room[0][5][4][0] = new BrickWall(4,0, calen, list, log, sprite);
		room[0][5][3][0] = new BrickWall(3,0, calen, list, log, sprite);
		room[0][5][2][0] = new BrickWall(2,0, calen, list, log, sprite);
		room[0][5][1][0] = new BrickWall(1,0, calen, list, log, sprite);

		//Room 6 - Office
		room[0][6][0][0] = new BrickWall(0,0, calen, list, log, sprite);
		room[0][6][1][0] = new BrickWall(1,0, calen, list, log, sprite);
		room[0][6][2][0] = new BrickWall(2,0, calen, list, log, sprite);

		room[0][6][1][4] = new BrickWall(1,4, calen, list, log, sprite);
		room[0][6][2][4] = new BrickWall(2,4, calen, list, log, sprite);
		
		room[0][6][1][1] = new WoodFloor(1,1, calen,list,log,sprite);
		room[0][6][1][2] = new WoodFloor(1,2, calen,list,log,sprite);
		room[0][6][1][3] = new WoodFloor(1,3, calen,list,log,sprite);
		room[0][6][2][1] = new WoodFloor(2,1, calen,list,log,sprite);
		room[0][6][2][2] = new WoodFloor(2,2, calen,list,log,sprite);
		room[0][6][2][3] = new Desk(2,3, calen,list,log,sprite);
		room[0][6][0][1] = new WallHole(0,1, calen, list, log, sprite);
		room[0][6][0][2] = new BrickWall(0,2, calen, list, log, sprite);
		room[0][6][0][3] = new BrickWall(0,3, calen, list, log, sprite);
		room[0][6][0][4] = new BrickWall(0,4, calen, list, log, sprite);
		room[0][6][3][0] = new BrickWall(3,0, calen, list, log, sprite);
		room[0][6][3][1] = new BrickWall(3,1, calen, list, log, sprite);
		room[0][6][3][2] = new YellowDoor(3,2, calen, list, log, sprite);
		room[0][6][3][3] = new BrickWall(3,3, calen, list, log, sprite);
		room[0][6][3][4] = new BrickWall(3,4, calen, list, log, sprite);

		//Room 7 - East Hallway 
		
		room[0][7][0][0] = new BrickWall(0,0, calen, list, log, sprite);
		room[0][7][0][1] = new BrickWall(0,1, calen, list, log, sprite);
		room[0][7][0][2] = new GreenDoor(0,2, calen, list, log, sprite);
		room[0][7][0][3] = new BrickWall(0,3, calen, list, log, sprite);
		room[0][7][0][4] = new BrickWall(0,4, calen, list, log, sprite);
		room[0][7][0][5] = new BrickWall(0,5, calen, list, log, sprite);
		room[0][7][0][6] = new BrokenWall(0,6, calen, list, log, sprite);
		room[0][7][0][7] = new GreenDoor(0,7, calen, list, log, sprite);
		room[0][7][0][8] = new BrickWall(0,8, calen, list, log, sprite);
		room[0][7][0][9] = new BrickWall(0,9, calen, list, log, sprite);
		room[0][7][0][10] = new BrickWall(0,10, calen, list, log, sprite);
		room[0][7][0][11] = new BrickWall(0,11, calen, list, log, sprite);

		room[0][7][4][0] = new BrickWall(4,0, calen, list, log, sprite);
		room[0][7][4][1] = new BrickWall(4,1, calen, list, log, sprite);
		room[0][7][4][2] = new BrickWall(4,2, calen, list, log, sprite);
		room[0][7][4][3] = new BrickWall(4,3, calen, list, log, sprite);
		room[0][7][4][4] = new BrickWall(4,4, calen, list, log, sprite);
		room[0][7][4][5] = new BrickWall(4,5, calen, list, log, sprite);
		room[0][7][4][6] = new BrickWall(4,6, calen, list, log, sprite);
		room[0][7][4][7] = new YellowDoor(4,7, calen, list, log, sprite);
		room[0][7][4][8] = new BrickWall(4,8, calen, list, log, sprite);
		room[0][7][4][9] = new BrickWall(4,9, calen, list, log, sprite);
		room[0][7][4][10] = new BrickWall(4,10, calen, list, log, sprite);
		room[0][7][4][11] = new BrickWall(4,11, calen, list, log, sprite);

		room[0][7][1][0] = new BrickWall(1,0, calen, list, log, sprite);
		room[0][7][2][0] = new BrickWall(2,0, calen, list, log, sprite);
		room[0][7][3][0] = new BrickWall(3,0, calen, list, log, sprite);
		room[0][7][1][11] = new BrickWall(1,11, calen, list, log, sprite);
		room[0][7][2][11] = new GreenDoor(2,11, calen, list, log, sprite);
		room[0][7][3][11] = new BrickWall(3,11, calen, list, log, sprite);

		for (int i = 1; i < 4; i++)
		{
			for (int j = 1; j < 11; j++)
			{
				room [0][7][i][j] = new WoodFloor(i,j, calen, list,log,sprite);
			}
		}
		//Room 8 - South Hall
		
		for (int i = 1; i < 8; i++)
			
		{
			room[0][8][i][0] = new BrickWall(i,0, calen, list, log, sprite);
			room[0][8][i][4] = new BrickWall(i,4, calen, list, log, sprite);

			for (int j = 1; j < 4; j++)
			{
				room [0][8][i][j] = new WoodFloor(i,j, calen, list, log, sprite);
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			room[0][8][0][i] = new BrickWall(0,i, calen, list, log, sprite);
			room[0][8][8][i] = new BrickWall(8,i, calen, list, log, sprite);	
		}
		

		room[0][8][0][2] = new BlueDoor(0,2,calen,list,log,sprite);
		room[0][8][6][0] = new GreenDoor(6,0,calen,list,log,sprite);
		room[0][8][4][4] = new YellowDoor(4,4,calen,list,log,sprite);
		

		//Room 9 - Yard

		for (int i = 1; i < 16; i++)
		{
			room [0][9][i][0] = new BrickWall(i,0, calen,list,log,sprite);
			room [0][9][i][16] = new BrickWall(i,16, calen,list,log,sprite);
			for (int j = 1; j < 16; j++)
			{
				room [0][9][i][j] = new Grass(i,j, calen,list, log, sprite);
			}
		}
		
		for (int i = 0; i < 17; i++)
		{
			room[0][9][0][i] = new BrickWall(0,i, calen, list,log,sprite);
			room[0][9][16][i] = new BrickWall(16,i, calen, list,log,sprite);
		}
		
		room[0][9][16][12] = new GreenDoor(16,12, calen, list, log, sprite);
		room[0][9][8][0] = new GreenDoor(8,0, calen, list, log, sprite);








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
				
			if (calen.getGameDay()== -3)
			{
				g.setColor(Color.red);
				g.drawString("You were never found.", getWidth()/2, getHeight()/2-15);
				g.drawString("Game Over", getWidth()/2, getHeight()/2);
			}
			
			if(calen.getGameDay() == -2)
			{
				inter.paintComponent(g);
			}
			
			if (calen.getGameDay() >= 0 && calen.getGameDay() != 357)
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
			
				if(calen.checkDialogue() == true || calen.checkDialogue2() == true)
				{
					inter.paintComponent(g);
				}
				
				if(calen.checkSelect() == true)
				{
					select.paintComponent(g);
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

				if(calen.getInventoryTotal() > 1)
					{g.drawString("NOTE", 140, 150);
					g.drawString("Red Door Key", 140, 170);}

				if(calen.getInventoryTotal() > 2)
					{g.drawString("NOTE", 140, 150);
					g.drawString("Red Door Key", 140, 170);
					g.drawString("Yellow Door Key", 140, 190);}
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
				g.drawString("To be continued...", getWidth()/2, getHeight()/2);
			}
		}
	}
