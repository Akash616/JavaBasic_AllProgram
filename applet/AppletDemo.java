import java.awt.Graphics;
import java.applet.Applet;
public class AppletDemo extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Hello world",10,100);
    }
}




/*
compiling:-
A:\javaprogram\applet>javac AppletDemo.java

A:\javaprogram\applet>appletviewer appletdemo.html
*/