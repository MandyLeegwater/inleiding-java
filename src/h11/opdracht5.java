package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht5 extends Applet {

    int teller, y;

    public void init(){
        y=0;
    }

    public void paint(Graphics g){
        for (teller = 1; teller <6; teller ++){
            y+=40;
            g.drawRect(y,y,40,40);
        }
    }
}
