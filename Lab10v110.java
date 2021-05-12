// Lab10v110.java


import java.awt.*;


public class Lab10v110 extends java.applet.Applet
{

	int numClicks;
   int xCoord, yCoord;
	Image picture1, picture2, picture3, picture4, picture5, picture6, picture7, picture8, picture9, picture10, picture11;
   
   /*public boolean mouseMove(Event e, int x, int y)
   {
      xCoord = x;
      yCoord = y;
      repaint();
      return true;
   }*/

	public void init()
	{
		numClicks = 0;
		picture1 = getImage(getDocumentBase(),"Class A Picture.png");
      picture2 = getImage(getDocumentBase(),"Florida.jpg");
		picture3 = getImage(getDocumentBase(),"SMA_logo.png");
      picture4 = getImage(getDocumentBase(),"eagle.jpg");
		picture5 = getImage(getDocumentBase(),"family.jpg");
      picture6 = getImage(getDocumentBase(),"SCF.jpg");
      picture7 = getImage(getDocumentBase(),"LU.jpg");
      picture8 = getImage(getDocumentBase(),"PBA.jpg");
      picture9 = getImage(getDocumentBase(),"family.png");
      picture10 = getImage(getDocumentBase(),"computer-internet.png");
      picture11 = getImage(getDocumentBase(),".png");

		// The following MediaTracker/try/catch code ensures that
		// all images are loaded before the program continues.
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(picture1,1);
		tracker.addImage(picture2,1);
		tracker.addImage(picture3,1);
		tracker.addImage(picture4,1);
		tracker.addImage(picture5,1);
      tracker.addImage(picture6,1);
      tracker.addImage(picture7,1);
      tracker.addImage(picture8,1);
      tracker.addImage(picture9,1);
      tracker.addImage(picture10,1);
      tracker.addImage(picture11,1);
		try
		{
			tracker.waitForAll();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public void paint(Graphics g)
	{
		switch (numClicks)
		{
			case 0 : page1(g); break;
			case 1 : page2(g); break;
			case 2 : page3(g); break;
         case 3 : page4(g); break;
			case 4 : page5(g); break;
			case 5 : page6(g); break;
         case 6 : page7(g); break;
         default: numClicks = 0;repaint();
		}
	}

	public boolean mouseDown(Event e, int x, int y)
	{
		numClicks++;
		repaint();
		return true;
	}

	public void page1(Graphics g)
	{
      int t = 12;
      Expo.drawString(g,"Mouse is located at (" + xCoord + "," + yCoord + ")",20,20);
		Expo.setFont(g,"Arial",Font.BOLD,100);
		Expo.drawString(g,"TITLE PAGE",218,100);
      
		Expo.setColor(g,Expo.navy);
		Expo.drawThickBurst(g,510,370,200,40,t);
      
		Expo.setColor(g,Expo.cyan);
		Expo.drawThickStar(g,510,370,325,9,25);
      
      Expo.setColor(g,Expo.purple);
      Expo.drawThickRegularPolygon(g, 510, 370, 200, 9, t);
      
      Expo.setColor(g,Expo.lightGreen);
      Expo.drawThickRegularPolygon(g, 510, 370, 350, 9, t);
      
      Expo.setColor(g,Expo.black);
      Expo.setFont(g,"Arial",Font.BOLD,100);
		Expo.drawString(g,"TITLE PAGE",218,100);
      
      Expo.setColor(g,Expo.blue);
		g.drawImage(picture1,400,225,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"My name is Jon Franck.",30,300);
		Expo.drawString(g,"Click once to continue.",760,550);
	}

	public void page2(Graphics g)
	{
		Expo.drawString(g,"Mouse is located at (" + xCoord + "," + yCoord + ")",20,20);
      Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"Slide 2",200,100);
		Expo.setColor(g,Expo.turquoise);
		Expo.fillRoundedRectangle(g,90,150,900,750,50);
		Expo.setColor(g,Expo.chartreuse);
		g.drawImage(picture2,200,300,this);
		Expo.setColor(g,Expo.tangerine);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I was born in Florida in:",125,225);
      Expo.setFont(g,"Times Roman",Font.BOLD,35);
      Expo.drawString(g,"1999",175,275);
		Expo.drawString(g,"Click once to continue.",500,700);
	}

	public void page3(Graphics g)
	{
      Expo.setColor(g,Expo.lightBlue);
      Expo.fillRectangle(g,0,0,1000,650);
      Expo.setColor(g,Expo.black);
      
      Expo.drawString(g,"Mouse is located at (" + xCoord + "," + yCoord + ")",20,20);   
		Expo.setFont(g,"Impact",Font.BOLD,100);
      Expo.drawString(g,"Slide 3",200,100);
		      
      
      Expo.drawRandomBurst(g,1000,650, 757,575);
            
      Expo.setColor(g,Expo.white);
		Expo.fillRectangle(g,1000,0,2000,1000);
      Expo.fillRectangle(g,0,650,1000,2000);
            
		g.drawImage(picture3,150,225,this);
		g.drawImage(picture4,500,300,this);
      
      Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Times Roman",Font.PLAIN,25);
		Expo.drawString(g,"I am a high school senior at Sarasota Military Academy, home of the eagles.",100,150);
      Expo.setColor(g,Expo.darkBlue);
		Expo.drawString(g,"Click once to continue.",600,550);
	}

   public void page4(Graphics g)
	{
		Expo.setColor(g,Expo.lightGreen);
      Expo.drawSpiral(g,510,370,1000);
      Expo.setColor(g,Expo.black);

      Expo.drawString(g,"Mouse is located at (" + xCoord + "," + yCoord + ")",20,20);
      Expo.setFont(g,"Calibri",Font.BOLD,100);
		Expo.drawString(g,"Slide 4",200,100);
				//Expo.fillRoundedRectangle(g,460,170,960,515,50);
		g.drawImage(picture5,100,190,this);
      g.drawImage(picture9,530,225,this);
      
      Expo.setColor(g,Expo.white);
		Expo.fillRectangle(g,1000,0,2000,1000);
      Expo.fillRectangle(g,0,650,1000,2000);

      
      Expo.setColor(g,Expo.darkGreen);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"My Family consists of my mother, father, younger brother, and I.",100,150);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

   public void page5(Graphics g)
	{
		Expo.setColor(g,Expo.blue);
      Expo.fillRectangle(g,0,0,1000,650);
      
      Expo.setColor(g,Expo.black);
      Expo.drawString(g,"Mouse is located at (" + xCoord + "," + yCoord + ")",20,20);
      Expo.setFont(g,"Gadget",Font.BOLD,100);
		Expo.drawString(g,"Slide 5",200,100);
      
      Expo.setColor(g,Expo.white);
		Expo.fillRectangle(g,1000,0,2000,1000);
      Expo.fillRectangle(g,0,650,1000,2000);
      
		Expo.setColor(g,Expo.darkGreen);
		Expo.fillRoundedRectangle(g,460,170,960,515,50);
		g.drawImage(picture6,150,225,this);
      
      
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"Next year, I plan to attend classes at the State College of Florida",25,125);
      Expo.drawString(g,"for one year, to get my associate's degree.",25,150);
		Expo.drawString(g,"Click once to continue.",750,625);
	}

