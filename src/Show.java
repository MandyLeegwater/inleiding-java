package h04;

import java.applet.Applet;
import java.awt.*;

public class Show extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        //4.1
        setBackground(Color.white);
        g.setColor(Color.blue);
        g.drawLine(10,10,70,70);
        g.setColor(Color.red);
        g.drawLine(70,70,10,120);
        g.setColor(Color.magenta);
        g.drawLine(10,10,10,120);

        //4.2
        g.setColor(Color.black);
        //horizontale bovenste lijn van vierkant
        g.drawLine(100,100,200,100);
        //verticale eerste lijn van vierkant
        g.drawLine(100,100,100,200);
        //horizontale onderste lijn van vierkant
        g.drawLine(100,200,200,200);
        //verticale tweede lijn van vierkant
        g.drawLine(200,200,200,100);
        //eerste schuine lijn
        g.drawLine(100,100,150,50);
        //tweede schuine lijn
        g.drawLine(200,100,150,50);
        //eerste verticale lijn deur
        g.drawLine(120,200,120,160);
        //horizontale lijn deur
        g.drawLine(140,160,120,160);
        //tweede verticale lijn deur
        g.drawLine(140,160,140,200);
        //bovenste horizontale lijn raam
        g.drawLine(160,150,190,150);
        //eerste verticale lijn raam
        g.drawLine(160,150,160,170);
        //onderste horizontale lijn raam
        g.drawLine(160,170,190,170);
        //tweede verticale lijn raam
        g.drawLine(190,150,190,170);

        //4.3
        g.setColor(Color.red);
        g.fillRect(10,220,80,20);
        g.setColor(Color.white);
        g.fillRect(10,240,80,20);
        g.setColor(Color.blue);
        g.fillRect(10,260,80,20);
        g.setColor(Color.black);
        g.fillRect(5,220,5,100);

        //4.4
        g.drawRect(300,20,90,90);
        g.setColor(Color.yellow);
        g.fillRect(300,90,30,20);
        g.setColor(Color.red);
        g.fillRect(330,60,30,50);
        g.setColor(Color.magenta);
        g.fillRect(360,70,30,40);

        g.setColor(Color.black);
        g.drawString("Valerie",300,130);
        g.drawString("Jeroen", 330,140);
        g.drawString("Hans", 360,130);

        //4.5
        g.setColor(Color.blue);
        g.fillRect(300,200,100,150);
        g.setColor(Color.yellow);
        g.fillArc(300,200,100,150,90,45);
        g.fillArc(300,200,100,150,45,45);
        g.fillArc(300,200,100,150,0,45);
        g.fillArc(300,200,100,150,135,45);
        g.fillArc(300,200,100,150,180,45);
        g.fillArc(300,200,100,150,225,45);
        g.fillArc(300,200,100,150,270,45);
        g.fillArc(300,200,100,150,315,45);

        //4.6
        g.setColor(Color.black);
        g.fillRect(10,350,30,90);
        g.setColor(Color.red);
        g.fillOval(10,350,30,30);
        g.setColor(Color.orange);
        g.fillOval(10,380,30,30);
        g.setColor(Color.green);
        g.fillOval(10,410,30,30);

        //4.7
        g.setColor(Color.black);
        g.drawRoundRect(100,350,40,40,10,10);
        g.fillOval(110,360,5,5);
        g.fillOval(110,375,5,5);
        g.fillOval(125,360,5,5);
        g.fillOval(125,375,5,5);
    }
}
