//Factorial GUI APPLICATION

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.awt.*;
import java.applet.Applet;
public class FactApp extends Applet implements ActionListener
{
     TextField t1;
     Button b;
     Label l;
     int x; 
     public void init()
     {
          t1=new TextField(8);
          t1.setText("0");
          l=new Label("Factorial of a number is ");
          b=new Button("Factorial");
          add(t1);
          add(l);
          add(b);
          b.addActionListener(this);
     } 
     public void paint(Graphics g)
     {
         g.drawString("FACTORIAL GUI APPLICATION",10,20);
     }
     public void actionPerformed(ActionEvent ae)
     {
         x=Integer.parseInt(t1.getText());
         int f=1;
         while(x>0)
         {
             f=f*x;
             x--;
         }
         l.setText("Factorial is "+f);
     }
} 




/*
A:\javaprogram\applet>javac FactApp.java

A:\javaprogram\applet>appletviewer FactApp.html
*/