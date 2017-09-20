package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht9 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        //de x en y coordinaten
        int x = 50;
        int y = 50;
        int breedte = 30;
        int hoogte = 30;
        setBackground(Color.gray);
        // voor lijnen 0,2,4,6
        for (int lijn = 0; lijn < 8; lijn++) {

            if (lijn == 0 || lijn == 2 || lijn == 4 || lijn == 6) {
                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.black);
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.setColor(Color.white);
                        g.fillRect(x, y, breedte, hoogte);
                    }
                    x += breedte;
                }
            }
            // voor lijnen 1,3,5,7
            else {
                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.white);
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, breedte, hoogte);
                    }
                    x += breedte;
                }
            }
            x = 50;
            y += 30;
        }
    }
}
