package h06;

import java.applet.Applet;
import java.awt.*;

public class Reken extends Applet {
    //6.1
    int a;
    int uitkomst;
    //6.2
    double minuut;
    double uur;
    double uren;
    double dag;
    double jaar;
    //6.3
    int pos;
    int pos2;
    int neg;


    public void init(){
        //6.1
        a = 113;
        uitkomst = a / 4;
        //6.2
        minuut= 60;
        uur= minuut*minuut;
        uren=24;
        dag=minuut*minuut*uren;
        jaar=dag*365.25;
        //6.3
        pos=10;
        pos2= 20;
        neg=pos + - pos2;
    }

    public void paint(Graphics g){
        //6.1
        g.drawString("6.1", 20,20);
        g.drawString("Jan:" + uitkomst,20,40);
        g.drawString("Ali:" + uitkomst,20,50);
        g.drawString("Jeannette:" + uitkomst, 20, 60);
        g.drawString("Mandy:" + uitkomst, 20, 70);

        g.drawLine(20,80,150,80);
        //6.2
        g.drawString("6.2", 20, 100);
        g.drawString("hoeveel seconden zitter er in een uur, dag, jaar?", 20,120);
        g.drawString("uur: 60x60:"+ uur, 20,130);
        g.drawString("dag: 60x60x24:" + dag, 20,140);
        g.drawString("jaar: 60x60x24x365:" + jaar, 20, 150);

        g.drawLine(20,160,150,160);
        //6.3
        g.drawString("10+-20:"+neg, 20,180);
    }
}
