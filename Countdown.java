package choice;
import javax.swing.*;
import java.awt.*;

public class Countdown extends JPanel
{

	int minute;
	int seconds;
	String gameover;
	GameCalendar calen;
	

	public Countdown (GameCalendar cal)
	{
		minute = 1;
		seconds = 30;
		calen = cal;
		gameover = "xx:xx";
	}
	
	public void resetCountdown()
	{
		minute = 1;
		seconds = 30;
	}
	
	public void increaseCountdown()
	{
		if(calen.checkTutorial()== false)
		{
			if(minute ==0 && seconds == 0)
			{
				calen.zeroDay();
			}
			if (seconds == 0)
			{	
				seconds = 59;
				minute -= 1;
			}
			
			else seconds -= 1;
		}
	}
	
	public void paintComponent(Graphics g)
	{
		if(calen.getGameDay()==-1)
		{	g.setColor(Color.red);
			g.drawString("Time: " + gameover, 325, 20);
		}
		
		else if(calen.getGameDay()==357)
		{	g.setColor(Color.white);
			g.drawString("Time: " + gameover, 325, 20);
		}
		
		else
		{	
			g.setColor(Color.white);
			
			if (seconds >= 10)
			{
				g.drawString("Time: " + minute+":"+seconds, 325, 20);
			}
			
			else
			{
				g.drawString("Time: " + minute+ ":0"+seconds, 325,20);
			}
		}
	}
}

