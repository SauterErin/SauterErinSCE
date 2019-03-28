package choice;
import javax.swing.*;

import java.awt.*;

public class GameScreen extends JPanel {
	
	public GameObject [][][] room = new GameObject [22][20][20];
	
	GameMode gameinfo;
	SystemMode system;
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
	
	public GameScreen (GameMode gameinfo, SystemMode system)
	{	
		setBackground(Color.black);
		this.gameinfo = gameinfo;
		this.system = system;
		dialogue = "";
		items = new Inventory();
		list = new List();
		inter = new InteractionPanel();						
		this.clock = clock;
		sprite = new GameSprite (2, 2, gameinfo);
		select = new Select(gameinfo, system, inter, list);
		log = new Dialogue(gameinfo, system, inter, select, sprite, list);
		Xsprite = 2;
		Ysprite = 2;

		//Room 2- Detention 
		
		for(int l=0; l < 6; l++)
		{
			for (int m=0; m <6; m++)
			{
				room[2][l][m] = new WoodFloor(l,m, gameinfo, list, log, sprite);
			}
		}
		
		room[2][1][0] = new BrickWall(1,0, gameinfo, list, log, sprite);
		room[2][2][0] = new BrickWall(2,0, gameinfo, list, log, sprite);
		room[2][3][0] = new BrickWall(3,0, gameinfo, list, log, sprite);
		room[2][4][0] = new Window(4,0, gameinfo, list, log, sprite);
		room[2][5][0] = new BrickWall(5,0, gameinfo, list, log, sprite);
		room[2][6][0] = new BrickWall(6,0, gameinfo, list, log, sprite);
		room[2][0][0] = new BrickWall(0,0, gameinfo, list, log, sprite);
		

		room[2][0][1] = new BrickWall(0,1, gameinfo, list, log, sprite);
		room[2][0][2] = new BrickWall(0,2, gameinfo, list, log, sprite);
		room[2][0][3] = new BrickWall(0,3, gameinfo, list, log, sprite);
		room[2][0][4] = new BrickWall(0,4, gameinfo, list, log, sprite);
		room[2][0][5] = new BrickWall(0,5, gameinfo, list, log, sprite);
		

		room[2][6][1] = new BrickWall(6,1, gameinfo, list, log, sprite);
		room[2][6][2] = new WallHole(6,2, gameinfo, list, log, sprite);
		room[2][6][3] = new BrickWall(6,3, gameinfo, list, log, sprite);
		room[2][6][4] = new BrickWall(6,4, gameinfo, list, log, sprite);
		room[2][6][5] = new BrickWall(6,5, gameinfo, list, log, sprite);

		room[2][1][6] = new BrickWall(1,6, gameinfo, list, log, sprite);
		room[2][2][6] = new BrickWall(2,6, gameinfo, list, log, sprite);
		room[2][3][6] = new BrickWall(3,6, gameinfo, list, log, sprite);
		room[2][4][6] = new PurpleDoor(4,6, gameinfo, list, log, sprite);
		room[2][5][6] = new BrickWall(5,6, gameinfo, list, log, sprite);
		room[2][6][6] = new BrickWall(6,6, gameinfo, list, log, sprite);
		room[2][0][6] = new BrickWall(0,6, gameinfo, list, log, sprite);
		
		room[2][1][2] = new Bed1(1,2, gameinfo, list, log, sprite);
		room[2][1][3] = new Bed2(1,3, gameinfo, list, log, sprite);

		room[2][3][3] = new TrapDoor(3,3, gameinfo, list, log, sprite);
		
		//Room 3 Detention - Music Wall
		
		room[3][0][1] = new BrickWall(0,1, gameinfo, list, log, sprite);
		room[3][0][2] = new WallHole(0,2, gameinfo, list, log, sprite);
		room[3][0][3] = new BrickWall(0,3, gameinfo, list, log, sprite);
		room[3][1][1] = new BrickWall(1,1, gameinfo, list, log, sprite);
		room[3][2][1] = new BrickWall(2,1, gameinfo, list, log, sprite);
		room[3][3][1] = new BrickWall(3,1, gameinfo, list, log, sprite);
		room[3][4][1] = new BrickWall(4,1, gameinfo, list, log, sprite);
		room[3][5][1] = new BrickWall(5,1, gameinfo, list, log, sprite);
		room[3][6][1] = new ClimbingWall(6,1, gameinfo, list, log, sprite);
		room[3][7][1] = new BrickWall(7,1, gameinfo, list, log, sprite);
		room[3][8][1] = new BrickWall(8,1, gameinfo, list, log, sprite);
		room[3][9][1] = new BrickWall(9,1, gameinfo, list, log, sprite);
		room[3][10][1] = new BrickWall(10,1, gameinfo, list, log, sprite);
		room[3][1][2] = new WoodFloor(1,2, gameinfo, list, log, sprite);
		room[3][2][2] = new WoodFloor(2,2, gameinfo, list, log, sprite);
		room[3][3][2] = new WoodFloor(3,2, gameinfo, list, log, sprite);
		room[3][4][2] = new WoodFloor(4,2, gameinfo, list, log, sprite);
		room[3][5][2] = new WoodFloor(5,2, gameinfo, list, log, sprite);
		room[3][6][2] = new WoodFloor(6,2, gameinfo, list, log, sprite);
		room[3][7][2] = new WoodFloor(7,2, gameinfo, list, log, sprite);
		room[3][8][2] = new WoodFloor(8,2, gameinfo, list, log, sprite);
		room[3][9][2] = new WoodFloor(9,2, gameinfo, list, log, sprite);
		room[3][1][3] = new BrickWall(1,3, gameinfo, list, log, sprite);
		room[3][2][3] = new BrickWall(2,3, gameinfo, list, log, sprite);
		room[3][3][3] = new BrickWall(3,3, gameinfo, list, log, sprite);
		room[3][4][3] = new BrickWall(4,3, gameinfo, list, log, sprite);
		room[3][5][3] = new BrickWall(5,3, gameinfo, list, log, sprite);
		room[3][6][3] = new BrickWall(6,3, gameinfo, list, log, sprite);
		room[3][7][3] = new BrickWall(7,3, gameinfo, list, log, sprite);
		room[3][8][3] = new BrickWall(8,3, gameinfo, list, log, sprite);
		room[3][9][3] = new BrickWall(9,3, gameinfo, list, log, sprite);
		room[3][10][3] = new BrickWall(10,3, gameinfo, list, log, sprite);
		room[3][10][2] = new WallHole(10,2, gameinfo,list,log, sprite);
		
		//Room 4 - Music Room
		
		room[4][0][0] = new BrickWall(0,0, gameinfo,list,log, sprite);
		room[4][0][1] = new BrickWall(0,1, gameinfo,list,log, sprite);
		room[4][0][2] = new BrickWall(0,2, gameinfo,list,log, sprite);
		room[4][0][3] = new BrickWall(0,3, gameinfo,list,log, sprite);
		room[4][0][4] = new BrickWall(0,4, gameinfo,list,log, sprite);
		room[4][0][5] = new BrickWall(0,5, gameinfo,list,log, sprite);
		room[4][0][6] = new WallHole(0,6, gameinfo,list,log, sprite);
		room[4][0][7] = new BrickWall(0,7, gameinfo,list,log, sprite);
		room[4][0][8] = new BrickWall(0,8, gameinfo,list,log, sprite);
		room[4][1][0] = new BrickWall(1,0, gameinfo,list,log, sprite);
		room[4][2][0] = new BrickWall(2,0, gameinfo,list,log, sprite);
		room[4][3][0] = new BrickWall(3,0, gameinfo,list,log, sprite);
		room[4][4][0] = new Window(4,0, gameinfo,list,log, sprite);
		room[4][5][0] = new Window(5,0, gameinfo,list,log, sprite);
		room[4][6][0] = new BrickWall(6,0, gameinfo,list,log, sprite);
		room[4][7][0] = new BrickWall(7,0, gameinfo,list,log, sprite);
		room[4][8][0] = new BrickWall(8,0, gameinfo,list,log, sprite);
		room[4][8][1] = new BrickWall(8,1, gameinfo,list,log, sprite);
		room[4][8][2] = new BrickWall(8,2, gameinfo,list,log, sprite);
		room[4][8][3] = new BrickWall(8,3, gameinfo,list,log, sprite);
		room[4][8][4] = new BrickWall(8,4, gameinfo,list,log, sprite);
		room[4][8][5] = new BrickWall(8,5, gameinfo,list,log, sprite);
		room[4][8][6] = new BrickWall(8,6, gameinfo,list,log, sprite);
		room[4][8][7] = new BrickWall(8,7, gameinfo,list,log, sprite);
		room[4][8][8] = new BrickWall(0,8, gameinfo,list,log, sprite);
		room[4][1][8] = new BrickWall(1,8, gameinfo,list,log, sprite);
		room[4][2][8] = new BrickWall(2,8, gameinfo,list,log, sprite);
		room[4][3][8] = new BrickWall(3,8, gameinfo,list,log, sprite);
		room[4][4][8] = new BrickWall(4,8, gameinfo,list,log, sprite);
		room[4][5][8] = new RedDoor(5,8, gameinfo, list, log, sprite );
		room[4][6][8] = new BrickWall(6,8, gameinfo,list,log, sprite);
		room[4][7][8] = new BrickWall(7,8, gameinfo,list,log, sprite);
		room[4][8][8] = new BrickWall(8,8, gameinfo,list,log, sprite);
		room[4][1][1] = new WoodFloor(1,1, gameinfo,list,log, sprite);
		room[4][1][2] = new WoodFloor(1,2, gameinfo,list,log, sprite);
		room[4][1][3] = new WoodFloor(1,3, gameinfo,list,log, sprite);
		room[4][1][4] = new WoodFloor(1,4, gameinfo,list,log, sprite);
		room[4][1][5] = new WoodFloor(1,5, gameinfo,list,log, sprite);
		room[4][1][6] = new WoodFloor(1,6, gameinfo,list,log, sprite);
		room[4][1][7] = new WoodFloor(1,7, gameinfo,list,log, sprite);
		room[4][2][1] = new WoodFloor(2,1, gameinfo,list,log, sprite);
		room[4][2][2] = new WoodFloor(2,2, gameinfo,list,log, sprite);
		room[4][2][3] = new WoodFloor(2,3, gameinfo,list,log, sprite);
		room[4][2][4] = new WoodFloor(2,4, gameinfo,list,log, sprite);
		room[4][2][5] = new WoodFloor(2,5, gameinfo,list,log, sprite);
		room[4][2][6] = new WoodFloor(2,6, gameinfo,list,log, sprite);
		room[4][2][7] = new WoodFloor(2,7, gameinfo,list,log, sprite);
		room[4][3][1] = new WoodFloor(3,1, gameinfo,list,log, sprite);
		room[4][3][2] = new WoodFloor(3,2, gameinfo,list,log, sprite);
		room[4][3][3] = new WoodFloor(3,3, gameinfo,list,log, sprite);
		room[4][3][4] = new WoodFloor(3,4, gameinfo,list,log, sprite);
		room[4][3][5] = new WoodFloor(3,5, gameinfo,list,log, sprite);
		room[4][3][6] = new WoodFloor(3,6, gameinfo,list,log, sprite);
		room[4][3][7] = new WoodFloor(3,7, gameinfo,list,log, sprite);
		room[4][4][1] = new WoodFloor(4,1, gameinfo,list,log, sprite);
		room[4][4][2] = new WoodFloor(4,2, gameinfo,list,log, sprite);
		room[4][4][3] = new WoodFloor(4,3, gameinfo,list,log, sprite);
		room[4][4][4] = new WoodFloor(4,4, gameinfo,list,log, sprite);
		room[4][4][5] = new WoodFloor(4,5, gameinfo,list,log, sprite);
		room[4][4][6] = new WoodFloor(4,6, gameinfo,list,log, sprite);
		room[4][4][7] = new WoodFloor(4,7, gameinfo,list,log, sprite);
		room[4][5][1] = new WoodFloor(5,1, gameinfo,list,log, sprite);
		room[4][5][2] = new WoodFloor(5,2, gameinfo,list,log, sprite);
		room[4][5][3] = new WoodFloor(5,3, gameinfo,list,log, sprite);
		room[4][5][4] = new WoodFloor(5,4, gameinfo,list,log, sprite);
		room[4][5][5] = new WoodFloor(5,5, gameinfo,list,log, sprite);
		room[4][5][6] = new WoodFloor(5,6, gameinfo,list,log, sprite);
		room[4][5][7] = new WoodFloor(5,7, gameinfo,list,log, sprite);
		room[4][6][1] = new Piano(6,1, gameinfo,list,log, sprite);
		room[4][6][2] = new Piano2(6,2, gameinfo,list,log, sprite);
		room[4][6][3] = new WoodFloor(6,3, gameinfo,list,log, sprite);
		room[4][6][4] = new WoodFloor(6,4, gameinfo,list,log, sprite);
		room[4][6][5] = new WoodFloor(6,5, gameinfo,list,log, sprite);
		room[4][6][6] = new WoodFloor(6,6, gameinfo,list,log, sprite);
		room[4][6][7] = new WoodFloor(6,7, gameinfo,list,log, sprite);
		room[4][7][1] = new Piano(7,1, gameinfo,list,log, sprite);
		room[4][7][2] = new Piano2(7,2, gameinfo,list,log, sprite);
		room[4][7][3] = new WoodFloor(7,3, gameinfo,list,log, sprite);
		room[4][7][4] = new WoodFloor(7,4, gameinfo,list,log, sprite);
		room[4][7][5] = new WoodFloor(7,5, gameinfo,list,log, sprite);
		room[4][7][6] = new WoodFloor(7,6, gameinfo,list,log, sprite);
		room[4][7][7] = new WoodFloor(7,7, gameinfo,list,log, sprite);
		
		
		//Room 0 - North Hallway
		room[0][6][0] = new BrickWall(6,0,gameinfo,list,log, sprite);
		room[0][7][0] = new BrokenWall(7,0,gameinfo,list,log, sprite);
		room[0][8][0] = new PurpleDoor(8,0,gameinfo,list,log, sprite);
		room[0][9][0] = new Vent(9,0,gameinfo,list,log, sprite);
		room[0][10][0] = new BrickWall(10,0,gameinfo,list,log, sprite);

		room[0][6][1] = new BrickWall(6,1, gameinfo,list, log, sprite);
		room[0][6][2] = new BrickWall(6,2, gameinfo,list, log, sprite);
		room[0][6][3] = new YellowDoor(6,3, gameinfo, list, log, sprite);
		room[0][6][4] = new BrickWall(6,4, gameinfo,list, log, sprite);
		room[0][6][5] = new BrickWall(6,5, gameinfo,list, log, sprite);
		

		room[0][10][1] = new BrickWall(10,1, gameinfo,list, log, sprite);
		room[0][10][2] = new BrickWall(10,2, gameinfo,list, log, sprite);
		room[0][10][3] = new PurpleDoor(10,3, gameinfo, list, log, sprite);
		room[0][10][4] = new BrickWall(10,4, gameinfo,list, log, sprite);
		room[0][10][5] = new BrickWall(10,5, gameinfo,list, log, sprite);

		room[0][0][5] = new BrickWall(0,5, gameinfo, list, log, sprite);
		room[0][1][5] = new BrickWall(1,5, gameinfo, list, log, sprite);
		room[0][2][5] = new BrickWall(2,5, gameinfo, list, log, sprite);
		room[0][0][5] = new RedDoor(3,5, gameinfo, list, log, sprite);
		room[0][4][5] = new BrickWall(4,5, gameinfo, list, log, sprite);
		room[0][5][5] = new BrickWall(5,5, gameinfo, list, log, sprite);

		room[0][11][5] = new BrickWall(11,5, gameinfo, list, log, sprite);
		room[0][12][5] = new BrickWall(12,5, gameinfo, list, log, sprite);
		room[0][13][5] = new RedDoor(13,5, gameinfo, list, log, sprite);		
		room[0][14][5] = new BrickWall(14,5, gameinfo, list, log, sprite);
		room[0][15][5] = new BrickWall(15,5, gameinfo, list, log, sprite);
		room[0][16][5] = new BrickWall(16,5, gameinfo, list, log, sprite);
		room[0][16][6] = new Vent(16,6, gameinfo, list, log, sprite);
		room[0][16][7] = new BlueDoor(16,7, gameinfo, list, log, sprite);
		room[0][16][8] = new BrickWall(16,8, gameinfo, list, log, sprite);
		room[0][3][5] = new RedDoor(3,5,gameinfo, list, log, sprite);

		room[0][0][5] = new BrickWall(0,5,gameinfo, list, log, sprite);
		room[0][0][6] = new BrokenWall(0,6,gameinfo, list, log, sprite);
		room[0][0][7] = new BlueDoor(0,7,gameinfo, list, log, sprite);
		room[0][0][8] = new Vent(0,8,gameinfo, list, log, sprite);
		room[0][0][9] = new BrickWall(0,9,gameinfo, list, log, sprite);
		room[0][1][9] = new BrickWall(1,9, gameinfo, list, log, sprite);
		room[0][2][9] = new BrickWall(2,9, gameinfo, list, log, sprite);
		room[0][3][9] = new BrickWall(3,9, gameinfo, list, log, sprite);
		room[0][4][9] = new BrickWall(4,9, gameinfo, list, log, sprite);
		room[0][5][9] = new BrickWall(5,9, gameinfo, list, log, sprite);
		room[0][6][9] = new BrickWall(6,9, gameinfo, list, log, sprite);
		room[0][7][9] = new BrokenWall(7,9, gameinfo, list, log, sprite);
		room[0][8][9] = new GreenDoor(8,9, gameinfo, list, log, sprite);
		room[0][9][9] = new BrickWall(9,9, gameinfo, list, log, sprite);
		room[0][10][9] = new BrickWall(10,9, gameinfo, list, log, sprite);
		room[0][11][9] = new BrickWall(11,9, gameinfo, list, log, sprite);
		room[0][12][9] = new BrickWall(12,9, gameinfo, list, log, sprite);
		room[0][13][9] = new BrickWall(13,9, gameinfo, list, log, sprite);
		room[0][14][9] = new BrickWall(14,9, gameinfo, list, log, sprite);
		room[0][15][9] = new BrickWall(15,9, gameinfo, list, log, sprite);
		room[0][16][9] = new BrickWall(16,9, gameinfo, list, log, sprite);
		room[0][16][6] = new BrickWall(16,6, gameinfo, list, log, sprite);
		room[0][16][7] = new GreenDoor(16,7, gameinfo, list, log, sprite);
		room[0][16][8] = new BrokenWall(16,8, gameinfo, list, log, sprite);

		for (int i = 0; i < 3; i++)
		{ for (int j = 0; j < 17; j++)
			{
				room[0][j][i+10] = new Grass(j,i+10,gameinfo, list, log, sprite);
			}
		}
		
		for (int i = 1; i < 16; i++)
		{ for (int j = 6; j < 9; j++)
			{
				room[0][i][j] = new WoodFloor(i,j,gameinfo, list, log, sprite);
			}
		}
		
		for (int i = 7; i < 10; i++)
		{ for (int j = 1; j < 6; j++)
			{
				room[0][i][j] = new WoodFloor(i,j,gameinfo, list, log, sprite);
			}
		}
		room[0][16][7] = new BlueDoor(16,7, gameinfo, list, log, sprite);
		room[0][6][11] = new GraveStone(6, 11, gameinfo, list, log, sprite);
		room[0][7][11] = new MonsterGrass(7, 11, gameinfo, list, log, sprite);
		room[0][3][6] = new WoodFloorNote(3,6,gameinfo,list,log,sprite);
		room[0][7][1] = new WoodFloorGreenKey(7,1,gameinfo,list,log,sprite);
		room[0][10][11] = new GraveDirt(10, 11, gameinfo, list, log, sprite);
		room[0][11][11] = new NewGraveStone(11, 11, gameinfo, list, log, sprite);


	
		// Room 1 - Power Room
		room[1][0][0] = new BrickWall(0,0, gameinfo, list, log, sprite);
		room[1][1][0] = new PowerSwitch(1,0, gameinfo, list, log, sprite);
		room[1][2][0] = new WallHole(2,0, gameinfo, list, log, sprite);
		room[1][0][3] = new BrickWall(0,3, gameinfo, list, log, sprite);
		room[1][0][1] = new BrickWall(0,1, gameinfo, list, log, sprite);
		room[1][0][2] = new BrickWall(0,2, gameinfo, list, log, sprite);
		room[1][3][0] = new BrickWall(3,0, gameinfo, list, log, sprite);
		room[1][3][1] = new BrickWall(3,1, gameinfo, list, log, sprite);
		room[1][2][3] = new RedDoor(2,3, gameinfo, list, log, sprite);
		room[1][3][3] = new BrickWall(3,3, gameinfo, list, log, sprite);
		room[1][1][1] = new WoodFloor(1,1,gameinfo,list,log,sprite);
		room[1][2][1] = new WoodFloor(2,1,gameinfo,list,log,sprite);
		room[1][1][2] = new WoodFloor(1,2,gameinfo,list,log,sprite);
		room[1][2][2] = new WoodFloor(2,2,gameinfo,list,log,sprite);

		room[1][3][2] = new BrickWall(3,2, gameinfo, list, log, sprite);
		room[1][1][3] = new BrickWall(1,3, gameinfo, list, log, sprite);
		
		
		//Room 5 Power - Office Wall
		room[5][1][1] = new WoodFloor(1,1, gameinfo, list,log,sprite);
		room[5][2][1] = new WoodFloor(2,1, gameinfo, list,log,sprite);
		room[5][3][1] = new WoodFloor(3,1, gameinfo, list,log,sprite);
		room[5][4][1] = new WoodFloor(4,1, gameinfo, list,log,sprite);
		room[5][5][1] = new WoodFloor(5,1, gameinfo, list,log,sprite);
		room[5][6][1] = new WallHole(6,1, gameinfo, list,log,sprite);
		room[5][1][2] = new WoodFloor(1,2, gameinfo, list,log,sprite);
		room[5][1][3] = new WoodFloor(1,3, gameinfo, list,log,sprite);
		room[5][1][4] = new WoodFloor(1,4, gameinfo, list,log,sprite);
		room[5][1][5] = new WoodFloor(1,5, gameinfo, list,log,sprite);
		room[5][1][6] = new WallHole(1,6, gameinfo, list,log,sprite);		
		room[5][0][0] = new BrickWall(0,0, gameinfo, list, log, sprite);
		room[5][0][1] = new BrickWall(0,1, gameinfo, list, log, sprite);
		room[5][0][2] = new BrickWall(0,2, gameinfo, list, log, sprite);
		room[5][0][3] = new BrickWall(0,3, gameinfo, list, log, sprite);
		room[5][0][4] = new BrickWall(0,4, gameinfo, list, log, sprite);
		room[5][0][5] = new BrickWall(0,5, gameinfo, list, log, sprite);
		room[5][0][6] = new BrickWall(0,6, gameinfo, list, log, sprite);
		room[5][2][6] = new BrickWall(2,6, gameinfo, list, log, sprite);
		room[5][2][5] = new BrickWall(2,5, gameinfo, list, log, sprite);
		room[5][2][4] = new BrickWall(2,4, gameinfo, list, log, sprite);
		room[5][2][3] = new BrickWall(2,3, gameinfo, list, log, sprite);
		room[5][2][2] = new BrickWall(2,2, gameinfo, list, log, sprite);
		room[5][3][2] = new BrickWall(3,2, gameinfo, list, log, sprite);
		room[5][4][2] = new BrickWall(4,2, gameinfo, list, log, sprite);
		room[5][5][2] = new BrickWall(5,2, gameinfo, list, log, sprite);
		room[5][6][2] = new BrickWall(6,2, gameinfo, list, log, sprite);
		room[5][6][0] = new BrickWall(6,0, gameinfo, list, log, sprite);
		room[5][5][0] = new BrickWall(5,0, gameinfo, list, log, sprite);
		room[5][4][0] = new BrickWall(4,0, gameinfo, list, log, sprite);
		room[5][3][0] = new BrickWall(3,0, gameinfo, list, log, sprite);
		room[5][2][0] = new BrickWall(2,0, gameinfo, list, log, sprite);
		room[5][1][0] = new BrickWall(1,0, gameinfo, list, log, sprite);

		//Room 6 - Office
		room[6][0][0] = new BrickWall(0,0, gameinfo, list, log, sprite);
		room[6][1][0] = new BrickWall(1,0, gameinfo, list, log, sprite);
		room[6][2][0] = new BrickWall(2,0, gameinfo, list, log, sprite);

		room[6][1][4] = new BrickWall(1,4, gameinfo, list, log, sprite);
		room[6][2][4] = new BrickWall(2,4, gameinfo, list, log, sprite);
		
		room[6][1][1] = new WoodFloor(1,1, gameinfo,list,log,sprite);
		room[6][1][2] = new WoodFloor(1,2, gameinfo,list,log,sprite);
		room[6][1][3] = new WoodFloor(1,3, gameinfo,list,log,sprite);
		room[6][2][1] = new WoodFloor(2,1, gameinfo,list,log,sprite);
		room[6][2][2] = new WoodFloor(2,2, gameinfo,list,log,sprite);
		room[6][2][3] = new Desk(2,3, gameinfo,list,log,sprite);
		room[6][0][1] = new WallHole(0,1, gameinfo, list, log, sprite);
		room[6][0][2] = new BrickWall(0,2, gameinfo, list, log, sprite);
		room[6][0][3] = new BrickWall(0,3, gameinfo, list, log, sprite);
		room[6][0][4] = new BrickWall(0,4, gameinfo, list, log, sprite);
		room[6][3][0] = new BrickWall(3,0, gameinfo, list, log, sprite);
		room[6][3][1] = new BrickWall(3,1, gameinfo, list, log, sprite);
		room[6][3][2] = new YellowDoor(3,2, gameinfo, list, log, sprite);
		room[6][3][3] = new BrickWall(3,3, gameinfo, list, log, sprite);
		room[6][3][4] = new BrickWall(3,4, gameinfo, list, log, sprite);

		//Room 7 - East Hallway 
		
		room[7][0][0] = new BrickWall(0,0, gameinfo, list, log, sprite);
		room[7][0][1] = new BrickWall(0,1, gameinfo, list, log, sprite);
		room[7][0][2] = new BlueDoor(0,2, gameinfo, list, log, sprite);
		room[7][0][4] = new BrickWall(0,4, gameinfo, list, log, sprite);
		room[7][0][3] = new BrokenWall(0,3, gameinfo, list, log, sprite);
		room[7][0][5] = new BrickWall(0,5, gameinfo, list, log, sprite);
		room[7][0][6] = new BrokenWall(0,6, gameinfo, list, log, sprite);
		room[7][0][7] = new GreenDoor(0,7, gameinfo, list, log, sprite);
		room[7][0][8] = new BrickWall(0,8, gameinfo, list, log, sprite);
		room[7][0][9] = new BrickWall(0,9, gameinfo, list, log, sprite);
		room[7][0][10] = new BrickWall(0,10, gameinfo, list, log, sprite);
		room[7][0][11] = new BrickWall(0,11, gameinfo, list, log, sprite);

		room[7][4][0] = new BrickWall(4,0, gameinfo, list, log, sprite);
		room[7][4][1] = new BrickWall(4,1, gameinfo, list, log, sprite);
		room[7][4][2] = new BrickWall(4,2, gameinfo, list, log, sprite);
		room[7][4][3] = new BrickWall(4,3, gameinfo, list, log, sprite);
		room[7][4][4] = new BrickWall(4,4, gameinfo, list, log, sprite);
		room[7][4][5] = new BrickWall(4,5, gameinfo, list, log, sprite);
		room[7][4][6] = new Vent(4,6, gameinfo, list, log, sprite);
		room[7][4][7] = new BlueDoor(4,7, gameinfo, list, log, sprite);
		room[7][4][8] = new BrokenWall(4,8, gameinfo, list, log, sprite);
		room[7][4][9] = new BrickWall(4,9, gameinfo, list, log, sprite);
		room[7][4][10] = new BrickWall(4,10, gameinfo, list, log, sprite);
		room[7][4][11] = new BrickWall(4,11, gameinfo, list, log, sprite);

		room[7][1][0] = new BrickWall(1,0, gameinfo, list, log, sprite);
		room[7][2][0] = new BrickWall(2,0, gameinfo, list, log, sprite);
		room[7][3][0] = new PastBrokenWall(3,0, gameinfo, list, log, sprite);
		room[7][1][11] = new BrokenWall(1,11, gameinfo, list, log, sprite);
		room[7][2][11] = new GreenDoor(2,11, gameinfo, list, log, sprite);
		room[7][3][11] = new BrickWall(3,11, gameinfo, list, log, sprite);

		
		for (int i = 1; i < 4; i++)
		{
			for (int j = 1; j < 11; j++)
			{
				room[7][i][j] = new WoodFloor(i,j, gameinfo, list,log,sprite);
			}
		}
		

		room[7][3][2] = new WoodFloorGuardN(3,2, gameinfo, list, log, sprite);
		room[7][2][1] = new WoodFloorGuardE(2,1, gameinfo, list, log, sprite);
		
		for(int i = 2;  i< 4; i++)
		{
			room[7][i][4] = new WoodFloorBlock(i,4, gameinfo,list,log,sprite);
		}
		
		room[7][1][4] = new WoodFloorBlockSource(1,4,gameinfo,list,log,sprite);
		//Room 8 - South Hall
		
		for (int i = 1; i < 8; i++)
			
		{
			room[8][i][0] = new BrickWall(i,0, gameinfo, list, log, sprite);
			room[8][i][4] = new BrickWall(i,4, gameinfo, list, log, sprite);

			for (int j = 1; j < 4; j++)
			{
				room[8][i][j] = new WoodFloor(i,j, gameinfo, list, log, sprite);
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			room[8][0][i] = new BrickWall(0,i, gameinfo, list, log, sprite);
			room[8][8][i] = new BrickWall(8,i, gameinfo, list, log, sprite);	
		}
		

		room[8][0][2] = new BlueDoor(0,2,gameinfo,list,log,sprite);
		room[8][0][1] = new Vent(0,1,gameinfo,list,log,sprite);
		room[8][5][4] = new Vent(5,4,gameinfo,list,log,sprite);
		room[8][5][0] = new BrokenWall(5,0,gameinfo,list,log,sprite);
		room[8][3][4] = new BrokenWall(3,4,gameinfo,list,log,sprite);
		room[8][0][3] = new BrokenWall(0,3,gameinfo,list,log,sprite);
		room[8][6][0] = new GreenDoor(6,0,gameinfo,list,log,sprite);
		room[8][4][4] = new YellowDoor(4,4,gameinfo,list,log,sprite);
		room[8][2][1] = new WoodFloorBlockSource(2,1,gameinfo,list,log,sprite);
		room[8][2][2] = new WoodFloorBlock(2,2,gameinfo,list,log,sprite);
		room[8][2][3] = new WoodFloorBlock(2,3,gameinfo,list,log,sprite);
		

		//Room 9 - Yard

		for (int i = 1; i < 16; i++)
		{
			room[9][i][0] = new BrickWall(i,0, gameinfo,list,log,sprite);
			room[9][i][16] = new BrickWall(i,16, gameinfo,list,log,sprite);
			for (int j = 1; j < 16; j++)
			{
				room[9][i][j] = new Grass(i,j, gameinfo,list, log, sprite);
			}
		}
		
		for (int i = 0; i < 17; i++)
		{
			room[9][0][i] = new BrickWall(0,i, gameinfo, list,log,sprite);
			room[9][16][i] = new BrickWall(16,i, gameinfo, list,log,sprite);
		}
		
		room[9][16][12] = new GreenDoor(16,12, gameinfo, list, log, sprite);
		room[9][8][0] = new GreenDoor(8,0, gameinfo, list, log, sprite);
		room[9][8][2] = new GrassGuardN(8,2,gameinfo,list,log,sprite);
		room[9][7][1] = new GrassGuardW(7,1,gameinfo,list,log,sprite);
		room[9][9][1] = new GrassGuardE(9,1,gameinfo,list,log,sprite);

		room[9][7][0] = new BrokenWall(7,0,gameinfo,list,log,sprite);
		room[9][16][11] = new BrokenWall(16,11,gameinfo,list,log,sprite);
		
		room[9][6][2] = new GraveStone(6,2, gameinfo,list,log,sprite);
		room[9][6][5] = new GraveStone(6,5, gameinfo,list,log,sprite);
		room[9][6][8] = new GraveStone(6,8, gameinfo,list,log,sprite);
		room[9][6][11] = new GraveStone(6,11, gameinfo,list,log,sprite);
		room[9][6][14] = new GraveStone(6,14, gameinfo,list,log,sprite);
		room[9][11][2] = new NewGraveStone(11,2, gameinfo,list,log,sprite);
		room[9][10][2] = new GraveDirt(10,2, gameinfo,list,log,sprite);

		

		
		

		// Room 10 - Attic
		
		for(int i = 0; i<6; i++)
		{
			for(int j = 0; j<6; j++)
			{
				room[10][i][j] = new RedCarpet(i,j,gameinfo, list,log,sprite);
				
				if(i ==0 || j == 0 || i == 5 || j ==5 )
				{
					room[10][i][j] = new AtticWall(i,j,gameinfo, list,log,sprite);
				}
			}
		}
		room[10][1][2] = new RedCarpetNote(1,2,gameinfo,list,log,sprite);
		
		room[10][2][2] = new BlueCarpet(2,2,gameinfo,list,log,sprite);
		room[10][1][0] = new AtticHole(1,0,gameinfo,list,log,sprite);
		room[10][4][5] = new AtticHole(4,5,gameinfo,list,log,sprite);

		//Room 11 - East Wing Wall Passage
		
		for (int i = 0; i < 19; i++)
		{
			room[11][i][0] = new BrickWall(i,0, gameinfo,list,log,sprite);
			
			if(i > 1 && i < 17)
			{
				room[11][i][2] = new BrickWall(i,2, gameinfo,list,log,sprite);
				room[11][i][1] = new WoodFloor(i,1, gameinfo,list,log,sprite);

			}
		}
		
		for(int i = 1; i < 10; i++)
		{
			room [11][0][i] = new BrickWall(0,i, gameinfo, list,log, sprite);
			room [11][18][i] = new BrickWall(18,i, gameinfo, list,log, sprite);
			room [11][1][i] = new WoodFloor(1,i,gameinfo,list,log,sprite);
			room [11][17][i] = new WoodFloor(17,i,gameinfo,list,log,sprite);

			if(i > 2)
			{
				room[11][2][i] = new BrickWall(2,i,gameinfo, list, log, sprite);
				room[11][16][i] = new BrickWall(16,i,gameinfo, list, log, sprite);
			}
		}
		
		room[11][1][9] = new WallHole(1,9,gameinfo,list,log,sprite);
		room[11][17][9] = new WallHole(17,9,gameinfo,list,log,sprite);
		
		//room 12 - East Wing
		for(int i = 0; i < 13; i++)
		{
			room[12][i][0] = new BrickWall(i,0, gameinfo,list,log,sprite);
			room[12][i][6] = new BrickWall(i,6,gameinfo,list,log,sprite);
		}
		
		for(int i = 1; i < 7; i++)
		{
			room[12][0][i] = new BrickWall(0,i, gameinfo,list,log,sprite);
			room[12][12][i] = new BrickWall(12,i,gameinfo,list,log,sprite);
		}
		
		for(int i = 1; i < 12; i++)
		{
			for(int j = 1; j < 6; j++)
			{
				room[12][i][j] = new WoodFloor(i,j,gameinfo,list,log,sprite);
			}
		}
		
		room[12][0][2] = new Vent(0,2,gameinfo,list,log,sprite);
		room[12][0][3] = new BlueDoor (0,3,gameinfo,list,log,sprite);
		room[12][0][4] = new BrokenWall (0,4,gameinfo,list,log,sprite);
		room[12][10][0] = new WireBox(10,0,gameinfo,list,log,sprite);
		room[12][9][0] = new SimpleDoor(9,0,gameinfo,list,log,sprite);
		room[12][4][0] = new YellowDoor(4,0,gameinfo,list,log,sprite);
		room[12][9][6] = new FancyDoor(9,6,gameinfo,list,log,sprite);
		room[12][4][6] = new PurpleDoor(4,6,gameinfo,list,log,sprite);
		room[12][11][3] = new FloorHole(11,3,gameinfo,list,log,sprite);

		
		//Room 13 - Second left East Wing Room
		
		for (int i = 0; i < 4; i++)
		{
			room[13][i][0] = new BrickWall(i,0, gameinfo,list,log,sprite);
			room[13][i][3] = new BrickWall(i,3, gameinfo,list,log,sprite);
		}
		
		for (int i = 1; i < 3; i++)
		{	room[13][0][i] = new BrickWall(0,i, gameinfo,list,log,sprite);
			room[13][3][i] = new BrickWall(3,i, gameinfo,list,log,sprite);
			room[13][i][1] = new WoodFloor(i,1, gameinfo,list,log,sprite);
			room[13][i][2] = new WoodFloor(i,2, gameinfo,list,log,sprite);
		}
		room[13][1][0] = new WallHole(1,0,gameinfo,list,log,sprite);
		room[13][2][1] = new Desk(2,1,gameinfo,list,log,sprite);
		room[13][1][3] = new SimpleDoor(1,3,gameinfo,list,log,sprite);
		room[13][2][3] = new WireBox(2,3,gameinfo,list,log,sprite);
		
		//Room 14 - First Left East Wing Room 
		
		for (int i = 0; i < 4; i++)
		{
			room[14][i][0] = new BrickWall(i,0, gameinfo,list,log,sprite);
			room[14][i][3] = new BrickWall(i,3, gameinfo,list,log,sprite);
		}
		
		for (int i = 1; i < 3; i++)
		{	room[14][0][i] = new BrickWall(0,i, gameinfo,list,log,sprite);
			room[14][3][i] = new BrickWall(3,i, gameinfo,list,log,sprite);
			room[14][i][1] = new WoodFloor(i,1, gameinfo,list,log,sprite);
			room[14][i][2] = new WoodFloor(i,2, gameinfo,list,log,sprite);
		}
		room[14][2][1] = new Desk(2,1,gameinfo,list,log,sprite);
		room[14][1][3] = new YellowDoor(1,3,gameinfo,list,log,sprite);
		room[14][2][2] = new WoodFloorID(2,2,gameinfo,list,log,sprite);
		
		//Room 15 - Old Dorm room 
		
		for (int i = 0; i < 20; i++)
		{
			room[15][0][i] = new BrickWall(0,i, gameinfo,list,log,sprite);
			room[15][10][i] = new BrickWall(10,i, gameinfo,list,log,sprite);
		}
		
		for (int i = 1; i < 10; i++)
		{
			room[15][i][0]= new BrickWall(i,0, gameinfo,list,log,sprite);
			room[15][i][19]= new BrickWall(i,19, gameinfo,list,log,sprite);
		}
		
		for (int i = 1; i< 19; i++)
		{
			for (int j = 1; j<10; j++)
				room[15][j][i] = new WoodFloor(j,i,gameinfo,list,log,sprite);
		}
		
		room [15][3][3] = new AlvaBed1(3,3,gameinfo,list,log,sprite);
		room [15][3][4] = new AlvaBed2(3,4,gameinfo,list,log,sprite);

		room [15][7][3] = new CommonBed1(7,3,gameinfo,list,log,sprite);
		room [15][7][4] = new CommonBed2(7,4,gameinfo,list,log,sprite);
		

		room [15][3][11] = new CommonBed1(3,11,gameinfo,list,log,sprite);
		room [15][3][12] = new CommonBed2(3,12,gameinfo,list,log,sprite);
		

		room [15][7][11] = new CommonBed1(7,11,gameinfo,list,log,sprite);
		room [15][7][12] = new CommonBed2(7,12,gameinfo,list,log,sprite);
		

		room [15][3][15] = new CommonBed1(3,15,gameinfo,list,log,sprite);
		room [15][3][16] = new CommonBed2(3,16,gameinfo,list,log,sprite);


		room [15][7][15] = new JacksonBed1(7,15,gameinfo,list,log,sprite);
		room [15][7][16] = new JacksonBed2(7,16,gameinfo,list,log,sprite);

		room [15][3][0] = new BrokenWall(3,0,gameinfo,list,log,sprite);
		room [15][4][0] = new YellowDoor(4,0,gameinfo,list,log,sprite);
		room [15][5][0] = new Vent(5,0,gameinfo,list,log,sprite);
		room[15][9][18] = new FloorHole(9,18,gameinfo,list,log,sprite);
		room[15][2][18] = new WoodFloorBackpack(2,18,gameinfo,list,log,sprite);
		
		
		// Holding Room A
		
		for(int i = 0; i < 5; i ++)
		{
			for(int j = 0; j < 5; j++)
			room[16][i][j]  = new BrickWall(i,j, gameinfo,list,log,sprite);
		}
		
		for(int i = 1; i < 4; i ++)
		{
			for(int j = 1; j < 4; j++)
			room[16][i][j]  = new WoodFloor(i,j, gameinfo,list,log,sprite);
		}
		
		room[16][1][1] = new WoodFloorFather(1,1,gameinfo,list,log,sprite);
		room[16][2][1] = new WoodFloorPurpleKey (2,1,gameinfo,list,log,sprite);
		room[16][4][1] = new BrokenWall (4,1,gameinfo,list,log,sprite);
		room[16][4][2] = new BlueDoor(4,2,gameinfo,list,log,sprite);

		
		// West Hall
		
		for(int i = 0; i < 5; i ++)
		{
			room[17][i][0]  = new BrickWall(i,0, gameinfo,list,log,sprite);
			room[17][i][10]  = new BrickWall(i,10, gameinfo,list,log,sprite);
		}
		
		for(int i = 1; i < 10; i ++)
		{
			room[17][0][i]  = new BrickWall(0,i, gameinfo,list,log,sprite);
			room[17][4][i]  = new BrickWall(4,i, gameinfo,list,log,sprite);
		}
		
		for(int i = 1; i < 10; i++)
		{
			room[17][1][i] = new WoodFloor(1,i,gameinfo,list,log,sprite);
			room[17][3][i] = new WoodFloor(3,i,gameinfo,list,log,sprite);
			room[17][2][i] = new WoodFloorBlock(2,i,gameinfo,list,log,sprite);
		}
		
		room[17][2][1] = new WoodFloorBlockSource(2,1,gameinfo,list,log,sprite);
		room[17][4][7] = new Vent(4,7,gameinfo,list,log,sprite);
		room[17][4][3] = new Vent(4,3,gameinfo,list,log,sprite);
		room[17][4][2] = new BlueDoor(4,2,gameinfo,list,log,sprite);
		room[17][4][8] = new BlueDoor(4,8,gameinfo,list,log,sprite);
		room[17][4][1] = new BrokenWall(4,1,gameinfo,list,log,sprite);
		room[17][4][9] = new BrokenWall(4,9,gameinfo,list,log,sprite);
		room[17][0][2] = new BlueDoor(0,2,gameinfo,list,log,sprite);
		room[17][0][8] = new BlueDoor(0,8,gameinfo,list,log,sprite);
		room[17][0][1] = new BrokenWall(0,1,gameinfo,list,log,sprite);
		room[17][0][9] = new BrokenWall(0,9,gameinfo,list,log,sprite);
		
		for(int i = 0; i<5; i++)
		{
			room[18][i][0] = new BrickWall(i,0,gameinfo,list,log,sprite);
			room[18][i][4] = new BrickWall(i,4,gameinfo,list,log,sprite);
		}
		
		for(int j = 1; j < 4; j++)
		{
			room[18][0][j] = new BrickWall(0,j,gameinfo,list,log,sprite);
			room[18][4][j] = new BrickWall(4,j,gameinfo,list,log,sprite);
		}
		
		for(int i = 1; i<4; i++)
		{
			for(int j = 1; j < 4; j++)
			{
				room[18][i][j] = new WoodFloor(i,j,gameinfo,list,log,sprite);
	
			}
		}
		
		room[18][1][1] = new WoodFloorBoy(1,1,gameinfo,list,log,sprite);
		room[18][4][2] = new BlueDoor(4,2,gameinfo,list,log,sprite);
		room[18][4][3] = new BrokenWall(4,3,gameinfo,list,log,sprite);


		
		
		
		
		// Holding Room B
		
		
		
		
		

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
		
		if (system.checkTutorial() == true)
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
			//clock.paintComponent(g);	
				
			if (gameinfo.getGameDay()== -3)
			{
				g.setColor(Color.red);
				g.drawString("You were never found.", getWidth()/2, getHeight()/2-15);
				g.drawString("Game Over", getWidth()/2, getHeight()/2);
			}
			
			if(gameinfo.getGameDay() == -2)
			{
				inter.paintComponent(g);
			}
			
			if (gameinfo.getGameDay() >= 0 && gameinfo.getGameDay() != 357)
			{
				
				for (int i = 0; i < 20; i++)
				{
					for (int j = 0; j < 20; j++)
					{
						if (room[gameinfo.getRoom()][i][j] != null)
						{	
							room[gameinfo.getRoom()][i][j].setRelative();
						
								room[gameinfo.getRoom()][i][j].paintComponent(g);
													
						}
					}
				}	
			
			sprite.paintComponent(g);
			
				if(system.checkDialogue() == true || system.checkDialogue2() == true)
				{
					inter.paintComponent(g);
				}
				
				if(system.checkSelect() == true)
				{
					select.paintComponent(g);
				}
				
				if(system.checkMenu() == true)
				{
					g.setColor(Color.CYAN);
					g.fillRect(100,100,200,500);
					g.setColor(Color.green);
					g.drawString("INVENTORY", 140, 150);
					g.drawString("EXIT", 140, 300);
					g.setColor(Color.MAGENTA);
					
					//gameinfo.paintComponent(g);


					if(system.getMenuCursor() == 0)
					{
						g.fillRect(120,150, 25,25);
					}
					
					else
						g.fillRect(120,300,25,25);
				}	
			}
			
			if(system.checkInventoryMenu() == true)
			{
				g.setColor(Color.YELLOW);
				g.fillRect(100,100,400,500);
				g.setColor(Color.green);
				if(system.getInventoryTotal() > 0)
					{g.drawString("NOTE", 140, 150);}

				if(system.getInventoryTotal() > 1)
					{g.drawString("NOTE", 140, 150);
					g.drawString("Red Door Key", 140, 170);}

				if(system.getInventoryTotal() > 2)
					{g.drawString("NOTE", 140, 150);
					g.drawString("Red Door Key", 140, 170);
					g.drawString("Yellow Door Key", 140, 190);}
				g.drawString("EXIT", 140, 470);
				g.setColor(Color.MAGENTA);
				
				//gameinfo.paintComponent(g);


				if(system.getInventoryCursor() == system.getInventoryTotal())
				{
					g.fillRect(120,470, 25,25);
				}
				
				else
					g.fillRect(120,140+(30*system.getInventoryTotal()),25,25);
			}	
		}
			
					
					
				

			if (gameinfo.getGameDay()==357)
			{
				g.drawString("To be continued...", getWidth()/2, getHeight()/2);
			}
		}
	}
