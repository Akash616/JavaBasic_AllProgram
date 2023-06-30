// ADD GUI APPLICATION

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.applet.Applet;
public class TestAction extends Applet implements ActionListener
{
     TextField t1,t2,t3;
     Button b;
     String s1,s2,s3;
     int x,y,z;
     public void init()
     {
          t1=new TextField(8);
          t2=new TextField(8);
          t3=new TextField(8);
          b=new Button("ADD");
          
          t1.setText("0");
          t2.setText("0");
          add(t1);
          add(t2);
          add(t3);
          add(b);
          b.addActionListener(this);
     }
     public void paint(Graphics g)
     {
          g.drawString("ADD GUI APPLICATION",10,20);
     }
     public void actionPerformed(ActionEvent ae)
     {
          s1=t1.getText();
          s2=t2.getText();
          x=Integer.parseInt(s1);
          y=Integer.parseInt(s2);

          z=x+y;
          s3=String.valueOf(z);
          t3.setText(s3);       
     }  
}
