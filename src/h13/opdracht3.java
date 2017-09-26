package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {

    private boolean baksteenBoolean, betonBlokBoolean, checkBoolean;
    private int x, y, width, height;

    public void init() {
        super.init();
        setSize(400, 375);

        Button baksteenKnop = new Button("Maak baksteen muur");
        add(baksteenKnop);
        baksteenKnop.addActionListener(new BaksteenKnopActionListener());

        Button betonblokKnop = new Button("Maak betonnen muur");
        add(betonblokKnop);
        betonblokKnop.addActionListener(new BetonKnopActionListener());
    }

    public void paint(Graphics g) {
        super.paint(g);

        if (checkBoolean)
        setBackground(Color.lightGray);
        tekenMuren(g, x, y, width, height);
    }

    private void tekenMuren(Graphics g, int x, int y, int width, int height) {

        if (baksteenBoolean) {
            for (int regel = 0; regel < 15; regel++) {
                for (int bakstenen = 0; bakstenen < 11; bakstenen++) {
                    g.setColor(Color.red);
                    g.fill3DRect(x + 5, y + 5, width - 10, height - 10, true);
                    x += width;
                }
                y += height;
                if ((regel % 2) == 0) {
                    x = -20;
                } else {
                    x = 0;
                }
            }
        } else if (betonBlokBoolean) {
            for (int regel = 0; regel < 15; regel++) {
                for (int betonblokken = 0; betonblokken < 10; betonblokken++) {
                    g.setColor(Color.black);
                    g.drawRect(x, y, width, height);
                    x += height;

                    if ((regel % 2) == 0) {
                        x = -30;
                    } else {
                        x = 0;
                    }
                }
            }
        }
    }
        private class BaksteenKnopActionListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                baksteenBoolean = true;
                betonBlokBoolean = false;
                checkBoolean = true;
                width= 40;
                height= 25;
                x = 0;
                y = 0;
                repaint();
            }
        }
        private class BetonKnopActionListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                betonBlokBoolean = false;
                betonBlokBoolean = true;
                checkBoolean = true;
                width=60;
                height=40;
                x=0;
                y=0;
                repaint();
            }
        }
    }


