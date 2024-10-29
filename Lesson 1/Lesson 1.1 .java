import java.io.*;
import java.awt.*;
import java.applet.*;

/*<applet code="app1" width=200 height=200> </applet>*/

//creating applet and setting background color to it

public class app1 extends Applet
{
  public void init()
  {
    setBackground(Color.gray);
    setForeground(Color.white);
  }
  public void paint(Graphics g)
  {  
    g.drawString("Welcome to my first applet",20,50);
    g.drawString("Welcome to Applet Windows",20,80);
  }
}
