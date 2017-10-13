package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wereldtijden extends Applet {
    private TextField vak1;
    private int tijd, sydney, london, washington, tokyo;
    private String error;

    public void init() {
        vak1 = new TextField("", 15);
        add(vak1);
        tijd = 0;
        Button knop = new Button("Toon Tijden");
        knopListener knopListener = new knopListener();
        knop.addActionListener(knopListener);
        add(knop);
    }

    public void paint(Graphics g) {
        int x = 10;
        int y = 50;
        if (tijd < 24) {
            g.drawString("Sydney: " + sydney + ":00", x, y);
            g.drawString("London: " + london + ":00", x, y+20);
            g.drawString("Washington: " + washington + ":00", x, y+40);
            g.drawString("Tokyo: " + tokyo + ":00", x, y+60);
        } else {
            g.drawString(error, x, y);
        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tijd = Integer.parseInt(vak1.getText());
            if (tijd < 24) {
                sydney = tijd + 9;
                if (sydney > 23) {
                    sydney = sydney - 24;
                }
                tokyo = tijd + 7;
                if (tokyo > 23) {
                    tokyo = tokyo - 24;
                }
                london = tijd - 1;
                if (london < 0) {
                    london = london + 24;
                }
                washington = tijd - 6;
                if (washington < 0) {
                    washington = washington + 24;
                }
            }
            else {
                error ="Voer een geldig uur in";
            }
            repaint();
        }
    }
}

