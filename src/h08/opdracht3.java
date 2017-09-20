package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {
    TextField tekst;
    Button knop;
    Label label;
    double getal;
    double btw;

    public void init() {
        tekst = new TextField("", 20);
        label = new Label("type een getal");
        tekst.addActionListener(new tekstListener());
        add(label);
        add(tekst);
        knop = new Button();
        knop.setLabel("ok");
        btw = 1.21;
    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal * btw, 50, 60);
    }
    class tekstListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s= tekst.getText();
            getal = Double.parseDouble(s);
            repaint();
        }
    }
}
