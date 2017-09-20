package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ouderavond extends Applet {
    int man, vrouw, mleerling, vleerling, totaal;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    public void init()
    {
        setSize(170,200);
        man = 0;
        vrouw = 0;
        mleerling = 0;
        vleerling = 0;
        totaal = 0;
        Listen1 M = new Listen1();
        Listen2 V = new Listen2();
        Listen3 ML = new Listen3();
        Listen4 VL = new Listen4();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button1.setLabel("man volwassen");
        button2.setLabel("vrouw volwassen");
        button3.setLabel("man leerling");
        button4.setLabel("Vrouw leerling");
        button1.addActionListener(M);
        button2.addActionListener(V);
        button3.addActionListener(ML);
        button4.addActionListener(VL);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }
    public void paint(Graphics g)
    {
        g.drawString("Mannen volwassen: "+man, 20, 130);
        g.drawString("Vrouwen volwassen: "+vrouw, 20, 150);
        g.drawString("Mannen leerlingen: "+mleerling, 20, 170);
        g.drawString("Vrouwen leerlingen: "+vleerling, 20, 190);
        g.drawString("totaal: "+totaal, 20, 210);
    }
    class Listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            man++;
            totaal++;
            repaint();
        }
    }
    class Listen2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            vrouw++;
            totaal++;
            repaint();
        }
    }
    class Listen3 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            mleerling++;
            totaal++;
            repaint();
        }
    }
    class Listen4 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            vleerling++;
            totaal++;
            repaint();
        }
    }
}
