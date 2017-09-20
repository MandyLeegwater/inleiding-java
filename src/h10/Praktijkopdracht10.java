package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht10  extends Applet {
    int cijfer;
    TextField cijfervak;
    Label cijferlabel;
    String s, tekst;

    public void init(){
        cijferlabel = new Label("type hier het cijfer in: ");
        cijfervak = new TextField("", 20);
        cijfervak.addActionListener(new TekstvakListener());
        tekst = "";
        add(cijferlabel);
        add(cijfervak);

    }

    public void paint(Graphics g){
        g.drawString(tekst,50,60);
    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            s = cijfervak.getText();
            cijfer = Integer.parseInt(s);
            switch (cijfer){
                case 1:
                    tekst = "Slecht";
                    break;
                case 2:
                    tekst = "Slecht";
                    break;
                case 3:
                    tekst = "Slecht";
                    break;
                case 4:
                    tekst = "Onvoldoende";
                    break;
                case 5:
                    tekst = "Matig";
                    break;
                case 6:
                    tekst = "Voldoende";
                    break;
                case 7:
                    tekst = "Voldoende";
                    break;
                case 8:
                    tekst = "Goed";
                    break;
                case 9:
                    tekst = "Goed";
                    break;
                case 10:
                    tekst = "Goed";
                    break;
                    default:
                        tekst = "verkeerd cijfer ingevoerd";
                        break;

            }
            repaint();

        }
    }
}
