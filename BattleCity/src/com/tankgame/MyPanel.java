package com.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * drawing panel
 */
public class MyPanel extends JPanel {

    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0,0,100,750);
    }
}
