package Challenge;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import java.net.*;

public class Fruitautomaat extends Applet {

    private String[] afbeelding ={"fruit_1.jpg","fruit_2.jpg","fruit_3.jpg","fruit_4.jpg","fruit_5.jpg","fruit_6.jpg","fruit_7.jpg","fruit_8.jpg","fruit_9.jpg","fruit_10.jpg","fruit_11.jpg","fruit_12.jpg","fruit_13.jpg","fruit_14.jpg","fruit_15.jpg","fruit_16.jpg","fruit_17.jpg","fruit_18.jpg","fruit_19.jpg","fruit_20.jpg",};

    private Image afbeelding1, afbeelding2, afbeelding3;
    private URL pad;
    private double getal1, getal2, getal3;
    private int krediet,nummer1, nummer2, nummer3;
    private boolean begin;
    private boolean win;
    private boolean bigwin;
    private Button koop;
    private Button speel;

    public void init() {
        begin = false;
        krediet = 10;
        pad = Fruitautomaat.class.getResource("/plaatjes/");
        koop = new Button("Koop 10 Kredietmunten");
        speel = new Button("Speel");
        Listen1 l1=new Listen1();
        Listen2 l2=new Listen2();
        koop.addActionListener(l2);
        speel.addActionListener(l1);
        add(speel);
        add(koop);
    }

    public void paint(Graphics g) {
        slots(g);

        g.drawString("Kredietmunten: "+ krediet , 80,240);

        if(win) {
            g.drawString("Gewonnen: +4 Kredietpunten.", 80, 260);
            win = false;
        }
        if(bigwin) {
            g.drawString("Jackpot Gewonnen: +20 Kredietpunten!", 80, 260);
            bigwin = false;
        }
    }


    class Listen1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            begin = true;
            if (krediet > 0) {
                krediet--;

                getal1 = Math.random();
                nummer1 = (int)(getal1 * 20);

                getal2 = Math.random();
                nummer2 = (int)(getal2 * 20);

                getal3 = Math.random();
                nummer3 = (int)(getal3 * 20);

                repaint();
            }
        }
    }


    class Listen2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (krediet < 1) {
                krediet = krediet + 10;
            }
            repaint();
        }
    }


    private void slots(Graphics g) {
        afbeelding1 = getImage(pad, ""+ afbeelding[nummer1]);
        afbeelding2 = getImage(pad, ""+ afbeelding[nummer2]);
        afbeelding3 = getImage(pad, ""+ afbeelding[nummer3]);


        g.drawImage(afbeelding1, 20, 40, 80, 160, this);
        g.drawImage(afbeelding2, 100, 40, 80, 160, this);
        g.drawImage(afbeelding3, 180, 40, 80, 160, this);

        if (nummer1 == nummer2 && begin ||nummer2 == nummer3 && begin ||nummer1 == nummer3 && begin) {
            krediet = krediet + 4;
            win = true;
        }
        if (nummer1 == nummer2 && nummer1 == nummer3 && bigwin) {
            krediet = krediet + 20;
            bigwin = true;
        }
        if (krediet < 1) {
            koop.setEnabled(true);
            speel.setEnabled(false);

        }
        else {
            koop.setEnabled(false);
        }
    }
}