   public void page6(Graphics g)
	{  
      int s; 
      
      Expo.setColor(g, Expo.black);
      Expo.fillRectangle(g,0,0,1000,650);
      
      Expo.setColor(g,Expo.white);
		Expo.fillRectangle(g,1000,0,2000,1000);
      Expo.fillRectangle(g,0,650,1000,2000);
      
      for (s = 1; s <= 225; s++)
      {
         
         int x = Expo.random(0,1000);
         int y = Expo.random(0,650); 
         Expo.drawThickRandomBurst(g,x,y, 15,75, 5);
      }
      
      Expo.setColor(g,Expo.white);
		Expo.fillRectangle(g,1000,0,2000,1000);
      Expo.fillRectangle(g,0,650,1000,2000);

      Expo.setColor(g,Expo.black);
      Expo.fillRectangle(g,190,110,675,30);
      
      Expo.setColor(g,Expo.white);
		Expo.drawString(g,"Mouse is located at (" + xCoord + "," + yCoord + ")",20,20);
      Expo.setFont(g,"Courier New",Font.BOLD,100);
		Expo.drawString(g,"Slide 6",200,100);
      
      Expo.setColor(g,Expo.black);
      Expo.fillRectangle(g,100,130,450,175);

		g.drawImage(picture7,150,225,this);
		g.drawImage(picture8,550,238,this);
      
      Expo.setColor(g,Expo.black);
      Expo.fillRectangle(g,750,550,940,530);
      
      Expo.setColor(g,Expo.white);      
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"Afterward, I plan to transfer to either: ",100,150);
      Expo.drawString(g,"Liberty Univerity or Palm Beach Atlantic.",100,175);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

   public void page7(Graphics g)
	{
      for(int k = 1; k <= 1000; k++)
      {
         int x = Expo.random(0,1000);
         int y = Expo.random(0,650);
         int red = Expo.random(0,255);
         int green = Expo.random(0,255);
         int blue = Expo.random(0,255);
         int alpha = Expo.random(0,255);
         Expo.setColor(g,red,green,blue,alpha);
         Expo.fillCircle(g,x,y,50);
      }
		
      Expo.setColor(g,Expo.black);
      
      Expo.drawString(g,"Mouse is located at (" + xCoord + "," + yCoord + ")",20,20);
      Expo.setFont(g,"Georgia",Font.BOLD,100);
		Expo.drawString(g,"Slide 7",200,100);
      
		g.drawImage(picture10,150,225,this);
      
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"",100,150);
      Expo.drawString(g,"I hope to get a bachelor's degree in computer science and enter a career related to computers.",100,150);
		Expo.drawString(g,"Click to restart slideshow.",750,550);
	}
}