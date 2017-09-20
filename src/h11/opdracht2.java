package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    int x;
    public void init(){
        x = 10;
    }

    public void paint(Graphics g){
        g.drawString("20", x,10);
        g.drawString("19", x,20);
        g.drawString("18", x,30);
        g.drawString("17", x,40);
        g.drawString("16", x,50);
        g.drawString("15", x,60);
        g.drawString("14", x,70);
        g.drawString("13", x,80);
        g.drawString("12", x,90);
        g.drawString("11", x,100);
        g.drawString("10", x,110);



    }
}
