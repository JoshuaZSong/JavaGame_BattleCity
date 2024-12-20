package com.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{ //set up a frame

    private MyPanel mp = null;
    public static void main(String[] args){
        new DrawCircle();
        System.out.println("exit");
    }

    public DrawCircle(){//constructor
        //initial the panel
        mp = new MyPanel();
        //put the panel into to the frame
        this.add(mp);
        //size of the canvas
        this.setSize(400,300);
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
        //draw a circle
        g.drawOval(10,10,100,100);
    }
}