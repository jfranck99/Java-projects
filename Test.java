import java.awt.*;
import java.applet.*;
import java.util.Random;
import java.util.Arrays;

public class Test extends Applet
{
   private int numClicks;
   protected int xCoord, yCoord;
   protected int coinY = 0;
   protected int roidY = 0;
   protected boolean loop = true;
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
       Ship2 ship = new Ship2(xCoord, yCoord);
              FlyingObjects2 fo = new FlyingObjects2();
       ship.drawShip2(g);
       
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

class Ship2 extends Test
{
   int b;                  //ship x coord
   int a;                  //ship y coord

   public Ship2(int x,int y)
   {
      a = x;
      b = y;
   }

   public void drawShip2(Graphics g)
   {
       Expo.setColor(g, Expo.blue);
       Expo.fillRegularPolygon(g, a, b, 20, 3);

   }
}

class FlyingObjects2 extends Test
{
   
   int coins[] = new int[difficulty*9];
   int asteroids[] = new int[difficulty*36];

   public FlyingObjects2()
   {
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


   
      public void drawObjects(Graphics g) {
       boolean loop = true;
       int coinY = 0;
       int roidY = 0;
       int h;
       int l;
       int i;
       int j;

       while(loop) {
           for(h = 0; h < coins.length; h++) {
               Expo.setColor(g, Expo.gold);
               Expo.fillCircle(g, coins[h],coinY, 5);
           }

           for(i = 0; i < coins.length; i++) {
               Expo.setColor(g, Expo.black);
               Expo.fillCircle(g, coins[i], coinY - 10, 5);
           }

           for(l = 0; l < asteroids.length; l++) {
               Expo.setColor(g, Expo.lightGrey);
               Expo.fillCircle(g, asteroids[l],roidY, 5);
           }

           for(j = 0; j < asteroids.length; j++) {
               Expo.setColor(g, Expo.black);
               Expo.fillCircle(g, asteroids[j], roidY - 10, 5);
           }



           coinY+=10;
           roidY+=10;

           if( coinY >= 650) {
               loop = false;
           }
           else {
               Expo.delay(1);

           }
       }
   }
}



