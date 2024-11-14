import java.applet.*;
import java.awt.*;

/*
 * <applet code ="Param" width=200 height=100>
 * <param name = "pid" value="111"/>
 * <param name = "pname" value="Kunal"/>
 */

//Illustrating the use of the <PARAM> tag

public class Param extends Applet
{
    int id;
    String name,msg;
    public void init()
    {
        id=Integer.parseInt(getParameter("pid"));
        name = getParameter("pname");
    }
    
    public void paint(Graphics g)
    {
        msg = id+""+name;
        g.drawString(msg,20,30);
    }
}
