import java.awt.*;
import java.applet.Applet;
public class ParaApplet extends Applet
{
     String str;
     public void init()
     {
          str=getParameter("msg");
          if(str==null)
          {
             str="c++";
          }
          str="hello"+str;
     }  
     public void paint(Graphics g)
     { 
          g.drawString(str,20,100);   
     }
    
}






/*
output
hellojava
*/