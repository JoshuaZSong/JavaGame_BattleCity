package com.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{ //set up a frame

    private MyPanel mp = null;
    public static void main(String[] args){
        new DrawCircle();

    }

    public DrawCircle(){//constructor
        //initial the panel
        mp = new MyPanel();
        //put the panel into to the frame
        this.add(mp);
        //size of the canvas
        this.setSize(400,300);
        //exit when click "x"
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("exit");
        this.setVisible(true);//visible
    }
}

//1.MyPanel class extends JPanel, paint on the canvas
class MyPanel extends JPanel{

    //1.MyPanel is a canvas
    //2.Graphics g is a pen
    //paint() will be called when:
    //      (1)first display
    //      (2)Minimize or Maximize
    //      (3)size of the frame change
    //      (4)repaint is called
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint() is called");
        //draw a line
        //g.drawLine(int x1,int y1, int x2, int y2);
        //draw a circle
        //g.drawOval(10,10,100,100);
        //fill the Oval
        //g.setColor(Color.red);
        //g.fillOval(10,10,100,100);
        //Get an image
        //Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource(""))
        //g.drawImage(image,10,10,175,211,this);
        //Draw text
        //g.setColor(Color.red);
        //g.setFont(new Font("",Font.BOLD,50));
        //g.drawString("",100,100);
    }
}