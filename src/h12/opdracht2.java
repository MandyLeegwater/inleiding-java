package h12;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {
    Button button[];

    public void init(){
    button = new Button[25];
    for (int tekst = 0; tekst < button.length; tekst++){
        button[1] = new Button();
        add(button[1]);
    }
    }

    public void paint(Graphics g){

    }
}
