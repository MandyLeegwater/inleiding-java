package h13;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    public void init() {
        super.init();
        setSize(600, 500);
    }

    public void paint(Graphics g) {
        super.paint(g);

        int x = 0, y = 0, width = 40, height = 25;
        setBackground(Color.lightGray);
        tekenMuur(g, x, y, width, height);
    }

    private void tekenMuur(Graphics g, int x, int y, int width, int height) {

        for (int i = 0; i < 20; i++) {
            for (int baksteen = 0; baksteen < 20; baksteen++) {
                g.setColor(Color.red);
                g.fill3DRect(x + 5, y + 5, width - 10, height - 10, true);
                x += width;
            }
            //Einde Bakstenen Loop
            y += height;
            if ((i % 2) == 0) {
                x = -20;
            } else {
                x = 0;
            }
        }
    }
}
