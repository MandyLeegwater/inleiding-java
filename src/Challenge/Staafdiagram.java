package Challenge;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Staafdiagram extends Applet {
    private Color Kleur;
    private TextField TekstvakValerie;
    private TextField TekstvakJeroen;
    private TextField TekstvakHans;
    private int Valerie, Hans, Jeroen;

    public void init() {
        setSize(500, 500);
        //Valerie
        Label labelValerie = new Label("Valerie");
        add(labelValerie);
        TekstvakValerie = new TextField("", 7);
        add(TekstvakValerie);
        //Jeroen
        Label labelJeroen = new Label("Jeroen");
        add(labelJeroen);
        TekstvakJeroen = new TextField("", 7);
        add(TekstvakJeroen);
        //Hans
        Label labelHans = new Label("Hans");
        add(labelHans);
        TekstvakHans = new TextField("", 7);
        add(TekstvakHans);

        Button knop = new Button("Toon");
        knopListener knopListener = new knopListener();
        knop.addActionListener(knopListener);
        add(knop);

        Kleur = Color.red;
        Valerie = 0;
        Hans = 0;
        Jeroen = 0;
    }

    public void paint(Graphics g) {
        g.drawLine(45, 80, 45, 340);
        g.drawLine(45, 340, 300, 340);
        g.drawString("0", 25, 340);
        g.drawString("20", 20, 300);
        g.drawString("40", 20, 260);
        g.drawString("60", 20, 220);
        g.drawString("80", 20, 180);
        g.drawString("100", 15, 140);
        g.drawString("120", 15, 100);
        g.drawString("Valerie", 60, 360);
        g.drawString("Jeroen",100,360);
        g.drawString("Hans",160,360);

        g.setColor(Kleur);
        g.fillRect(60, 340 - Valerie, 30, Valerie);
        g.fillRect(110,340 - Jeroen,30,Jeroen );
        g.fillRect(160,340 - Hans,30, Hans);
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String getal1 = TekstvakValerie.getText();
            Valerie = Integer.parseInt(getal1);
            Valerie = Valerie * 2;
            repaint();

            String getal2 = TekstvakJeroen.getText();
            Jeroen = Integer.parseInt(getal2);
            Jeroen = Jeroen * 2;
            repaint();

            String getal3 = TekstvakHans.getText();
            Hans = Integer.parseInt(getal3);
            Hans = Hans * 2;
            repaint();
        }
    }
}
