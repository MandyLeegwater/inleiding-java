package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht11a extends Applet {
    int tafelinput;
    int i,x,y;
    TextField vak1;

    public void init(){
        setSize(300,500);
        tafelinput = 0;
        vak1 = new TextField();
        vak1.setSize(300,500);
        Listen1 l1 = new Listen1();
        vak1.addActionListener(l1);
        add(vak1);
    }

    public void paint(Graphics g){
        x = 60;
        y = 60;

        if (tafelinput>0){
            for (i = 0; i<10;){
                y = y+20;
                i++;
                g.drawString(i+"x"+tafelinput+"="+tafelinput*1,x,y);
            }
        }

        vak1.setSize(50,50);

    }
    class Listen1 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tafelinput = (Integer.parseInt(vak1.getText()));
            vak1.setText("");
            repaint();
        }
    }
}