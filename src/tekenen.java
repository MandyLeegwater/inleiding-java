package h04;

import java.applet.Applet;
        import java.awt.*;

public class tekenen extends Applet{
    public void init(){

    }
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawLine(5,10,200,10);
        g.drawString("Lijn",95,25);

        //  rechthoek
        g.setColor(Color.black);
        g.drawRect(5,35,195,80);
        g.drawString("Rechthoek", 80,135);

        //  Afgeronde rechthoek
        g.setColor(Color.black);
        g.drawRoundRect(5,145,195,80,30,30);
        g.drawString("Afgeronde rechthoek", 50,250);

        //  gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(210,35,195,80);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal", 230,135);
        g.drawOval(210,35,195,80);

        //  gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(210,145,195,80);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",260,250);

        //  Taartpunt met ovaal eromheen
        g.setColor(Color.black);
        g.drawArc(415,35,195,80,0,45);
        g.drawArc(415,35,195,80,45,45);
        g.drawArc(415,35,195,80,90,45);
        g.drawArc(415,35,195,80,135,45);
        g.drawArc(415,35,195,80,180,45);
        g.drawArc(415,35,195,80,225,45);
        g.drawArc(415,35,195,80,270,45);
        g.drawArc(415,35,195,80,315,45);
        g.setColor(Color.magenta);
        g.fillArc(415,35,195,80,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 425,135);

        //  cirkel
        g.setColor(Color.black);
        g.drawOval(470,145,80,80);
        g.drawString("Cirkel",490,250);

    }
}