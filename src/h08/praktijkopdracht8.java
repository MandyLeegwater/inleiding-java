package h08;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht8 extends Applet {
    TextField tekstvak;
    TextField tekstvak1;
    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    double waarde1;
    double waarde2;
    double waarde3;

    public void init(){
        tekstvak=new TextField();
        tekstvak1=new TextField();
        button=new Button("+");
        button1=new Button("-");
        button2=new Button("/");
        button3=new Button("*");
        button4=new Button("reset");
        add(tekstvak);
        add(tekstvak1);
        add(button);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }
    public void paint(Graphics g){

    }
}
