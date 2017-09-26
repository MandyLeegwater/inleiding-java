package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht8 extends Applet {
    TextField imput1;
    TextField imput2;
    Button Keer;
    Button Deel;
    Button Plus;
    Button Min;

    Double Getal1;
    Double Getal2;


    public void init() {
        super.init();
        setSize(500,200);

        imput1 = new TextField("", 20);
        add(imput1);

        imput2 = new TextField("", 20);
        add(imput2);

        Keer = new Button("X");
        KeerListener keerListener = new KeerListener();
        Keer.addActionListener(keerListener);
        add(Keer);

        Deel = new Button("/");
        Deellistener deellistener = new Deellistener();
        Deel.addActionListener(deellistener);
        add(Deel);

        Plus = new Button("+");
        Pluslistener pluslistener = new Pluslistener();
        Plus.addActionListener(pluslistener);
        add(Plus);

        Min = new Button("-");
        Minlistener minlistener = new Minlistener();
        Min.addActionListener(minlistener);
        add(Min);
    }

    class KeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String arg1 = imput1.getText();
            Getal1 = Double.parseDouble(arg1);

            String arg2 = imput2.getText();
            Getal2 = Double.parseDouble(arg2);

            Double uitkomstKeer = Getal1 * Getal2;
            imput1.setText("" + uitkomstKeer);
            imput2.setText(" ");
        }
    }
    class Deellistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String arg1 = imput1.getText();
            Getal1 = Double.parseDouble(arg1);

            String arg2 = imput2.getText();
            Getal2 = Double.parseDouble(arg2);

            Double uitkomstDeel = Getal1 / Getal2;
            imput1.setText("" + uitkomstDeel);
            imput2.setText(" ");
        }
    }
    class Pluslistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String arg1 = imput1.getText();
            Getal1 = Double.parseDouble(arg1);

            String arg2 = imput2.getText();
            Getal2 = Double.parseDouble(arg2);

            Double uitkomstPlus = Getal1 + Getal2;
            imput1.setText("" + uitkomstPlus);
            imput2.setText(" ");
        }
    }
    class Minlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String arg1 = imput1.getText();
            Getal1 = Double.parseDouble(arg1);

            String arg2 = imput2.getText();
            Getal2 = Double.parseDouble(arg2);

            Double uitkomstMin = Getal1 - Getal2;
            imput1.setText("" + uitkomstMin);
            imput2.setText(" ");
        }
    }
}