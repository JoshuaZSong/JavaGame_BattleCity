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
        g.fillRect(0,0,1000,750);
    }

    /**
     *
     * @param x tank's top-left conor x
     * @param y tank's top-left conor y
     * @param g draw
     * @param direct direction
     * @param type hero/enemy
     */
    public void drawTank(int x, int y,Graphics g, int direct, int type){

        switch(type){
            case 0: // hero
                g.setColor(Color.cyan);
                break;
            case 1: //enemy tank
                g.setColor(Color.yellow);
                break;

        }
    }
}
