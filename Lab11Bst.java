// Lab11Bst.java
// The Graphics Array
// This is the student, starting file for Lab 11B.


import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.util.Arrays;

public class Lab11Bst extends Applet
{

	private int numBars;	// number of bars to be displayed
	int barHeight[];		// array of bar heights
	int swapDelay;          // The delay between the original display and the second display.
	int bar1, bar2;         // Indexes of 2 bars to be swapped.
   public int k;
   public int x1, x2, x3;
   
	public void init()
	{
		numBars   = enterIntGUI("How many bars will be displayed?  {1-1000}");
		bar1      = enterIntGUI("What is the index of the 1st bar to be swapped?  {0-"+(numBars-1)+"}");
		bar2      = enterIntGUI("What is the index of the 2nd bar to be swapped?  {0-"+(numBars-1)+"}");
		swapDelay = 3000;
		barHeight = new int[numBars];
		getBarValues();
	}

	public void getBarValues()
	{

      for (k = 0; k < numBars; k++)
			barHeight[k] = Expo.random(10,640);
         
      System.out.println(Arrays.toString(barHeight));
         
         

	}


	public void paint(Graphics g)
	{
      displayBars(g);
		Expo.delay(swapDelay);
		swapBars(bar1,bar2);
		Expo.setBackground(g,Expo.white);
		displayBars(g);
	}

    public static int enterIntGUI(String prompt)  // Allows GUI keyboard input of an integer in a graphics program.
	{
		String tempString = JOptionPane.showInputDialog(prompt);
		int temp = Integer.parseInt(tempString);
		return temp;
	}


	public void displayBars(Graphics g)
	{
     
      Expo.setColor(g, Expo.red);
      
      x1 = 0;
      x2 = 10;
      // x3 = 20;
          
      for (k = 0; k < numBars; k++)
      // Expo.drawLine(g, k, 0, k, barHeight[k]);  // Top Down Display
         Expo.drawLine(g, k, 650, k, 650 - barHeight[k]);  // Bottom Up Display
       
         Expo.setColor(g, Expo.blue);
         Expo.drawLine(g, bar1, 650, bar1, 650 - barHeight[bar1]);
         Expo.drawLine(g, bar2, 650, bar2, 650 - barHeight[bar2]);

	}

  	private void swapBars(int x, int y)
  	{
      x = barHeight[bar1];
      y = barHeight[bar2];
      
      barHeight[bar1] = y;
      barHeight[bar2] = x;
      

	}

}



