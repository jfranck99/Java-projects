import java.awt.*;
import java.applet.*;
import java.util.Random;
import java.util.Arrays;

public class CoinCollector extends Applet
{
   protected int xCoord, yCoord;
   protected int difficulty = 1;
   protected int score = 0;

   public void paint(Graphics g) 
   {
       Expo.setBackground(g, Expo.black);
       Expo.setColor(g, Expo.white);
       Expo.drawString(g,"Mouse is located at (" + xCoord + "," + yCoord + ")",20,20);
       Expo.drawString(g,"Your score is: " + score, 20,30);

       Ship ship = new Ship(xCoord, yCoord);
       ship.drawShip(g);

       FlyingObjects fo = new FlyingObjects();
       fo.drawObjects(g);
   }

   public boolean mouseMove(Event e, int x, int y) 
   {
       xCoord = x;
       yCoord = y;

       repaint();
       return true;
   }
}

class Ship extends CoinCollector
{
   int a;                 //ship x coord
   int b;                 //ship y coord

   public Ship(int x,int y)
   {
       a = x;
       b = y;
   }

   public void drawShip(Graphics g)
   {
       Expo.setColor(g, Expo.blue);
       Expo.fillRegularPolygon(g, a, b, 20, 3);

   }
}

class FlyingObjects extends CoinCollector
{

   int coins[] = new int[difficulty*7];
   int asteroids[] = new int[difficulty*21];

   public FlyingObjects() {
       Random coin = new Random(12);
       for (int k = 0; k < coins.length; k++) 
       {
           coins[k] = coin.nextInt(1000) + 1;
       }

       Random roids = new Random(1);
       for (int j = 0; j < asteroids.length; j++) 
       {
           asteroids[j] = roids.nextInt(1000) + 1;
       }
   }

   public void drawObjects(Graphics g)
   {
       boolean loop = true;
       int coinY = 0;
       int roidY = 0;
       int h;
       int l;
       int i;
       int j;

       while(loop)
       {
           for(h = 0; h < coins.length; h++) 
           {
               Expo.setColor(g, Expo.gold);
               Expo.fillCircle(g, coins[h],coinY, 5);
           }

           for(i = 0; i < coins.length; i++)
            {
               Expo.setColor(g, Expo.black);
               Expo.fillCircle(g, coins[i], coinY - 10, 5);
           }

           for(l = 0; l < asteroids.length; l++) 
           {
               Expo.setColor(g, Expo.lightGrey);
               Expo.fillCircle(g, asteroids[l],roidY, 5);
           }

           for(j = 0; j < asteroids.length; j++)
            {
               Expo.setColor(g, Expo.black);
               Expo.fillCircle(g, asteroids[j], roidY - 10, 5);
           }



           coinY+=10;
           roidY+=10;

           if( coinY >= 650) 
           {
               loop = false;
           }
           else 
           {
               Expo.delay(100);

           }
       }
    }
}

