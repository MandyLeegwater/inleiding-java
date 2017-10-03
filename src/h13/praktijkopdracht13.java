package h13;

import java.awt.*;
import java.applet.*;


public class praktijkopdracht13 extends Applet{

    Color bruin = new Color(179, 45, 0);

    @Override
    public void paint(Graphics g) {

        int x = 0;
        int y = 50;

        for (int row = 0; row < 2; row++) {

            for (int i = 0; i < 5; i++) {
                x += 60;

                g.setColor(Color.GREEN);
                g.fillOval(x, y, 50, 50);
                g.setColor(bruin);
                g.fillRect(x + 20, y + 50, 10, 25);
            }
            x = 0;
            y += 100;
        }
    }
}