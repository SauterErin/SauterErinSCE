package choice;
import javax.swing.*;

import java.awt.*;

public class GameScreen extends JPanel {
	
	public GameObject [][][] room = new GameObject [23][20][20];
	
	Dialogue log;
	GameMode gameinfo;
	public GameSprite sprite;
	InteractionPanel inter;
	List list;
	Select select;
	SystemMode system;
	
	public GameScreen (GameMode gameinfo, SystemMode system)
	{	
		setBackground(Color.black);
		
		this.gameinfo = gameinfo;
		this.system = system;
		
		inter = new InteractionPanel(gameinfo);	
		list = new List();
		sprite = new GameSprite (2, 2, gameinfo, list);
		
		//Break in alphabetical pattern due to different needing one another
		select = new Select(gameinfo, system, inter, list, sprite);
		log = new Dialogue(gameinfo, system, inter, select, sprite, list);


		// Room 2- Detention 
		for(int i=0; i < 6; i++)
		{
			for (int j=0; j <6; j++)
			{
				room[2][i][j] = new WoodFloor(i,j, gameinfo, list, log, sprite);
			}
			room[2][i][0] = new BrickWall(i,0, gameinfo, list, log, sprite);
			room[2][0][i] = new BrickWall(0,i, gameinfo, list, log, sprite);
			room[2][6][i] = new BrickWall(6,i, gameinfo, list, log, sprite);
			room[2][i][6] = new BrickWall(i,6, gameinfo, list, log, sprite);
		}
		room[2][4][0] = new Window(4,0, gameinfo, list, log, sprite);
		room[2][6][0] = new BrickWall(6,0, gameinfo, list, log, sprite);
		room[2][0][6] = new BrickWall(0,6, gameinfo, list, log, sprite);
		room[2][6][2] = new WallHole(6,2, gameinfo, list, log, sprite);
		room[2][6][6] = new BrickWall(6,6, gameinfo, list, log, sprite);
		room[2][4][5] = new WoodFloorFather(4,5, gameinfo, list, log, sprite);		
		room[2][4][6] = new PurpleDoor(4,6, gameinfo, list, log, sprite);		
		room[2][1][2] = new Bed1(1,2, gameinfo, list, log, sprite);
		room[2][1][3] = new Bed2(1,3, gameinfo, list, log, sprite);
		room[2][3][3] = new TrapDoor(3,3, gameinfo, list, log, sprite);
		room[2][1][1] = new Fire(1,1,gameinfo,list,log,sprite);
		room[2][1][5] = new Fire(1,5,gameinfo,list,log,sprite);
		room[2][3][2] = new Fire(3,2,gameinfo,list,log,sprite);
		room[2][1][4] = new Fire2(1,4,gameinfo,list,log,sprite);
		room[2][2][5] = new Fire2(2,5,gameinfo,list,log,sprite);
		room[2][3][1] = new Fire2(3,1,gameinfo,list,log,sprite);
		room[2][4][2] = new Fire2(4,2,gameinfo,list,log,sprite);
		room[2][8][5] = new FireBlack2(8,5,gameinfo,list,log,sprite);
		room[2][8][6] = new FireBlack2(8,6,gameinfo,list,log,sprite);
		room[2][8][4] = new FireBlack2(8,4,gameinfo,list,log,sprite);
		room[2][9][4] = new FireBlack2(9,4,gameinfo,list,log,sprite);
		room[2][9][6] = new FireBlack2(9,6,gameinfo,list,log,sprite);
		
		// Room 3 Detention - Music Wall
		
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
		
		room[3][0][0] = new FireBlack(0,0,gameinfo,list,log,sprite);
		room[3][1][0] = new FireBlack(1,0,gameinfo,list,log,sprite);
		room[3][2][0] = new FireBlack(2,0,gameinfo,list,log,sprite);
		room[3][0][4] = new FireBlack2(0,4,gameinfo,list,log,sprite);
		room[3][1][4] = new FireBlack2(1,4,gameinfo,list,log,sprite);
		room[3][2][4] = new FireBlack2(2,4,gameinfo,list,log,sprite);
		room[3][9][2] = new Fire2(9,2,gameinfo,list,log,sprite);
		room[3][8][2] = new Fire2(8,2,gameinfo,list,log,sprite);
		room[3][8][5] = new FireBlack2(8,5,gameinfo,list,log,sprite);
		room[3][8][4] = new FireBlack(8,4,gameinfo,list,log,sprite);
		room[3][7][4] = new FireBlack(7,4,gameinfo,list,log,sprite);
		room[3][6][4] = new FireBlack2(6,4,gameinfo,list,log,sprite);
		room[3][5][4] = new FireBlack2(5,4,gameinfo,list,log,sprite);
		room[3][4][4] = new FireBlack2(4,4,gameinfo,list,log,sprite);
		
		// Room 4 - Music Room
		
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
		room[4][1][4] = new Fire2(1,4, gameinfo,list,log, sprite);
		room[4][1][5] = new Fire2(1,5, gameinfo,list,log, sprite);
		room[4][1][6] = new Fire2(1,6, gameinfo,list,log, sprite);
		room[4][1][7] = new Fire(1,7, gameinfo,list,log, sprite);
		room[4][2][1] = new WoodFloor(2,1, gameinfo,list,log, sprite);
		room[4][2][2] = new Fire2(2,2, gameinfo,list,log, sprite);
		room[4][2][3] = new Fire2(2,3, gameinfo,list,log, sprite);
		room[4][2][4] = new Fire(2,4, gameinfo,list,log, sprite);
		room[4][2][5] = new Fire(2,5, gameinfo,list,log, sprite);
		room[4][2][6] = new WoodFloor(2,6, gameinfo,list,log, sprite);
		room[4][2][7] = new WoodFloor(2,7, gameinfo,list,log, sprite);
		room[4][3][1] = new WoodFloor(3,1, gameinfo,list,log, sprite);
		room[4][3][2] = new Fire(3,2, gameinfo,list,log, sprite);
		room[4][3][3] = new WoodFloor(3,3, gameinfo,list,log, sprite);
		room[4][3][4] = new WoodFloor(3,4, gameinfo,list,log, sprite);
		room[4][3][5] = new Fire2(3,5, gameinfo,list,log, sprite);
		room[4][3][6] = new WoodFloor(3,6, gameinfo,list,log, sprite);
		room[4][3][7] = new WoodFloor(3,7, gameinfo,list,log, sprite);
		room[4][4][1] = new WoodFloor(4,1, gameinfo,list,log, sprite);
		room[4][4][2] = new WoodFloor(4,2, gameinfo,list,log, sprite);
		room[4][4][3] = new WoodFloor(4,3, gameinfo,list,log, sprite);
		room[4][4][4] = new WoodFloor(4,4, gameinfo,list,log, sprite);
		room[4][4][5] = new Fire2(4,5, gameinfo,list,log, sprite);
		room[4][4][6] = new WoodFloor(4,6, gameinfo,list,log, sprite);
		room[4][4][7] = new WoodFloor(4,7, gameinfo,list,log, sprite);
		room[4][5][1] = new WoodFloor(5,1, gameinfo,list,log, sprite);
		room[4][5][2] = new WoodFloor(5,2, gameinfo,list,log, sprite);
		room[4][5][3] = new WoodFloor(5,3, gameinfo,list,log, sprite);
		room[4][5][4] = new Fire2(5,4, gameinfo,list,log, sprite);
		room[4][5][5] = new Fire2(5,5, gameinfo,list,log, sprite);
		room[4][5][6] = new Fire2(5,6, gameinfo,list,log, sprite);
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
		
		
		// Room 0 - North Hallway
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
		{ for (int j = 1; j < 16; j++)
			{
				room[0][j][i+10] = new Grass(j,i+10,gameinfo, list, log, sprite);
				room[0][0][i+10] = new BrickWall(0,i+10,gameinfo,list,log,sprite);
				room[0][16][i+10] = new BrickWall(16,i+10,gameinfo,list,log,sprite);
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
		
		room[0][1][7] = new Fire(1,7, gameinfo, list, log, sprite);
		room[0][1][8] = new Fire2(1,8, gameinfo, list, log, sprite);
		room[0][2][8] = new Fire2(2,8, gameinfo, list, log, sprite);
		room[0][3][8] = new Fire2(3,8, gameinfo, list, log, sprite);
		room[0][16][7] = new BlueDoor(16,7, gameinfo, list, log, sprite);
		room[0][6][11] = new GraveStone(6, 11, gameinfo, list, log, sprite);
		room[0][4][11] = new FireGrass(4, 11, gameinfo, list, log, sprite);
		room[0][4][12] = new FireGrass(4, 12, gameinfo, list, log, sprite);
		room[0][3][11] = new FireGrass2(3, 11, gameinfo, list, log, sprite);
		room[0][3][12] = new FireGrass2(3, 12, gameinfo, list, log, sprite);
		room[0][2][11] = new FireGrass2(2, 11, gameinfo, list, log, sprite);
		room[0][2][12] = new FireGrass2(2, 12, gameinfo, list, log, sprite);

		room[0][3][6] = new WoodFloorNote(3,6,gameinfo,list,log,sprite);
		room[0][7][1] = new WoodFloorGreenKey(7,1,gameinfo,list,log,sprite);
		room[0][10][11] = new GraveDirt(10, 11, gameinfo, list, log, sprite);
		room[0][11][11] = new NewGraveStone(11, 11, gameinfo, list, log, sprite);
		room[0][7][2] = new Fire(7,2, gameinfo, list, log, sprite);
		room[0][7][6] = new Fire(7,6, gameinfo, list, log, sprite);
		room[0][6][6] = new Fire(6,6, gameinfo, list, log, sprite);
		room[0][5][6] = new Fire(5,6, gameinfo, list, log, sprite);
		room[0][8][7] = new Fire(8,7, gameinfo, list, log, sprite);
		room[0][9][7] = new Fire(9,7, gameinfo, list, log, sprite);
		room[0][10][7] = new Fire(10,7, gameinfo, list, log, sprite);
		room[0][11][7] = new Fire(11,7, gameinfo, list, log, sprite);
		room[0][11][6] = new Fire(11,6, gameinfo, list, log, sprite);
		room[0][12][6] = new Fire(12,6, gameinfo, list, log, sprite);

		room[0][8][6] = new Fire(8,6, gameinfo, list, log, sprite);
		room[0][4][8] = new Fire(4,8, gameinfo, list, log, sprite);
		room[0][8][1] = new Fire2(8,1, gameinfo, list, log, sprite);
		room[0][8][2] = new Fire2(8,2, gameinfo, list, log, sprite);
		room[0][8][3] = new Fire2(8,3, gameinfo, list, log, sprite);
		room[0][8][4] = new Fire2(8,4, gameinfo, list, log, sprite);
		room[0][8][5] = new Fire2(8,5, gameinfo, list, log, sprite);
		room[0][9][5] = new Fire2(9,5, gameinfo, list, log, sprite);
		room[0][7][5] = new WoodFloorGuardD(7,5, gameinfo, list, log, sprite);


	
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
		room[1][1][2] = new Fire(1,2,gameinfo,list,log,sprite);
		room[1][2][2] = new WoodFloor(2,2,gameinfo,list,log,sprite);

		room[1][3][2] = new BrickWall(3,2, gameinfo, list, log, sprite);
		room[1][1][3] = new BrickWall(1,3, gameinfo, list, log, sprite);
		
		room[1][8][1] = new FireBlack(8,1,gameinfo,list,log,sprite);
		room[1][8][0] = new FireBlack2(8,0,gameinfo,list,log,sprite);
		room[1][9][0] = new FireBlack2(9,0,gameinfo,list,log,sprite);
		room[1][9][2] = new FireBlack2(9,2,gameinfo,list,log,sprite);		
		room[1][8][2] = new FireBlack2(8,2,gameinfo,list,log,sprite);
		room[1][7][1] = new FireBlack2(7,1,gameinfo,list,log,sprite);
		room[1][6][1] = new FireBlack2(6,1,gameinfo,list,log,sprite);
		
		// Room 5 Power - Office Wall
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
		
		room[5][3][5] = new FireBlack2(3,5, gameinfo, list, log, sprite);
		room[5][4][5] = new FireBlack2(4,5, gameinfo, list, log, sprite);
		room[5][4][4] = new FireBlack(4,4, gameinfo, list, log, sprite);
		room[5][5][5] = new FireBlack2(5,5, gameinfo, list, log, sprite);
		room[5][5][4] = new FireBlack2(5,4, gameinfo, list, log, sprite);
		room[5][5][3] = new FireBlack2(5,3, gameinfo, list, log, sprite);
		

		// Room 6 - Office
		room[6][0][0] = new BrickWall(0,0, gameinfo, list, log, sprite);
		room[6][1][0] = new BrickWall(1,0, gameinfo, list, log, sprite);
		room[6][2][0] = new BrickWall(2,0, gameinfo, list, log, sprite);

		room[6][1][4] = new BrickWall(1,4, gameinfo, list, log, sprite);
		room[6][2][4] = new BrickWall(2,4, gameinfo, list, log, sprite);
		
		room[6][1][1] = new WoodFloor(1,1, gameinfo,list,log,sprite);
		room[6][1][2] = new Fire2(1,2, gameinfo,list,log,sprite);
		room[6][1][3] = new Fire(1,3, gameinfo,list,log,sprite);
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

		room[6][1][5] = new FireBlack2(1,5, gameinfo,list,log,sprite);
		room[6][2][5] = new FireBlack2(2,5, gameinfo,list,log,sprite);
		room[6][3][5] = new FireBlack(3,5, gameinfo,list,log,sprite);
		room[6][4][5] = new FireBlack2(4,5, gameinfo,list,log,sprite);
		room[6][4][4] = new FireBlack2(4,4, gameinfo,list,log,sprite);
		room[6][4][3] = new FireBlack2(4,3, gameinfo,list,log,sprite);

		// Room 7 - East Hallway 
		
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
		
		room[7][3][6] = new Fire(3,6,gameinfo,list,log,sprite);
		room[7][2][6] = new Fire(2,6,gameinfo,list,log,sprite);

		room[7][2][3] = new Fire2(2,3,gameinfo,list,log,sprite);
		room[7][3][3] = new Fire(3,3,gameinfo,list,log,sprite);

		room[7][2][5] = new Fire2(2,5,gameinfo,list,log,sprite);
		room[7][2][7] = new Fire2(2,7,gameinfo,list,log,sprite);
		room[7][2][8] = new Fire2(2,8,gameinfo,list,log,sprite);
		room[7][2][9] = new Fire2(2,9,gameinfo,list,log,sprite);

		// Room 8 - South Hall
		
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
		room[8][1][1] = new WoodFloorGuardD(1,1,gameinfo,list,log,sprite);
		room[8][4][1] = new Fire(4,1,gameinfo,list,log,sprite);
		room[8][7][1] = new Fire(7,1,gameinfo,list,log,sprite);

		room[8][7][3] = new Fire2(7,3,gameinfo,list,log,sprite);
		room[8][7][2] = new Fire2(7,2,gameinfo,list,log,sprite);
		room[8][5][3] = new Fire2(5,3,gameinfo,list,log,sprite);
		room[8][4][3] = new Fire2(4,3,gameinfo,list,log,sprite);
		room[8][6][3] = new Fire2(6,3,gameinfo,list,log,sprite);


		// Room 9 - Yard

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

		for(int i = 2; i < 15; i++)
		{
			room[9][4][i] = new FireGrass(4,i, gameinfo,list,log,sprite);
			room[9][3][i] = new FireGrass2(3,i, gameinfo,list,log,sprite);
			room[9][2][i] = new FireGrass2(2,i, gameinfo,list,log,sprite);
		}
		
		for(int i = 4; i < 13; i++)
		{
			room[9][i][13] = new FireGrass2(i,13, gameinfo,list,log,sprite);
			room[9][i][6] = new FireGrass2(i,6, gameinfo,list,log,sprite);
			room[9][i][7] = new FireGrass2(i,7, gameinfo,list,log,sprite);
			room[9][i][9] = new FireGrass2(i,9, gameinfo,list,log,sprite);

		}

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
		room[10][2][3] = new BlueCarpet(2,3,gameinfo,list,log,sprite);
		room[10][3][2] = new BlueCarpet(3,2,gameinfo,list,log,sprite);
		room[10][3][3] = new BlueCarpet(3,3,gameinfo,list,log,sprite);
		
		room[10][1][0] = new AtticHole(1,0,gameinfo,list,log,sprite);
		room[10][4][5] = new AtticHole(4,5,gameinfo,list,log,sprite);

		// Room 11 - East Wing Wall Passage
		
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
		
		for(int i = 0; i < 5; i++)
		{
			room[11][i+5][1] = new Fire2(i+5,1, gameinfo,list,log,sprite);
		}
		room[11][5][5] = new FireBlack(5,5,gameinfo,list,log,sprite);
		room[11][5][6] = new FireBlack(5,6,gameinfo,list,log,sprite);
		room[11][6][5] = new FireBlack(6,5,gameinfo,list,log,sprite);
		room[11][6][6] = new FireBlack(6,6,gameinfo,list,log,sprite);

		room[11][7][8] = new FireBlack(7,8,gameinfo,list,log,sprite);
		room[11][7][5] = new FireBlack(7,5,gameinfo,list,log,sprite);
		room[11][8][8] = new FireBlack(8,8,gameinfo,list,log,sprite);
		room[11][9][8] = new FireBlack(9,8,gameinfo,list,log,sprite);
		room[11][9][7] = new FireBlack(9,7,gameinfo,list,log,sprite);
		room[11][10][7] = new FireBlack(10,7,gameinfo,list,log,sprite);

		// room 12 - East Wing
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
		room[12][1][2] = new WoodFloorGuardD(1,2,gameinfo,list,log,sprite);

		room[12][0][3] = new BlueDoor (0,3,gameinfo,list,log,sprite);
		room[12][0][4] = new BrokenWall (0,4,gameinfo,list,log,sprite);
		room[12][10][0] = new WireBox(10,0,gameinfo,list,log,sprite);
		room[12][9][0] = new SimpleDoor(9,0,gameinfo,list,log,sprite);
		room[12][4][0] = new YellowDoor(4,0,gameinfo,list,log,sprite);
		room[12][9][6] = new FancyDoor(9,6,gameinfo,list,log,sprite);
		room[12][4][6] = new PurpleDoor(4,6,gameinfo,list,log,sprite);
		room[12][11][3] = new FloorHole(11,3,gameinfo,list,log,sprite);

		room[12][5][2] = new Fire(5,2,gameinfo,list,log,sprite);
		room[12][6][3] = new Fire(6,3,gameinfo,list,log,sprite);
		room[12][5][3] = new Fire(5,3,gameinfo,list,log,sprite);
		room[12][4][3] = new Fire(4,3,gameinfo,list,log,sprite);
		room[12][3][3] = new Fire(3,3,gameinfo,list,log,sprite);
		room[12][6][4] = new Fire2(6,4,gameinfo,list,log,sprite);
		room[12][6][5] = new Fire2(6,5,gameinfo,list,log,sprite);
		room[12][7][5] = new Fire2(7,5,gameinfo,list,log,sprite);
		room[12][8][5] = new Fire2(8,5,gameinfo,list,log,sprite);
		
		// Room 13 - Second left East Wing Room
		
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
		room[13][2][2] = new Fire(2,2,gameinfo,list,log,sprite);
		room[13][8][4] = new FireBlack(8,4,gameinfo,list,log,sprite);
		room[13][9][4] = new FireBlack2(9,4,gameinfo,list,log,sprite);
		room[13][8][5] = new FireBlack(8,5,gameinfo,list,log,sprite);

		// Room 14 - Wreck Room 
		
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
		room[14][1][1] = new Fire(1,1,gameinfo,list,log,sprite);
		room[14][5][1] = new FireBlack(5,1,gameinfo,list,log,sprite);
		room[14][5][2] = new FireBlack(5,2,gameinfo,list,log,sprite);
		room[14][5][3] = new FireBlack(5,3,gameinfo,list,log,sprite);

		room[14][6][4] = new FireBlack2(6,4,gameinfo,list,log,sprite);
		room[14][5][4] = new FireBlack2(5,4,gameinfo,list,log,sprite);
		room[14][4][4] = new FireBlack2(4,4,gameinfo,list,log,sprite);
		room[14][6][1] = new FireBlack2(6,1,gameinfo,list,log,sprite);
		room[14][7][1] = new FireBlack2(7,1,gameinfo,list,log,sprite);

		// Room 15 - Old Dorm room 
		
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
		
		room [15][1][1] = new Fire(1,1,gameinfo,list,log,sprite);
		room [15][1][2] = new Fire(1,2,gameinfo,list,log,sprite);
		room [15][2][1] = new Fire(2,1,gameinfo,list,log,sprite);
		room [15][5][1] = new Fire(5,1,gameinfo,list,log,sprite);
		room [15][6][1] = new Fire(6,1,gameinfo,list,log,sprite);
		room [15][7][1] = new Fire2(7,1,gameinfo,list,log,sprite);
		room [15][7][2] = new Fire2(7,2,gameinfo,list,log,sprite);

		room [15][1][3] = new Fire2(1,3,gameinfo,list,log,sprite);
		room [15][2][2] = new Fire2(2,2,gameinfo,list,log,sprite);
		room [15][3][2] = new Fire2(3,2,gameinfo,list,log,sprite);
		room [15][5][5] = new Fire(5,5,gameinfo,list,log,sprite);
		room [15][5][9] = new Fire(5,9,gameinfo,list,log,sprite);
		room [15][5][10] = new Fire2(5,10,gameinfo,list,log,sprite);
		room [15][5][11] = new Fire2(5,11,gameinfo,list,log,sprite);
		room [15][5][12] = new Fire2(5,12,gameinfo,list,log,sprite);
		room [15][5][13] = new Fire2(5,13,gameinfo,list,log,sprite);
		room [15][4][11] = new Fire2(4,11,gameinfo,list,log,sprite);
		room [15][6][11] = new Fire2(6,11,gameinfo,list,log,sprite);
		room [15][5][4] = new Fire2(5,4,gameinfo,list,log,sprite);
		room [15][5][3] = new Fire2(5,3,gameinfo,list,log,sprite);
		room [15][4][5] = new Fire2(4,5,gameinfo,list,log,sprite);
		
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
		
		room[16][1][1] = new WoodFloorFatherD(1,1,gameinfo,list,log,sprite);
		room[16][2][1] = new WoodFloorPurpleKey (2,1,gameinfo,list,log,sprite);
		room[16][4][1] = new BrokenWall (4,1,gameinfo,list,log,sprite);
		room[16][4][2] = new BlueDoor(4,2,gameinfo,list,log,sprite);
		
		room[16][3][3] = new Fire(3,3,gameinfo,list,log,sprite);
		room[16][3][2] = new Fire(3,2,gameinfo,list,log,sprite);
		room[16][2][2] = new Fire2(2,2,gameinfo,list,log,sprite);
		room[16][1][2] = new Fire2(1,2,gameinfo,list,log,sprite);
		room[16][1][3] = new Fire2(1,3,gameinfo,list,log,sprite);

		
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
		room[17][1][5] = new WoodFloorGuardD(1,5,gameinfo,list,log,sprite);
		room[17][3][5] = new Fire(3,5,gameinfo,list,log,sprite);
		room[17][3][4] = new Fire(3,4,gameinfo,list,log,sprite);
		room[17][1][6] = new Fire(1,6,gameinfo,list,log,sprite);
		room[17][3][3] = new Fire2(3,3,gameinfo,list,log,sprite);
		room[17][3][6] = new Fire2(3,6,gameinfo,list,log,sprite);
		room[17][3][7] = new Fire2(3,7,gameinfo,list,log,sprite);
		room[17][3][8] = new Fire2(3,8,gameinfo,list,log,sprite);
		room[17][1][7] = new Fire2(1,7,gameinfo,list,log,sprite);
		room[17][1][8] = new Fire(1,8,gameinfo,list,log,sprite);

		// Holding Room B
		
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
		
		room[18][3][2] = new Fire(3,2,gameinfo,list,log,sprite);
		room[18][1][3] = new Fire(1,3,gameinfo,list,log,sprite);
		room[18][2][2] = new Fire2(2,2,gameinfo,list,log,sprite);
		room[18][2][3] = new Fire2(2,3,gameinfo,list,log,sprite);
		room[18][3][1] = new Fire2(3,1,gameinfo,list,log,sprite);
		
		// Exit Hall
		
		for(int i = 0; i < 15; i++)
		{
			room[19][0][i] = new BrickWall(0,i,gameinfo,list,log,sprite);
			room[19][6][i] = new BrickWall(6,i,gameinfo,list,log,sprite);
			
			if(i < 6)
			{
				room[19][i][0] = new BrickWall(i,0,gameinfo,list,log,sprite);
				room[19][i][14] = new BrickWall(i,14,gameinfo,list,log,sprite);
			}
		}
		for(int i = 1; i< 14; i++)
		{
			for(int j = 1; j < 6; j++)
			{
				room[19][j][i] = new WoodFloor(j,i,gameinfo,list,log,sprite);
			}
		}
		
		for(int i = 7; i < 13; i++)
		{
			room[19][i][2] = new BrickWall(i,2,gameinfo,list,log,sprite);
			room[19][i][12] = new BrickWall(i,12,gameinfo,list,log,sprite);
		}
		
		for(int i = 6; i < 11; i++)
		{
			room[19][i][3] = new WoodFloor(i,3,gameinfo,list,log,sprite);
			room[19][i][4] = new BrickWall(i,4,gameinfo,list,log,sprite);
			room[19][i][11] = new WoodFloor(i,11,gameinfo,list,log,sprite);
			room[19][i][10] = new BrickWall(i,10,gameinfo,list,log,sprite);
		}
		
		for(int i = 5; i < 10; i++)
		{
			room[19][10][i] = new BrickWall(10,i,gameinfo,list,log,sprite);		

		}
		
		for(int i = 3; i < 12; i++)
		{
			room[19][12][i] = new BrickWall(12,i,gameinfo,list,log,sprite);
			room[19][11][i] = new WoodFloor(11,i,gameinfo,list,log,sprite);
		}
		
		for(int i = 1; i < 14; i++)
		{
			room[19][2][i] = new WoodFloorBlock(2,i,gameinfo,list,log,sprite);
			room[19][4][i] = new WoodFloorBlock(4,i,gameinfo,list,log,sprite);
		}
		
		for(int i = 1; i < 6; i++)
		{
			room[19][i][6] = new WoodFloorBlock(i,6,gameinfo,list,log,sprite);
			room[19][i][8] = new WoodFloorBlock(i,8,gameinfo,list,log,sprite);
		}
		
		room[19][3][0] = new PurpleDoor(3,0,gameinfo,list,log,sprite);
		room[19][2][1] = new WoodFloorBlockSource(2,1,gameinfo,list,log,sprite);
		room[19][4][1] = new WoodFloorBlockSource(4,1,gameinfo,list,log,sprite);

		room[19][3][14] = new PurpleDoor(3,14,gameinfo,list,log,sprite);
		room[19][4][14] = new Vent(4,14,gameinfo,list,log,sprite);
		room[19][2][14] = new BrokenWall(2,14,gameinfo,list,log,sprite);
		room[19][2][13] = new Fire(2,13,gameinfo,list,log,sprite);
		room[19][2][12] = new Fire2(2,12,gameinfo,list,log,sprite);
		room[19][3][13] = new Fire2(3,13,gameinfo,list,log,sprite);
		room[19][1][13] = new Fire2(1,13,gameinfo,list,log,sprite);
		room[19][1][7] = new Rubble(1,7,gameinfo,list,log,sprite);
		room[19][2][7] = new RubbleLeft(2,7,gameinfo,list,log,sprite);
		room[19][4][7] = new RubbleRight(4,7,gameinfo,list,log,sprite);
		room[19][5][7] = new Rubble(5,7,gameinfo,list,log,sprite);
		
		room[19][1][2] = new WoodFloorBackpack(1,2,gameinfo,list,log,sprite);

		room[19][7][8] = new FireBlack(7,8,gameinfo,list,log,sprite);
		room[19][8][8] = new FireBlack2(8,8,gameinfo,list,log,sprite);
		room[19][6][3] = new Rubble(6,3,gameinfo,list,log,sprite);
		room[19][2][11] = new Rubble(2,11,gameinfo,list,log,sprite);
		room[19][2][10] = new Rubble(2,10,gameinfo,list,log,sprite);
		room[19][1][11] = new Rubble(1,11,gameinfo,list,log,sprite);
		room[19][5][6] = new WoodFloorBlockSource(5,6,gameinfo,list,log,sprite);
		room[19][1][8] = new WoodFloorBlockSource(1,8,gameinfo,list,log,sprite);
		room[19][3][7] = new WoodFloorSacrificeTrigger(3,7,gameinfo,list,log,sprite);
		
		// Denouncement Zone - Leave to enter epilogue 
		
		for(int i = 0; i < 16; i++)
		{
			room[20][0][i] = new BrickWall(0,i,gameinfo,list,log,sprite);
			room[20][8][i] = new BrickWall(8,i,gameinfo,list,log,sprite);
		}
		
		for(int i = 1; i < 9; i++)
		{
			room[20][i][0] = new BrickWall(i,0,gameinfo,list,log,sprite);
			room[20][i][15] = new BrickWall(i,15,gameinfo,list,log,sprite);
		}
		
		for(int i = 1; i < 15; i++)
		{
			for(int j = 1; j < 8 ;j++)
			{
				room[20][j][i] = new Grass(j,i,gameinfo,list,log,sprite);
			}
			room[20][4][i] = new Cement(4,i,gameinfo,list,log,sprite);
		}
		
		room[20][4][15] = new PurpleDoor(4,15,gameinfo,list,log,sprite);
		room[20][4][0] = new Gate(4,0,gameinfo,list,log,sprite);

		for(int i = 0; i < 6; i++)
		{
			room[21][0][i] = new BrickWall(0,i, gameinfo,list,log,sprite);
			room[21][2][i] = new BrickWall(2,i, gameinfo,list,log,sprite);
			room[21][1][i] = new WoodFloor(1,i, gameinfo,list,log,sprite);
		}
		
		room[21][1][0] = new PurpleDoor(1,0,gameinfo,list,log,sprite);
		room[21][1][5] = new BrickWallKeySlot(1,5,gameinfo,list,log,sprite);

		room[21][1][6] = new FireBlack2(1,6,gameinfo,list,log,sprite);
		room[21][0][6] = new FireBlack2(0,6,gameinfo,list,log,sprite);
		room[21][1][7] = new FireBlack(1,7,gameinfo,list,log,sprite);
		room[21][1][8] = new FireBlack2(1,8,gameinfo,list,log,sprite);
		room[21][2][7] = new FireBlack(2,7,gameinfo,list,log,sprite);
		room[21][3][7] = new FireBlack(3,7,gameinfo,list,log,sprite);
		room[21][3][6] = new FireBlack(3,6,gameinfo,list,log,sprite);
		room[21][3][5] = new FireBlack(3,5,gameinfo,list,log,sprite);
		room[21][3][8] = new FireBlack2(3,8,gameinfo,list,log,sprite);
		room[21][4][7] = new FireBlack2(4,7,gameinfo,list,log,sprite);
		room[21][4][6] = new FireBlack2(4,6,gameinfo,list,log,sprite);
		room[21][4][5] = new FireBlack2(4,5,gameinfo,list,log,sprite);
		room[21][4][4] = new FireBlack2(4,4,gameinfo,list,log,sprite);
		room[21][4][3] = new FireBlack2(4,3,gameinfo,list,log,sprite);
		room[21][5][4] = new FireBlack2(5,4,gameinfo,list,log,sprite);
		room[21][5][6] = new FireBlack2(5,6,gameinfo,list,log,sprite);
		room[21][1][6] = new FireBlack2(1,6,gameinfo,list,log,sprite);

		for(int i = 0; i < 7; i++)
		{
			room[22][1][i] = new FireBlack(1,i,gameinfo,list,log,sprite);
			room[22][2][i] = new FireBlack(2,i,gameinfo,list,log,sprite);
			room[22][5][i] = new FireBlack(5,i,gameinfo,list,log,sprite);
			room[22][6][i] = new FireBlack(6,i,gameinfo,list,log,sprite);
			room[22][i][5] = new FireBlack(i,5,gameinfo,list,log,sprite);
			room[22][i][6] = new FireBlack(i,6,gameinfo,list,log,sprite);
		}
		
		for(int i = 0; i < 5; i++)
		{
			room[22][3][i] = new BrickWall(3,i, gameinfo,list,log,sprite);
			room[22][5][i] = new BrickWall(5,i, gameinfo,list,log,sprite);
			room[22][4][i] = new WoodFloor(4,i, gameinfo,list,log,sprite);
		}
		
		room[22][4][0] = new FancyDoor(4,0,gameinfo,list,log,sprite);
		room[22][4][4] = new FinalSwitch(4,4,gameinfo,list,log,sprite);
	}	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		
		
		if (system.checkTutorial() == true)
		{	
			// Instructions
			g.drawString("To move left press the left arrow key.", 50, 30);
			g.drawString("To move up press the up arrow key.", 50, 45);
			g.drawString("To move down press the down arrow key.", 50, 60);
			g.drawString("To move right press the right arrow key.", 50, 75);
			g.drawString("To inspect objects press the shift key.", 50, 90);
			g.drawString("Press any key to begin.", 50, 105);
		}
		
		if (gameinfo.getEnding() < 0 || gameinfo.getEnding() > 0)
		{
			inter.paintComponent(g);
		}
		
		// If in normal play 
		if (gameinfo.getEnding() == 0 && system.checkTutorial() == false)
		{
			for (int i = 0; i < 20; i++)
			{
				for (int j = 0; j < 20; j++)
				{
					// if something is in square
					if (room[gameinfo.getRoom()][i][j] != null)
					{	
						// Set position relative to sprite
						room[gameinfo.getRoom()][i][j].setRelative();	
						// Paint objects according to said position
						room[gameinfo.getRoom()][i][j].paintComponent(g);								
					}
				}
			}	
			
			sprite.paintComponent(g);
			
			// If mode is Dialogue - paint InteractionPanel paint instructions
			if(system.checkDialogue() == true || system.checkDialogue2() == true)
			{
				inter.paintComponent(g);
			}
			
			// If mode is select - paint selection paint instructions
			if(system.checkSelect() == true)
			{
				select.paintComponent(g);
			}
		}		
	}
}