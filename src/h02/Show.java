package h02;

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam h02.Show van het type Applet
public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(10,10,130,20);
        g.setColor(Color.yellow);
        g.drawString("Mandy Leegwater",15,25);
        g.setColor(Color.blue);
        g.drawString("Mandy",50,60);
        g.setColor(Color.red);
        g.drawString("Leegwater", 50,70);
    }

}
