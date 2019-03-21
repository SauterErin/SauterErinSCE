package choice;
import javax.swing.*;

import java.awt.*;

public class GameCalendar extends JPanel {
	
	GameMode gameMode;
	
	public GameCalendar (GameMode gameMode) 
	{
		this.gameMode = gameMode;
	}
	
	
	
	
	
	
	public void paintComponent(Graphics calendar)
	{	
		calendar.setColor(Color.white);
		
		super.paintComponent(calendar);
		if (gameMode.gameday == -1)
		{
			calendar.setColor(Color.red);
			calendar.drawString("Day: xxxxx", 100, 20);
			calendar.drawString("Year: xxxxx", 100, 40);
		}
		
		else
		{
			calendar.drawString("Day: " + (gameMode.gameday+1), 140, 320);
			
			if (gameMode.gameday == 0)
			{
			calendar.drawString("Year: " + gameMode.currentyear, 140, 350);
			}
			
			if (gameMode.gameday == 1)
			{
				calendar.drawString("Year: " + gameMode.gameyearpresent, 140, 350);
			}
			
			if (gameMode.gameday == 357)
			{
				calendar.drawString("Year: 2053", 140, 350);
			}
		}
	}
}