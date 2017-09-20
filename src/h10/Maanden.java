package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Maanden extends Applet {
    TextField maandnummervak, jaarvak;
    Label labelmaand, labeljaar;
    String s,s2, tekst, tekst2;
    int maand, jaar;

    public void init() {
       labelmaand = new Label("type hier het maandnummer: ");
       maandnummervak = new TextField("",10);
       maandnummervak.addActionListener(new TekstvakListener());

       labeljaar = new Label("type hier het jaar in: ");
       jaarvak = new TextField("", 10);
       jaarvak.addActionListener(new TekstvakListener2());

       add(labelmaand);
       add(maandnummervak);

       add(labeljaar);
       add(jaarvak);

       tekst = "";
       tekst2 = "";
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 100 );
        g.drawString(tekst2, 50, 120);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = maandnummervak.getText();
            maand = Integer.parseInt(s);
            switch(maand) {
                case 1:  tekst = "januari 31 dagen";
                    break;
                case 2: tekst = "februari 29 dagen";
                    break;
                case 3: tekst = "maart 31 dagen";
                    break;
                case 4: tekst = "april 30 dagen";
                    break;
                case 5: tekst = "mei 31 dagen";
                    break;
                case 6:
                    tekst = "juni 30 dagen";
                    break;
                case 7:
                    tekst = "juli 31 dagen";
                    break;
                case 8:
                    tekst = "augustus 31 dagen";
                    break;
                case 9:
                    tekst = "september 30 dagen";
                    break;
                case 10:
                    tekst = "oktober 31 dagen";
                    break;
                case 11:
                    tekst = "november 30 dagen";
                    break;
                case 12:
                    tekst = "december 31 dagen";
                    break;
                default:
                    tekst = "u heeft niet het juiste getal ingevuld";
                    break;

            }
            repaint();
        }
    }
    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = jaarvak.getText();
            jaar = Integer.parseInt(s2);

            if ((jaar % 4 == 0 && !(jaar % 100 == 0))|| jaar % 400 == 0){
                tekst2 = "" + jaar + " is een schrikkeljaar";
            }
            else {
                tekst2 = "" + jaar + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}