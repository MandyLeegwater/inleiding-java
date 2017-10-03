package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class opdracht2 extends Applet {

    private String[] kleuren = {"Harten", "Klaver", "Ruiten", "Schoppen"};
    private String[] kaarten = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer"};
    private String[] deck = new String[52];
    private String[] speler1 = new String[130];
    private String[] speler2 = new String[130];
    private String[] speler3 = new String[130];
    private String[] speler4 = new String[130];
    Button knop;
    boolean geklikt;

    public void init() {
        knop = new Button("Deel de kaarten");
        knop.addActionListener(new Knoplistener());
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Speler 1", 10,30);
        g.drawString("Speler 2", 110,30);
        g.drawString("Speler 3", 210,30);
        g.drawString("Speler 4", 310,30);
        for (int i = 0; i < 13; i++){
            g.drawString(speler1[i],10,50 +(i *20));
            g.drawString(speler2[i],110,50 +(i *20));
            g.drawString(speler3[i],210,50 +(i *20));
            g.drawString(speler4[i],310,50 +(i *20));
        }
    }

    class Knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            setSize(900, 550);
            geklikt = true;

            deck = new String[52];
            int index = 0;

            for (int i = 0; i < kleuren.length; i++) {
                String kleur = kleuren[i];
                for (int j = 0; j < kaarten.length; j++) {
                    String kaart = kaarten[j];
                    deck[index] = kleur + " " + kaart;
                    index++;
                }
            }

            for (int i = 0; i < 13; i++ ) {
                speler1[i] = deelKaart();
                speler2[i] = deelKaart();
                speler3[i] = deelKaart();
                speler4[i] = deelKaart();
            }

            repaint();
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }
}