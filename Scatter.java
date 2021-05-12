import java.awt.*;
import java.applet.*;
import java.util.Random;
import java.util.Arrays;

public class Scatter extends Applet
{
   private int numClicks;
   protected int xCoord, yCoord;
   public int difficulty = 1;
   int score = 0;
   
   public void init()
   {
       numClicks = 0;
   }

   public void paint(Graphics g)
   {
       Expo.setBackground(g, Expo.black);
       Expo.setColor(g, Expo.white);
       Expo.drawString(g,"Mouse is located at (" + xCoord + "," + yCoord + ")",20,20);
       Expo.drawString(g,"Your score is: " + score, 20,30);
       Ship1 ship = new Ship1(xCoord, yCoord);
       FlyingObjects1 fo = new FlyingObjects1();
       ship.drawShip1(g);
       fo.drawCoin1(g);
       fo.drawAsteroid1(g);


   }

   public int getXCoord()
   {
       return xCoord;
   }

   public int getYCoord()
   {
       return yCoord;
   }
    
   public boolean mouseMove(Event e, int x, int y) {
       xCoord = x;
       yCoord = y;

       repaint();
       return true;
   }
}

class Ship1 extends Scatter
{
   int b;                  //ship x coord
   int a;                  //ship y coord
   int direction;          //ship direction


   public Ship1(int x,int y)
   {
      a = x;
      b = y;
       direction = 0;
   }

   public void drawShip1(Graphics g)
   {
       Expo.setColor(g, Expo.blue);
       Expo.fillRegularPolygon(g, a, b, 20, 3);

   }
}




class FlyingObjects1 extends Scatter
{
   int x;
   int y;
   
   int coins[] = new int[difficulty*9];
   int asteroids[] = new int[difficulty*36];
   
   public void drawCoin1(Graphics g)
   {
       Expo.setColor(g, Expo.gold);
       
       Random coin = new Random(12);
	    for (int k = 2; k < coins.length; k++)
       {
	       coins[k] = coin.nextInt(1000) + 1;
          Expo.fillCircle(g, coins[k],Expo.random(0,650), 5);
       }



   } 
   public void drawAsteroid1(Graphics g)
   {
       int numRoids = difficulty * 11;
       Expo.setColor(g, Expo.lightGrey);
       
       Random roids = new Random(1);
       for (int j = 0; j < asteroids.length; j++)
       {
      	 asteroids[j] = roids.nextInt(1000) + 1;
          Expo.fillCircle(g, asteroids[j],Expo.random(0,650), 30);
       }
              
       

   }
}

