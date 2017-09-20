package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht4 extends Applet {

    int teller, antwoord, y;

    public void init(){
        y = 0;
    }

    public void paint(Graphics g){
        for (teller = 1; teller<11; teller++){
            antwoord = teller * 3;
            y+=20;
            g.drawString("" + antwoord, 180,y);
            g.drawString(teller + " x 3 =", 125, y);
        }
    }
}
