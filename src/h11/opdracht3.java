package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {

    int a, y, fibonacci, fibonacci2;
    public void init(){
        y = 0;
        fibonacci = 1;
        fibonacci2 = 0;
    }

    public void paint(Graphics g){
        for (int i = 0; i < 10; i++){
            y+= 20;
            g.drawString("" + (fibonacci+fibonacci2), 15,y);
            a = fibonacci;
            fibonacci = fibonacci2;
            fibonacci2 = a + fibonacci2;
        }
    }
}
