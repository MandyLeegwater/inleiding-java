package h05;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht3 extends Applet {

    Color Valerie;
    Color Jeroen;
    Color Hans;
    int heightValerie;
    int heightJeroen;
    int heightHans;


    public void init(){
        Valerie = Color.yellow;
        Jeroen = Color.red;
        Hans = Color.magenta;
        heightValerie = 20;
        heightJeroen = 50;
        heightHans = 40;
    }

    public void paint(Graphics g){
        g.drawRect(100,20,90,90);
        g.setColor(Valerie);
        g.fillRect(100,20,30,heightValerie);
        g.setColor(Jeroen);
        g.fillRect(130,20,30, heightJeroen);
        g.setColor(Hans);
        g.fillRect(160,20,30, heightHans);
    }
}