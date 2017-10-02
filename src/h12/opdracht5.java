package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht5 extends Applet {

    int[] nummers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 43, 1984, 235240, 3000, 22, 2016};
    TextField invoer = new TextField("", 5);
    Button oke = new Button("Oké");
    String string = "";
    boolean gevonden = false;
    int index = -1;

    public void init() {
        setSize(450, 450);
        add(invoer);
        invoer.addActionListener(new invoerListener());
        add(oke);
        oke.addActionListener(new invoerListener());
    }

    public void paint(Graphics g) {
        int x = getWidth();
        int y = getHeight();

        g.drawString("" + string, x / 2 - 100, y / 2);
    }

    class invoerListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int zoeken = Integer.parseInt(invoer.getText());
            for (int o = 0; o < nummers.length && gevonden == false; o++) {
                index++;
                if (nummers[o] == zoeken) {
                    gevonden = true;
                }
            }
            if (gevonden == true) {
                string = "Er is een of meer waarde(s) gevonden onder de index " + index + ".";
            } else {
                string = "De waarde is niet gevonden.";
            }
            index = -1;
            invoer.setText("");
            gevonden = false;
            repaint();
        }
    }
}
