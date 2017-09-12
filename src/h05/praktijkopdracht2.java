package h05;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht2 extends Applet {

    //uitleg
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init(){
        opvulkleur=Color.magenta;
        lijnkleur=Color.black;
        breedte=195;
        hoogte=80;
    }
    public void paint(Graphics g){
        //praktijkopdracht
        //  lijn
        g.setColor(lijnkleur);
        g.drawLine(5,10,200,10);
        g.drawString("Lijn",95,25);

        //  rechthoek
        g.setColor(lijnkleur);
        g.drawRect(5,35,breedte,hoogte);
        g.drawString("Rechthoek", 80,135);

        //  Afgeronde rechthoek
        g.setColor(lijnkleur);
        g.drawRoundRect(5,145,breedte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek", 50,250);

        //  gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(210,35,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde rechthoek met ovaal", 230,135);
        g.drawOval(210,35,breedte,hoogte);

        //  gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(210,145,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal",260,250);

        //  Taartpunt met ovaal eromheen
        g.setColor(lijnkleur);
        g.drawArc(415,35,breedte,hoogte,0,45);
        g.drawArc(415,35,breedte,hoogte,45,45);
        g.drawArc(415,35,breedte,hoogte,90,45);
        g.drawArc(415,35,breedte,hoogte,135,45);
        g.drawArc(415,35,breedte,hoogte,180,45);
        g.drawArc(415,35,breedte,hoogte,225,45);
        g.drawArc(415,35,breedte,hoogte,270,45);
        g.drawArc(415,35,breedte,hoogte,315,45);
        g.setColor(opvulkleur);
        g.fillArc(415,35,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 425,135);

        //  cirkel
        g.setColor(lijnkleur);
        g.drawOval(470,145,80,80);
        g.drawString("Cirkel",490,250);

    }
}
