package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht1 extends Applet {


    private String kaartKleurArray[] = {
            "Harten", "Klaver", "Ruiten", "Schoppen"
    };

    private String kaartNummerArray[] = {
            "Een", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven",
            "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer"
    };

    private String kaartKleurString = "", kaartNummerString = "";

    @Override
    public void init() {
        super.init();

        Button knop = new Button("Deel kaart");
        add(knop);
        knop.addActionListener(new KnopActionListener());

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawString(kaartKleurString + " " + kaartNummerString, 50, 60);

    }

    private class KnopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            kaartKleurString = kaartKleurArray[(int) (Math.random() * kaartKleurArray.length)];
            kaartNummerString = kaartNummerArray[(int) (Math.random() * kaartNummerArray.length)];
            repaint();
        }
    }
}