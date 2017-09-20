package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {

    int x2, x1;
    public void init(){
    x1 = 10;
    x2= 100;
    }

    public void paint(Graphics g){
        g.drawLine(x1,10,x2,10);
        g.drawLine(x1,20,x2,20);
        g.drawLine(x1,30,x2,30);
        g.drawLine(x1,40,x2,40);
        g.drawLine(x1,50,x2,50);
        g.drawLine(x1,60,x2,60);
        g.drawLine(x1,70,x2,70);
        g.drawLine(x1,80,x2,80);
        g.drawLine(x1,90,x2,90);
        g.drawLine(x1,100,x2,100);

    }
}
