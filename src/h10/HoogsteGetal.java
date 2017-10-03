package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HoogsteGetal extends Applet {

    long invoergetal;
    long hoogstegetal;
    TextField tekstvak;
    Label label;
    String tekst;
    long laagstegetal;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";

        label = new Label("Geef uw leeftijd in en druk op enter");

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste getal =" + hoogstegetal, 50, 45);
        g.drawString("Het laagste getal =" + laagstegetal, 50, 55);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoergetal = Long.parseLong(tekstvak.getText());
            repaint();
            if (laagstegetal == 0) {
                laagstegetal = invoergetal;
            }
            if (invoergetal > hoogstegetal) {
                hoogstegetal = invoergetal;
                tekstvak.setText(null);
            }
            if (invoergetal < laagstegetal) {
                laagstegetal = invoergetal;
            }
            tekstvak.setText(null);
            repaint();
        }
    }

}
