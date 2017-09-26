package h13;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        int x1 = 50, x2 = 75, x3 = 100, y1 = 100, y2 = 50, y3 = 100;

        tekenDriehoek(g,x1,y1,x2,y2,x3,y3);
    }
    private void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x1, y1, x3, y3);
        g.drawLine(x2, y2, x3, y3);
    }
}
