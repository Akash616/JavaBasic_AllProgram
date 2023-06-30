import java.awt.*;
import java.applet.Applet;
public class AddApplet extends Applet
{
    public void init()
    {
        setBackground(Color.RED);   //BACKGROUND COLOR 
    }
    public void paint(Graphics g)
    {
        int a=2;
        int b=4;
        int sum=a+b;
        g.setColor(Color.GREEN);    //FONT COLOR
        g.setFont(new Font("Times New Roman",Font.BOLD,18));
        String res="Sum of two number is "+String.valueOf(sum);
        g.drawString(res,10,50);   
    }
}