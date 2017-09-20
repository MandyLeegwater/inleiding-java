package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gemiddelde extends Applet {
    TextField tekstvak;
    Button knop;
    String s, s2, bepaaler;
    int aantalCijfers;
    double totaal, gemiddelde, invoer;
    boolean bepaaler2;

    public void init() {
        tekstvak = (new TextField("", 25));
        add(tekstvak);
        tekstvak.addActionListener(new KnopListener());

        knop = (new Button("Ok"));
        add(knop);
        totaal = 0.0;
        bepaaler = "";
        gemiddelde = 0.0;
        aantalCijfers = 0;
    }

    public void paint(Graphics g){
        g.drawString("" + bepaaler,50,100);
        g.drawString("Het gemiddelde cijfer is: " + gemiddelde, 50,150);
        g.drawString("Aantal cijfers: " + aantalCijfers,50,165);
    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            s = tekstvak.getText();
            invoer = Double.parseDouble(s);

            aantalCijfers++;
            totaal = invoer + totaal;
            gemiddelde = totaal / aantalCijfers;

            if (invoer >= 5.5){
                bepaaler = "Voldoende!";
            }
            else{
                bepaaler = "Onvoldoende";
            }
                tekstvak.setText("");
            repaint();
        }
    }
}
