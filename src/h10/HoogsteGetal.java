package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HoogsteGetal extends Applet {

    long getal2;
    long getal1;
    TextField tekstvak;
    Label label;
    String tekst;
    long cijfer3;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";

        label = new Label("Geef uw leeftijd in en druk op enter");

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste getal =" + getal1, 50, 45);
        g.drawString("Het laagste getal =" + cijfer3, 50, 55);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal2 = Long.parseLong(tekstvak.getText());
            repaint();
            if (cijfer3 == 0) {
                cijfer3 = getal2;
            }
            if (getal2 > getal1) {
                getal1 = getal2;
                tekstvak.setText(null);
            }
            if (getal2 < cijfer3) {
                cijfer3 = getal2;
            }
            tekstvak.setText(null);
            repaint();
        }
    }

}
